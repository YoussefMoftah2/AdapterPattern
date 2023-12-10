package adapter;

public class Executor {

	public static void main(String[] args) {
	Vichle car =new Car() ;
	usevichle(car ) ;
	Vichle bike =new Adapter(new Bike()) ;
	usevichle(bike) ;
	

	}
	private static void usevichle(Vichle car) {
		car.accelrate();
		car.pushbreak();
		car.soundhorn();
	}

}
