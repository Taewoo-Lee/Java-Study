package chap01;

import java.util.Scanner;

class Alternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("+와 -를 번갈아 n개 출력합니다.");

		do {
			System.out.print("n 값 : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0)
				System.out.print('+');
			else
				System.out.print('-');
		}
		System.out.println();
		
		stdIn.close();
	}

}
