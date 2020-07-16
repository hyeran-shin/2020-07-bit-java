package com.bit.alg0212;

public class alg02 {
	static int ans = -1;

	public static void main(String[] args) {

		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		boolean[] arr = new boolean[completion.length];
		String ans = "";

		for (int i = 0; i < participant.length; i++) {
			boolean p = false;
			for (int j = 0; j < completion.length; j++) {
				if (participant[i] == completion[j]) {
					if (arr[j] == false) {
						arr[j] = true;
						p = true;
						break;
					} else {
						ans = participant[i];
					}

				}

			}
			if (p == false) {
				ans = participant[i];
			}

		}

		System.out.println(ans);

	}
}
