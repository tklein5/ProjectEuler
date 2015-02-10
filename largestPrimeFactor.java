
public class largestPrimeFactor {

	
	public static void main(String[] args){
		
		long n=600851475143L;
		int i = 1;
		
		boolean factored = false;
		while (!factored){
			
			if ( n % i == 0){
				
				System.out.println(i);
				
			}
			
			else if ( i > n ){
				factored = true;
			}
			i++;
			
			
			
		}
				
	}
	
	public boolean isPrime(int n) {
	    int i;
	    for (i = 2; i <= n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
	

