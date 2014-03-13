package com.vesmile.framework.util;


import java.io.UnsupportedEncodingException;
import java.util.Date;


public class CastUtil {
	public static String toText(Object obj) {
		if (obj == null)
			return "";
		if (obj instanceof Date) {
			return DateUtil.fmtDateToYMD((Date) obj);
		} else if (obj instanceof Boolean) {
			if (((Boolean) obj).booleanValue() == true)
				return "true";
			else
				return "false";
		} else {
			if(obj instanceof String){
				if("null".equals(obj)){
					return "";
				}
			}
			return obj.toString();
		}
	}

	public static String toDateStr(Object obj) {
		if (obj == null)
			return "";
		String dateValue = (String) obj;
		String dateFormate = dateValue.substring(0, 4) + "-"
				+ dateValue.substring(4, 6) + "-" + dateValue.substring(6, 8);
		return DateUtil.fmtDateToYMD(DateUtil.fmtStrToDate(dateFormate));
	}

	public static Object castValue(Object val, Class c) {
		if (val == null)
			return null;
		if ((java.lang.String.class).equals(c))
			return CastUtil.toString(val, null);
		if ((java.lang.Integer.class).equals(c) || Integer.TYPE.equals(c))
			return CastUtil.toInteger(val, null);
		if ((java.lang.Double.class).equals(c) || Double.TYPE.equals(c))
			return CastUtil.toDouble(val, null);
		if ((java.lang.Short.class).equals(c) || Short.TYPE.equals(c))
			return CastUtil.toShort(val, null);
		if ((java.lang.Long.class).equals(c) || Long.TYPE.equals(c))
			return CastUtil.toLong(val, null);
		if ((java.lang.Float.class).equals(c) || Float.TYPE.equals(c))
			return CastUtil.toFloat(val, null);
		if ((java.lang.Byte.class).equals(c) || Byte.TYPE.equals(c))
			return CastUtil.toByte(val, null);
		if ((java.lang.Boolean.class).equals(c) || Boolean.TYPE.equals(c))
			return CastUtil.toBoolean(val, null);
		if ((java.util.Date.class).equals(c) || (java.sql.Date.class).equals(c)) {
			return DateUtil.fmtStrToDate(String.valueOf(val));
		}
		return null;
	}

	public static boolean toBoolean(Byte be) {
		if (be == null || be.intValue() == 0)
			return false;
		return true;
	}

	public static Byte toByte(boolean be) {
		if (be == false)
			return new Byte("0");
		return new Byte("1");
	}

	public static String toString(Object obj, String def) {
		if (obj == null || "null".equalsIgnoreCase(obj.toString().trim())
				|| obj.toString().trim().equals(""))
			return def;
		try {
			return String.valueOf(obj).trim();
		} catch (Exception e) {
			return def;
		}
	}

