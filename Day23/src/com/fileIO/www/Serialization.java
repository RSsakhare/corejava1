package com.fileIO.www;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) throws IOException
	{
		String data = "This is a test string";
	
		FileOutputStream f1 = new FileOutputStream("D:\\info123.txt");
		ObjectOutputStream os = new ObjectOutputStream(f1);
		
		os.writeObject(data);
		
		os.close();
		f1.close();
	}
}
