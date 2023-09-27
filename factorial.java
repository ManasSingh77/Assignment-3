package functions;

public class factorial {

	public static void main(String[] args) {
		int result = factorial(5);
        System.out.print(result);
	}
		public static int factorial(int n) {
			int fact=1;
			for(int i=n;i>0;i--) {
				 fact=fact*i;
			}
			return fact;
		}

	}

