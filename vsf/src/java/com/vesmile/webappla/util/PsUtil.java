package com.vesmile.webappla.util;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;


public class PsUtil {
	private static final String MD5 = "MD5";
	private static final String SHA = "SHA";	
	private static final String ALL_CHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";


	public static final String encryptPsw(String psw) {
		try {
			byte[] code = encrypt(encrypt(psw.getBytes("utf-8"), MD5),SHA);
			return new String(Base64.encodeBase64(Base64.encodeBase64(code)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	
	public static byte[] encrypt(byte[] data, String method)
			throws Exception {
		MessageDigest md5 = MessageDigest.getInstance(method);
		md5.update(data);
		return md5.digest();
	}
	

    public static String generatePsw(int length) //参数为返回随机数的长度
    {
     StringBuffer sb = new StringBuffer();
     Random random = new Random();
     for (int i = 0; i < length; i++)
     {
      sb.append(ALL_CHAR.charAt(random.nextInt(ALL_CHAR.length())));
     }
    return sb.toString();
    }

	
	public static void main(String[] args) {
		System.out.println(generatePsw(8));
		System.out.println(encryptPsw("cdl19851018"));
		System.out.println("TnovYWx5OGVSNE5zNXdGYnNMYmJEdUoxQnFFPQ==".equals(encryptPsw("cdl19851018")));
	}
	

}