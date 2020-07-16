package com.bit.day07.prob;


public class Manager {
	public void process() {
		int key = 0;
		ManagerDAO dao = new ManagerDAO();

		while ((key = dao.menu()) != 0) {
			if (key >= 0 && key < 6) {
					switch(key) {
					case 1: dao.insertMember(); break;
					case 2: dao.deleteMember(); break;
					case 3: dao.selectOneMember(); break;
					case 4: dao.selectMember(); break;
					case 5: dao.updateMember(); break;
				}
			}else if(key==-1){
				System.out.println("숫자만 입력하세요.(문자X)");
			}else {
				System.out.println("해당 메뉴 없음.");
			}
		}
	}

}
