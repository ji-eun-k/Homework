import java.lang.Math;

public class Ramanujan {

	public static void main(String[] args) {
		double sum=0, n=0, fact1=1, fact2 = 1, gap=0.0000001, rooteight=Math.sqrt(8)/9801;
		
		while(true){
			
			for (int i =1; i<4*n;i++) {
				fact1 = fact1 * i;
				if (i==n) fact2 = fact1;
			}
			
			sum = sum + fact1*(1103+26390*n) / Math.pow(fact2, 4)*Math.pow(396, 4*n);
			
			if(Math.abs(1/(rooteight*sum) - Math.PI) < gap) break;
			
			n++;
		}
		
		System.out.println("원래 π : "+ Math.PI +", 라마누잔 공식으로 구한 2/π : " + 1/(rooteight*sum));

	}

}
