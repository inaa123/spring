package spring.core.ch01.ex01;

public class Main {
	public static void main(String[] args) { //메인이 IOC...... 8번줄 관계맺어주는게 main.. mian이 IOC
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		
		Shooter shooter = new Shooter(pistol);
		shooter.fire();
		
		shooter.setGun(rifle);
		shooter.fire();
	}
}
