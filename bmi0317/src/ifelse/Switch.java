package ifelse;

public class Switch {

	// Switch 를 이용한 주사위 산출   /  break 필수!!
	public static void main(String[] args) {
		
		double num = Math.random();
		int numRes = (int)((num * 6)+1);
		System.out.println("주사위 : " + numRes);
		
		switch (numRes) {
		case 1:
			System.out.println("1번이 나왔습니다");
			
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			
			// break 가 없어서 계속 진행 
			
		case 4:
			System.out.println("4번이 나왔습니다");
			
			// break 가 없어서 계속 진행
		case 5:
			System.out.println("5번이 나왔습니다");
			
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			
			break;

		default:
			System.out.println("================= 종료 =============");
			break;
		}
			
		}
		
		}
	

