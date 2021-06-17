package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException{	//IO는 input/output임

		
		//UTF-8 외에 다른 포맷일때
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");//제일 얇은 빨대 꽂고,
		InputStreamReader isr = new InputStreamReader(in, "MS949");//주스트림 꽂고 어떤 포맷인지,
		BufferedReader br = new BufferedReader(isr);	//보조스트림(중간빨대) 꽂음. 얘가 제일 큰 빨대
		
		
		String line = "";	//공간 만듦
		
		while(true) {
			line = br.readLine();	//	한 줄씩 읽어
			if(line == null) {	//한줄씩 읽다가 null이면 끝내셈	
				break;
			}
			
			System.out.println(line);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		br.close();
		
	}

}
