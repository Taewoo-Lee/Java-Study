package exercise.chapter4;

import java.util.Scanner;

public class Q1Switch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 10;
		int num2 = 2;
		char operator;
		System.out.print("기호를 입력하시오. : ");
		operator = sc.next().charAt(0);
		int result = 0;

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 오류입니다");
			return;
		}
		System.out.println("결과 값은 " + result + "입니다");
		sc.close();
	}

}
