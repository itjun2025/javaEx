package Loop;

public class Lottolotto {

		public static void main(String[] args) {
			int[] lotto = new int[6];
			int count = 0;

			while (count < 6) {
			    int num = (int) (Math.random() * 45)+1;
			    boolean res = false;
			    
			    for (int i = 0; i < count; i++) {
			        if (num == lotto[i]) {
			            res = true;
			            break;
			        }
			    }
			    
			    if (!res) {
			        lotto[count] = num;
			        count++;
			    }
			}
			

			System.out.print("추첨된 로또 번호: ");
			for (int i = 0; i < lotto.length; i++) {
			    System.out.print(lotto[i] + " ");
			}
		}
}
