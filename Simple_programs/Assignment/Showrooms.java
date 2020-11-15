import java.util.*;

public class Showrooms {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Only 5 car Showrooms Available here");
        System.out.println("choose 1 to select Honda Showroom");
        System.out.println("choose 2 to select Nissan Showroom");
        System.out.println("choose 3 to select Maruti Suzuki showroom");
        System.out.println("choose 4 to select Ford showroom");
        System.out.println("choose 5 to select Renault showroom");
        System.out.print("Choose you'r option: " );
        int n = sc.nextInt();
        
        switch(n){
            case 1:
            System.out.println("you'r option is 1");

            System.out.println("Welcome to Hyundai showroom, 5 cars only Available here");
            System.out.println("1) Honda Amaze");
            System.out.println("2) Honda Civic");
            System.out.println("3) Honda Jazz");
            System.out.println("4) Honda WR-V");
            System.out.println("5) Honda CR-V");
            System.out.print("Enter You'r option: ");
            int carName1 = scanner1.nextInt();

            switch(carName1){
                case 1:
                System.out.println("you selected Honda Amaze");
                System.out.println("Thank you");
                break;
                case 2:
                System.out.println("you selected Honda Civic");
                System.out.println("Thank you");
                break;
                case 3:
                System.out.println("you selected Honda Jazz");
                System.out.println("Thank you");
                break;
                case 4:
                System.out.println("you selected Honda WR-V");
                System.out.println("Thank you");
                break;
                case 5:
                System.out.println("you selected Honda CR-V");
                System.out.println("Thank you");
                break;
                default:
                System.out.println("There no car in that " + carName1+ "th list");
                System.exit(0);
            }
            break;
            case 2:
            System.out.println("you'r option is 2");

            System.out.println("Welcome to Nissan showroom, 5 cars only Available here");
            System.out.println("1) Nissan Kicks");
            System.out.println("2) Nissan GT-R");
            System.out.println("3) Nissan Magnite");
            System.out.println("4) Nissan Kicks Facelift");
            System.out.println("5) Nissan Leaf EV");
            System.out.print("Enter You'r option: ");
            int carName2 = scanner2.nextInt();

            switch(carName2){
                case 1:
                System.out.println("you selected Nissan Kicks");
                System.out.println("Thank you");
                break;
                case 2:
                System.out.println("you selected Nissan GT-R");
                System.out.println("Thank you");
                break;
                case 3:
                System.out.println("you selected Nissan Magnite");
                System.out.println("Thank you");
                break;
                case 4:
                System.out.println("you selected Nissan Kicks Facelift");
                System.out.println("Thank you");
                break;
                case 5:
                System.out.println("you selected Nissan Leaf EV");
                System.out.println("Thank you");
                break;
                default:
                System.out.println("There no car in that " + carName2 + "th list");
                System.exit(0);
            }
            break;

            case 3:
            System.out.println("you'r option is 3");

            System.out.println("Welcome to Maruti Suzuki, 5 cars only Available here");
            System.out.println("1) Maruti Suzuki Alto 800");
            System.out.println("2) Maruti Suzuki S-Presso");
            System.out.println("3) Maruti Suzuki Ignis");
            System.out.println("4) Maruti Suzuki Dzire");
            System.out.println("5) Maruti Suzuki Ertiga");
            System.out.print("Enter You'r option: ");
            int carName3 = scanner3.nextInt();

            switch(carName3){
                case 1:
                System.out.println("you selected Maruti Suzuki Alto 800");
                System.out.println("Thank you");
                break;
                case 2:
                System.out.println("you selected Maruti Suzuki S-Presso");
                System.out.println("Thank you");
                break;
                case 3:
                System.out.println("you selected Maruti Suzuki Ignis");
                System.out.println("Thank you");
                break;
                case 4:
                System.out.println("you selected Maruti Suzuki Dzire");
                System.out.println("Thank you");
                break;
                case 5:
                System.out.println("you selected Maruti Suzuki Ertiga");
                System.out.println("Thank you");
                break;
                default:
                System.out.println("There no car in that " + carName3 + "th list");
                System.exit(0);
            }
            break;


            case 4:
            System.out.println("you'r option is 4");

            System.out.println("Welcome to Ford, 5 cars only Available here");
            System.out.println("1) Ford Endeavour");
            System.out.println("2) Ford Figo");
            System.out.println("3) Ford Freestyle");
            System.out.println("4) Ford Aspire");
            System.out.println("5) Ford Mustang 2021");
            System.out.print("Enter You'r option: ");
            int carName4 = scanner4.nextInt();

            switch(carName4){
                case 1:
                System.out.println("you selected Ford Endeavour");
                System.out.println("Thank you");
                break;
                case 2:
                System.out.println("you selected Ford Figo");
                System.out.println("Thank you");
                break;
                case 3:
                System.out.println("you selected Ford Freestyle");
                System.out.println("Thank you");
                break;
                case 4:
                System.out.println("you selected Ford Aspire");
                System.out.println("Thank you");
                break;
                case 5:
                System.out.println("you selected Ford Mustang 2021");
                System.out.println("Thank you");
                break;
                default:
                System.out.println("There no car in that " + carName4 + "th list");
                System.exit(0);
            }
            break;

            case 5:
            System.out.println("you'r option is 5");

            System.out.println("Welcome to Renault, 5 cars only Available here");
            System.out.println("1) Renault KWID");
            System.out.println("2) Renault Triber");
            System.out.println("3) Renault Duster");
            System.out.println("4) Renault Kiger (HBC)");
            System.out.println("5) Renault K-ZE");
            System.out.print("Enter You'r option: ");
            int carName5 = scanner5.nextInt();

            switch(carName5){
                case 1:
                System.out.println("you selected Renault KWID");
                System.out.println("Thank you");
                break;
                case 2:
                System.out.println("you selected Renault Triber");
                System.out.println("Thank you");
                break;
                case 3:
                System.out.println("you selected Renault Duster");
                System.out.println("Thank you");
                break;
                case 4:
                System.out.println("you selected Renault Kiger (HBC)");
                System.out.println("Thank you");
                break;
                case 5:
                System.out.println("you selected Renault K-ZE");
                System.out.println("Thank you");
                break;
                default:
                System.out.println("There no car in that " + carName5 + "th list");
                System.exit(0);
            }
            break;

            default:
            System.out.println("There no Showroom in that " + n + "th list");
            System.exit(0);
        }
    
    }
}
