import java.util.*; 



public class NewClass { 
    static char[] OTP(int len) {
        System.out.print("Your OTP is : ");
        String numbers = "0123456789"; 
        Random rndm_method = new Random(); 
        char[] otp = new char[len]; 
        for (int i = 0; i < len; i++) 
        { 
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
        return otp; 
    } 
    public static void main(String[] args) { 

        int length = 3; 
        System.out.println(OTP(length));

        int balance = 0, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("");
            System.out.println("----------KingFisher_Airways Flight Booking----------");
            System.out.println("Please Enter Your class");
            System.out.println("Choose 1 for VIP class");
            System.out.println("Choose 2 for Normal class");
            System.out.println("Press  3 to Check your booking");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter your money to apply VIP class:");
                deposit = s.nextInt();
                if(deposit > 0 && deposit < 1000){
                    balance = 0;
                    System.out.println("low money you cant able to book");
                    break;
                }
                else if(deposit <= 1000 && deposit <= 5000){
                    balance = balance + deposit;
                    System.out.println("You Booked VIP class");
                    break;
                }else if(deposit > 5000){
                    balance = balance + deposit;
                    System.out.println("cant able to get money its too hight, 1000 to 5000 Range only is there to apply");
                    break;
                }
                break;

                case 2:
                System.out.print("Enter your money to apply Normal class: ");
                deposit = s.nextInt();
                if(deposit > 0 && deposit < 200){
                    balance = 0;
                    System.out.println("low money you cant able to book");
                    break;
                }
                else if(deposit <= 200 && deposit<=1000){
                    balance = balance + deposit;
                    System.out.println("You Booked Normal class");
                    break;
                }
                else if(deposit>1000){
                    balance = balance + deposit;
                    System.out.println("we cant able to get money its too hight, 200 to 1000 Range only is there to apply");
                    break;
                }
                break;
 
                case 3:
                System.out.println("Your money is received : " + balance + "");
                System.out.println("We will inform your booking detail");
                System.out.println("-----------------Thank You------------------");
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    } 
} 