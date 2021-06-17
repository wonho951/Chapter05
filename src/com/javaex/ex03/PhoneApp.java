package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException{

		//선생님 답안
		
		
		//파일 읽는다. --> 한줄씩 --> 출력
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		String line = "";
		
		
		while (true) {
			line = br.readLine();	//이효리,010-2222-3333,031-2323-4441
			//자르는 코드가 여깄으면 쓸데없는 행동
			
			
			if (line == null) {
				break;
			}
			
			//여기에 자르는 코드 넣어줌			
			String[] pInfo = line.split(",");	//	내부적으로 new String[3] 이런거 지가 만듦. --> 자르는거기 때문에 []써줌.
			
			String name =  pInfo[0];
			String hp =  pInfo[1];
			String company =  pInfo[2];
			
			
			
			System.out.println("이름: " + name);	//해보고 테스트해보고 반복하는게 오류 찾기 쉬움.
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
		}
		
		
		
		
		br.close();
		
		
		
		
		
	}

}
