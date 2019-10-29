package one2fifty;

import java.util.ArrayList;
import java.util.List;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Largest_Prime_Factor__3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		int result = LPrime(2,12,prime);
		System.out.println(result);
	}
	
	public static int LPrime(int factor, long target, List<Integer> primes) {
		
		int key = 0;
		while(key == 0) {
			factor +=1;
			for (int p : primes){
				if(factor%p != 0) {
					primes.add(factor);
					key = 1;
					break;
				}
			}
			
		}
		
		//need to reduce target to a factor 12/2/2 = 3;
		target = ReduceFact(target, primes);
		
		if(factor == target) {
			return factor;
		}else {
			LPrime(factor, target, primes);
		}
		return 0;
	}
	
	public static long ReduceFact(long obj, List<Integer> primeList) {
		for(int i=0; i<primeList.size()-2; i++) {
			int p = primeList.get(i);
			if(obj%p == 0) {
				obj = obj%p;
				ReduceFact(obj, primeList);
			}
		}
		
		return obj;
		
	}

}
