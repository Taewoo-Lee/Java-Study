package collection.arraylist;

import collection.Member;

public class MmeberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");

		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);

		memberArrayList.showAllmember();

		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllmember();
	}

}
