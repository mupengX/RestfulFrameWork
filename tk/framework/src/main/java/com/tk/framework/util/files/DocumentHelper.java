package com.tk.framework.util.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import com.tk.framework.rest.framework.exceptions.RestException;
import com.tk.framework.rest.framework.model.ResponseModel;

/**
 * <pre> 
 *  
 *  File: DocumentHelper.java
 *  
 *  Copyright (C): 2014
 *  Description:文件上传工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: DocumentHelper.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:40:15>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class DocumentHelper
{
	public DocumentHelper()
	{
	};

	public ResponseModel addDocumentUpload(FileUploadRequest upload) throws IOException
	{
		ResponseModel respModel = new ResponseModel();

		try
		{
			// 获取上传文件名
			String filename = upload.getNewFileName();
			// 获取上传文件完整路径
			String uploadFilePath = upload.getFilePath() + "/" + filename;
			File tempFile = new File(uploadFilePath);
			// 如果要写入的文件已经存在
			if (tempFile.exists() && upload.getBlockNumber() == 1)
			{
				// 删除已经存在的文件
				boolean delResult = tempFile.delete();
				System.out.println("删除已存在的文件：" + delResult);
			}
			else
			{
				// 如果要写如的文件不存在，创建
				// if(!tempFile.exists()){
				// tempFile.mkdirs();
				// }

				// 续写文件内容
				int count = upload.getContent().length;
				if (count > 0)
				{
					FileOutputStream fos = new FileOutputStream(uploadFilePath);
					fos.write(upload.getContent(), 0, count);// 向服务端文件写入字节流
					fos.close(); // 关闭FileOutputStream对象
				}
				// 如果是文件结尾,表示文件上传完成，可以从临时空间移入储存空间
				/*
				 * if (upload.getIsEnd()==true) { //do something }
				 */

			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			respModel.setCode("101");
			respModel.setMessage("文件上传失败:" + e.getMessage());
			System.out.println("文件上传失败:" + e.getMessage());
			return respModel;
		}

		respModel.setCode("100");
		respModel.setMessage("文件上传成功！");
		System.out.println("文件上传成功！");
		return respModel;
	}

}

/*
 * $Log: av-env.bat,v $
 */