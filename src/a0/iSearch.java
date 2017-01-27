package a0;

/**
 * Defines a basic interface for testing data structures with
 * binary, ternary and quaternary searching
 * @author Benjamin Slack
 */
public interface iSearch {
	/**
	 * Performs a binary search on the iSearch object's data
	 * seeking the value x.
	 * @param x target value
	 * @return index of the found data item or -1 if not found
	 */
	public int binarySearch_iter(float x);
	/**
	 * Performs a binary search on the iSearch object's data
	 * seeking the value x.
	 * @param x target value
	 * @return index of the found data item or -1 if not found
	 */
	public int binarySearch_recu(float x);
	/**
	 * Performs an iterative ternary search on the iSearch object's data
	 * seeking the value x.
	 * @param x target value
	 * @return index of the found data item or -1 if not found
	 */
	public int ternarySearch_iter(float x);
	/**
	 * Performs a recursive ternary search on the iSearch object's data
	 * seeking the value x.
	 * @param x target value
	 * @return index of the found data item or -1 if not found
	 */
	public int ternarySearch_recu(float x);
	/**
	 * Performs an iterative quaternary search on the iSearch object's data
	 * seeking the value x.
	 * @param x target value
	 * @return index of the found data item or -1 if not found
	 */
	public int quaternarySearch_iter(float x);
	/**
	 * Performs a recursive quaternary search on the iSearch object's data
	 * seeking the value x.
	 * @param x target value
	 * @return index of the found data item or -1 if not found
	 */
	public int quaternarySearch_recu(float x);
	/**
	 * Performs a range query on the iSearch object's data
	 * @param x min of the range
	 * @param y max of the range
	 * @return number of data items within the range
	 */
	public int rangeQuery(float x, float y);
}
