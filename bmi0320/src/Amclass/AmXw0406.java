package Amclass;

public class AmXw0406 {	

	public static void main(String[] args) {

		// i = 1,2,3,4
		for (int i = 1; i < 5; i++) {

			// j = 4,3,2,1
			for (int j = 4; j > 0; j--) {
				// i = 1 일때 j = 4,3,2,(1) i>=j
				// i = 2 일때 j = 4,3,(2,1)
				// i = 3 일때 j = 4,(3,2,1)	
				// i = 4 일때 j = (4,3,2,1)   출력
				if (i >=j) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}
