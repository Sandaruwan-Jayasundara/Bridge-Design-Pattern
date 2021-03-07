package BridgePattern;

public class RemoteContrlolerImpl implements RemoteController{

	TV tv;
	
	public RemoteContrlolerImpl(TV tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void on() {
	
		tv.on();
	}

	@Override
	public void off() {
		tv.off();
		
	}

	@Override
	public void tune(int chanel) {
	
		tv.tune(chanel);
	}

}
