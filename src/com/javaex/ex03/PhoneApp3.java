package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp3 {

	public static void main(String[] args) throws IOException{

		
		//파일 읽는다. --> 한줄씩 --> 출력
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");	//빨대준비
		BufferedReader br = new BufferedReader(fr);
		

		
		//보관할 리스트 만들기.
		List<Person> pList = new ArrayList<Person>();	//리스트 준비 
		
		
		Person won = new Person("최원호", "010-112-119", "02-112-119");
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
			
			Person person = new Person(name, hp, company);	//Person이 메모리에 올라옴
			pList.add(person);	//보관되고 있다.
		}
		
		pList.add(won);
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		for(int i = 0; i < pList.size(); i++) {
			bw.write(pList.get(i).draw());
			bw.newLine();
		}
		

		
		
		
		
		
		
		
		//언제든지 보관하는걸 출력 가능
		for(int i = 0; i < pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());	//해보고 테스트해보고 반복하는게 오류 찾기 쉬움.
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
		
		bw.close();
		br.close();
		
		
		
		
		
	}

}
