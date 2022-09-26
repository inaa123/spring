package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //레오파드 빈을 하나 만든다.
public class Leopard {

}
