
public class LargestPalindrome {
	
	
	public static void main(String[] args){
		int maxProduct = 1;
		int i = 100;
		while (i < 1000){
			 
			int j = 100;
			int product = 0;
			while (j<1000){
				product = i*j;
				if (product>maxProduct){
					maxProduct = product;
					System.out.println(maxProduct);
				}
				j++;
				
			}
			i++;
			
		}
		System.out.println(maxProduct);
			
	}
	

}
