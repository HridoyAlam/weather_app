import java.util.Scanner;
public class CombinedPattern {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many Row's you want(Enter odd number)?");
		int n=input.nextInt();
		//Print right to left
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j){
					System.out.print("|#|");
				}
				else{
					System.out.print("| |");
				}
				
				
			}
			System.out.println();
		}
		
		System.out.println();
		//print left to right
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j==(n-i-1)){
					System.out.print("|#|");
				}
				else{
					System.out.print("| |");
				}
				
				
			}
			System.out.println();
		}
		
		
		System.out.println();
		//print Cross pattern
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j || j==(n-i-1)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
