
public class TravelInformation {
	private String source;
	private String destination; 
	private int noOfTravellers;
	private int distance;
	
	
	public TravelInformation(String source, String destination, int noOfTravellers, int distance) {
		super();
		this.source = source;
		this.destination = destination;
		this.noOfTravellers = noOfTravellers;
		this.distance = distance;
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
	
	
}
