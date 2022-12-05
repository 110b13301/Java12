package pack9.sub1;
public class CSphere { //(a)create class
	public double radius;
	public CSphere(double r) { //(a)create constructor
		radius=r;
	}
	public void show() {
		System.out.println("radius="+radius+"\nvolume="+4/3*3.14*Math.pow(radius, 3)); //(b)show radius and volume
	}
}
