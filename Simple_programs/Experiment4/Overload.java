import java.util.Scanner;

class overloademo{
	double r,b,h,arcir,pi=3.14;
	int s,l,br;
	void area(float x){
		r=x;
		arcir=pi*r*r;
		System.out.println("the area of the circle is : " + arcir);
	}
	void area(float x, float y){
		System.out.println("the area of the rectangle is "+x*y+" sq units");
	}

	void area(double x){
		double z = 3.14 * x * x;
		System.out.println("the area of the circle is "+z+" sq units");
	}

}
class Overload{
	public static void main(String args[]){
		overloademo ob = new overloademo();
		ob.area(5);
		ob.area(11,12);
		ob.area(2.5);
	}
}