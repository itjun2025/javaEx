package PmClass;

public class Member {
		public static void main(String[] args) {
			Member member1 = new Member("id");
			Member member2 = new Member("id");
			System.out.println("mem1.equals(mem2) :");
			System.out.println(member1.equals(member2));
			
		}
		private String id;
		
		public Member(String id) {
			this.id =id;
		}
		@Override
		/**
		 * this(Member 객체)가 가지고 있는 id 값과
		 * 매개변수로 받은 object의 id값이 일치 하늕 ㅣ비교
		 */
		public boolean equals(Object obj) {
			if (obj instanceof Member) {
				Member member =(Member)obj;
				System.out.println("obj.equals 의 결과는 :" + super.equals(obj));
				System.out.println("Member.equals() 의 결과는 : " + getId().equals(member.id));
				
//				((Member)obj).getId();
				if (this.id.equals(member.id)) {
					return true;
				}else {
					return false;
				}
			}
//			if (this.id==((Member)obj).getId()) {
//				
//			}
			// 객체가 가지고 있는 id값이 같다면 true 아니면 false
//		return;
			return false;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
}
