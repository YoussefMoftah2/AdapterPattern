package adapter;

public class Adapter implements Vichle{
public Bike bike ;
public Adapter(Bike bike) 
{
	this.bike=bike ;
}
	@Override
	public void accelrate() {
		this.bike.padal();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pushbreak() {
		// TODO Auto-generated method stub
		this.bike.pushbreak();
	}

	@Override
	public void soundhorn() {
		// TODO Auto-generated method stub
		this.bike.ringbell();
	}
	
	
	

}
