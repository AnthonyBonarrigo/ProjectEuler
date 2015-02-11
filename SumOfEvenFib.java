/*
 * Sums the Fibonacci numbers below 4,000,000
 */
public class SumOfEvenFib 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 0;; i++)
		{
			int num = fib(i);
			if(num > 4000000) break;
			if(num % 2 == 0) sum += num;
		}
		System.out.print(sum);
	}
	
	public static int fib(int term)
	{
		int a = 0;
		int b = 1;
		for(int i = 0; i < term; i++){
			int c = a + b;
			a = b;
			b = c;
		}
		return a;
	}

}
