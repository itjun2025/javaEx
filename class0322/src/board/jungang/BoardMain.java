package board.jungang;

public class BoardMain {
	public static void main(String[] args) {
	
		//배열의 방을 만들어 줍니다.
		//타입을 명시해야 합니다.
		//배열은 같은타입을 여러개 저장하는 자료구조입니다.
//	int[] intArr1 = {1,2,3,4,5};
	int[] intArr = new int[5];
	intArr[0] =1;
	intArr[1] =2;
	intArr[2] =3;
	intArr[3] =4;
	intArr[4] =5;
	
	// [] : 배열
	// 타입[] 이름 = new 타입[갯수];
	
	Board[] boardArr = new Board[5];
	boardArr[0] = new Board("게시글1","홍길동");
	boardArr[1] = new Board("게시글2","홍길동2");
	boardArr[2] = new Board("게시글3","홍길동3");
	boardArr[3] = new Board("게시글4","홍길동4");
	boardArr[4] = new Board("게시글5","홍길동5");
	
	// board 객체를 생성하여  boardArr배열 0,1,2,3,4번째 index에 넣어줍니다
	for (Board board : boardArr) {
		System.out.println("=======================");
		System.out.println(board.title);
		System.out.println(board.content);
		System.out.println(board.date);
		System.out.println(board.hitcount);
		System.out.println("=======================\n");
		
	}
	}
}
