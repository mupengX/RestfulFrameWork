package com.tk.apis.document;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.tk.framework.annotations.ResourceDescription;
import com.tk.framework.rest.framework.exceptions.RestException;
import com.tk.framework.rest.framework.model.ResponseModel;
import com.tk.framework.util.APILevel;
import com.tk.framework.util.files.DocumentHelper;
import com.tk.framework.util.files.FileUploadRequest;

/**
 * <pre>
 *  File: DocumentResourceV1.java
 *  Copyright (C): 2014
 *  Description:
 *  文件上传api
 * 
 *  Notes:
 * 
 * @Revision History:
 * <<2014年12月24日下午1:06:35>>, <<Who>>, <<what>>  
 *  2014年12月24日		Tk		Initial.
 * </pre>
 */
@RestController
@RequestMapping(value = "/1/upload")
public class DocumentResourceV1
{

	private static final Log log = LogFactory.getLog(DocumentResourceV1.class);

	// private UploadService uploadService;
	// private AuthService authService;

	// @Value("${属性名}")
	@Value("${uploadDirectory}")
	private String fileSavePath; // 文件保存路径

	@Value("${uploadTempDirectory}")
	private String fileTempSavePath; // 文件上传临时保存路径

	@ResourceDescription(Module = "", Resource = "document", Operation = "uploadDocument", ApiLevel = APILevel.ALL, Description = "上传文件.")
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ResponseModel upload(HttpServletRequest request,
			@RequestParam(value = "files", required = false) MultipartFile[] files) throws RestException
	{
		try
		{
			System.out.println("in upload method......");
			DocumentHelper documentHelper = new DocumentHelper();
			FileUploadRequest fileRequest = new FileUploadRequest();
			// int i = 0;// 文件块数
			for (MultipartFile file : files)
			{
				// 若上传文件非空
				if (!file.isEmpty())
				{
					// 获取当前的路径
					// String path = request.getSession().getServletContext().getRealPath("upload");
					String filename = file.getOriginalFilename();
					try
					{
						fileRequest.setFileName(filename);
						fileRequest.setContent(file.getBytes());
						fileRequest.setSize(file.getSize());
						fileRequest.setFilePath(fileSavePath);
						fileRequest.setFileType(filename.substring(filename.lastIndexOf(".")));
						fileRequest.setNewFileName(new Date().getTime() + fileRequest.getFileType());
						// 文件最后一块
						documentHelper.addDocumentUpload(fileRequest);
					}
					catch (IOException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		catch (RestException e)
		{
			throw new RestException(e.getMessage());
		}
		ResponseModel r = new ResponseModel();
		r.setStatus(200);
		r.setMessage("文件上传成功");
		System.out.println("DocumentResourceV1....Done");
		// throw new RestException("test");
		return r;
	}

	/**
	 * 大文件上传 大文件分成小文件块上传到临时文件夹，一次传递一块，最后一块上传成功后，将合并所有已经上传的块，保存到Server文件存储目录 上相应的位置，并返回已经成功上传的文件的详细属性。
	 * 当最后一块上传完毕，返回上传成功的信息。此时用getFileList查询该文件， 该文件的上传状态为2。客户端请自行处理该状态下文件如何显示。
	 * 
	 */
	@RequestMapping(value = "/addfile", method = RequestMethod.POST)
	public Object upload(HttpServletRequest request,
			@RequestParam(value = "block", required = false) Integer blockIndex,
			@RequestParam(value = "file", required = false) MultipartFile multipartFile) throws RestException
	{

		if (multipartFile == null)
		{
			throw new RestException("没有收到上传文件！");// 上传文件不存在
		}
		// 从上传目录拷贝文件到工作目录
		String fileAbsulutePath = null;
		try
		{
			fileAbsulutePath = this.copyFile(multipartFile.getInputStream(), multipartFile.getOriginalFilename());
		}
		catch (IOException ioe)
		{
			log.error(ioe.getMessage(), ioe);
			throw new RestException("上传文件不存在！");// 上传文件不存在
		}
		/*
		 * File uploadedFile = new File(fileTempSavePath + fileAbsulutePath); checkEmptyFile(uploadedFile);// file 非空验证
		 * 
		 * Object rs = uploadService.upload(uuidL, blockIndexI, uid, uploadedFile, bucketUrl);
		 */
		ResponseModel r = new ResponseModel();
		r.setStatus(200);
		r.setMessage("文件上传成功");
		System.out.println("DocumentResourceV1....Done");
		// throw new RestException("test");
		return r;
	}

	// TODO 查看下这里是否有问题
	// 上传文件非空验证
	private void checkEmptyFile(File file)
	{
		if (file == null || file.getAbsolutePath() == null)
		{
			throw new RestException("上传文件不存在！");// 上传文件不存在
		}
	}

	/**
	 * 写文件到本地文件夹
	 * 
	 * @throws IOException 返回生成的文件名
	 */
	private String copyFile(InputStream inputStream, String fileName)
	{
		OutputStream outputStream = null;
		String tempFileName = null;
		int pointPosition = fileName.lastIndexOf(".");
		if (pointPosition < 0)
		{
			tempFileName = UUID.randomUUID().toString();
		}
		else
		{
			tempFileName = UUID.randomUUID() + fileName.substring(pointPosition);
		}
		try
		{
			outputStream = new FileOutputStream(fileTempSavePath + tempFileName);
			int readBytes = 0;
			byte[] buffer = new byte[10000];
			while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1)
			{
				outputStream.write(buffer, 0, readBytes);
			}
			return tempFileName;
		}
		catch (IOException ioe)
		{
			throw new RestException("上传文件不存在！");
		}
		finally
		{
			if (outputStream != null)
			{
				try
				{
					outputStream.close();
				}
				catch (IOException e)
				{
				}
			}
			if (inputStream != null)
			{
				try
				{
					inputStream.close();
				}
				catch (IOException e)
				{
				}
			}

		}
	}

}
