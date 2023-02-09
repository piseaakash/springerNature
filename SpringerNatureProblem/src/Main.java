
public class Main {

	public static void main(String args[]) {
		TravelInformation t = new TravelInformation("PUNE", "NASHIK", 2, 0);
		Calculatable d = new DistanceCalculator();
		double distance = d.calculate(t);
		t.setDistance((int)distance);
		Calculatable c = new TicketCostCalculator();
		double cost = c.calculate(t);
		
		
		Ticket ticket = new Ticket(t.getSource(), t.getDestination(), t.getNoOfTravellers(), t.getDistance(), (int)cost);
		Printable printer = new TicketPrinter();
		printer.print(ticket);
	}
}
