import java.lang.Math;

public class Euler {

	public static void main(String[] args) {
		double n=1, sum = 0, gap = 0.00000001, powpi =  Math.pow(Math.PI,2);
		
		while(true) {
			sum = sum + 1/Math.pow(n,2);
			if(Math.abs( sum- powpi/6)<gap) break;
			n++;
		}
		System.out.println("원래 π^2/6 :"+ (powpi/6) +" 오일러 공식으로 구한 π^2/6 :" +sum);
	}

}
