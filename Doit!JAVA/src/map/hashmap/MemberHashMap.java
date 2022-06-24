package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

class MemberHashMap {
	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) { // 다음 key가 있으면
			int key = ir.next(); // key 값을 가져와서
			Member member = hashMap.get(key); // key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
