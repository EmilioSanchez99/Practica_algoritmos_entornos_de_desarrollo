package util;

public abstract class Algoritmos {
	
	public static int fibonacci (int a) {
		if (a==0) {
			return 0;
		}
		
		else if (a==1) {
			return 1;
		}
		else {
			return fibonacci(a-1)+fibonacci(a-2);
		}
	
	}

	
	
	
	   
	   
		
	
}
