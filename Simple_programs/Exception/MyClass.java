import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner java = new Scanner(System.in);
    System.out.println("Enter your age: ");

    int name = java.nextInt();
    if(name != 18 || name > 18){
        System.out.println("congrats");
       } else{
            System.out.println("bad luck");
        }
  }
}
