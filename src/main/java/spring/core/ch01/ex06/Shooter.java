package spring.core.ch01.ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired private Pistol pistol; //DI내용을 AUTOwired로 선언했다.
	@Autowired @Nullable private Rifle rifle;
	
	public void fire() {
		pistol.fire();
		if(rifle != null) rifle.fire();
	}
}
