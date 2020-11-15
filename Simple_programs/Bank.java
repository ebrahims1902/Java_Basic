import java.util.Scanner;
class bankInternal {
    int acno;
    float bal = 0;
    Scanner get = new Scanner(System.in);
    bankInternal(){
        System.out.println("Enter Account Number: ");
        acno = get.nextInt();
        System.out.println("Enter Inital Balance: ");
        bal = get.nextFloat();
    }
    void deposit(){
        float amount;
        System.out.println("Enter Amount to be Deposited:");
        amount = get.nextFloat();
        bal = bal+amount;
        System.out.println("Deposited! Account Balance is "+bal);
    }

    void withdraw(){
        float amount;
        System.out.println("Enter Amount to be Withdrawn:");
        amount = get.nextFloat();
        if(amount<bal){
            bal = bal-amount;
            System.out.println("Amount Withdrawn!! Available Balance:"+bal);
        }else{
            System.out.println("Insufficient funds!!");
        }
    
    }
}
public class Bank {
    public static void main(String[] args){
        bankInternal myObj = new bankInternal();
        myObj.deposit();
        myObj.withdraw();
    }
}