package com.chap1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCharStream2 {
	public static void main(String[] args) {
		FileCharStream2 fcs 
						= new FileCharStream2();
		//fcs.fileSave();
		//fcs.fileRead();
		fcs.fileReadStream();
	}
	public void fileReadStream() {
		System.out.println("start");
		try(FileInputStream fr = new  FileInputStream("D:\\work\\IOEx\\src\\com\\chap1\\A_File.java")){
//		try(FileReader fr = new  FileReader("b_char.txt")){
			int value = 0;
			//System.out.println((char)fr.read());
			
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void fileRead() {
		System.out.println("start");
		try(FileReader fr = new  FileReader("D:\\work\\IOEx\\src\\com\\chap1\\A_File.java")){
//		try(FileReader fr = new  FileReader("b_char.txt")){
			int value = 0;
			//System.out.println((char)fr.read());
			
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void fileSave() {
		
		// 리소스를 자동으로  close() 
		// FileWriter를 이용해서 파일을 생성하고 
		// 데이터를 문자단위로 저장 한다.
		try(FileWriter fw = new FileWriter("b_char.txt")){
			fw.write("IO 어떠신가요?!\n");
			fw.write("혼자서도 잘할수 있습니다!!");
			fw.write('A');
			fw.write(' ');
			fw.write('\n');
			fw.write(new char[]{'a','b','c','d'});
			
			fw.flush();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("fileSave() 종료");
		}
	}
}












