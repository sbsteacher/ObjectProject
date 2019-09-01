package com.pdh.obj.inheri.abc;

public class ScoreTest {

	public static void main(String[] args) {
		String[] names = {"영희", "철수", "민희", "동수"};
		int[][] scores = {
				{100, 50, 85, 100},
				{98, 55, 44, 50},
				{95, 54, 98, 10}
		};
		
		double[] avgScore = new double[4];
		int[] sumScore = new int[4];
	
		//총점 계산		
		for(int i=0; i<scores.length; i++) {			
			for(int z=0; z<scores[i].length; z++) {
				sumScore[z] += scores[i][z];				
			}				
		}
		
		//평점 계산
		for(int i=0; i<sumScore.length; i++) {
			avgScore[i] = (double)sumScore[i] / scores.length;
		}
		
		
		for(int i=0; i<names.length; i++) {
			System.out.printf("%s의 총점: %s, 평점: %f\n", names[i], sumScore[i], avgScore[i]);
		}

	}

}
