package com.pdh.obj.inheri.abc;

public class ScoreTest2 {

	public static void main(String[] args) {
		String[] names = {"영희", "철수", "민희", "동수"};
		int[][] scores = {
				{100, 50, 85, 100},
				{98, 55, 44, 50},
				{95, 54, 98, 10}
		};
		
		double[] avgScore = new double[4];
		int[] sumScore = new int[4];
		

		
		for(int i=0; i<scores[0].length; i++) {			
			for(int z=0; z<scores.length; z++) {
				//System.out.println(scores[z][i]);
				sumScore[i] += scores[z][i];
			}	
			//System.out.println();
			avgScore[i] = (double)sumScore[i] / scores.length;
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.printf("%s의 총점: %s, 평점: %f\n", names[i], sumScore[i], avgScore[i]);
		}
	}

}
