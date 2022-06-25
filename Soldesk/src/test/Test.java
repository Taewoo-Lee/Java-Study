package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class Test {

	public static void main(String[] args) {
		/*
		 * int ary[] = { 3, 2, 1, 6, 5 }; int temp; // 임시 공간 for (int i = 0; i <
		 * ary.length; i++) { for (int j = 0; j < (ary.length - i) - 1; j++) { if
		 * (ary[j] > ary[j + 1]) { temp = ary[j + 1]; ary[j + 1] = ary[j]; ary[j] =
		 * temp; // 두 갯값 교환 코드 } } } for (int i = 0; i < 5; i++)
		 * System.out.println(ary[i]); // 교환한 후, 일차원 배열 출력
		 * 
		 * try (FileInputStream fis = new FileInputStream("input.txt")) { int i; while
		 * ((i = fis.read()) != -1) System.out.print((char) i); System.out.println();
		 * System.out.println("end"); fis.close(); } catch (FileNotFoundException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); } catch (IOException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 *
		 * int n = 0, sum = 0;
		 * 
		 * for (int i = 0; i < 5; i++) { try { System.out.print("정수 5개 입력 : "); n =
		 * s.nextInt(); // 5번 입력 } catch (InputMismatchException e) {
		 * e.printStackTrace(); s.next(); // 입력 스트림에 있는 토큰을 버린다. i--; // 인덱스가 증가하면 안 되므로
		 * 감소된다. continue; } sum += n; }
		 * 
		 * System.out.println(sum);
		 * 
		 * try (FileInputStream fis = new FileInputStream("reader.txt")) { int i; while
		 * ((i = fis.read()) != -1) System.out.print((char) i); System.out.println();
		 * System.out.println("end"); fis.close(); } catch (FileNotFoundException e1) {
		 * // TODO Auto-generated catch block e1.printStackTrace(); } catch (IOException
		 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 * 
		 * try (FileReader fr = new FileReader("reader.txt")) { int i; while ((i =
		 * fr.read()) != -1) System.out.print((char) i); System.out.println();
		 * fr.close(); } catch (IOException e) { e.printStackTrace(); }
		 *
		 * try (FileWriter fw = new FileWriter("writer.txt")) { fw.write('A'); char
		 * buf[] = { 'B', 'C', 'D', 'E', 'F', 'G' }; fw.write("안녕하세요? 잘 써지 네요.");
		 * fw.write(buf, 1, 2); fw.write("65"); System.out.println("출력이 완료되었습니다.");
		 * fw.close(); } catch (IOException e) { e.printStackTrace(); }
		 * 
		 * try (FileWriter fw = new FileWriter("hi.txt")) { fw.write("안녕하세요?");
		 * System.out.println("저장 완료!"); fw.close(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 * 
		 * try (FileReader fr = new FileReader("hi.txt")) { int i; while((i = fr.read())
		 * != -1) System.out.print((char)i); System.out.println(); fr.close(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 * 
		 * int exp1;
		 * 
		 * for (int i = 0; i < 10; i++) { try { System.out.print("정수 10개 입력 : "); exp1 =
		 * s.nextInt(); } catch (InputMismatchException e) { // e.printStackTrace();
		 * s.next(); // 입력 스트림에 있는 토큰을 버린다. i--; // 인덱스가 증가하면 안 되므로 감소된다. continue; } if
		 * (exp1 % 4 != 0) continue; System.out.print(exp1); System.out.println(); }
		 * 
		 * int a = 50, b = 150;
		 * 
		 * double exp2 = a > b ? a * b : a % b; System.out.println(exp2);
		 * 
		 * int exp3 = 0; int test3 = 0; while (exp3 <= 100) { exp3++; if (exp3 % 2 == 0
		 * && exp3 % 7 == 0) { System.out.println(exp3); test3 += exp3; } }
		 * System.out.println(test3);
		 * 
		 * int exp4; while (true) { try { System.out.print("정수를 입력하시오. : "); exp4 =
		 * s.nextInt(); if (exp4 % 2 == 0) System.out.println("짝수"); else
		 * System.out.println("홀수"); } catch (InputMismatchException e) { //
		 * e.printStackTrace(); break; } }
		 * 
		 * int ary[]; ary = make();
		 * 
		 * for (int i = 0; i < ary.length; i++) System.out.print(ary[i] + " ");
		 * System.out.println();
		 * 
		 * while (true) { try { int a = 0, b = 0; System.out.print("실행 결과) 두 정수 입력: ");
		 * a = sc.nextInt(); b = sc.nextInt(); System.out.println("답: " + (a + b));
		 * break; } catch (InputMismatchException e) { // e.printStackTrace();
		 * System.out.println("실수는 안 된다."); sc.next(); continue; } } int a = 0, b = 0;
		 * func(a, b); int score[] = new int[] { 58, 60, 86, 90, 84 }; pr(score, 5);
		 * System.out.println(show('$', 10));
		 * 
		 * String str = "공부는 어렵지만, 재밌네요";
		 * 
		 * String[] s = str.split(",");
		 * 
		 * for (int i = 0; i < s.length; i++) System.out.println(s[i]);
		 * 
		 * String s1 = str.substring(6, 7); System.out.println(s1);
		 * 
		 * String s2 = str.substring(0, 3); System.out.println(s2); BufferedReader bu =
		 * null; // 입력하기 위한 문자형 입력 스트림 PrintWriter pr = null; // 출력하기 위한 문자형 출력 스트림
		 * 
		 * try { InputStreamReader in = new InputStreamReader(System.in); bu = new
		 * BufferedReader(in); // 콘솔에 입력 FileWriter fw = new FileWriter("d.txt"); //
		 * d.txt에 저장 pr = new PrintWriter(fw);
		 * 
		 * String str = null; while ((str = bu.readLine()) != null) pr.println(str);
		 * bu.close(); } catch (IOException e) { e.printStackTrace(); } finally {
		 * pr.close(); }
		 * 
		 * FileOutputStream fos = new FileOutputStream("output2.txt", true);
		 * 
		 * try(fos) { byte[] bs = new byte[26]; byte data=65;
		 * 
		 * for(int i=0; i<bs.length; i++) { bs[i]=data; data++; } fos.write(bs);
		 * System.out.println("출력이 완료되었습니다."); } catch(FileNotFoundException e) {
		 * e.printStackTrace(); }
		 * 
		 * ByteArrayInputStream in = null; FileOutputStream fout = null;
		 * 
		 * try { byte[] b = new byte[] { 1, 2, 3 }; in = new ByteArrayInputStream(b);
		 * fout = new FileOutputStream("g.dat");
		 * 
		 * int r = -1; while ((r = in.read()) != -1) fout.write(r);
		 * System.out.println("end"); } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } finally { try { in.close(); fout.close(); } catch
		 * (NullPointerException e) { e.printStackTrace(); } }
		 * 
		 * FileInputStream fin = null; ByteArrayOutputStream out = null;
		 * 
		 * try { fin = new FileInputStream("g.dat"); // g.dat 파일을 읽어 와서 out = new
		 * ByteArrayOutputStream(); // 바이트 배열에 저장한다.
		 * 
		 * int r = -1; while ((r = in.read()) != -1) out.write(r); // 배열에 저장함. byte[] b
		 * = out.toByteArray(); // 새로운 바이트 배열 생성함.
		 * 
		 * for (int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
		 * System.out.println(); } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } finally { try { fin.close(); out.close(); } catch
		 * (NullPointerException e) { e.printStackTrace(); } } // 1,2,3,4,5를 읽어 와서
		 * outputstream에 저장하고 싶다.
		 * 
		 * byte[] bin = { 1, 2, 3, 4, 5 }; byte[] bout = null;
		 * 
		 * out = new ByteArrayOutputStream(); in = new ByteArrayInputStream(bin);
		 * 
		 * int r = 0; while ((r = in.read()) != -1) out.write(r); // 스트림에 저장 bout =
		 * out.toByteArray(); // 바이트 스트림을 바이트 배열로 바꿔서 out(바이트 배열)
		 * 
		 * System.out.println(Arrays.toString(bin));
		 * System.out.println(Arrays.toString(bout));
		 * 
		 * DataOutputStream dout = null; try { int a = 5; double b = 1.5; boolean c =
		 * true;
		 * 
		 * FileOutputStream fi = new FileOutputStream("h.txt"); dout = new
		 * DataOutputStream(fi);
		 * 
		 * dout.writeInt(a); dout.writeDouble(b); dout.writeBoolean(c); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); } finally { dout.close(); }
		 * 
		 * DataInputStream din = null; try { FileInputStream fi = new
		 * FileInputStream("h.txt"); din = new DataInputStream(fi);
		 * 
		 * int a = din.readInt(); double b = din.readDouble(); boolean c =
		 * din.readBoolean();
		 * 
		 * System.out.println(a); System.out.println(b); System.out.println(c); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); } finally { din.close(); }
		 * 
		 * InputStreamReader isr = new InputStreamReader(System.in); // 키보드로부터 읽는 문자 입력
		 * 스트림 생성
		 * 
		 * FileWriter fw = null; int r;
		 * 
		 * try { fw = new FileWriter("e.txt"); while ((r = isr.read()) != -1)
		 * fw.write(r); // 키보드로부터 입력한 문자를 파일에 저장 } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } isr.close(); fw.close();
		 * 
		 * BufferedWriter bw = new BufferedWriter(new FileWriter("sample.txt")); String
		 * str = sc.next(); bw.write(str); bw.close();
		 * 
		 * BufferedReader br = null; try { br = new BufferedReader(new
		 * FileReader("sample.txt")); String b[] = new String[1]; for (int i = 0; i <
		 * b.length; i++) { b[i] = br.readLine(); System.out.println(b[i]); } } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } finally { br.close(); }
		 * 
		 * // 지금 생성한 c.txt파일을 읽어 와서 출력 FileReader fr = new FileReader("c.txt"); int n =
		 * 0; while ((n = fr.read()) != -1) System.out.print((char) n);
		 * System.out.println(); fr.close();
		 * 
		 * FileWriter f = new FileWriter("system.dat"); BufferedWriter b = new
		 * BufferedWriter(f);
		 * 
		 * char a[] = new char[] { '목', '요', '일' };
		 * 
		 * b.write(a); b.close();
		 * 
		 * int lotto[] = { 4, 10, 25, 30, 45, 47 }; int my[] = { 1, 4, 7, 26, 45, 48 };
		 * int r;
		 * 
		 * r=same(lotto, my); System.out.printf("일치하는 번호의 갯수: %d\n", r);
		 * 
		 * int ary[] = { 6, 2, 8, 4, 9 }; show(ary);
		 * 
		 * int[][] ary1 = { { 43, 97 }, { 34, 77, 87 }, { 100, 95, 38, 89 } };
		 * 
		 * int sum1 = 0; int count = 0; for (int i = 0; i < ary1.length; i++) { for (int
		 * j = 0; j < ary1[i].length; j++) { sum1 += ary1[i][j]; count++; } }
		 * System.out.printf("%d, %1.2f\n", sum1, (double) sum1 / count);
		 * 
		 * int score[] = new int[5]; int sum = 0; double avg; int max, min;
		 * 
		 * System.out.println("5명 학생 점수 입력");
		 * 
		 * for (int i = 0; i < score.length; i++) { score[i] = s.nextInt(); // 90 100 80
		 * 70 85 } max = min = score[0];
		 * 
		 * for (int i = 1; i < score.length; i++) { if (max < score[i]) { max =
		 * score[i]; // max=100 } if (min > score[i]) { min = score[i]; // min=70 } }
		 * System.out.println("유효 점수 : "); for (int i = 0; i < 5; i++) { if (max ==
		 * score[i] || min == score[i]) { continue; // 최고, 최저점을 제외 } else { sum +=
		 * score[i]; } } System.out.println(sum / 3.0);
		 * 
		 * Test t = new Test(10, "java"); // t.r=10; // t.name="java";
		 * 
		 * System.out.println(t.name + " " + t.area());
		 * 
		 * Test t2 = new Test(); t2.name = "db"; System.out.println(t2.name + " " +
		 * t2.area());
		 * 
		 * Book b1 = new Book("고양이", 30000); // 파라미터가 있는 생성자 Book b2 = new Book("총균쇠");
		 * // 파라미터가 있는 생성자 Book b3 = new Book(); // 기본 생성자
		 * 
		 * b1.show(); b2.show(); b3.show();
		 * 
		 * Circle c = new Circle(3.4); c.show(); c.area();
		 * 
		 * XY x = new XY(); x.set(4, 8); x.show();
		 * 
		 * XYZ y = new XYZ(); y.set(6, 8); y.setname("xyz"); y.pr();
		 * 
		 * Human h = new Human(); //부모클래스의 객체 생성 h.name="용학"; h.age=30; h.show(); //
		 * 
		 * Person p = new Student("길동"); Student s = (Student) p;
		 * System.out.println(s.name);
		 * 
		 * Ipad i=new Ipad("pink",30,50); i.show();
		 * 
		 * A a = new D(); System.out.println(a instanceof B); System.out.println(new D()
		 * instanceof A); System.out.println(new C() instanceof A); //
		 * System.out.println(new C() instanceof D);
		 */
		int lineCount = 4;
		int spaceCount = lineCount / 2 + 1;
		int startCount = 1;

		for (int i = 0; i < lineCount; i++) {
			int exp1 = 0;
			for (int j = 0; j < spaceCount; j++)
				System.out.print(' ');
			for (int j = 0; j < startCount; j++) {
				System.out.print(exp1);
				exp1++;
			}
			spaceCount -= 1;
			startCount += 2;
			System.out.println();
		}
		/*
		 * int[][] grade = { { 55, 60, 65 }, { 85, 90, 95 } };
		 * 
		 * int high;
		 * 
		 * high = get(grade);
		 * 
		 * System.out.println("가장 높은 점수는 " + high + "점 입니다.");
		 * 
		 * ObjectOutputStream os = null;
		 * 
		 * try { os = new ObjectOutputStream(new FileOutputStream("ob.dat"));
		 * 
		 * Stu s = new Stu(); s.setName("신우"); s.setId("123"); s.setAge(22);
		 * 
		 * os.writeObject(s); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } finally { try { os.close(); } catch (IOException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); } }
		 * 
		 * ObjectInputStream in = null;
		 * 
		 * try { in = new ObjectInputStream(new FileInputStream("ob.dat"));
		 * 
		 * Stu s = (Stu) in.readObject(); // 형 변환
		 * 
		 * System.out.println(s.getName()); System.out.println(s.getId());
		 * System.out.println(s.getAge()); } catch (IOException | ClassNotFoundException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); } finally { try
		 * { in.close(); } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 * 
		 * Circle c[] = new Circle[5];
		 * 
		 * for (int i = 0; i < c.length; i++) { double r = sc.nextDouble(); c[i] = new
		 * Cir(r); System.out.println(c[i].get()); }
		 * 
		 * show(new Person());
		 * 
		 * show(new ITWorker());
		 * 
		 * int math = sc.nextInt(); int eng = sc.nextInt(); int com = sc.nextInt();
		 * Score s = new Score(math, eng, com); System.out.println("평균은 " + s.avg());
		 * 
		 * Circle c[] = new Circle[5]; double sum = 0.0;
		 * 
		 * for(int i=0; i<c.length; i++) { double d = sc.nextDouble(); c[i] = new
		 * Circle(d); sum += c[i].area(); }
		 * 
		 * System.out.println(sum);
		 *
		 * int exp3 = 0; int sum = 0; for (int i = 0; i < 5; i++) { try {
		 * System.out.printf("%d번째 정수: ", i + 1); exp3 = sc.nextInt(); } catch
		 * (InputMismatchException e) { System.out.println("다시 입력해라. 정수아니다.");
		 * sc.next(); i--; continue; } sum += exp3; } System.out.println("총합: " + sum);
		 * 
		 * int[] arr = new int[10]; int temp;
		 * 
		 * for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		 * 
		 * for (int i = 0; i < (arr.length) - 1; i++) { for (int j = i + 1; j <
		 * arr.length; j++) { if (arr[i] > arr[j]) { temp = arr[i]; arr[i] = arr[j];
		 * arr[j] = temp; } } }
		 * 
		 * for (int i = 0; i < arr.length; i++) { Arrays.sort(arr);
		 * System.out.print(arr[i] + " "); } System.out.println();
		 * 
		 * Add a = new Add(); System.out.println(a.add(1, 4));
		 * System.out.println(a.add(10));
		 * 
		 * pr(new Pizza()); pr(new Steak());
		 * 
		 * D d1 = new D(); A a1 = d1; // up a1.funcA();
		 * 
		 * B b1 = d1; // up b1.funcB();
		 * 
		 * C c1 = d1; // up c1.funcA(); c1.funcB(); c1.funcC();
		 * 
		 * // 인터페이스에서 객체 생성 불가능하기 때문에 // 상속받은 클래스 D에서 객체 생성해 줌
		 * 
		 * Ipad i = new Ipad(); Tv t = i; // up Computer c = i; // up
		 * 
		 * i.ip();
		 * 
		 * Integer i = new Integer(10); // boxing int i1 = i.intValue();
		 * 
		 * Character c = new Character('a'); char c1 = c.charValue();
		 * 
		 * // 문자열을 기본 타입으로 변환 int i2 = Integer.parseInt("123"); boolean b2 =
		 * Boolean.parseBoolean("true"); double d2 = Double.parseDouble("3.14"); //
		 * parse~~~~ 반환형이 기본 자료형
		 * 
		 * int i3 = Integer.valueOf(123); int i4 = Integer.valueOf("10") +
		 * Integer.valueOf("20");
		 * 
		 * // valueOf는 반환형이 객체 System.out.println(i4);
		 * 
		 * String s = Integer.toString(123); // 정수형 객체 123을 문자열로 반환
		 * System.out.println(s);
		 * 
		 * Integer i11 = 100; // auto boxing int n1 = i11 + 200; // auto unboxing
		 * 
		 * System.out.println(n1);
		 * 
		 * Point p = new Point(3, 4);
		 * 
		 * System.out.println(p); // 3.4출력
		 * 
		 * String exp2 = "841111-1234560";
		 * 
		 * int gender = Integer.parseInt(exp2.substring(exp2.indexOf('-') + 1,
		 * exp2.indexOf('-') + 2));
		 * 
		 * switch (gender) { case 1: System.out.println("남성"); break; case 2:
		 * System.out.println("여성"); break; default: break; }
		 * 
		 * Tv1 t = new Tv1(20, "삼성");
		 * 
		 * t.show(); // 삼성 20인치 Tv 출력
		 * 
		 * Shape s = new Shape();
		 * 
		 * Shape s1 = new Shape(2, 5);
		 * 
		 * s.pr("@");
		 * 
		 * s1.pr("#");
		 * 
		 * s.show(); // @@@-> 1행 3열로 출력
		 * 
		 * s1.show(); // #####->2행 5열로 출력 // #####
		 * 
		 * XYZ xyz = new XYZ(10, 10, "red");
		 * 
		 * xyz.setxy(20, 30);
		 * 
		 * xyz.setcolor("blue");
		 * 
		 * xyz.show();
		 * 
		 * Re r = new Rec(10, 20);
		 * 
		 * r.show(); // "사각형!!" 출력
		 * 
		 * System.out.println("면적 " + r.area());
		 * 
		 * // 객체 배열 2개 만들어 이름과 아이디를 입력 받아 객체 생성해서 입력한 값을 출력해라. Profile p[] = new
		 * Profile[2];
		 * 
		 * for (int i = 0; i < 2; i++) { String name = sc.next(); String id = sc.next();
		 * p[i] = new Profile(name, id); } // 하성 123 현민 234 for (int i = 0; i < 2; i++)
		 * { System.out.println(p[i].name + " " + p[i].id); }
		 * 
		 * Animal a1 = new Dog("강아지", "푸들"); System.out.println(a1.ani());
		 * 
		 * Arr ar = new Arr(5); while(true) { System.out.println("A. 학교 친구 정보");
		 * System.out.println("B. 직장 친구 정보"); System.out.println("C. 종료");
		 * System.out.println("D. 출력"); System.out.print("문자 입력: "); char
		 * c=s.next().charAt(0);
		 * 
		 * switch(c) { case 'A': ar.friend(c); break; case 'B': ar.friend(c); break;
		 * case 'C': System.out.println("종료"); return; case 'D': ar.all(); } }
		 * 
		 * Music m = new Music("음악 재생"); Movie m1 = new Movie("영화 재생"); Thread t1 = new
		 * Thread(m); Thread t2 = new Thread(m1);
		 * 
		 * t1.start(); t2.start();
		 * 
		 * try { t1.join(); t2.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * System.out.println("쓰레드!!!!!!!!!"); Th t = new Th(); Thread t1 = new
		 * Thread(t); t1.start(); try { t1.join(); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * System.out.println("쓰레드@@@@@@@@@");
		 * 
		 * Th t1 = new Th("민훈", Thread.MAX_PRIORITY); Th t2 = new Th("의영",
		 * Thread.MIN_PRIORITY); Th t3 = new Th("상우", Thread.NORM_PRIORITY); try {
		 * t1.join(); t2.join(); t3.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } t1.start(); t2.start();
		 * t3.start();
		 * 
		 * Share s = new Share();
		 * 
		 * String eng[] = { "java", "study", "db", "spring", "jsp" }; String kor[] = {
		 * "자바", "공부", "데이터베이스", "스프링", "제이에스피" };
		 * 
		 * Tt1 t1 = new Tt1(s, eng); Thread t2 = new Tt1(s, kor);
		 * 
		 * try { t1.join(); t2.join(); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * t1.start(); t2.start();
		 * 
		 * ITFriend it = new ITFriend("홍길동", "010-111-1111", "컴퓨터");
		 * 
		 * it.show();
		 * 
		 * Circle a = new Circle(30);
		 * 
		 * Circle b = new Circle(30);
		 * 
		 * System.out.println("반지름" + a);
		 * 
		 * System.out.println("반지름" + b);
		 * 
		 * if (a.equals(b)) System.out.println("같은 원"); else System.out.println("다른 원");
		 * 
		 * Po p = new Point();
		 * 
		 * p.pr(30000, "java");
		 * 
		 * p.pr("python");
		 * 
		 * ObjectOutputStream os = new ObjectOutputStream(new
		 * FileOutputStream("obj.dat")); os.writeObject(new Rec(4, 7));
		 * 
		 * os.close();
		 * 
		 * ObjectInputStream in = null; try { in = new ObjectInputStream(new
		 * FileInputStream("obj.dat")); Rec r1 = (Rec) in.readObject(); r1.show(); }
		 * catch (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } finally { in.close(); }
		 * 
		 * // 시험점수 입력 받아 90점 이상이면 합격 판별하는 프로그램 System.out.print("점수를 입력하세요. : ");
		 * 
		 * int score = sc.nextInt();
		 * 
		 * if (score >= 90) System.out.println("합격"); else System.out.println("불합격");
		 * 
		 * // 학점 입력 받아 학점 A, B → Perfect 학점 C, D → Good 학점 F → 재수강
		 * 
		 * char grade = sc.next().charAt(0); switch (grade) { case 'A': case 'B':
		 * System.out.println("Perfect"); break; case 'C': case 'D':
		 * System.out.println("Good"); break; case 'F': System.out.println("Fail");
		 * break; default: break; }
		 * 
		 * // while, break 문을 사용하여 0이 입력될 때까지 입력한 숫자의 갯수를 출력 while (true) { if
		 * (sc.nextInt() == 0) break; }
		 * 
		 * Goods g = new Goods(); Goods g1 = new Goods();
		 * 
		 * g.name = "JAVA"; g.price = 30000;
		 * 
		 * g1.name = "DB";
		 * 
		 * A a2 = new A(); a2.set(4);
		 * 
		 * int[] a1 = { 3, 4, 5, 6, 7 }; in(a1);
		 * 
		 * for (int i = 0; i < a1.length; i++) System.out.print(a1[i] + " ");
		 * System.out.println();
		 * 
		 * Sample s1 = new Sample(); s1.n = 10; s1.a(); s1.m = 40;
		 * 
		 * ArrayList<Integer> v = new ArrayList<Integer>(); v.add(1); v.add(2);
		 * v.add(new Integer(3)); // auto unboxing v.add(2, 4); for (int i = 0; i <
		 * v.size(); i++) { int n = v.get(i); System.out.print(n); }
		 * System.out.println();
		 * 
		 * ArrayList<String> a = new ArrayList<String>(); for (int i = 0; i < 3; i++) {
		 * String str = sc.next(); a.add(str); } for (int i = 0; i < a.size(); i++) {
		 * String st = a.get(i); System.out.print(st); } System.out.println(); int max =
		 * 0; for (int i = 0; i < a.size(); i++) { if (a.get(max).length() <
		 * a.get(i).length()) max = i; System.out.println("길이가 제일 긴 문자열 " + a.get(max));
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		String chul = "";
		String[] game = { "가위", "바위", "보" };

		do {
			System.out.print("가위 바위 보 중 입력하시요. : ");
			chul = sc.next();
			Random random = new Random();
			String yong = game[random.nextInt(game.length)];

			if (chul.equals(yong))
				System.out.println("비겼다.");
			else if (chul.equals("가위")) {
				if (yong.equals("바위"))
					System.out.println("철수가 졌다.");
				else
					System.out.println("철수가 이겼다.");
			} else if (chul.equals("바위")) {
				if (yong.equals("가위"))
					System.out.println("철수가 이겼다.");
				else
					System.out.println("철수가 졌다.");
			} else if (chul.equals("보")) {
				if (yong.equals("가위"))
					System.out.println("철수가 졌다.");
				else
					System.out.println("철수가 이겼다.");
			}
		} while ((Arrays.binarySearch(game, chul)) <= -1);

		int exp2 = 1;
		while (exp2 > 0 && exp2 <= 100) {
			System.out.print("입력:");
			exp2 = sc.nextInt();
			if ((exp2 / 10) == 3 || (exp2 / 10) == 6 || (exp2 / 10) == 9) {
				if ((exp2 % 10) == 3 || (exp2 % 10) == 6 || (exp2 % 10) == 9) {
					System.out.println("짝짝");
					break;
				} else {
					System.out.println("짝");
					break;
				}
			} else if ((exp2 % 10) == 3 || (exp2 % 10) == 6 || (exp2 % 10) == 9) {
				System.out.println("짝");
				break;
			} else {
				System.out.println("땡");
				break;
			}
		}

		HashMap<Object, Object> h = new HashMap<Object, Object>();
//		h.put("hyunmin", "123");
//		h.put("seoyoung", "234");
//		h.put("sangwoo", "345");
		/*
		 * while (true) { System.out.println("id,pw입력해라"); String id = sc.next(); String
		 * pw = sc.next();
		 * 
		 * if (!h.containsKey(id)) {// 2. id가 해시맵에 없을 경우
		 * System.out.println("id가 존재하지 않네요"); continue; // id 다시 입력함 }
		 * 
		 * else { // id가 해시맵에 있을 경우 if (!h.get(id).equals(pw)) { // 비번이 틀릴 경우
		 * System.out.println("비밀번호가 일치하지 않네요"); } else { // 비밀번호 짝에 맞게 입력함
		 * System.out.println("로그인"); break; } } }
		 */
		h.put("computer", "컴퓨터");
		h.put("coffee", "커피");
		h.put("cream", "크림");
		/*
		 * Set<Object> key = h.keySet(); Iterator<Object> it = key.iterator();
		 * 
		 * while (it.hasNext()) { String k = (String) it.next(); String v = (String)
		 * h.get(k); System.out.println(k + " " + v); }
		 */
		for (int i = 0; i < h.size(); i++) {
			System.out.println("찾을 단어는?");
			String str = sc.next();
			String str2 = (String) h.get(str);
			if (str.equals("stop"))
				break;
			if (str2 == null)
				System.out.println(str + "은 없는 단어");
			System.out.println(str2);
		}
		/*
		 * System.out.print("너비, 높이 입력 : "); int width = 0; int height = 0; try { width
		 * = sc.nextInt(); height = sc.nextInt(); } catch (InputMismatchException e) {
		 * System.out.println("다시 입력하세요."); sc.next(); return; } Rectangle rec = new
		 * Rectangle(); rec.setWidth(width); rec.setHeight(height);
		 * System.out.println("사각형의 넓이는 " + rec.getWidth() * rec.getHeight());
		 *
		 * HashMap<String, Integer> exp5 = new HashMap<String, Integer>(); String exp5_1
		 * = sc.next(); int exp5_2 = sc.nextInt(); exp5.put(exp5_1, exp5_2); Set<String>
		 * key = exp5.keySet(); Iterator<String> it = key.iterator(); while
		 * (it.hasNext()) { String k = it.next(); int v = exp5.get(k);
		 * System.out.println(v); }
		 */
		HashMap<String, Integer> exp6 = new HashMap<String, Integer>();
		String str = "", exp6_1;
		int max = 0, exp6_2;
		for (int i = 0; i < 3; i++) {
			try {
				System.out.print("이름 입력:");
				exp6_1 = sc.next();
				System.out.print("나이 입력:");
				exp6_2 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("다시 입력하세요.");
				sc.next();
				i--;
				continue;
			}
			exp6.put(exp6_1, exp6_2);
		}
		Set<String> key1 = exp6.keySet();
		Iterator<String> it1 = key1.iterator();
		while (it1.hasNext()) {
			String exp6_key = it1.next();
			int exp6_value = exp6.get(exp6_key);
			if (max < exp6_value) {
				str = exp6_key;
				max = exp6_value;
			}
		}
		System.out.println(str);

		sc.close();

		/*
		 * ByteArrayInputStream in = null; FileOutputStream fos = null; byte[] b = { 1,
		 * 2, 3, 4, 5 }; try { in = new ByteArrayInputStream(b); fos = new
		 * FileOutputStream("fi.txt"); int r; while ((r = in.read()) != -1)
		 * fos.write((char) r); } catch (IOException e) { e.printStackTrace(); } finally
		 * { fos.close(); in.close(); }
		 * 
		 * try (FileInputStream fis = new FileInputStream("fi.txt")) { int i; while ((i
		 * = fis.read()) != -1) System.out.print((char) i); System.out.println(); }
		 * catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */
		ArrayList<Integer> exp4 = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++)
			exp4.add((int) Math.random() * (100 + 1));

		Iterator<Integer> exp4_1 = exp4.iterator();

		while (exp4_1.hasNext()) {
			int exp4_2 = exp4_1.next();
			System.out.print(exp4_2 + " ");
		}
		System.out.println();
	}

	/*
	 * private static void show(int[] ary) { // TODO Auto-generated method stub for
	 * (int i = 0; i < ary.length / 2; i++) { int temp = ary[i]; ary[i] =
	 * ary[(ary.length - i) - 1]; ary[(ary.length - i) - 1] = temp; }
	 * System.out.println(ary); }
	 * 
	 * static void func(int a, int b) { Scanner s = new Scanner(System.in); int exp6
	 * = 0; exp6 = s.nextInt(); a = exp6 / 5; b = exp6 % 5;
	 * System.out.printf("%d, %d\n", a, b); s.close(); }
	 * 
	 * static void pr(int[] ary, int a) { for (int i = 0; i < ary.length; i++) { int
	 * j = ary[i] / a; for (int k = 0; k < j; k++) System.out.print('#');
	 * System.out.println(); } }
	 * 
	 * static String show(char a, int i) { String result = ""; for (int j = 0; j <=
	 * i; j++) result += a; return result; }
	 * 
	 * private static int same(int[] lotto, int[] my) { // TODO Auto-generated
	 * method stub int r = 0; for (int i : my) { for (int j : lotto) { if (i == j)
	 * r++; } } return r; }
	 * 
	 * private static int get(int[][] grade) { // TODO Auto-generated method stub
	 * int max = 0;
	 * 
	 * for (int i = 0; i < grade.length; i++) { for (int j = 0; j < grade[i].length;
	 * j++) { if (max < grade[i][j]) max = grade[i][j]; } }
	 * 
	 * return max; }
	 * 
	 * private static void pr(Food f) { System.out.println(f.name()); }
	 */
}
