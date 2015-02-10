
public class SmallestMultiple {
	
	public static void main(String[] args){
		
		int smallest = 0;
		int i = 20;
		int j = 2;
		
		boolean done = false;
		
		while (!done) {
			if (i%j == 0){
				j++;
			}
			else if (j>20){
				smallest = i;
				done = true;
			}
			else if (i%j != 0){
				i++;
			}
		}
		System.out.println(smallest);
		
	}

}
