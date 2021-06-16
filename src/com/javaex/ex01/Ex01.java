package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException{	//파일 던져줌
		
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");	//try~catch문 사용해야함.
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");	//저장되는곳의 위치와 이름 써줘야함.
		
		
		
		
		int data;	//한모금씩 옮겨서 느림.ㅇㅋ?
		
		System.out.println("copy start");
		while (true) {	//느림
			data = in.read();	// 한 모금.(4바이트)
			
			if(data == -1) {
				System.out.println("copy finish: " + data);
				break;
			}
			
			out.write(data);			
			
		}	
		
		
		out.close();	//Scanner처럼 해줘야함.
		in.close();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
