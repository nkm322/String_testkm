import java.util.*;
public class String_km1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann=new Scanner(System.in); //Ŭ������ new�����ڸ� ������ ��밡��
		while(true) {
			System.out.println(">>");
			scann.nextLine();//nextLine�����ϸ� ���ڿ� �Է¹޾���,������� �Է¹����� ���� 
//			scann.next();//���� ���� �ϳ��� �Է¹���  
			String txt =scann.nextLine();//����ڰ� �Է��� ���� txt�� ����Ǿ�����,txt�� StringŬ������ ���� ��ü��  
			if(txt.equals("exit")){ //Ŭ������ �޼ҵ带 ��������,txt-> StringŬ�����ȿ� ����ִ� ���� ������ ���°��� 
			//equals :���ں񱳽� ���ֻ��
					break;
			}	
		}
		
		System.out.println("���α׷��� �����մϴ�.");
		
	}


}//a b c�Է½� ������ ��, exit��� �Է��ϱ� ������ �ٽ� ���ѹݺ� 