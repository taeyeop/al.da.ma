package problem2;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\K\\Desktop\\data.txt");

		Scanner sc = new Scanner(file);

		int T = sc.nextInt();
		for (int testcase = 0; testcase < T; testcase++) {
			int N = sc.nextInt();
			int[][] triangleArray = new int[N][];
			for (int i = 0; i < N; i++) {
				triangleArray[i] = new int[i + 1];
				for (int j = 0; j < i + 1; j++) {
					triangleArray[i][j] = sc.nextInt();
				}
			}

// Data Input Test
//			System.out.println("length : " + triangleArray.length);
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < i + 1; j++) {
//					System.out.println(triangleArray[i][j]);
//				}
//			}

			int maximumValue = 0;
			System.out.println("#" + (testcase + 1) + " " + maximumValue);
		}
		sc.close();
	}
}
