class Multhr implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Multhr m1=new Multhr();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}