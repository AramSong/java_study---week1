package Game;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Player user = new Player();
		Player com  = new Player();
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
				
		int u_in; //������� �Է°�  
		int c_in; //��ǻ���� �Է°�
		
		//���� ����
		
		while(true) {
			c_in = r.nextInt(2) + 1;
			System.out.print("����(1), ���(2) �Է����ּ��� : ");
			u_in = s.nextInt();
			System.out.println("��ǻ�� �Է� : " + c_in);
			//��ǻ�Ͱ� ������ ���
			if(c_in == 1) {
				if(u_in == 1) {
					com.attack(user);
					user.attack(com);
					System.out.println("(com_hp : " + com.getHp() + " / " + "user_hp : " + user.getHp() + ")");
				}
				else if(u_in == 2){
					user.defence(com);
					System.out.println("(com_hp : " + com.getHp() + " / " + "user_hp : " + user.getHp() + ")");
				}			
			}
	
			//��ǻ�Ͱ� ����� ���
			else if(c_in == 2) {
				if(u_in == 1) {
					com.defence(user);
					System.out.println("<==============��ǻ�ʹ��� ��� ����==============>");
					System.out.println("(com_hp : " + com.getHp() + " / " + "user_hp : " + user.getHp() + ")");
				}
				else if(u_in == 2){
					//�� �� ����� ���?
					System.out.println("(com_hp : " + com.getHp() + " / " + "user_hp : " + user.getHp() + ")");
				}	

			}
			
			//�������� üũ
			if(com.getHp() <= 0 || user.getHp() <= 0) {
				System.out.println("��������");
				if(user.getHp() > 0) {
					System.out.println("�÷��̾� �¸�");
				}
				else if(com.getHp() > 0) {
					System.out.println("��ǻ�� �¸�");
				}
				break;
			}

		};
		
	
	
	}

}
