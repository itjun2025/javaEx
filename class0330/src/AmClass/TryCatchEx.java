package AmClass;

import java.util.Scanner;

public class TryCatchEx {
	public static void main(String[] args) {

	/**
	 * try-catch
	 * 
	 * try{
	 *     // 예외가 발새할 소지가 있는 코드
	 * } catch(Exception e){
	 * 		// try 블럭에서 예외가 발생시 실행을 멈추고 catch블럭으로 이동하여
	 * 			예외처리 코드를 실행	
	 * }
	 */
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			try {
				
				System.out.println("숫자를 입력합니다");
				// 사용자가 문자를 입력했을경우, 숫자로 변환시 오류가 발생
				int num =  scan.nextInt();
				
			} catch (Exception e) {
				String str = scan.next();
				// e.printStackTrace();
				System.out.println(str + "입력이 잘못되었습니다. 숫자 입력해주세요");
			}
		}
			
		}
	
	
	
	
}
