package com.bit.board;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// 사용 시에만 받아오도록 Factory 정의
public class MysqlSessionFactory {
	private static SqlSession session = null;
	private String resource ="mybatis-config.xml";
	
	public MysqlSessionFactory() {
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			session = sqlSessionFactory.openSession();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public SqlSession getInstance() {
		return session;
	}
	
	
}
