package spring.core.ch01.ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.ch01.ex01.Rifle;

@Configuration //나는 configuration이야
public class Config2 {
	@Bean //여기선 rifle선언
	public Rifle rifle() {
		return new Rifle();
	}
}
