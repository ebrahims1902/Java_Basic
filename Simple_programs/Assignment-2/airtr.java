import java.util.*; 

interface airtravel{
    public void expense();
    public void traveltime();
}

class airindia implements airtravel {
    public void expense() {
        System.out.println("AirIndia TicketRate");
        int balance = 0, vipRate;
        Scanner vipsc = new Scanner(System.in);
        // Scanner normals = new Scanner(System.in);
        System.out.println("Choose 1 to choose VIP class, VIP class Rate is 1500 to 1750 Based on Seats");
        System.out.println("Choose 2 to choose Normal class, Normal class Rate is 1000 to 1499 Based on Seats ");
        System.out.println("Choose 3 to choose low class, low class Rate is 500 to 999 Based on Seats ");
        System.out.println("Choose 4 to EXIT");
        System.out.print("Choose your class: ");

        int vip = vipsc.nextInt();
        switch(vip){
            case 1:
            System.out.print("You Choose VIP Class, Please Enter You'r money to apply VIP Class: ");
            vipRate = vipsc.nextInt();

            if(vipRate > 0 && vipRate < 1500){
                balance = 0;
                System.out.println("You cant able to apply. VIP class Range is 1500 to 1750, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            else if(vipRate <= 1500 && vipRate <= 1750){
                balance = balance + vipRate;
                System.out.println("Successfully You Booked VIP class, Thank You.");
                break;
            }else if(vipRate > 1750){
                balance = 0;
                System.out.println("1500 to 1750 Range only is there to apply, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            break;
            case 2:
            System.out.print("You Choose Normal Class, Please Enter You'r money to apply Normal Class: ");
            vipRate = vipsc.nextInt();

            if(vipRate > 0 && vipRate < 1000){
                balance = 0;
                System.out.println("You cant able to apply. Normal class Range is 1000 to 1499, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            else if(vipRate <= 1000 && vipRate <= 1499){
                balance = balance + vipRate;
                System.out.println("Successfully You Booked Normal class, Thank You.");
                break;
            }else if(vipRate > 1499){
                balance = 0;
                System.out.println("1000 to 1499 Range only is there to apply, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            break;
            case 3:
            System.out.print("You Choose Low Class, Please Enter You'r money to apply Low Class: ");
            vipRate = vipsc.nextInt();

            if(vipRate > 0 && vipRate < 500){
                balance = 0;
                System.out.println("You cant able to apply. Low class Range is 500 to 999, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            else if(vipRate <= 500 && vipRate <= 999){
                balance = balance + vipRate;
                System.out.println("Successfully You Booked Low class, Thank You.");
                break;
            }else if(vipRate > 999){
                balance = 0;
                System.out.println("500 to 999 Range only is there to apply, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            break;
            case 4:
            System.exit(0);
            default:
            System.exit(0);
        }
    }
    public void traveltime() {
        System.out.print("AirIndia Traveltime: ");
        System.out.println("3 Hours.");
        System.out.println("------------------------------------Thanking You------------------------------------");
    }
}

class emirates implements airtravel {
    public void expense() {
        
        System.out.println("Emirates TicketRate");
        int balance = 0, vipRate;
        Scanner vipsc = new Scanner(System.in);
        System.out.println("Choose 1 to choose VIP class, VIP class Rate is 2000 to 3000 Based on Seats");
        System.out.println("Choose 2 to choose Normal class, Normal class Rate is 1500 to 1999 Based on Seats ");
        System.out.println("Choose 3 to choose low class, low class Rate is 750 to 1499 Based on Seats ");
        System.out.println("Choose 4 to EXIT");
        System.out.print("Choose your class: ");

        int vip = vipsc.nextInt();
        switch(vip){
            case 1:
            System.out.print("You Choose VIP Class, Please Enter You'r money to apply VIP Class: ");
            vipRate = vipsc.nextInt();

            if(vipRate > 0 && vipRate < 2000){
                balance = 0;
                System.out.println("You cant able to apply. VIP class Range is 2000 to 3000, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            else if(vipRate <= 2000 && vipRate <= 3000){
                balance = balance + vipRate;
                System.out.println("Successfully You Booked VIP class, Thank You.");
                break;
            }else if(vipRate > 3000){
                balance = 0;
                System.out.println("2000 to 3000 Range only is there to apply, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            break;
            case 2:
            System.out.print("You Choose Normal Class, Please Enter You'r money to apply Normal Class: ");
            vipRate = vipsc.nextInt();

            if(vipRate > 0 && vipRate < 1500){
                balance = 0;
                System.out.println("You cant able to apply. Normal class Range is 1500 to 1999, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            else if(vipRate <= 1500 && vipRate <= 1999){
                balance = balance + vipRate;
                System.out.println("Successfully You Booked Normal class, Thank You.");
                break;
            }else if(vipRate > 1999){
                balance = 0;
                System.out.println("1500 to 1999 Range only is there to apply, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            break;
            case 3:
            System.out.print("You Choose Low Class, Please Enter You'r money to apply Low Class: ");
            vipRate = vipsc.nextInt();

            if(vipRate > 0 && vipRate < 750){
                balance = 0;
                System.out.println("You cant able to apply. Low class Range is 750 to 1499, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            else if(vipRate <= 750 && vipRate <= 1499){
                balance = balance + vipRate;
                System.out.println("Successfully You Booked Low class, Thank You.");
                break;
            }else if(vipRate > 1499){
                balance = 0;
                System.out.println("750 to 1499 Range only is there to apply, Sorry you cant apply in this cost: " + vipRate);
                break;
            }
            break;
            case 4:
            System.exit(0);
            default:
            System.exit(0);
        }
    }
    public void traveltime() {
        System.out.print("Emirates Traveltime: ");
        System.out.println("1.5 Hours");
        System.out.println("------------------------------------Thanking You------------------------------------");
    }
}

class NewClass { 
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
}

class airtr{
    public static void main(String args[]){
        System.out.println("Welcome to Airways");
        System.out.println("Choose 1 to AirIndia Airways, Indian Airways Rate 500 to 1750.");
        System.out.println("Choose 2 to Emirates Airways, Emirates Airways Rate 750 to 3000.");
        System.out.print("Select your option: ");
        Scanner scr = new Scanner(System.in);
        int airways = scr.nextInt();
        switch(airways){
            case 1:
            int length = 4; 
            System.out.println(NewClass.OTP(length));
            System.out.println("");
            airindia ar = new airindia();
            ar.expense();
            System.out.println("");
            ar.traveltime();
            System.out.println("");
            break;
            case 2:
            int length1 = 4; 
            System.out.println(NewClass.OTP(length1));
            System.out.println("");
            emirates er = new emirates();
            er.expense();
            System.out.println("");
            er.traveltime();
            break;
            default:
            System.out.println("Anable to find your option. Please try again");
        }
    }
}