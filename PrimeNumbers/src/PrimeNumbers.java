import java.util.ArrayList;
import java.util.List;


public class PrimeNumbers {

	public static List<Integer> primes(int num) {
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		primeNums.add(2);
		if(num > 2) {
			primeNums.add(3);
			primeNums.add(5);
		}
		if(num > 7) {
			primeNums.add(7);
		}
		
		for(int i = 2; i < num; i++) {
			if((i % 2 != 0 && i != 2) && 
			   (i % 3 != 0 && i != 3) && 
			   (i % 5 != 0 && i != 5) && 
			   (i % 7 != 0 && i != 7)) {
				primeNums.add(i);
			}
		}
		return primeNums;
	}

}
