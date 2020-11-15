import java.util.Scanner;

class rainfall{
    double a[] = new double[5];
    double total = 0,average;
        void get(){
            Scanner sc = new Scanner(System.in);

            for(int i=0; i<5; i++){
                System.out.print("Enter rainfall data No."+(i+1)+": ");
                a[i] = sc.nextDouble();
            }
        }
    void average(){
        for(int i=0; i<5; i++){
            total = total + a[i];
        }
        average = total / 5;
        System.out.format("The average is: %.3f", average);
    }

}

public class Rainfall {
    public static void main(String[] args) {    
        rainfall rn=new rainfall();
        rn.get();
        rn.average();
    }
}