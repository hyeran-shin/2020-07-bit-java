package com.bit.board;

import java.io.RandomAccessFile;

public class BoardSequence {
	private static int no = 1; // 
	
	public synchronized static int getNo() {
		try (
				RandomAccessFile seqFile = new RandomAccessFile("board_seq.txt", "rw"); // 읽고 쓰는 거 동시에 해주는 RandomAccessFile
		) {
			String str = seqFile.readLine();
			if(str!=null) {
				no = Integer.parseInt(str);
			}
			int readNo = no;
			seqFile.seek(0); //파일의 맨 처음으로 옮겨가라 // 위치를 직접 옮기는? 3을 입력하고 커서깜빡인후 1입력하면 13? 1?
			seqFile.writeBytes(String.valueOf(++readNo));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return no;
	
	}
}
