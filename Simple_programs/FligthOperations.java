import java.util.Scanner;
import java.util.*;
import java.util.Random;


public interface FligthOperations{
void getAllAvailableFlights();
void booking();
}
class Emirates extends otp implements FlightOpeartions{
        
        public void getAllAvailableFlights(){
                //get british airways flights in the way 
                //they told us to fetch flight details.
        }
        
        public void booking(){  
                //place booking order in a way British airways 
                //told us to place order for seat.
        }
}
class Airindia implements FlightOpeartions{

        private Object s;
 
        public void getAllAvailableFlights(){
                //get Emirates flights in the way 
                //they told us to fetch flight details.
        }
        
        public void booking(){  
                //place booking order in a way Emirates airways
                //told us to place order for seat.
        }
        
}

class otp{
        void reverse(){
                int num,digit,reversed=0;
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a 3 digit number:");
                num = s.nextInt();
                while(num!=0){
                        digit = num % 10;
                        reversed = reversed*10 + digit;
                        num /=10;
                }
                System.out.println("Reversed Number:" + reversed);
        }
}
