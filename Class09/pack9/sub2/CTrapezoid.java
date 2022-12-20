package pack9.sub2;
public class CTrapezoid { //(c)create class
	public int upper, base, height;
	public CTrapezoid(int u, int b, int h) { //(c)create constructor
		upper=u;
		base=b;
		height=h;
	}
	public void show() {
		System.out.println("upper="+upper+"\nbase="+base+"\nheight="+height+"\narea="+(upper+base)*height/2); //(d)show upper, base, height and area
	}
}
