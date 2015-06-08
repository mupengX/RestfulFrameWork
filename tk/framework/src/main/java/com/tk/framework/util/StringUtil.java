package com.tk.framework.util;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Field;

import org.apache.commons.lang.exception.NestableRuntimeException;


/**
 * <pre> 
 *  
 *  File: StringUtil.java
 *  
 *  Copyright (C): 2014
 *  Description: 字符串工具类
 *  TODO
 * 
 *  Notes:
 *  $Id: StringUtil.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:50:47>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
public final class StringUtil
{
	/**
	 * Initialize array to quickly identify if it is a HTML special char.
	 * '<', '>', '&', '"', '\''
	 */
	private static byte[] htmlSpecialCharPool = new byte[256];
	/**
	 * Initialize array to quickly identify if it is a EC special char.
	 * '=', ','
	 */
	private static byte[] ecSpecialCharPool = new byte[256];
	/**
	 * Initialize array to quickly identify if it is a JavaScript special char.
	 * '\b', '\n','\t','\f','\r', '\'','"','\\','/'
	 */
	private static byte[] jsSpecialCharPool = new byte[256];
	
	/**
	 * Initialize array to quickly identify if it is a XML special char.
	 * '&', '\\', '<','>', '\r', '\n', '"'
	 */
	private static byte[] xmlSpecialCharPool = new byte[256];
	
	/**
	 * PK special char 
	 * '.', '-', '%', '/', '\\', ':', '*', '\"', '<', '>', '|', '?', ' ', '&', '#' 
	 */
	private static byte[] pkEscapeSpecialCharPool = new byte[256];
	
	/**
	 * HTML char '<', '>', '&', '"', '\''
	 */
	private static final String[] HTML_CHAR = new String[] { "&lt;", "&gt;",
		"&amp;", "&quot;", "&#39;"};
	/**
	 * EC encoding
	 * keyword : "==", ",,"
	 * 
	 * Encoding string value as below, 
	 * '='  ==> "\\=" 
	 * ','  ==> "\\,"
	 */
	private static final String[] EC_CHAR = new String[] { "\\=", "\\,"};

	/**
	 * JS char '\b', '\n','\t','\f','\r', 
	 * '\'','"','\\','/'
	 */
	private static final String[] JS_CHAR = new String[] { "\\b", "\\n", "\\t", "\\f", "\\r",
		"\\'", "\\\"", "\\\\", "\\/"};
	
	/**
	 * XML char '&', '\\', '<','>', '\r', '\n', '"'
	 */
	private static final String[] XML_CHAR = new String[] { "&amp;",
			"&lt;", "&gt;", "&#10;", "&#13;", "&quot;" };
	
	/**
	 * 	PK escape special char '.', '-', '%', '/', '\\', ':', '*', '\"', '<', '>', '|', '?', ' ', '&' ,'#'
	 */
	private static final String[] PK_CHAR = new String[] {".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8",
			".9", ".a", ".b", ".c", ".d", ".e",".f"};

	static
	{
		for (int i = 0; i < 256; i++)
		{
			htmlSpecialCharPool[i] = -1;
			ecSpecialCharPool[i] = -1;
			jsSpecialCharPool[i] = -1;
			xmlSpecialCharPool[i] = -1;
			pkEscapeSpecialCharPool[i] = -1;
		}
		//HTML encoding '<', '>', '&', '"', '\''
		htmlSpecialCharPool['<'] = 0;
		htmlSpecialCharPool['>'] = 1;
		htmlSpecialCharPool['&'] = 2;
		htmlSpecialCharPool['"'] = 3;
		htmlSpecialCharPool['\''] = 4;
		//Key/Value encoding '=', ','
		ecSpecialCharPool['='] = 0;
		ecSpecialCharPool[','] = 1;
		/**
		 * JS char '\b', '\n','\t','\f','\r', 
		 * '\'','"','\\','/'
		 */
		jsSpecialCharPool['\b'] = 0;
		jsSpecialCharPool['\n'] = 1;
		jsSpecialCharPool['\t'] = 2;
		jsSpecialCharPool['\f'] = 3;
		jsSpecialCharPool['\r'] = 4;
		jsSpecialCharPool['\''] = 5;
		jsSpecialCharPool['"'] = 6;
		jsSpecialCharPool['\\'] = 7;
		jsSpecialCharPool['/'] = 8;

		//XML encoding '&', '\\', '<','>', '\r', '\n', '"'
		/**
		 * XML char '&', '\\', '<','>', '\r', '\n', '"'
		 */
		
		xmlSpecialCharPool['&'] = 0;
		xmlSpecialCharPool['<'] = 1;
		xmlSpecialCharPool['>'] = 2;
		xmlSpecialCharPool['\r'] = 3;
		xmlSpecialCharPool['\n'] = 4;
		xmlSpecialCharPool['"'] = 5;

		/**
		 * PK special char 
		 * '.', '-', '%', '/', '\\', ':', '*', '\"', '<', '>', '|', '?', ' ', '&' ,'#'
		 */
		pkEscapeSpecialCharPool['.'] = 0;
		pkEscapeSpecialCharPool['-'] = 1;
		pkEscapeSpecialCharPool['%'] = 2;
		pkEscapeSpecialCharPool['/'] = 3;
		pkEscapeSpecialCharPool['\\'] = 4;
		pkEscapeSpecialCharPool[':'] = 5;
		pkEscapeSpecialCharPool['*'] = 6;
		pkEscapeSpecialCharPool['\"'] = 7;
		pkEscapeSpecialCharPool['<'] = 8;
		pkEscapeSpecialCharPool['>'] = 9;
		pkEscapeSpecialCharPool['|'] = 10;
		pkEscapeSpecialCharPool['?'] = 11;
		pkEscapeSpecialCharPool[' '] = 12;
		pkEscapeSpecialCharPool['&'] = 13;
		pkEscapeSpecialCharPool['#'] = 14;
		pkEscapeSpecialCharPool['+'] = 15;
	}

	/**
	 * Encode string following HTML specification.
	 * 
	 * @param html HTML snippet
	 * @return
	 */
	public static String encodeHTML(String html)
	{
		if (html == null || html.length() == 0)
		{
			return "";
		}
		return replaceCharWithString(html, htmlSpecialCharPool, HTML_CHAR);
	}
	/**
	 * Encode string following XML specification.
	 * 
	 * @param xml XML snippet
	 * @return
	 */
	public static String encodeXML(String xml)
	{
		if (xml == null || xml.length() == 0)
		{
			return "";
		}
		return replaceCharWithString(xml, xmlSpecialCharPool, XML_CHAR);
	}
	/**
	 * EC encoding. 
	 * Convert the string as below,
	 * '=' ==> "\\="
	 * ',' ==> "\\,"
	 * 
	 * @param strValue string value.
	 * @return
	 */
	public static String encodeEC(String strValue)
	{
		if (strValue == null || strValue.length() == 0)
		{
			return "";
		}
		return replaceCharWithString(strValue, ecSpecialCharPool, EC_CHAR);
	}
	/**
	 * EC decoding . 
	 * Convert the string as below,
	 * "\\=" ==> '='
	 * "\\," ==> ','
	 * 
	 * @param strValue string value.
	 * @return
	 */
	public static String decodeEC(String strValue)
	{
		if (strValue == null || strValue.length() == 0)
		{
			return "";
		}
		StringBuilder result = null;
		String decodedString = strValue;
		int len = strValue.length();
		for (int i = 0; i < len; i++)
		{
			char filtered = checkECSpecialChar(strValue, i, len);
			if (result == null)
			{
				if (filtered != 0)
				{
					result = new StringBuilder(strValue.length() + 10);
					if (i > 0)
					{
						result.append(strValue.substring(0, i));
					}
					i = i + 1;
					result.append(filtered);
				}
			}
			else
			{
				if (filtered == 0)
				{
					result.append(strValue.charAt(i));
				}
				else
				{
					result.append(filtered);
					i = i + 1;
				}
			}
		}
		if (result != null)
		{
			decodedString = result.toString();
		}
		return decodedString;
	}
	/**
	 * Check EC special char.
	 *
	 * @param strValue	original string
	 * @param index		pointer position
	 * @param len		string length.
	 * @return
	 */
	private static char checkECSpecialChar(String strValue, int index, int len)
	{
		char specialChar = 0;
		char val = strValue.charAt(index);
		if (val == '\\' && index + 1 < len)
		{
			char val2 = strValue.charAt(index + 1);
			if (val2 == '=' || val2 == ',')
			{
				specialChar = val2;
			}
		}
		return specialChar;
	}
	/**
	 * Replace char with string in long string. 
	 * oldChar = new char[] {'&', '\', '<', '>'}; 
	 * newString = new String[] {"&amp;", "&quot;", "&lt;", "&gt;"};
	 * 
	 * @param srcString 	source char array
	 * @param oldCharPool 	The char array will be replaced.
	 * @param newChar 		The char array to be replaced.
	 * @return
	 */
	private static String replaceCharWithString(String srcString,
			byte[] oldCharPool, String[] newChar)
	{
		StringBuilder result = null;
		int length = srcString.length();
		for (int i = 0; i < length; i++)
		{
			String filtered = null;
			int val = srcString.charAt(i);
			if (val < 256 && oldCharPool[val] > -1)
			{
				filtered = newChar[oldCharPool[val]];
			}
			if (result == null)
			{
				if (filtered != null)
				{
					result = new StringBuilder(length + 20);
					if (i > 0)
					{
						result.append(srcString.substring(0, i));
					}
					result.append(filtered);
				}
			}
			else
			{
				if (filtered == null)
				{
					result.append(srcString.charAt(i));
				}
				else
				{
					result.append(filtered);
				}
			}
		}
		if (result == null)
		{
			return srcString;
		}
		else
		{
			return result.toString();
		}
	}	
	
	/**
	 * JavaScript encoding. 
	 * 1. Handle unicode char 
	 * 	 unicode char ==> "\\u0000"
	 * Convert the string as below,
	 * JS char:
	 *  '\b', '\n','\t','\f','\r', '\'','"','\\','/'
	 * ==>
	 * "\\b", "\\n", "\\t", "\\f", "\\r","\\'", "\\\"", "\\\\", "\\/"
	 * 
	 * @param strValue string value.
	 * @return
	 */
	public static String encodeJS(String strValue)
	{
		if (strValue == null || strValue.length() == 0)
		{
			return "";
		}
		return replaceJSCharWithString(strValue, jsSpecialCharPool, JS_CHAR);
	}
	/**
	 * Replace JS char with string. 
	 * 1. At first, the program will handle unicode char.
	 * 2. Replace special char.
	 * 3. handle other char.
	 * replace special char as below:
	 *
	 * JS char:
	 *  '\b', '\n','\t','\f','\r', '\'','"','\\','/'
	 * ==>
	 * "\\b", "\\n", "\\t", "\\f", "\\r","\\'", "\\\"", "\\\\", "\\/"
	 * 
	 * @param srcString 	source char array
	 * @param oldCharPool 	The char array will be replaced.
	 * @param newChar 		The char array to be replaced.
	 * @return
	 */
	private static String replaceJSCharWithString(String srcString,
			byte[] oldCharPool, String[] newChar)
	{
		StringBuilder result = null;
		for (int i = 0; i < srcString.length(); i++)
		{
			String filtered = checkJSSpecialChar(srcString, i, oldCharPool, newChar);
			if (result == null)
			{
				if (filtered != null)
				{
					result = new StringBuilder(srcString.length() + 20);
					if (i > 0)
					{
						result.append(srcString.substring(0, i));
					}
					result.append(filtered);
				}
			}
			else
			{
				if (filtered == null)
				{
					result.append(srcString.charAt(i));
				}
				else
				{
					result.append(filtered);
				}
			}
		}
		if (result == null)
		{
			return srcString;
		}
		else
		{
			return result.toString();
		}
	}	
	
	private static String checkJSSpecialChar(String srcString, int index, byte[] oldCharPool, String[] newChar)
	{
		String specialResult = null;
		char currentChar = srcString.charAt(index);
		 // handle unicode
		if (currentChar > 0x7f)
		{
			specialResult = hex(currentChar);
		}
		// Handle special char '\b', '\n','\t','\f','\r', '\'','"','\\','/'
		else if (oldCharPool[currentChar] > -1)
		{
			specialResult = newChar[oldCharPool[currentChar]];
		}
		// Handle other unicode
		else if (currentChar < 32)
		{
			specialResult = hex(currentChar);
		}
		// else
		// {
		// Don't handle normal char(7f >= char >=32)
		// }
		return specialResult;
	}
	/**
	 * <p>Returns an upper case hexadecimal <code>String</code> for the given
	 * character.</p>
	 * 
	 * @param currentChar The character to convert.
	 * @return An upper case hexadecimal <code>String</code>
	 */
	private static String hex(char currentChar) 
	{
		String result = null;
		if (currentChar > 0xfff)
		{
			result = "\\u" + Integer.toHexString(currentChar).toUpperCase();
		}
		else if (currentChar > 0xff)
		{
			result = "\\u0" + Integer.toHexString(currentChar).toUpperCase();
		}
		else if (currentChar > 0xf)
		{
			result = "\\u00" + Integer.toHexString(currentChar).toUpperCase();
		}
		else
		{
			result = "\\u000" + Integer.toHexString(currentChar).toUpperCase();
		}
		return result;
	}	
	
	/**
	 * Encode URL with UTF-8 char set.
	 * 
	 * @param url URL
	 * @return
	 */
	public static String encodeUrl(String url)
	{
		if (url == null || url.length() == 0)
		{
			return "";
		}
		String result;
		try
		{
			result = java.net.URLEncoder.encode(url, "UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			result = url;
		}
		return result;
	}
	
	/**
	 * Double encode URL with UTF-8 char set. 
	 * Illegal hex characters in escape (%) pattern
	 * 
	 * @param url
	 * @return
	 */
	public static String doubleEncodeUrl(String url)
	{
	    if (url == null || url.length() == 0)
        {
            return "";
        }
	    return encodeUrl(encodeUrl(url));
	}
	/**
	 * decode URL with UTF-8 char set.
	 * 
	 * @param url URL
	 * @return
	 */
	public static String decodeUrl(String url)
	{
		if (url == null || url.length() == 0)
		{
			return "";
		}
		String result;
		try
		{
			result = java.net.URLDecoder.decode(url, "UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			result = url;
		}
		return result;
	}
	
	/**
     * Double decode URL with UTF-8 char set. 
     * Illegal hex characters in escape (%) pattern
     * 
     * @param url
     * @return
     */
    public static String doubleDecodeUrl(String url)
    {
        if (url == null || url.length() == 0)
        {
            return "";
        }
        return decodeUrl(decodeUrl(url));
    }
	
	/**
	 * decode javascript
	 * 
	 * @param str String
	 * @return
	 */
	public static String unescapeJavaScript(String str)
    {
        return unescapeJava(str);
    }
	
	/**
	 * decode Java String
	 * @param str Java String
	 * @return
	 */
	public static String unescapeJava(String str)
    {
        if(str == null)
        {
            return null;
        }
        try
        {
            StringWriter writer = new StringWriter(str.length());
            unescapeJava(((Writer) (writer)), str);
            return writer.toString();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return null;
    }

	/**
	 * decode Java String
	 * 
	 * @param out Writer
	 * @param str String
	 * @throws IOException
	 */
    public static void unescapeJava(Writer out, String str)
        throws IOException
    {
        if(out == null)
        {
            throw new IllegalArgumentException("The Writer must not be null");
        }
        if(str == null)
        {
            return;
        }
        int stringLen = str.length();
        StringBuilder unicode = new StringBuilder(4);
        boolean hadSlash = false;
        boolean inUnicode = false;
        for(int i = 0; i < stringLen; i++)
        {
            char ch = str.charAt(i);
            if(inUnicode)
            {
                unicode.append(ch);
                if(unicode.length() == 4)
                {
                    try
                    {
                        int value = Integer.parseInt(unicode.toString(), 16);
                        out.write((char)value);
                        unicode.setLength(0);
                        inUnicode = false;
                        hadSlash = false;
                    }
                    catch(NumberFormatException nfe)
                    {
                        throw new NestableRuntimeException("Unable to parse unicode value: " + unicode, nfe);
                    }
                }
            } 
            else
            if(hadSlash)
            {
                hadSlash = false;
                switch(ch)
                {
                case 92: // '\\'
                    out.write(92);
                    break;

                case 39: // '\''
                    out.write(39);
                    break;

                case 34: // '"'
                    out.write(34);
                    break;

                case 114: // 'r'
                    out.write(13);
                    break;

                case 102: // 'f'
                    out.write(12);
                    break;

                case 116: // 't'
                    out.write(9);
                    break;

                case 110: // 'n'
                    out.write(10);
                    break;

                case 98: // 'b'
                    out.write(8);
                    break;

                case 117: // 'u'
                    inUnicode = true;
                    break;

                default:
                    out.write(ch);
                    break;
                }
            } 
            else
            if(ch == '\\')
            {
                hadSlash = true;
            }
            else
            {
                out.write(ch);
            }
        }

        if(hadSlash)
        {
            out.write(92);
        }
    }
    
    /**
     * 
     * Separate the number and string from the alphanumeric data. (Number is in the front.)
     * Sample: "1a" -> "1" and "a". "1" -> "1" and "". "a1" -> "" and "a1".
     *
     * @param string The alphanumeric data.
     * @return String[2]. String[0] is the number, String[1] is the string.
     */
    public static String[] separateNumberString(String string)
    {
    	char[] chars1 = string.toCharArray();
		int flag = 0;
		String[] numberString = {"",""};
		char charTemp;
		for(int i = 0; i < chars1.length; i++)
		{
			charTemp = chars1[i];
			if(Character.isDigit(charTemp)) // Flag the first char which is not number.
			{
				flag = i + 1;
			}
			else
			{
				break;
			}
		}
		
		if(flag > 0)
		{
			// Get number String.
			numberString[0] = string.substring(0, flag);
			if(flag <= chars1.length)
			{
				// Get character String.
				numberString[1] = string.substring(flag);
			}
		}
		else
		{
			numberString[1] = string;
		}
		
		// Return String[2]. String[0] is the number, String[1] is the string.
		return numberString;
    }
    
    /**
	 * Escape id value.
	 * Special char
	 * '.', '-', '%', '/', '\\', ':', '*', '\"', '<', '>', '|', '?', ' ', '&', '#'
	 * ==>
	 * ".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9", ".a", ".b", ".c", ".d", ".e"
	 *
	 * @param str the input string
	 * @return the string
	 */
	public static String encodePK(String str)
	{
		if (str == null || str.length() == 0)
		{
			return "";
		}
		return replaceCharWithString(str, pkEscapeSpecialCharPool, PK_CHAR);
	}

	/**
	 * Unescape id value.
	 * 
	 * ".0", ".1", ".2", ".3", ".4", ".5", ".6", ".7", ".8", ".9", ".a", ".b", ".c", ".d", ".e"
	 * ==>
	 * '.', '-', '%', '/', '\\', ':', '*', '\"', '<', '>', '|', '?', ' ', '&', '#'
	 *
	 * @param str the input string
	 * @return the string
	 */
	public static String decodePK(String str)
	{
		if (str == null || str.length() == 0)
		{
			return "";
		}

		int i = 0;
		StringBuilder result = new StringBuilder(str.length());

		while (i < str.length())
		{
			if (str.charAt(i) == '.')
			{
				if ((i + 1) < str.length())
				{
					char ch = str.charAt(i + 1);

					switch (ch)
					{
						case '0':
							result.append('.');
							break;
						case '1':
							result.append('-');
							break;
						case '2':
							result.append('%');
							break;
						case '3':
							result.append('/');
							break;
						case '4':
							result.append('\\');
							break;
						case '5':
							result.append(':');
							break;
						case '6':
							result.append('*');
							break;
						case '7':
							result.append('\"');
							break;
						case '8':
							result.append('<');
							break;
						case '9':
							result.append('>');
							break;
						case 'a':
							result.append('|');
							break;
						case 'b':
							result.append('?');
							break;
						case 'c':
							result.append(' ');
							break;
						case 'd':
							result.append('&');
							break;
						case 'e':
							result.append('#');
							break;
						case 'f':
							result.append('+');
							break;
						default:
							result.append(ch);
							break;
					}
					i = i + 2;
				}
				else
				{
					result.append(str.charAt(i));
					i++;
				}
			}
			else
			{
				result.append(str.charAt(i));
				i++;
			}
		}

		return result.toString();
	}
	
	
	

	
	
	/**
	 * 
	 * TODO.
	 *
	 * @param str
	 * @param strs
	 * @return
	 */
	public static boolean  isContainStr(String str,String []strs)
	{
		for(String s:strs)
		{
			if(str.equals(s))
			{
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	

	public static void main(String[] as)
	{
		String inputString = "ADBC-d/..d-\\123-.+.0|1+";

		for (int i = 0; i < inputString.length(); i++)
		{
			char c = inputString.charAt(i);
			System.out.print(c);
		}

		System.out.println();

		String escaped = encodePK(inputString);
		System.out.println(escaped);

		String unescaped = decodePK(escaped);
		System.out.println(unescaped);
	}

}

/*
*$Log: av-env.bat,v $
*/
