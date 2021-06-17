package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException{

		
		Writer fw = new FileWriter("C:\\\\\\\\javaStudy\\\\\\\\file\\\\\\\\song.txt");	//주스트림
		BufferedWriter bw = new BufferedWriter(fw);	//큰빨대 ()안에 주스트림 넣고
		
		bw.write("학교종이 땡땡땡 ");//줄바꿈이 편하다.속도도 좀 더 빠름
		bw.newLine();	//줄바꿈. \n은 os에 따라 미묘하게 다르기 때문에 newline써줌
		bw.write("어서 모이자 ");
		bw.newLine();
		bw.write("선생님이 우리를 ");
		bw.newLine();
		bw.write("기다리신다.");
		
		
		
		
		
		
		
		bw.close();//close 먼저 해주는게 좋음. 까먹을수도 있으니깐.
		
		
		
		
		//문제점이 있는 방식
		/*
		Writer fw = new FileWriter("C:\\\\javaStudy\\\\file\\\\song.txt");	//이미 있는 파일을 넣으면 기존에 있던 파일이 망가짐.주의요망
		String str = "학교종이 땡땡땡 어서 모이자 선생님이 우리를 기다리신다.";
		fw.write(str);	//이건 문제점이 많다. 텍스트 양이 많아질경우?
		fw.close();
		*/
		
		
		
	}

}
