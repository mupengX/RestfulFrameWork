package com.tk.qpid;


import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
/**
 * <pre> 
 *  TK
 *  File: SendMsgService.java
 *  Copyright (C): 2015
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: SendMsgService.java 2014-12-24 23:59:59Z TK\mupeng $ 
 * 
 * @Revision History:
 * <<2015年3月17日下午3:33:50>>, <<Who>>, <<what>>  
 *  2015年3月17日		mupeng		Initial.
 * </pre>
 */
@Service(value = "sendMsgService")
public class SendMsgService
{
	@Autowired
	private JmsTemplate qpidJmsTemplate;
	
	public void SendMsg(final String msg, final String windowNum, final String serialNum) {
		 qpidJmsTemplate.send(new MessageCreator() {
             public Message createMessage(Session session) throws JMSException {
                 MapMessage message = session.createMapMessage();
                 message.setString("message", msg);
                 message.setString("windowNum", windowNum);
                 message.setString("serialNum", serialNum);
                 return message;
             }
         });
	}
}

/*
*$Log: av-env.bat,v $
*/