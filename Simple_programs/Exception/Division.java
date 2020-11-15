import java.util.Scanner;

class Division {
    public static void main(String[] args) {
        double a,b, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");
        a = input.nextDouble();
        b = input.nextDouble();
        try {
            result = a/b;
            System.out.println("Result = " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: Division by Zero");
        }
    }
}