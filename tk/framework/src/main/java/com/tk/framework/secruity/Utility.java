package com.tk.framework.secruity;

import java.security.SecureRandom;

//import org.apache.catalina.realm.RealmBase;




/**
 * <pre> 
 *  
 *  File: Utility.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description:
 *  TODO
 * 
 *  Notes:
 *  $Id: Utility.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:38:47>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public final class Utility
{
	private static Object lockObject = new Object();
	
	/**
	 * Create a secure random number generator
	 */
	private static SecureRandom secureRandom = new SecureRandom();
	private static int PASSWORD_ABOUT_EXPIR_TIMEFRAME = 15;

	public static String generateSessionID()
	{
		synchronized(lockObject)
		{
			//Get 1024 random bits
			byte [] bytes = new byte[1024];
			secureRandom.nextBytes(bytes);
			StringBuilder s = new StringBuilder();
			for (int x= 0; x < 20; x++)
			{
				s.append(secureRandom.nextInt(10));
			}
			return s.toString();
		}
	}

//	public static boolean comparePasswords(String sInputPassword, String sEncryptedPassword) throws Exception
//	{
//		return sEncryptedPassword.equals(encryptPassword(sInputPassword));
//	}
//	
//	public static String encryptPassword(String sInputPassword)
//		throws Exception
//	{
//	  //commented and replaced with SHA encrypted password
//		//return sInputPassword;
//	    return RealmBase.Digest(sInputPassword, "SHA", null);
//	}

	/**  encode with DES method
	 * @param String
	 * @return String
	 */		
	public static String encode4Des(String input_str) 
	{
	//	byte[] key = hex2byte("BCCEDFA162EC6794");    //to get the Des Key
		
		byte[] input =  input_str.getBytes();         //to convert string to bytes[] 
			
//		SecretKey deskey = new javax.crypto.spec.SecretKeySpec(key,"DES"); //to get a new des key
		
//		Cipher c1 = Cipher.getInstance("DES");                            //to get an instance for des
//		c1.init(Cipher.ENCRYPT_MODE, deskey);                             //to set the mode of encrypt   

//		byte[] cipherByte = c1.doFinal(input);                            // to to encrypt
		
		String hexString = byte2hex(input);                                      //to get the hex string
		
		int len = hexString.length();
		char[] str_char= hexString.toCharArray();
		
		for(int i =0; i<len/2 ; i++)
		{
			char temp = str_char[i];
	    	str_char[i] =  str_char[len-i-1];
	    	str_char[len-i-1] =temp;
		}
		
		return new String(str_char);
		
	}

	/**  decode with DES method
	 * @param String
	 * @return String
	 */	
	public static String decode4Des(String input_str) 
	{
		int len = input_str.length();
		char[] str_char= input_str.toCharArray();
		
		for(int i =0; i<len/2 ; i++)
		{
			char temp = str_char[i];
	    	str_char[i] =  str_char[len-i-1];
	    	str_char[len-i-1] =temp;
		}
		
		String passwd_in = new String(str_char);
		
		byte[] input = hex2byte(passwd_in);

		String passwd_out = new String(input); 
		
		return passwd_out;
		
		/*		
		byte[] key = hex2byte("BCCEDFA162EC6794");
		byte[] input = hex2byte(input_str);
		
		SecretKey deskey = new javax.crypto.spec.SecretKeySpec(key,"DES");
		Cipher c1 = Cipher.getInstance("DES");
		c1.init(Cipher.DECRYPT_MODE, deskey);

		byte[] clearByte = c1.doFinal(input);
		
		return new String(clearByte);
*/
		
	}


	/**  To convert from hex bte array  to String
	 * @param bytes[]
	 * @return String
	 */	
	public static String byte2hex(byte bytes[])
	{
	  StringBuilder retString = new StringBuilder();
	  for (int i = 0; i < bytes.length; ++i)
	  {
	    retString.append(Integer.toHexString(0x0100 + (bytes[i] & 0x00FF)).substring(1).toUpperCase());
	  }
	  return retString.toString();
	}


	/**  To convert from hex Sring to byte array
	 * @param hex
	 * @return byte[]
	 */	
	public static byte[] hex2byte(String hex) 
	{
	  byte[] bts = new byte[hex.length() / 2];
	  for (int i = 0; i < bts.length; i++) 
	  {
	     bts[i] = (byte) Integer.parseInt(hex.substring(2*i, 2*i+2), 16);
	  }
	  return bts;
	}
	
