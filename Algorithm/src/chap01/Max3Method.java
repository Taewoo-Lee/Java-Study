package chap01;

import java.util.Scanner;

//3개의 정숫값을 입력하고 최댓값을 구하여 출력

class Max3Method {
	// a, b, c의 최댓값으 구하여 반환
	static int max3(int a, int b, int c) {
		int max = a; // 최댓값
		if (b > max)
			max = b;
		if (c > max)
			max = c;

		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		System.out.print("b의 값: ");
		int b = stdIn.nextInt();
		System.out.print("c의 값: ");
		int c = stdIn.nextInt();
		System.out.println("max3(a,b,c) = " + max3(a, b, c));
		stdIn.close();
	}

}
