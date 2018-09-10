package Game;

public class Player {
	private int hp = 50;
	private int damage = 10;
	
	
	//getter,setter
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	//method
	//1. 공격
	public void attack(Player target) {
		this.setHp(this.getHp() - target.getDamage());
	}
	//2. 방어
	public void defence(Player target) {
		this.setHp(this.getHp() -(target.getDamage()/2));
	}
	
	
	
}