//	/**
//	 * 
//	 * @param user
//	 * @throws RemoteException
//	 * @throws DisableAccountException 
//	 * @throws AAException
//	 * @throws Exception
//	 */
//	public static void checkAccountDisable(User user,TimeZone agencyTimeZone) throws RemoteException,DisableAccountException, AAException, Exception
//	{
//		if("ADMIN".equalsIgnoreCase(user.getUserId()))
//		{
//			return ;
//		}
//		Date today = SysDateTimeUtil.getMinValueOfOneDay(getAgencyCurrentdate(agencyTimeZone));
//		Date lastLoginDate =user.getLastLoginTime();
//		
//		if (lastLoginDate==null)
//		{
//			return ;
//		}
//		
//		lastLoginDate =  SysDateTimeUtil.getMinValueOfOneDay(lastLoginDate);
//		int accountDisableTimeframe = user.getAccountDisableTimeframe();
//		int noLoginTimeframe = SysDateTimeUtil.getDiffDay(today, lastLoginDate);
//		
//		if(noLoginTimeframe>=accountDisableTimeframe)
//		{
//			user.setInactive();
//		}
//	}
//	/**
//	 * 
//	 * @param user the user who need check password expire status
//	 * @throws RemoteException
//	 * @throws AAException
//	 * @throws PasswordExpireException - if the use's password is expired throw it
//	 * @throws PasswordWillExpireException - if the user's password is about to expired thow it
//	 * @throws Exception
//	 */
//	public static void checkPasswordExprie(User user,TimeZone agencyTimeZone) 
//		throws RemoteException, AAException, Exception
//	{
//		Date today = SysDateTimeUtil.getMinValueOfOneDay(getAgencyCurrentdate(agencyTimeZone));
//		Date passwordChangDate = user.getPasswordChangeTime();
//		
//		if(passwordChangDate!=null)
//		{
//			int passwordExpirTimeframe = user.getPasswordExpireTimeframe();		
//			int noPasswordChangeTimeframe = SysDateTimeUtil.getDiffDay(today, passwordChangDate);
//
//			if (noPasswordChangeTimeframe >= passwordExpirTimeframe && "N".equals(user.getIntegratedFlag()))
//			{
//				user.setMustChangePasswordNextLogin("Y");
//			}
//		}			
//	}
//	
//	public static int getPasswordExprieDays(User user,TimeZone agencyTimeZone)
//	{
//		Date today = SysDateTimeUtil.getMinValueOfOneDay(getAgencyCurrentdate(agencyTimeZone));		
//		Date passwordChangDate = user.getPasswordChangeTime();
//		int passwordExprieDays=-1;
//		
//		if(passwordChangDate!=null)
//		{		 
//			passwordChangDate = SysDateTimeUtil.getMinValueOfOneDay(passwordChangDate);
//			int passwordExpireTimeframe = user.getPasswordExpireTimeframe();		
//			int noPasswordChangeTimeframe = SysDateTimeUtil.getDiffDay(today, passwordChangDate);
//			passwordExprieDays=passwordExpireTimeframe-noPasswordChangeTimeframe; 
//			
//			if (passwordExprieDays <= 0 && !("Y".equals(user.getIntegratedFlag())))
//			{
//				user.setMustChangePasswordNextLogin("Y");
//			}
//			
//			if(passwordExprieDays>PASSWORD_ABOUT_EXPIR_TIMEFRAME)
//			{
//				passwordExprieDays = -1;
//			}
//		}		
//		return passwordExprieDays;
//	}
	
	
}

