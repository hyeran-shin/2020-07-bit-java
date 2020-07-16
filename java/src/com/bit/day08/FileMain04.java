package com.bit.day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileMain04 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis = null;

		try {
			fr = new FileReader("sample/sample.txt");
			int data = -1;
			int count = 0;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
				count++;
			}
			System.out.println();
			System.out.println("Read Count : " + count);

//			FileInputStream
			fis = new FileInputStream("sample/sample.txt");
			count = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
				count++;
			}
			System.out.println("");
			System.out.println("Read Count : " + count);

		} catch (FileNotFoundException fnfe) {
			System.out.println("error : " + fnfe);
		} catch (IOException ex) {
			System.out.println("error : " + ex);
		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}
}
