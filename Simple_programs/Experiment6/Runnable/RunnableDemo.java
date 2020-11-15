class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Creating " + threadName );
    }
    public void run() {
        System.out.println(“Even numbers”);
        for(int i = 2; i <5 0; i=i+2) {
            System.out.println(i);
        }
    }

    Class odd implements Runnable{
        public void run(){
            for(i=1;i<10;i=i+2){
                System.out.println(i);
            }    
        }
    }
    Class even implements Runnable{
        public void run(){
            for(i=2;i<10;i=i+2){
                System.out.println(i);
            }
        }
    }
    
    Class oddeven{
        Public static void main(String args[]){
            Odd o=new odd();
            Even e =new even();
            Thread t1=new Thread(o);
            Thread t2=new Thread(e);
            t1.start();
            t2.start();
        }
    }
}
    class odd extends Thread{
        public void run(){
            for(i=1;i<10;i=i+2){
                System.out.println(i);
            }
        }
    }
    Class even extends Thread{
        public void run(){
            for(i=2;i<10;i=i+2){
            System.out.println(i);
            }
        }
    }
    Class oddeven{
        Public static void main(String args[]){
            Odd o=new odd();
            Even e =new even();
            o.start();
            e.start();
        }
    }