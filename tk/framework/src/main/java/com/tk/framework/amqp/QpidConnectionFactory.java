package com.tk.framework.amqp;

import java.io.InputStream;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.tk.framework.exceptions.BusinessException;

public class QpidConnectionFactory {
	
	private static ConnectionFactory connectionFactory = null;
	private static Context context = null;
	
	private QpidConnectionFactory(){}
	

	private static void init() throws Exception{
		  try(InputStream propertiesStream = QpidConnectionFactory.class.getResourceAsStream("qpid.properties")){
			  Properties properties = new Properties();
			  properties.load(propertiesStream);
	          context = new InitialContext(properties);
	          connectionFactory = (ConnectionFactory) context.lookup("localhost");

		  }catch (Exception e) {
			  e.printStackTrace();
			  throw new BusinessException("缺少QPID的JNDI配置");
		  }
		 
	}
	
	public static Connection getConnection() throws Exception{
		if(connectionFactory == null) {
			init();
		}
		return connectionFactory.createConnection();
	}
	
	public static Queue getQueue(String queueName) throws Exception {
		if(context == null){
			init();
		}
		return (Queue)context.lookup(queueName);
	}
	

	public static Context getContext() {
		return context;
	}

	public static void main(String[] args) throws Exception {
		Connection connection = null;
		try {
			connection = QpidConnectionFactory.getConnection();
			Session producersession = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			Queue queue = (Queue) QpidConnectionFactory.getContext()
					.lookup("queue");
			MessageProducer messageProducer = producersession.createProducer(queue);
			TextMessage message = producersession.createTextMessage("Hello world!");
			connection.start();
			messageProducer.send(message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(connection != null) {
				connection.close();
			}
			QpidConnectionFactory.getContext().close();
		}
		
	}
}
