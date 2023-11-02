package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class Minicar extends Car{

	public Minicar(Engine engine) {
		super(engine);
	}
	
	public void openTrunk() {
		if (this.engine == null) {
			System.out.println("Engine 이 없어서 차가 동작하지 않음");
			return;
		} 
			System.out.println("트렁크가 열림");
	}
}
