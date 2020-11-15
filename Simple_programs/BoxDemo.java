class Box {
    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    void volume(){
        double vol = width*height*depth;
        System.out.println(vol);
    }
}
class BoxDemo{
    public static void main(String args[]){
        Box myfirstbox = new Box(5,10,15);
        Box mysecondbox = new Box(1,5,7);
        myfirstbox.volume();
        mysecondbox.volume();
    }
}