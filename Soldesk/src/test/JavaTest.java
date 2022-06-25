package test;

import java.awt.Container;
import java.awt.GridLayout;
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;

class Circle {
	private double r;

	Circle(double r) {
		this.r = r;
	}

	double area() {
		return 3.14 * r * r;
	}
}

// 3번 문제
class Num {
	public void add(int i) {
		// TODO Auto-generated method stub

	}

	public int getSum() {
		// TODO Auto-generated method stub
		int sum = 0;
		return sum;
	}

	public int getMax() {
		// TODO Auto-generated method stub
		int max = 0;
		return max;
	}
}

// 6번 문제
class Student implements Externalizable {
	String name;
	String ID;
	int number;
	
	public Student(String name, String iD, int number) {
		this.name = name;
		ID = iD;
		this.number = number;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java.txt"));
			oos.writeObject(getClass());
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeUTF(name);
		out.writeUTF(ID);
		out.writeUTF(Integer.toString(number));
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = in.readUTF();
		ID = in.readUTF();
		number = in.read();
	}

	public void show() {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java.txt"));
			Student s = (Student)ois.readObject();
			System.out.println(s);
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class JavaTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 5번 문제
	JavaTest() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 3));
		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton();
			b.setText(Integer.toString(i));
			c.add(b);
		}
		setTitle("JavaTest");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 문제
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력: ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		System.out.println("합은 : " + (a1 + b1));
		// 2번 문제
		System.out.print("5개의 원의 반지름 입력: ");
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int c2 = sc.nextInt();
		int d2 = sc.nextInt();
		int e2 = sc.nextInt();
		Circle cir1 = new Circle(a2);
		Circle cir2 = new Circle(b2);
		Circle cir3 = new Circle(c2);
		Circle cir4 = new Circle(d2);
		Circle cir5 = new Circle(e2);
		System.out.println("원의 면적의 합은: " + (cir1.area() + cir2.area() + cir3.area() + cir4.area() + cir5.area()));
		Num nb = new Num();
		nb.add(7);
		nb.add(-1);
		nb.add(20);
		nb.add(5); // 4개 숫자를 입력
		System.out.println("Sum = " + nb.getSum()); // 4개 숫자의 합계
		System.out.println("Max = " + nb.getMax()); // 4개 숫자 중 최대값
		// 4번 문제
		HashMap<String, Integer> exp4 = new HashMap<String, Integer>();
		exp4.put("test1", 1);
		exp4.put("test2", 2);
		Set<String> keys = exp4.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.print("이름 입력: ");
			String exp4_1 = sc.next();
			exp4_1 = it.next();
			int exp4_2 = exp4.get(exp4_1);
			System.out.println(exp4_2);
			break;
		}
		new JavaTest();
		Student s = new Student("jack", "123", 20);
		s.show(); // 모든 데이터 출력
		Worker worker = new Worker();
		while(true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1.	사원정보 입력");
			System.out.println("2.	사원정보 개별 조회");
			System.out.println("3.	프로그램 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.print("사번: ");
				int ID = sc.nextInt();
				worker.setID(ID);
				System.out.print("이름: ");
				String name = sc.next();
				worker.setName(name);
				System.out.print("부서: ");
				String department = sc.next();
				worker.setDepartment(department);
				System.out.print("주소: ");
				String address = sc.next();
				worker.setAddress(address);
				System.out.print("생일: ");
				String birth = sc.next();
				worker.setBirth(birth);
				System.out.println("사원정보가 입력되었다.");
			case 2:
				System.out.print("검색하고자 하는 사원의 사번은? ");
				String search = sc.next();
				if(search.equals(Integer.toString(worker.getID()))) {
					System.out.println("이름: " + worker.getName());
					
				}
			}
			sc.close();
		}
	}

}
