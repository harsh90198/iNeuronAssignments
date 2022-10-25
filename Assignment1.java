package patternsAssignment;

public class Assignment1 {
	
	public static void iNeuron(int n) {
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || i == n - 1 || j == (n - 1) / 2) {
					System.out.print("*" );
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j = 0; j < n; j++) {
				if(j == 0 || j == n - 1 || j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j = 0; j < n; j++) {
				if(j == 0 || i == 0 || i == n - 1 || i == (n - 1) / 2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for(int j = 0; j < n; j++) {
				if((j == 0 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1) || (j == n - 1 && i != n - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j = 0; j < n; j++) {
				if((i == 0 && j > 0 && j < n - 1) || (j == 0 && i != 0) || (j == n - 1 && i > 0 && i < (n - 1) / 2)
						|| (i - j == (n / 2) - 1) || (i == (n - 1) / 2 && j != n - 1)) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for(int j = 0; j < n; j++) {
				if((i == 0 && j > 0 && j < n - 1) || (i == n - 1 &&j > 0 && j < n - 1) || (j == 0 && i > 0 && i < n - 1)
						|| (j == n - 1 && i > 0 && i < n - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(int j = 0; j < n; j++) {
				if(j == 0 || j == n - 1 || j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void numberPattern(int n) {
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	} 
	
	public static void pattern3(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i == n - 1) || (i == 0) || (j == 0) || (j == n - 1)
						|| (i + j <= (n / 2) - 1) || (j - i >= (n / 2) - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i == n - 1) || (i == n - 2) || (j == 0 && i >= (n - 1) / 2)
						|| (j == n - 1 && i >= (n - 1) / 2) || (i - j >= (n / 2) - 1 
						) 
						|| (j + i >= n + 5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i == 0) || (i == n - 1) || (i + j <= (n / 2) - 1)
						|| (i - j >= (n - 1) / 2) || (j == 0)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iNeuron(10);
		System.out.println();
		numberPattern(4);
		System.out.println();
		pattern3(10);
		System.out.println();
		pattern4(14);
		System.out.println();
		pattern5(14);
	}

}
