package ws1;

import java.util.Arrays;
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
				System.out.println("Input Number 5~9...");
				int a2Number = sc.nextInt();
				
				// 입력 받은 숫자만큼 배열을 생성 하고
				int arr[] = new int[a2Number];
				
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				Random r = new Random();

				for (int i = 0; i < arr.length; i++) {
					arr[i] = r.nextInt(9) + 1;
				}

				// 배열 정보를 출력한다.
				System.out.println(Arrays.toString(arr));
				
				// 짝수 번재 숫자들의 합과 평균을 출력한다.
				int sum = 0;
				double avg = 0.0;
				int cnt = 0;
				
				for (int i=0; i <arr.length ; i++) {
					if (i%2 == 0) {
						sum += arr[i];
						cnt++;
					}					
				}
				avg = sum / (cnt*1.0);
				System.out.printf("합계는 %d, 평균은 %4.2f\n\n", sum, avg);
				
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
			} else {
				System.out.println("Invalid Command..");
				System.out.println("Tri Again..");
			}
		} // end while
		System.out.println("Bye..");
		sc.close();
	}

}
