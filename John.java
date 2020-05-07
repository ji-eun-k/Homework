import java.lang.Math;

public class John {

	public static void main(String[] args) {
		double gap=0.00000001, sum = 1, n=1;
	
		while(true) {
			sum = sum * (1 - 1/(4*Math.pow(n,2)));
			if(Math.abs(sum - 2/Math.PI) < gap) break;
			n++;
		}
		
		System.out.println("원래 2/π : "+ (2/Math.PI) +", 존 월리스 공식으로 구한 2/π : " +sum);
	}

}