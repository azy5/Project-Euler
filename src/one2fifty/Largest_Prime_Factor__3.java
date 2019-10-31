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
//		prime.add(2);
		int quest = 12;
//		Reduce(quest, prime.get(prime.size()-1));
		int result = LPrime(1,quest,prime);
		System.out.println(result);
	}
	
	public static int LPrime(int factor, long target, List<Integer> primes) {
		
		int key = 0;
		while(key == 0) {
			factor +=1;
			System.out.println("testing number: " + factor);
			if(factor == 2) {
				primes.add(factor);
				break;
			}
			for (int p : primes){
				if(factor%p != 0) {
					primes.add(factor);
					key = 1;
					break;
				}
			}	
		}
		
		System.out.println("New factor found is: " + factor);
		
		// reduce to factor
		target = Reduce(target, primes.get((primes.size())-1));
		
//		if(target == 1) {
//			return factor;
//		}else {
//			LPrime(factor, target, primes);
//		}
		return 0;
	}
	
	
	//recursion needs to revert
	public static long Reduce(long obj, int divider) {
		if(obj%divider == 0) {
			obj = obj/divider;
			Reduce(obj, divider);
		}else {
			return obj;
		}
		System.out.println("target reduced to: " + obj);
		return obj;
	}

}
