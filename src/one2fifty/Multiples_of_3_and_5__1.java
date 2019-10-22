package one2fifty;

import java.util.ArrayList;
import java.util.List;

/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Multiples_of_3_and_5__1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> multiples = new ArrayList<Integer>();
		int result=0;
		
		for(int i=1;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				multiples.add(i);
			}
		}
		
		for(int i=0; i<multiples.size(); i++) {
			result+=multiples.get(i);
		}
		
		System.out.println(result);

	}

}
