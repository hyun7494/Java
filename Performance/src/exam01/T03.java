package exam01;

public class T03 {
	public static void main(String[] args) {

		
		for (int i = 1; i <= 5; i++) {
		    
		    // 공백 j for문
		    for(int j = 5-1; j >= i; j--) {
		        System.out.print("☆");
		    }
		    
		    // 별 j for문
		    for(int j=1; j <=i; j++) {
		        System.out.print("★");
		    }
		    
		    System.out.println("");
		}

			System.out.println("\n");	
			
			int n = 4;
			
			for(int i = 0 ; i<n ; i++) {
				
				for(int j=n-1 ; j > i ; j--) {
					System.out.print("☆");
				}
				
				
				for(int j=0 ; j < 2 * i +1 ; j++) {
					System.out.print("★");
				}
				
				for(int j=n-1 ; j > i ; j--) {
					System.out.print("☆");
				}
				
				System.out.println("\n");
			}
	}
}
		

	
	
	
	
	
	
	
	
	
	

