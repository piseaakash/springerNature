
public class Ticket {
	private String source; 
	private String destination; 
	private int noOfTravellers;
	private int distance;
	private int totalCost;
	
	
	
	public Ticket(String source, String destination, int noOfTravellers, int distance, int totalCost) {
		super();
		this.source = source;
		this.destination = destination;
		this.noOfTravellers = noOfTravellers;
		this.distance = distance;
		this.totalCost = totalCost;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfTravellers() {
		return noOfTravellers;
	}
	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
}
