package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException{

		//읽기 --> 입력
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		String str = "";
		
		while(true) {
			str = br.readLine();	//전부 읽는게 아닌 한줄씩 읽어온다, 줄바꿈 기호는 안들어감. only 텍스트만 들어감
				//str이 null이 됨.
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		
		
		
		
		
		
		br.close();
		fr.close();
		
	}

}
