

public class TicketCostCalculator implements Calculatable {

	/*private TravelInformation t;
	
	public void setTravelInformation(TravelInformation t) {
		this.t = t;
	}*/
	@Override
	public double calculate(TravelInformation t) {
		// TODO Auto-generated method stub
		// 100km - 750 then 5 per km
		int distance = t.getDistance();
		
		//int distance = Integer.valueOf(distanceStr);
		int totalCost = (750 + ((distance - 100)*5) )*t.getNoOfTravellers();
		return totalCost;
	}

}
