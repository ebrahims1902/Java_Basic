import java.util.*;
public class Car
{
    public static void main(String args[]){
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the car name:");
        String carname = java.nextLine();
        
        System.out.println("The given car name is " + carname);
        if (carname =="ferrari"){
            name = 'A';
            
        }else if(carname =="audi"){
            name = 'B';
            
        }else if(carname == "bently"){
            name = 'C';
            
        }else if(carname == "benz"){
            name = 'D';
            
        }else if(carname == "bmw"){
            name = 'E';
            
        }
        switch (name) {
            case 'A' :
            System.out.println("The top speed of a ferrari is 340 Kmph");
            break;
            case 'B' :
            System.out.println("The top speed of a audi is 330 Kmph");
            break;
            case 'C':
            System.out.println("The top speed of a bentlyis 327 Kmph");
            break;
            case 'D':
            System.out.println("The top speed of a benz is 318 Kmph");
            break;
            case 'E':
            System.out.println("The top speed of a is bmw 309 Kmph");
            break;
            default:
            System.out.println("Car not found");
            break;
        }
    }
}