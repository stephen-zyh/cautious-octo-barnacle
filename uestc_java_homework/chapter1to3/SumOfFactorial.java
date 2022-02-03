package chapter1to3;

public class SumOfFactorial {

	public static void main(String[] args) {

		SumOfFactorial sof = new SumOfFactorial();
		long a = sof.sum_of_factorial();
		System.out.println(a);

	}
	private long sum = 0;
	
	public long sum_of_factorial() {
		for(int i = 1; i <= 20; i++) {
			setSum((long)this.factorial(i) + getSum());
		}
		return getSum();
	}
	
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	public long factorial(int n) {
		if(n == 0) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}

}
