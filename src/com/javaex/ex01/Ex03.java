package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException{

		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");	// 주스트림
		BufferedInputStream bin = new BufferedInputStream(in);	//보조스트림
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\buffimg.jpg");	//주스트림
		BufferedOutputStream bout = new BufferedOutputStream(out);	//보조스트림
		
		
		
		int data;
		
		System.out.println("copy start");
		while(true) {
			data = bin.read();	//--> 지가 알아서 담는다. 굳이 1024 이런거 안써줘도 됨.
			if(data == -1) {
				System.out.println("copy finish" + data);
				break;
			}
			bout.write(data);
			
		}
		
		
		bout.close();	//Scanner처럼 해줘야함.
		bin.close();
		
		
		
	}

}
