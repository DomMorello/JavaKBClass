package vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("�ƿ��","A8",Wheel.RED);
		Wheel w1 = new Wheel("ȥ��Ÿ�̾�1",3);
		Wheel w2 = new Wheel("�ƿ��Ÿ�̾�1",1);
		Wheel w3 = new Wheel("ȥ��Ÿ�̾�2",2);
		Wheel w4 = new Wheel("�ƿ��Ÿ�̾�2",2);
		Wheel w5 = new Wheel("����Ÿ�̾�1",1);
		Wheel w6 = new Wheel("����Ÿ�̾�2",1);
		Wheel w7 = new Wheel("ȥ��Ÿ�̾�3",1);
		Wheel w8 = new Wheel("�ƿ��Ÿ�̾�3",3);
		Wheel w9 = new Wheel("����Ÿ�̾�3",3);
		Wheel w10 = new Wheel("ȥ��Ÿ�̾�4",2);
		Wheel w11 = new Wheel("�ƿ��Ÿ�̾�4",3);
		Wheel w12 = new Wheel("����Ÿ�̾�4",3);
		Wheel w13 = new Wheel("ȥ��Ÿ�̾�5",2);
		Wheel w14 = new Wheel("����Ÿ�̾�5",1);
		Wheel w15 = new Wheel("�ƿ��Ÿ�̾�5",3);
		
		car1.addWheel(w1);
		car1.addWheel(w8);
		car1.addWheel(w9);
		car1.addWheel(w11);
		car1.assembleWheel();
		
	}

}
