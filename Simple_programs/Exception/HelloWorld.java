import java.util.*; 

public class HelloWorld{
    public static void main(String[] args){
         Scanner java = new Scanner(System.in);
         System.out.println("Enter name,sl and age");
         
         String name = java.nextLine();
         double sl = java.nextDouble();
         int age = java.nextInt();
         
         System.out.println("Name:" + name);
         System.out.println("Salary:" + sl);
         System.out.println("age:" + age);
        
    }
}