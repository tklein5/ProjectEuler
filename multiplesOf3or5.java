
public class multiplesOf3or5 {

		public static void main(String[] args){
			
			int n = 1000;	
			int i = 1;
			int sum = 0;
			while (i < n){
				if ( i % 3 == 0 || i % 5 == 0){
					sum = sum + i;
					
				}
				i++;
			
			}
			System.out.println(sum);
		}
	
}
