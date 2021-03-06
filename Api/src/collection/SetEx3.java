package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		//hashcode확인하고 equals 확인해서 둘다 같다면 저장하지 않음
		set.add(new Member("hong123", "hong124", "홍길동"));
		set.add(new Member("hong124", "hong124", "홍길동"));
		set.add(new Member("hong125", "hong124", "홍길동"));
		set.add(new Member("hong123", "hong124", "홍길동"));

		for (Member member : set) {
			System.out.println(member + "" + member.hashCode());
		}
	}
}
