import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DistanceCalculator implements Calculatable{
	

	@Override
	public double calculate(TravelInformation t) {
		FileInputStream fis;
		String distance = "";
		try {
			fis = new FileInputStream("distance.properties");

			Properties prop = new Properties();

			prop.load(fis);
			distance = prop.getProperty(t.getSource()+t.getDestination());
			
			if(distance.isEmpty()) {
				System.out.println("Travel currently unavailable for given source and destination");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Integer.valueOf(distance);
	}
}
