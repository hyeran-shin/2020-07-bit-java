package com.bit.day08;
// 제일 중요 => 객체를 쓰고읽어?

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.bit.util.FileClose;
// 인스턴스가 파일에 저장되는 과정(저장을 위해 거치는 과정)을 가리켜 직렬화
// 그반대의 과정을 역직렬화
// 직렬화의 대상이 되는 인스턴스의 클래스는 Serializable 인터페이스를 구현해야하낟.
// 이건 직렬화의 대상임을 표시하는 인터페이스일뿐, 
// pdf 24장
@SuppressWarnings("serial")
class Member1 implements Serializable{ // implements Serializable 안하면 오류
	// Member1를 파일에 쓸 수 있도록 직렬화
	// 구현클래스만 파일에 쓸 수 있	다?
	private String name;
	private int age;
	private transient String addr; // 직렬화에서 제외, 
	
	public Member1(String name, int age, String addr) { // alt + shift+s+o
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() { // alt+shift + s+ r
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() { //alt+shift+ s+s
		return "Member1 [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	
}


public class FileMain06 {
	public static void write() {
		Member1 member = new Member1("장동건" , 45, "서울시 서초구");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		// com.bit.util .fileColse.java
		try {
			fos = new FileOutputStream("sample/object.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(member);
			
			System.out.println("저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos,oos);
		}
		
		
		
	}
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("sample/object.txt");
			ois = new ObjectInputStream(fis);
			
			Member1 member = (Member1)ois.readObject();
			
			System.out.println("읽기 완료");
			System.out.println(member.toString());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fis,ois);
		}
	}
	
	public static void main(String[] args) {
		write();
		read();
	}
}
