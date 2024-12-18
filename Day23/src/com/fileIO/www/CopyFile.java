package com.fileIO.www;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {

	public static void main(String[] args) throws IOException
	{

		File f1=new File("C:\\Files\\info123.txt");
		File f2=new File("C:\\Files\\copy.txt");
		
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout = new FileOutputStream(f2);
		
		int x;
		
		while((x=fin.read())!= -1)
		{
			fout.write(x);
		}
		
		System.out.println("File copied.....");
		
		fin.close();
		fout.close();
	}

}
