package a0;

/**
 * Search timer performs iterations on supplied
 * iSearch interface methods and stores the mean
 * and standard deviation of the time required
 * in nanoseconds.
 * @author Benjamin Slack
 *
 */
public class SearchTimer{
	private long mean;
	private long stddev;
	
	/**
	 * Constructs a timer and executes the iterations
	 * based on the iSearch function provided. Calculates
	 * both mean and standard deviation and places them
	 * in local fields.
	 * @param iterations number of iterations to time the function
	 * @param x target value for the function
	 * @param gen the function to time
	 */
	public SearchTimer(int iterations, float x, iSearch_Generic_FloatToInt gen) {
		long[] results = new long[iterations];
		long start_time, end_time;
		for (int i = 0; i < iterations; i++){
			start_time = System.nanoTime();
			gen.f(x);
			end_time = System.nanoTime();
			results[i] = end_time - start_time;
		}
		long sum = 0;
		for (Long this_result : results){
			sum += this_result;
		}
		this.mean = sum/(long)iterations;
		long[] deviations = new long[iterations];
		for(int i = 0; i < iterations; i++){
			deviations[i] = Math.abs(this.mean - results[i]);
		}
		sum = 0;
		for(Long this_deviation : deviations){
			sum += this_deviation;
		}
		this.stddev = (long)Math.sqrt(sum/(long)iterations);
	}
	
	/**
	 * Constructs a timer and executes the iterations
	 * based on the iSearch function provided. Calculates
	 * both mean and standard deviation and places them
	 * in local fields.
	 * @param iterations number of iterations to time the function
	 * @param x target value for the function
	 * @param y target value for the function
	 * @param gen
	 */
	public SearchTimer(int iterations, float x, float y, iSearch_Generic_2FloatsToInt gen) {
		long[] results = new long[iterations];
		long start_time, end_time;
		for (int i = 0; i < iterations; i++){
			start_time = System.nanoTime();
			gen.f(x,y);
			end_time = System.nanoTime();
			results[i] = end_time - start_time;
		}
		long sum = 0;
		for (Long this_result : results){
			sum += this_result;
		}
		this.mean = sum/(long)iterations;
		long[] deviations = new long[iterations];
		for(int i = 0; i < iterations; i++){
			deviations[i] = Math.abs(this.mean - results[i]);
		}
		sum = 0;
		for(Long this_deviation : deviations){
			sum += this_deviation;
		}
		this.stddev = (long)Math.sqrt(sum/(long)iterations);
	}

	/**
	 * 
	 * @return
	 */
	public long getMean() {
		return mean;
	}

	public long getStddev() {
		return stddev;
	}
}
