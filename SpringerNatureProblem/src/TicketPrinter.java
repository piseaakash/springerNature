
public class TicketPrinter implements Printable {

	
	@Override
	public void print(Ticket ticket) {
		System.out.println("Taxi Ticket:");
		System.out.println("=============");
		System.out.println("Source: " +ticket.getSource());
		System.out.println("Destination: "+ticket.getDestination());
		System.out.println("Kms: "+ticket.getDistance());
		System.out.println("No. of travellers: "+ticket.getNoOfTravellers());
		System.out.println("Total: "+ticket.getTotalCost());
		
	}
	
	
}
