package com.tk.qpid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

import org.springframework.beans.factory.annotation.Autowired;



/**
 * <pre> 
 *  ZqElectron
 *  File: MyListener.java
 *  ZqElectron, Inc.
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: MyListener.java 69862260-0 2014-12-24 23:59:59Z ZqElectron\mupeng $ 
 * 
 * @Revision History:
 * <<2015年3月17日下午3:30:58>>, <<Who>>, <<what>>  
 *  2015年3月17日		mupeng		Initial.
 * </pre>
 */
public class MyListener implements MessageListener
{

	public  void onMessage(Message msg) {
				try
				{
					String	message = ((MapMessage)msg).getString("message");
					String	windowNum = ((MapMessage)msg).getString("windowNum");
					String  serialNum = ((MapMessage)msg).getString("serialNum");
					
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
		
	}
}

/*
*$Log: av-env.bat,v $
*/