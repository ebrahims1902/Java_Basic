import java.util.Scanner;
public class Digit_sum {
    public static void main(String args[]){
        int m, n, sum =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m/10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}