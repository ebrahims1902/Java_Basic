interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}
class TestInterface1{
    public static void main(String args[]){
        Rectangle rec = new Rectangle();
        Circle cir = new Circle();
        rec.draw();
        cir.draw(); 
    }
}