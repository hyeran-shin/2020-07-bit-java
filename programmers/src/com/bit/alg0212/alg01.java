package com.bit.alg0212;
//완주하지 못한 선수
public class alg01 {

	public static void main(String[] args) {
		String[] a = { "leo", "kiki", "eden" };
		String[] b = { "eden" };
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		solution(a,b);
	}

	public static void solution(String[] participant, String[] completion) {
		String answer="";
		boolean[] result = new boolean[completion.length];

		for (int i = 0; i < participant.length; i++) {
			boolean x = false; //////

			for (int j = 0; j < completion.length; j++) {
				if (participant[i].contains(completion[j])) { // participant[i].equals(completion[j])
					// 이름 같
					if (result[j] == false) {
						result[j] = true;
						x = true;
						break;
					} else {
						result[i] = false;
					}
				} else {
				}
			}
			if (x == false) {
				answer = participant[i];
				System.out.println(answer);
			}
		}
	}

}