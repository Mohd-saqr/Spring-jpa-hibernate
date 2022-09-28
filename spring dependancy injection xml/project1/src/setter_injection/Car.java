package setter_injection;

public class Car implements vehicle{
	CarRepairer carRepeare;

	@Override
	public String getEngineType() {
		// TODO Auto-generated method stub
		return "desile Engine";
	}
	
	

	public CarRepairer getCarRepeare() {
		return carRepeare;
	}



	public void setCarRepeare(CarRepairer carRepeare) {
		this.carRepeare = carRepeare;
	}
	
	


}


