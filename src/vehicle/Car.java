package vehicle;

public class Car {

	String brand; //자동차 제조회사
	int tire = 4; 
	int capacity;
	String name;
	int color;
	Wheel[] wheels = new Wheel[tire];
	
	public Car(String brand, String name, int color) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.capacity = 0;
	}
	
	public Car() {}
	
	@Override
	public String toString() {
		return name+"brand: "+" color: "+color;
	}
	
	public void assembleWheel() {
		for(int i=0; i < wheels.length; i++) {
			if(wheels[0].size == wheels[i].size) {
				System.out.println("["+i+"]"+wheels[i].name+"을 결합했습니다.");
			}else {
				System.out.println(wheels[i].name+"의 사이즈가 "+wheels[0].name+"의 사이즈와 다릅니다. 같은 사이즈를 결합하십시오.");
			}
		}//for끝
	}//메서드끝
	
	public void addWheel(Wheel wheel) {
		if(capacity == wheels.length) {	//배열에 꽉 차 있으면 추가 못함
			System.out.println("\t>>공간부족! "+wheel+"을 추가하지 못했습니다.");
		}else {
			for(int i=0; i < wheels.length; i++) {	
				if(wheels[i] == null) {	//비어있는 곳에만 추가
					wheels[i] = wheel;
					System.out.println("["+i+"]"+wheel+"을(를) 재고에 추가했습니다.");
					capacity++;
					break;
				}//if끝
			}//for끝
		}//else끝
	}//메서드끝
	
	
}
