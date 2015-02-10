
public class evenFibonacci {
	
	public static void main(String[] args){
		
		int i = 1;
		int j = 0;
		int sum = 0;
		
		
		
		while ( i <= 4000000){
			
			int temp1 = i;
			i = i + j;
			j = temp1;
			
			if (i%2 ==0){
				
				sum = sum + i;
				
			}
			
			
			
		}
		
		System.out.println(sum);
	}

}
