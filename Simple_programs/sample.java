import java.util.Scanner;
import java.util.Random;
interface FlightOpeartions{
 void getAllAvailableFlights();
 void booking(BookingObject bookingObj);
 

class BookingObject{}

class BritishAirways implements FlightOpeartions{
 
 public void getAllAvailableFlights(){
           //get british airways flights in the way 
           //they told us to fetch flight details.
 }
 
 public void booking(BookingObject flightDetails){  
          //place booking order in a way British airways 
          //told us to place order for seat.
 }
 
}
class Emirates implements FlightOpeartions{
 
 public void getAllAvailableFlights(){
         //get Emirates flights in the way 
         //they told us to fetch flight details.
 }
 
 public void booking(BookingObject flightDetails){  
         //place booking order in a way Emirates airways
         //told us to place order for seat.
        }
            
}
public class sample {
    public static void main(String[] args) {
        
    }
}
