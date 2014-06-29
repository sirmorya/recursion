package recursion;

/**
 * This method is used to check whether a number is a palendrome using recursion. 
 * @author ankit
 *
 */
public class PalendromeRecursion {

	private static int dupNum;
	
	
	static boolean isOnedigit(int num){
		return (num >=0 && num < 10);
	}
	
	static boolean isPalenRecur(int num){
		
		if(isOnedigit(num)){
			return ( num == dupNum % 10);
		}
		
		if(!isPalenRecur(num / 10))
			return false;
		
		dupNum /= 10;
		
		return(num%10 == dupNum%10);
	}
	
	
	public static void main(String[] args) {
		int num = 123321;
		if(num < 0)
			num = -(num);
		dupNum = num;
		System.out.println(isPalenRecur(num));
	}
}
