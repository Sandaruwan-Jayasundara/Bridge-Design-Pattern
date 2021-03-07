package BridgePattern;

public class Test {

	public static void main(String[] args) {

		TV LGTV = new LGtv();
		TV SonyTV = new Sonytv();
		
		
		
		

		new RemoteContrlolerImpl(LGTV).on();
		new RemoteContrlolerImpl(LGTV).off();
		new RemoteContrlolerImpl(LGTV).tune(10);
		new RemoteContrlolerImpl(SonyTV).on();
		new RemoteContrlolerImpl(SonyTV).off();
		new RemoteContrlolerImpl(SonyTV).tune(20);
	}

}
