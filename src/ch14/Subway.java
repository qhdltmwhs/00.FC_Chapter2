package ch14;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	public void showSubwayInfo() {
		System.out.println(lineNumber + "색의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원입니다.");
	}
	
}
