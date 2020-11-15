import java.util.*;
public class Test {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            int i, t;
            System.out.print("Enter table number:");
            t = sc.nextInt();
            i = 0;
            while(i<=100) {
                System.out.println(i+"*"+t+"="+i*t);
                i++;
            }
            System.out.print("Do you want to continue(Y/N):");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');
        sc.close();
        
    }

}