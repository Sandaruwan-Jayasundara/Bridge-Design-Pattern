package BridgePattern;

public class Sonytv implements TV{

	@Override
	public void on() {
	
		System.out.println("Switch on Sony TV");
	}

	@Override
	public void off() {

		System.out.println("Switch off Sony TV");
	}

	@Override
	public void tune(int chanel) {
	
		System.out.println("Switch on channel in Sony TV is :"+ chanel);
	}

}
