package com.bit.alg0213;
// 체육복
import java.util.stream.IntStream;

public class alg01 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        IntStream.range(0, lost.length)
                .forEach(i -> IntStream.range(0, reserve.length)
                        .filter(j ->  lost[i] == reserve[j])
                        .forEach(j -> lost[i] = reserve[j] = 0));

        for (int i = 0; i < lost.length ; i++) {
            if (lost[i] == 0) continue;
            answer--;
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == 0) continue;
                if (lost[i] == reserve[j] && i == j || Math.abs(lost[i] - reserve[j]) == 1) {
                    reserve[j] = 0;
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
	public static void main(String[] args) {
		
	}
}
