package a0;

public class SearchTimer{
	private long mean;
	private long stddev;
	
	public SearchTimer(int iterations, float x, iSearch_Generic gen) {
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

	public long getMean() {
		return mean;
	}

	public long getStddev() {
		return stddev;
	}
}
