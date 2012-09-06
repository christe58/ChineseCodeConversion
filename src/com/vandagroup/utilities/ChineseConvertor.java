package com.vandagroup.utilities;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class ChineseConvertor {
	
	public static final String CHARSET_NAME = "x-MS950-HKSCS";

	public static String covertHKSCS(String i) throws CharacterCodingException{
		Charset charset = Charset.forName(CHARSET_NAME);
		CharsetDecoder decoder = charset.newDecoder();
		CharsetEncoder encoder = charset.newEncoder();
		ByteBuffer bbuf = encoder.encode(CharBuffer.wrap(i));
		return decoder.decode(bbuf).toString();
	}
}
