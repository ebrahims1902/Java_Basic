interface Airtravel {
    public void expense();
    public void traveltime();
}

class Travel implements Airtravel{
    public void expense(){
        System.out.println("TricketRate");
    }
    public void traveltime(){
        System.out.println("Travel time");
    }
}
class TestInterface2{
    public static void main(String args[]) {
        Travel t = new Travel();
        t.expense();
        t.traveltime();
    }
}
