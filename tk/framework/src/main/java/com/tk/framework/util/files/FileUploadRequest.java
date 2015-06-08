package com.tk.framework.util.files;

import java.io.Serializable;
import java.util.Arrays;

/**
 * <pre> 
 *  
 *  File: FileUploadRequest.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: 文件上传请求对象
 *  TODO
 * 
 *  Notes:
 *  $Id: FileUploadRequest.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:40:28>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class FileUploadRequest implements Serializable
{

	/**
	 * Comment for &lt;code&gt;serialVersionUID&lt;/code&gt;
	 */
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
	
	public FileUploadRequest()
	{
		super();
	}

	private String FileName; //文件名称
	
	private String newFileName; //文件新名称
		
	private String FilePath;  //文件路径
	
	private String FileType;  //文件类型 

	private String FileHash;  //文件Hash码
	
	private byte[] content;   //文件内容
	
	private Boolean isEnd;    //是否结尾
	
	private int blockNumber;  //文件分块数    
	
	private long size;        //文件大小

	public String getFileName()
	{
		return FileName;
	}

	public void setFileName(String fileName)
	{
		FileName = fileName;
	}

	public String getNewFileName()
	{
		return newFileName;
	}

	public void setNewFileName(String newFileName)
	{
		this.newFileName = newFileName;
	}

	public String getFilePath()
	{
		return FilePath;
	}

	public void setFilePath(String filePath)
	{
		FilePath = filePath;
	}

	public String getFileType()
	{
		return FileType;
	}

	public void setFileType(String fileType)
	{
		FileType = fileType;
	}

	public String getFileHash()
	{
		return FileHash;
	}

	public void setFileHash(String fileHash)
	{
		FileHash = fileHash;
	}

	public byte[] getContent()
	{
		return content;
	}

	public void setContent(byte[] content)
	{
		this.content = content;
	}

	public Boolean getIsEnd()
	{
		return isEnd;
	}

	public void setIsEnd(Boolean isEnd)
	{
		this.isEnd = isEnd;
	}

	public int getBlockNumber()
	{
		return blockNumber;
	}

	public void setBlockNumber(int blockNumber)
	{
		this.blockNumber = blockNumber;
	}

	public long getSize()
	{
		return size;
	}

	public void setSize(long size)
	{
		this.size = size;
	}

	@Override
	public String toString()
	{
		return "FileUploadRequest [getFileName()=" + getFileName() + ", getNewFileName()=" + getNewFileName()
				+ ", getFilePath()=" + getFilePath() + ", getFileType()=" + getFileType() + ", getFileHash()="
				+ getFileHash() + ", getContent()=" + Arrays.toString(getContent())	+ ", getIsEnd()=" + getIsEnd() + 
				", getBlockNumber()=" + getBlockNumber() + ", getSize()=" + getSize() + "]";
	}

	
}

/*
*$Log: av-env.bat,v $
*/