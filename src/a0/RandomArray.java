package a0;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
	private int size;
	private float max;
	private float[] ar;
	
	/**
	 * RandomArray creates a sorted array of random
	 * floats.
	 * @param size corresponds to the size of the array
	 * @param max is the maximum size of any float in it.
	 * 
	 * @author Benjamin Slack
	 */
	
	public RandomArray(int size, float max) {

		this.size = size;
		this.max = max;
		this.initArray();
	
	}
	
	/**
	 *  Creates a RandomArray with a default setting 
	 *  of 10 for the size and 10 for the max.
	 */

	public RandomArray(){
		this(10,10.0f);
	}

	/**
	 * Used by the constructor and setters. Allocates
	 * a new array and populates it with randoms using
	 * the current field values.
	 */
	private void initArray(){
		this.ar = new float[this.size];
		
		Random rand = new Random();
		
		for(int i = 0; i < this.size; i++){
			this.ar[i] = 1 + rand.nextFloat()*(this.max-1);
		}
		
		Arrays.sort(this.ar);	
	}
	
	/**
	 * Sets a RandomArry to a default set of numbers for
	 * testing  purposes.
	 */
	public void __testArray(){
		this.size = 10;
		this.max = 10.0f;
		this.ar = new float[this.size];
		for(int i = 1; i <= this.size; i++){
			this.ar[i-1] = (float)i;
		}
	}
	
	/**
	 * Implements binary search using an iterative
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int binarySearch_iter(float x){
		
		int start = 0; // begin at the start of the array
		int end = this.ar.length - 1; // end at the end of the array
		int middle; //poke the middle
		while (start <= end){
			middle = (start + end)/2;
			if (this.ar[middle] == x){ // x has been found
				return middle;
			}else if (this.ar[middle] < x){ // x is in the top half of the array
				start = middle + 1;
			}else{ // x is in the bottom half of the array
				end = middle - 1;
			}
		}
		return -1; // got through the loop, so must not have found x
	} //end binarySearch_iter
	
	/**
	 * Implements binary search using a recursive
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int binarySearch_recu(float x){
		return  binarySearch_recu(x, 0, this.ar.length-1); // special case, on start of recursion
	}
	
	private int binarySearch_recu(float x, int start, int end){
		if (start > end){ // break recursion,  not found
			return -1;
		}
		
		int middle = (start+end)/2;
		
		if (this.ar[middle] == x){ // x is found
			return middle;
		}else if(this.ar[middle] < x){ // x is above the middle
			return binarySearch_recu(x, middle+1, end); //recurse with the second half
		}else{
			return binarySearch_recu(x, start, middle - 1); //recurse with the first half
		}
	}
	
	/**
	 * Implements ternary search using an iterative
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int ternarySearch_iter(float x){
		int start = 0;
		int end = this.ar.length - 1;
		int partition1, partition2;
		while (start<=end){
			partition1 = (start + end)/3;
			partition2 = (start + end)/3*2;
			if (this.ar[partition1] == x){ // x is the first partition point
				return partition1;
			}else if (this.ar[partition2] == x){ // x is the second partition point
				return partition2;
			}else if (this.ar[partition2] < x){ // x is in the third partition
				start = partition2 + 1;
			}else if (this.ar[partition1] > x){ // x is in the first partition
				end = partition1 - 1;
			}else{ // x iss in the second partition
				start =  partition1 + 1;
				end = partition2 - -1;
			}
		}
		return -1; //got through the loops so x wasn't found
	} // end ternary_iter
	
	/**
	 * Implements ternary search using a recursive
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int ternarySearch_recu(float x){
		
		return ternarySearch_recu(x, 0, this.ar.length - 1); // special case for first call
		
	}
	
	private int ternarySearch_recu(float x, int start, int end){
		if (start > end){
			return -1;
		}
		int partition1, partition2;
		partition1 = (start + end)/3;
		partition2 = (start + end)/3*2;
		if (this.ar[partition1] == x){ // x is partition point 1
			return partition1;
		}else if (this.ar[partition2] == x){ // x is partition point 2
			return partition2;
		}else if (this.ar[partition2] < x){ // x is in partition 3
			return ternarySearch_recu(x, partition2 + 1, end);
		}else if (this.ar[partition1] > x){
			return ternarySearch_recu(x, start, partition1 - 1); // x is in partition 1
		}else{
			return ternarySearch_recu(x, partition1 + 1, partition2 - 1); // x is in partition 2
		}
	} // end ternarySearch_recu
	
	/**
	 * Implements quaternary search using an iterative
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int quaternarySearch_iter(float x){
		
		int start = 0;
		int end = this.ar.length - 1;
		int partition1, partition2, partition3;
		while(start<=end){
			partition1 = (start + end)/4; // calculate the partitions
			partition2 = (start + end)/4*2;
			partition3 = (start + end)/4*3;
			if (this.ar[partition1] == x){ // if we happen to hit, return the hit
				return partition1;
			}else if (this.ar[partition2] == x){
				return partition2;
			}else if (this.ar[partition3] == x){
				return partition3;
			}else if (this.ar[partition3] < x){ // x is in the last partition
				start = partition3 + 1;
			}else if (this.ar[partition1] > x){ //x is in the first partition
				end = partition1 - 1;
			}else if ((this.ar[partition1] < x) && (this.ar[partition2] > x)){ // x is in the second partition
				start = partition1 + 1;
				end = partition2 - 1;
			}else{ // x is in the third partition
				start = partition2 + 1;
				end = partition3 - 1;
			}
		}
		return -1; // got past the loop so, not found
		
	}
	
	/**
	 * Implements quaternary search using a recursive
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int quaternarySearch_recu(float x){
		return quaternarySearch_recu(x, 0, this.ar.length - 1);
	}
	
	private int quaternarySearch_recu(float x, int start, int end){
		if (start >  end){ // not found, break recursion
			return -1;
		}
		int partition1, partition2, partition3;
		partition1 = (start + end)/4;
		partition2 = (start + end)/4*2;
		partition3 = (start + end)/4*3;
		if (this.ar[partition1] == x){
			return partition1;
		}else if (this.ar[partition2] == x){
			return partition2;
		}else if (this.ar[partition3] == x){
			return partition3;
		}else if(this.ar[partition3] < x){ // x is in the last part
			return quaternarySearch_recu(x, partition3 + 1, end);
		}else if(this.ar[partition1] > x){ // x is in the first part
			return quaternarySearch_recu(x, start, partition1 - 1);
		}else if((this.ar[partition1] < x) && (this.ar[partition2] > x)){ // x is in the second part
			return quaternarySearch_recu(x, partition1 + 1, partition2 - 1);
		}else{ // x is in the third part
			return quaternarySearch_recu(x, partition2 + 1, partition3 - 1); 
		}
	} // end quaternarySearch_recu
	
	/**
	 * Used by rangeQuery, finds the index of the
	 * nearest value in the array less than x.
	 * @param x target value
	 * @return index of the floor value in the array
	 */
	private int findFloor(float x){
		int start = 0;
		int end = this.ar.length - 1;
		int floor = (start + end)/2;
		while(start <= end){
			if (this.ar[floor] < x){ // floor maybe not high enough
				start = floor + 1;
			}else if(this.ar[floor] > x){ // floor is too high
				end = floor - 1;
			}else{
				return floor; // the value is the floor
			}
			floor = (start + end)/2;
		}
		return floor;
	}
	
	/**
	 * Used by rangeQuery, finds the index of the 
	 * nearest value in the array greater than x.
	 * @param x target value
	 * @return index of the ceiling value in the array
	 */
	private int findCeiling(float x){
		return (findFloor(x) + 1);
	}
	
	/**
	 * Finds the number of elements in the array contained
	 * within the range specified by (x,y). Swaps the parameters 
	 * if x &gt; y. Returns -1 if x == y. 
	 * @param x the floor of the range
	 * @param y the ceiling of the range
	 * @return the number of elements in the array in range
	 */
	public int rangeQuery(float x, float y){
		float temp;
		if (x > y){
			temp = y;
			y = x;
			x = temp;
		}
		int start_of_range = findCeiling(x);
		int end_of_range = findFloor(y);
		if (start_of_range <= end_of_range){
			return (end_of_range - start_of_range)+1;
		}else{
			return -1;
		}
	} //end rangeQuery
	
	public int getSize() {
		return size;
	}
	
	/**
	 * Accepts a new size for the RandomArray and 
	 * reinitializes it using the current fields.
	 * @param size the new size for the array.
	 */
	public void setSize(int size) {
		this.size = size;
		this.initArray();
	}

	public float getMax() {
		return max;
	}
	
	/**
	 * Accepts a new max for the RandomArray and 
	 * reinitializes it using the current fields.
	 * @param max the new maximum size for values.
	 */
	public void setMax(float max){
		this.max = max;
		this.initArray();
	}

	public float[] getAr() {
		return ar;
	}
	
	/**
	 * Dumps the contents of the array to
	 * standard out.
	 */
	public void dump(){
		for(int i = 0; i<this.size; i++){
			if (i==this.size-1){
				System.out.printf("%f\n", this.ar[i]);
			}else{
				System.out.printf("%f,", this.ar[i]);
			}
		}
	}
}