	public static Byte toByte(Object obj, Byte def) {
		if (obj == null)
			return def;
		try {
			return Byte.valueOf(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static Short toShort(Object obj, Short def) {
		if (obj == null)
			return def;
		try {
			return Short.valueOf(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static int[] toInt(Object[] objs) {
		if (objs == null)
			return null;
		int[] ret = new int[objs.length];
		for (int i = 0; i < objs.length; i++) {
			ret[i] = toInt(objs[i], 0);
		}
		return ret;
	}

	public static Integer[] toInteger(Object[] objs) {
		if (objs == null)
			return null;
		Integer[] ret = new Integer[objs.length];
		for (int i = 0; i < objs.length; i++) {
			ret[i] = toInteger(objs[i], null);
		}
		return ret;
	}

	public static Double[] toDouble(Object[] objs, Double def) {
		if (objs == null)
			return null;
		Double[] ret = new Double[objs.length];
		for (int i = 0; i < objs.length; i++) {
			ret[i] = toDouble(objs[i], def);
		}
		return ret;
	}

	public static Double[] toDouble(Object[] objs) {
		return toDouble(objs, null);
	}

	public static Date[] toDate(String[] objs) {
		if (objs == null)
			return null;
		Date[] ret = new Date[objs.length];
		for (int i = 0; i < objs.length; i++) {
			ret[i] = DateUtil.fmtStrToDate(objs[i]);
		}
		return ret;
	}

	public static int toInt(Object obj, int def) {
		if (obj == null)
			return def;
		try {
			return Integer.parseInt(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static Integer boolan2Integer(Boolean b) {
		if (b == null)
			return null;
		if (b.booleanValue() == true)
			return new Integer(1);
		else
			return new Integer(0);
	}

	public static Integer toInteger(Object obj, Integer def) {
		if (obj == null)
			return def;
		try {
			if (obj instanceof Number) {
				Number n = (Number) obj;
				return new Integer(n.intValue());
			}
			return Integer.valueOf(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static Integer toInteger(Object obj) {
		return toInteger(obj, null);
	}

	public static Long toLong(Object obj, Long def) {
		if (obj == null)
			return def;
		try {
			return Long.valueOf(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static long toLong(Object obj, long def) {
		if (obj == null)
			return def;
		try {
			return Long.valueOf(String.valueOf(obj)).longValue();
		} catch (Exception e) {
			return def;
		}
	}

	public static Float toFloat(Object obj, Float def) {
		if (obj == null)
			return def;
		try {
			return Float.valueOf(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static Double toDouble(Object obj, Double def) {
		if (obj == null)
			return def;
		try {
			if (obj instanceof Number) {
				Number n = (Number) obj;
				return new Double(n.doubleValue());
			}
			if (obj.getClass().equals(java.lang.String.class))
				obj = ((String) obj).trim().replaceAll(",", "");
			return Double.valueOf(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static double toDouble(Object obj, double def) {
		if (obj == null)
			return def;
		try {
			if (obj.getClass().equals(java.lang.String.class))
				obj = ((String) obj).trim().replaceAll(",", "");
			return Double.valueOf(String.valueOf(obj)).doubleValue();
		} catch (Exception e) {
			return def;
		}
	}

	public static double toDouble(String obj, double def) {
		if (obj == null)
			return def;
		try {
			obj = obj.replaceAll(",", "");
			return Double.valueOf(String.valueOf(obj)).doubleValue();
		} catch (Exception e) {
			return def;
		}
	}

	public static Boolean toBoolean(Object obj, Boolean def) {
		if (obj == null)
			return def;
		try {
			return Boolean.valueOf(String.valueOf(obj));
		} catch (Exception e) {
			return def;
		}
	}

	public static String trimNull(Object obj) {
		if (obj == null || "null".equalsIgnoreCase(obj.toString()))
			return "";
		return obj.toString().trim();
	}

	public static String trimNull(Object obj, String dev) {
		if (obj == null || "null".equalsIgnoreCase(obj.toString()))
			return dev;
		return obj.toString().trim();
	}

	public static String repalceNull(String obj, String dev) {
		if (obj == null || "null".equalsIgnoreCase(obj.toString())
				|| "".equals(obj))
			return dev;
		return obj;
	}

	public static boolean isEmpty(Object obj) {
		return obj == null || "".equals(obj.toString().trim());
	}

	public static String toTextForHtml(Object obj) {
		if (isEmpty(obj) || "null".equalsIgnoreCase(obj.toString()))
			return "&nbsp;";
		return toString(obj, "&nbsp;").replaceAll("&", "&amp;").replaceAll("<",
				"&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;")
				.replaceAll("'", "&#146;").replaceAll("\n", "<br>").replaceAll(
						"\r", "").replaceAll("  ", " &nbsp;");
	}

	public static String firstCharToLower(String str) {
		if (str == null || str.trim().equals(""))
			return str;
		return (str.charAt(0) + "").toLowerCase() + str.substring(1);
	}

	public static boolean toBoolean(Integer inte) {
		return !(inte == null || inte.intValue() == 0);
	}

	public static void main(String[] args) {
		System.out.println(toInteger(new Double(1)));
	}

	public static String toString(boolean b) {
		return b ? "1" : "0";
	}

	public static boolean toBoolean(String str) {
		if (str == null || "0".equals(str))
			return false;
		return true;
	}

	public static boolean isGBK(String s) {
		if (s == null)
			return true;
		try {
			return new String(s.getBytes("GB2312")).equals(s);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static String isoToGbk(String para) {
		try {
			return new String(para.getBytes("ISO-8859-1"), "GBK");
		} catch (UnsupportedEncodingException e) {
			return "";
		} catch (Exception e) {
			return "";
		}
	}

	public static String toGBK(String s) {
		if (isGBK(s))
			return s;
		else
			return isoToGbk(s);
	}

	public static boolean toBoolean(Long v) {
		if (v == null || v.longValue() == 0)
			return false;
		return true;
	}

	
	public static String filter(String value) {    
		if (value == null)    
		return (null);    
		StringBuffer result = new StringBuffer();    
		for (int i = 0; i < value.length(); i++) {    
		char ch = value.charAt(i);    
		if (ch == '<')    
		result.append("&lt;");    
		else if (ch == '>')    
		result.append("&gt;");    
		else if (ch == '&')    
		result.append("&amp;");    
		else if (ch == '"')    
		result.append("&quot;");    
		else if (ch == '\r')    
		result.append("<BR>");    
		else if (ch == '\n') {    
		if (i > 0 && value.charAt(i - 1) == '\r') {    
		} else {    
		result.append("<BR>");    
		}    
		} else if (ch == '\t')    
		result.append("&nbsp;&nbsp;&nbsp;&nbsp");    
		else if (ch == ' ')    
		result.append("&nbsp;");    
		else    
		result.append(ch);    
		}    
		return (result.toString());    
		} 	
}
