package com.bit.board;

import java.io.RandomAccessFile;

//글번호
public class BoardSequence {
	private static int no = 1; // 

	public synchronized static int getNo() {
		try(
				//RandomAccessFile 클래스 : 파일에 대한 입출력을 동시에 제공
				RandomAccessFile seqFile = new RandomAccessFile("board_seq.txt", "rw");
		){
			String str = seqFile.readLine();
			if (str != null) {
				no = Integer.parseInt(str);
			}
			int readNo = no;
			seqFile.seek(0);
			seqFile.writeBytes(String.valueOf(++readNo));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return no;
	}
}
