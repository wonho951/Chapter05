package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) throws IOException{

		//연습문제
		
		//파일 읽기		
		InputStreamReader ir = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(ir);
		
		String str = "";
		/*
		while (true) {
			str = br.readLine();
			
			if(str == null) {
				break;
			}
			System.out.println(str);
		}*/
		
		
		ArrayList<Ex05> person= new ArrayList<Ex05>();
		
		Ex05 leejungjae = new Ex05("이정재", "010-2222-2222", "02-4332-9090");
		Ex05 jungwoosung = new Ex05("정우성", "010-0000-2345", "02-6552-2341");
		Ex05 yoojaeseok = new Ex05("유재석", "010-5555-5555", "02-7552-9994");
		Ex05 leehyoelee = new Ex05("이효리", "010-9999-7777", "02-900-9888");
		
		
		person.add(leejungjae);
		person.add(jungwoosung);
		person.add(yoojaeseok);
		person.add(leehyoelee);

		/*
		System.out.println("이름: " + name);
		System.out.println("핸드폰:" + hp);
		System.out.println("회사:" + company);
		System.out.println("");
		*/
		
		
		br.close();
		
		
		
		
		
		
		
	}

}
