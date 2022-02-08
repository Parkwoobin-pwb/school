package com.musucovery.study.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.FieldPosition;

public class FileExceptionfHanding {

	public static void main(String[] args) {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("a.txt");
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
