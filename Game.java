package Game;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Player user = new Player();
		Player com  = new Player();
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
				
		int u_in; //사용자의 입력값  
		int c_in; //컴퓨터의 입력값
		
		//게임 시작
		
		while(true) {
			c_in = r.nextInt(2) + 1;
			System.out.print("공격(1), 방어(2) 입력해주세요 : ");
			u_in = s.nextInt();
			System.out.println("컴퓨터 입력 : " + c_in);
			//컴퓨터가 공격일 경우
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
	
			//컴퓨터가 방어인 경우
			else if(c_in == 2) {
				if(u_in == 1) {
					com.defence(user);
					System.out.println("<==============컴퓨터님의 방어 성공==============>");
					System.out.println("(com_hp : " + com.getHp() + " / " + "user_hp : " + user.getHp() + ")");
				}
				else if(u_in == 2){
					//둘 다 방어일 경우?
					System.out.println("(com_hp : " + com.getHp() + " / " + "user_hp : " + user.getHp() + ")");
				}	

			}
			
			//게임종료 체크
			if(com.getHp() <= 0 || user.getHp() <= 0) {
				System.out.println("게임종료");
				if(user.getHp() > 0) {
					System.out.println("플레이어 승리");
				}
				else if(com.getHp() > 0) {
					System.out.println("컴퓨터 승리");
				}
				break;
			}

		};
		
	
	
	}

}
