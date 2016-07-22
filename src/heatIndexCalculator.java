/* Oscar Hedblad
 * COP3330, 0002A
 * 
 * DESCRIPTION: The program takes in input from the user, first a temperature in degrees Fahrenheit,
 * followed by the humidity expressed as a percentage. The program then calculates what temperature
 * it actually "feels" like outside.  
 */

// Name of my class, heatIndexCalculator.
public class heatIndexCalculator {
    
    // Declaration of my fields, following Prof. Ghosh UML diagram.
    private int temperature;
    private double humidity;
    private double heatIndex;
    
    
    // Below is my constructor that takes in temperature, as an integer, and humidity as a double.
    public heatIndexCalculator(int temperature, double humidity){
        this.temperature = temperature;
        this.humidity = humidity;
        // Obtains value from temperature and humidity by passing through the method (calculateHeatIndex).
        heatIndex = calculateHeatIndex(temperature, humidity);
        printHeatIndex(temperature, humidity, heatIndex);
    }

    /* Below is my private method for calculating the heat index. The variable heatIndex
     * gets calculated according to the formula given in the assignment.
    */
    private double calculateHeatIndex(int currentTemp, double currentHumidity){
        
    	// Constants c1 through c9 gets set to their value.
        double c1 = -42.379, c2 = 2.04901523, c3 = 10.14333127, c4 = -0.22475541, 
                c5 = (-6.83783*0.001), c6 = (-5.481717*0.01), c7 = (1.22874*0.001),
                c8 = (8.5282*0.0001), c9 = (-1.99*0.000001);
        
        // heatIndex gets calculated.
        heatIndex = c1 + (c2*currentTemp) + (c3*currentHumidity) + (c4*currentTemp*currentHumidity) 
                + (c5*currentTemp*currentTemp) + (c6*currentHumidity*currentHumidity) 
                + (c7*currentTemp*currentTemp*currentHumidity) + (c8*currentTemp*currentHumidity*currentHumidity) 
                + (c9*currentTemp*currentTemp*currentHumidity*currentHumidity);
        
        // heatIndex gets returned.
        return heatIndex;
        
    }
    // Below is the method that prints out the calculated heat index.
    private void printHeatIndex(int currentTemp, double currentHumidity, double calculatedHeatIndex){
        
    	// Printf that prints out and displays the temperature & humidity entered by the user, 
    	// as well as the new temperature it actually "feels" like.
        System.out.printf("At a temperature of %dF and a humidity of %.2f percent . . .\nIt actually feels like: %.2fF", currentTemp, currentHumidity, calculatedHeatIndex);
    }
}