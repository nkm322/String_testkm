import java.util.*;
public class String_km1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann=new Scanner(System.in); //클래스는 new연산자를 만들어야 사용가능
		while(true) {
			System.out.println(">>");
			scann.nextLine();//nextLine지정하면 문자열 입력받아짐,띄어쓰기까지 입력받을수 있음 
//			scann.next();//띄어쓰기 없이 하나면 입력받음  
			String txt =scann.nextLine();//사용자가 입력한 것이 txt에 저장되어있음,txt는 String클래스로 만든 객체임  
			if(txt.equals("exit")){ //클래스는 메소드를 갖고있음,txt-> String클래스안에 들어있는 것을 가져다 쓰는것임 
			//equals :문자비교시 자주사용
					break;
			}	
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}


}//a b c입력시 거짓이 됨, exit라고 입력하기 전까지 다시 무한반복 