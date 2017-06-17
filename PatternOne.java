import java.util.Scanner;
public class PatternOne {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("How many Row's you want(Enter odd number)?");
		int n=input.nextInt();
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
	}
}
