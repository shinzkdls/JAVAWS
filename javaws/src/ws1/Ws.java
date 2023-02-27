package ws1;

import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Commend[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Quit..");
				break;
			} else if (cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성 하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배결의 합과 평균을 출력한다.
			} else if (cmd.equals("a2")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성 하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수 번재 숫자들의 합과 평균을 출력한다.
			} else if (cmd.equals("a3")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성 하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수값만의 합과 평균을 출력한다.
			} else if (cmd.equals("a4")) {
				// 5~9까지의 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배결의 합과 평균을 출력한다.
				System.out.println("5~9 사이의 숫자를 2개입력해주세요.");
				int a;
				int b;
				while (true) {
					System.out.println("첫번째 숫자 입력");
					a = sc.nextInt();
					if (a < 5 || a > 9) {
						System.out.println("잘못된 입력 범위입니다.");
						continue;
					}
					break;
				}
				while (true) {
					System.out.println("두번째 숫자 입력");
					b = sc.nextInt();
					if (b < 5 || b > 9) {
						System.out.println("잘못된 입력 범위입니다.");
						continue;
					}
					break;
				}
				int[][] arr = new int[a][b];
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = new Random().nextInt(9) + 1;
						System.out.print(arr[i][j] + " ");
						sum = sum + arr[i][j];
					}
					System.out.println("");
				}
				System.out.println("");
				double avg = (1.0 * sum) / (a * b);
				System.out.println("2중 배열의 합: " + sum);
				System.out.println("2중 배열의 평균: " + avg);
				System.out.println("");
			} else {
				System.out.println("Invalid Command..");
				System.out.println("Tri Again..");
			}
		} // end while
		System.out.println("Bye..");
		sc.close();
	}

}
