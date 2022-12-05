package pack9;
import pack9.sub1.CSphere;
import pack9.sub2.CTrapezoid;
public class Java09 {
	public static void main(String[] args) {
		CSphere s=new CSphere(2);
		CTrapezoid t=new CTrapezoid(3, 4, 5);
		s.show(); //(e)show the result of (a), (b)
		t.show(); //(e)show the result of (c), (d)
	}
}
