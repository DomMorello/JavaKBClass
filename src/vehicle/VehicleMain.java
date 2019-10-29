package vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("아우디","A8",Wheel.RED);
		Wheel w1 = new Wheel("혼다타이어1",3);
		Wheel w2 = new Wheel("아우디타이어1",1);
		Wheel w3 = new Wheel("혼다타이어2",2);
		Wheel w4 = new Wheel("아우디타이어2",2);
		Wheel w5 = new Wheel("볼보타이어1",1);
		Wheel w6 = new Wheel("볼보타이어2",1);
		Wheel w7 = new Wheel("혼다타이어3",1);
		Wheel w8 = new Wheel("아우디타이어3",3);
		Wheel w9 = new Wheel("볼보타이어3",3);
		Wheel w10 = new Wheel("혼다타이어4",2);
		Wheel w11 = new Wheel("아우디타이어4",3);
		Wheel w12 = new Wheel("볼보타이어4",3);
		Wheel w13 = new Wheel("혼다타이어5",2);
		Wheel w14 = new Wheel("볼보타이어5",1);
		Wheel w15 = new Wheel("아우디타이어5",3);
		
		car1.addWheel(w1);
		car1.addWheel(w8);
		car1.addWheel(w9);
		car1.addWheel(w11);
		car1.assembleWheel();
		
	}

}
