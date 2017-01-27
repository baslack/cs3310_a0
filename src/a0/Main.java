/*
Benjamin Slack
CS3310, Winter 2017
Assignment #1
Searching in Arrays
 
Summary:
Experiment with techniques for searching 
sorted arrays. Practice developing high-
performance solutions. Compare theoreti-
cal vs. empirical complexities. Compare
iterative and recursive solutions of the
problem.
*/

package a0;

public class Main {

	public static void main(String[] args) {
		/*
		 TODO:
		 done 1. Generate n random floats, 1 to m
		 done 2. Sort n.
		 3. Generate a random number x.
		 3a. BinSearch Array interatively
		 3b. BinSearch Array recursively
		 4. Redo 3, poking at thirds
		 5. Redo 3, poking at quarters
		 6. Range-Query: gen two (x,y) rand
		    Find no of n between (x,y)
		 */
		RandomArray test = new RandomArray();
		test.__testArray();
		System.out.printf("%d\n", test.binarySearch_iter(3.0f));
		System.out.printf("%d\n", test.binarySearch_recu(7.0f));
		System.out.printf("%d\n", test.rangeQuery(7.5f, 7.9f));
		System.out.printf("%d\n", test.rangeQuery(3.1f, 7.9f));
		System.out.printf("%d\n", test.rangeQuery(7.0f, 7.0f));
		test.dump();
		
		SearchTimer timer = new SearchTimer(1, 5.0f, (x)->test.binarySearch_iter(x));
	}

}
