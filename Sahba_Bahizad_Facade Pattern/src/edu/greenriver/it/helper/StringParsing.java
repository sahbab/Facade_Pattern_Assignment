package edu.greenriver.it.helper;

public final class StringParsing {

	public static String before(String subject, String delimiter)
	{
		
		String[] parts = subject.split(delimiter);
		return parts[0];
	}
	
	public static String after(String subject, String delimiter)
	{
		String[] parts = subject.split(delimiter);
		return parts[1];
	}
}
