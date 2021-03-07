package BridgePattern;

public class LGtv implements TV{

	@Override
	public void on() {

		System.out.println("Switch on LG TV");
	}

	@Override
	public void off() {
		
		System.out.println("Switch off LG TV");
		
	}

	@Override
	public void tune(int chanel) {
	
		System.out.println("Switch on channel in LG TV is :"+ chanel);
	}
	

}
