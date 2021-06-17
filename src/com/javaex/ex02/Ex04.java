package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException{

		//파일 읽기		
		InputStreamReader ir = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(ir);
		
		String str = "";
		
		while (true) {
			str = br.readLine();
			
			if(str == null) {
				break;
			}
			System.out.println(str);
		}

		br.close();
		ir.close();
		
		
		
		
		
		
	}

}
