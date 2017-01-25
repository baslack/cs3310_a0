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
			this.ar[i] = rand.nextFloat()*this.max;
		}
		
		Arrays.sort(this.ar);	
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
		
		return -1;
		
	}
	
	/**
	 * Implements binary search using a recursive
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int binarySearch_recu(float x){
		
		return -1;
		
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
		
		return -1;
		
	}
	
	/**
	 * Implements ternary search using a recursive
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int ternarySearch_recu(float x){
		
		return -1;
		
	}
	
	/**
	 * Implements quaternary search using an iterative
	 * looping algorithm.
	 * @author Benjamin Slack
	 * @param x the number to be searched for
	 * @return the index of the found float or -1
	 * if not found.
	 */
	public int quaternarySearch_iter(float x){
		
		return -1;
		
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
		
		return -1;
		
	}
	
	/**
	 * Used by rangeQuery, finds the index of the
	 * nearest value in the array less than x.
	 * @param x target value
	 * @return index of the floor value in the array
	 */
	
	@SuppressWarnings("unused")
	private int findFloor(float x){
		return -1;
	}
	
	/**
	 * Used by rangeQuery, finds the index of the 
	 * nearest value in the array greater than x.
	 * @param x target value
	 * @return index of the ceiling value in the array
	 */
	@SuppressWarnings("unused")
	private int findCeiling(float x){
		return -1;
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
		return -1;
	}
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
