interface airtravel {
    public void expense();
    public void traveltime();
}
class travel implements airtravel {    
    public void expense() {
        System.out.println("TicketRate");
    }
    public void traveltime() {
        System.out.println("Traveltime");
    }
}

class Airtravel{
    public static void main(String args[]) {  
        travel t = new travel();
        t.expense();
        t.traveltime();
    }
}