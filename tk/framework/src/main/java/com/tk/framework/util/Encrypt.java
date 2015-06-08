package com.tk.framework.util;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.security.Key;  
import java.security.SecureRandom;  
   

import javax.crypto.Cipher;  
import javax.crypto.CipherInputStream;  
import javax.crypto.CipherOutputStream;  
import javax.crypto.KeyGenerator;  
   

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tk.framework.rest.framework.util.ResponseHelper;

import sun.misc.BASE64Decoder;  
import sun.misc.BASE64Encoder;  

/**
 * <pre> 
 *  
 *  File: Encrypt.java
 *  
 *  Copyright (C): 2014
 *  Description: 加密解密工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: Encrypt.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:49:08>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public class Encrypt
{

	
	private static final Logger logger = LoggerFactory.getLogger(ResponseHelper.class);

	
	
	
	/**
	 * md5加密算法
	 * TODO.
	 *
	 * @param str
	 * @return
	 */
	
    public  static String IrreversibleMD5(String str) {  
        MessageDigest messageDigest = null;  
        try {  
            messageDigest = MessageDigest.getInstance("MD5");  
            messageDigest.reset();  
            messageDigest.update(str.getBytes("UTF-8"));  
        } catch (NoSuchAlgorithmException e) {  
            logger.error(e.getMessage());
            
            System.exit(-1);  
        } catch (UnsupportedEncodingException e) {  
        	 logger.error(e.getMessage());
        }  
        byte[] byteArray = messageDigest.digest();  
        StringBuffer md5StrBuff = new StringBuffer();  
        for (int i = 0; i < byteArray.length; i++) {  
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  
                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
            else  
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
        }  
        return md5StrBuff.toString();  
    }  
  
 
    static String str="1234567";
    static  Key key ;  
    
    
     public Key getKey() {  
        return key ;  
     }  
    
    
     /** 
       * 根据参数生成 KEY 
       */  
     private static  void setKey() {  
        try {  
            KeyGenerator _generator = KeyGenerator.getInstance ( "DES" );  
            _generator.init( new SecureRandom(str.getBytes()));  
             key = _generator.generateKey();  
            _generator = null ;  
        } catch (Exception e) {  
            throw new RuntimeException(  
                   "Error initializing SqlMap class. Cause: " + e);  
        }  
     }  
    
     
     
     /**
      * 
      * TODO.
      *采用DES方式 加密 字符串
      * @param strMing String 明文输入
      * @return String 密文输出 
      */
     public static String encryptStr(String strMing) {  
    	 setKey();
        byte [] byteMi = null ;  
        byte [] byteMing = null ;  
        String strMi = "" ;  
        BASE64Encoder base64en = new BASE64Encoder();  
        try {  
            byteMing = strMing.getBytes( "UTF8" );  
            byteMi = encryptByte(byteMing);  
            strMi = base64en.encode(byteMi);  
        } catch (Exception e) {  
            throw new RuntimeException(  
                   "Error initializing SqlMap class. Cause: " + e);  
        } finally {  
            base64en = null ;  
            byteMing = null ;  
            byteMi = null ;  
        }  
        return strMi;  
     }  
    
     /** 
      * 
      * TODO.
      * 采用DES方式解密字符串
       * 解密 以 String 密文输入 ,String 明文输出 
       * 
       * @param strMi  String 密文输入
       * @return  String 明文输出 
       */  
     public static  String decryptStr(String strMi) {  
    	 setKey();
        BASE64Decoder base64De = new BASE64Decoder();  
        byte [] byteMing = null ;  
        byte [] byteMi = null ;  
        String strMing = "" ;  
        try {  
            byteMi = base64De.decodeBuffer(strMi);  
            byteMing = decryptByte(byteMi);  
            strMing = new String(byteMing, "UTF8" );  
        } catch (Exception e) {  
            throw new RuntimeException(  
                   "Error initializing SqlMap class. Cause: " + e);  
        } finally {  
            base64De = null ;  
            byteMing = null ;  
            byteMi = null ;  
        }  
        return strMing;  
     }  
    
     /** 
       * 加密以 byte[] 明文输入 ,byte[] 密文输出 
       * 
       * @param byteS 
       * @return 
       */  
     private static byte [] encryptByte( byte [] byteS) {  
        byte [] byteFina = null ;  
        Cipher cipher;  
        try {  
            cipher = Cipher.getInstance ( "DES" );  
            cipher.init(Cipher. ENCRYPT_MODE , key );  
            byteFina = cipher.doFinal(byteS);  
        } catch (Exception e) {  
            throw new RuntimeException(  
                   "Error initializing SqlMap class. Cause: " + e);  
        } finally {  
            cipher = null ;  
        }  
        return byteFina;  
     }  
    
     /** 
       * 解密以 byte[] 密文输入 , 以 byte[] 明文输出 
       * 
       * @param byteD 
       * @return 
       */  
     private  static byte [] decryptByte( byte [] byteD) {  
        Cipher cipher;  
        byte [] byteFina = null ;  
        try {  
            cipher = Cipher.getInstance ( "DES" );  
            cipher.init(Cipher. DECRYPT_MODE , key );  
            byteFina = cipher.doFinal(byteD);  
        } catch (Exception e) {  
            throw new RuntimeException(  
                   "Error initializing SqlMap class. Cause: " + e);  
        } finally {  
            cipher = null ;  
        }  
        return byteFina;  
     }  
    
     /** 采用 DES 算法加密文件 
       * 文件 file 进行加密并保存目标文件 destFile 中 
       * 
       * @param file 
       *             要加密的文件 如 c:/test/srcFile.txt 
       * @param destFile 
       *             加密后存放的文件名 如 c:/ 加密后文件 .txt 
       */  
     public static void encryptFile(String file, String destFile) throws Exception {  
    	 setKey();
        Cipher cipher = Cipher.getInstance ( "DES" );  
        // cipher.init(Cipher.ENCRYPT_MODE, getKey());  
        cipher.init(Cipher. ENCRYPT_MODE ,  key );  
        InputStream is = new FileInputStream(file);  
        OutputStream out = new FileOutputStream(destFile);  
        CipherInputStream cis = new CipherInputStream(is, cipher);  
        byte [] buffer = new byte [1024];  
        int r;  
        while ((r = cis.read(buffer)) > 0) {  
            out.write(buffer, 0, r);  
        }  
        cis.close();  
        is.close();  
        out.close();  
     }  
    
     /** 
       * 采用 DES 算法解密文件 
       * 
       * @param file 
       *             已加密的文件 如 c:/ 加密后文件 .txt * 
       * @param destFile 
       *             解密后存放的文件名 如 c:/ test/ 解密后文件 .txt 
       */  
     public  static void decryptFile(String file, String dest) throws Exception {  
    	 setKey();
        Cipher cipher = Cipher.getInstance ( "DES" );  
        cipher.init(Cipher. DECRYPT_MODE , key );  
        InputStream is = new FileInputStream(file);  
        OutputStream out = new FileOutputStream(dest);  
        CipherOutputStream cos = new CipherOutputStream(out, cipher);  
        byte [] buffer = new byte [1024];  
        int r;  
        while ((r = is.read(buffer)) >= 0) {  
            cos.write(buffer, 0, r);  
        }  
        cos.close();  
        out.close();  
        is.close();  
     }  
   
     public static void main(String[] args) throws Exception {  
    	// Encrypt des = new Encrypt( "1234567" );  
        // DES 加密文件  
        // des.encryptFile("G:/test.doc", "G:/ 加密 test.doc");  eL9shDvpMO5rJlj9G07EYoJ3gatQYZTPD8KZUo2g+UM=
        // DES 解密文件  
        // des.decryptFile("G:/ 加密 test.doc", "G:/ 解密 test.doc");  
        String str1 = " fdsfgreglgf" ;  
        // DES 加密字符串  
        String str2 = Encrypt.encryptStr(str1);  
        // DES 解密字符串  
        String deStr = Encrypt.decryptStr(str2);  
        System. out .println( " 加密前： " + str1);  
        System. out .println( " 加密后： " + str2);  
        System. out .println( " 解密后： " + deStr);  
     }  
	

}

/*
*$Log: av-env.bat,v $
*/