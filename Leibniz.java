import java.lang.Math;
public class Leibniz {

	public static void main(String[] args) {
		double n = 1;
		double s = -1;
		double a = 0;
		double gap = 0.0000000001;
		
		while(true) {
			s = -s;
			a += s / (2*n - 1);
			if(Math.abs(a - Math.PI/4) < gap) break;
			n++;
		}
		
		System.out.println("원래 파이값:"+Math.PI +" 구한 파이값:" +a*4);
	}

}