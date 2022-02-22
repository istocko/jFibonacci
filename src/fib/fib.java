package fib;

public class fib {

	private static int[] cache = new int[1000];
	
	public static void main(String[] args) {
		int nth = 45;
		cache[0] = 0;
		cache[1] = 1;
		long begin = System.currentTimeMillis();
		System.out.println("non-recursive " + getnthfibonacci(nth));
		long end = System.currentTimeMillis();
		long diff = end - begin;
		System.out.println("time "+diff);
		begin = System.currentTimeMillis();
		System.out.println("recursive " + getnthfibonaccirecursive(nth));
		end = System.currentTimeMillis();
		diff = end - begin;
		System.out.println("time "+diff);
		begin = System.currentTimeMillis();
		System.out.println("recursive cache " + getnthfibonaccirecursivecache(nth));
		end = System.currentTimeMillis();
		diff = end - begin;
		System.out.println("time "+diff);
		begin = System.currentTimeMillis();
		
		//StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i <= 15 ; i++)
		{
			System.out.print(cache[i]+",");
		}
		System.out.println("");
		System.out.println("Finish");

	}
	
	public static int getnthfibonacci(int nth) {
		int result = 0;
		
		if (nth <= 0 ) {
			result = 0;
		}
		if (nth == 1)
		{
			result = 1;
		}
		
		int start = 0;
		int start2 = 1;
		
		
		
		for (int i=2; i <= nth;i++)
		{
		
			result = start + start2;
			//System.out.println(res);
			start = start2;
			start2 = result;
		}
		
		
		return result; 
	}
	
	public static  int getnthfibonaccirecursive(int nth) {
		if (nth <= 0 ) {
			return 0;
		}
		if (nth == 1)
		{
			return 1;
		}
		return getnthfibonaccirecursive(nth - 1) + getnthfibonaccirecursive(nth -2);
	}
	
	public static  int getnthfibonaccirecursivecache(int nth) {
		if (nth < 0 ) {
			return 0;
		}
		
		System.out.println("fibrec nth:"+nth+" value from cache:"+cache[nth]);
		if (cache[nth] != 0) {
			return cache[nth];
		}
	
		
		
		int result = getnthfibonaccirecursivecache(nth - 1) + getnthfibonaccirecursivecache(nth -2);
		cache[nth] = result;
		return result;
	}

}
