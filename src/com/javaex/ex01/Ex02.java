package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteBufferimg.jpg");
		
		//int[] intArray = new int[3];	--> 기존 사용배열
		
		
		int data;
		byte[] buff = new byte[1024];	//쟁반. ---> []안에 몇개씩 묶어서 갈거냐는 뜻.
										//기존 4바이트씩 쓰던애를 1024로 묶어서 감.
		
		System.out.println("copy start");
		while(true) {
			data = in.read(buff);
			if(data == -1) {
				System.out.println("copy finish: " + data);
				break;
			}
			out.write(buff);
			
		}
		
		
		
		out.close();	//Scanner처럼 해줘야함.
		in.close();
		
		
		
		
		
		
		
		
	}

}
