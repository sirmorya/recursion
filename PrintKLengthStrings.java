package recursion;

/**
 * This class is used to find all the k length strings from set of characters
 * @author ankit
 *
 */
public class PrintKLengthStrings {
	
	
	void printKLengthRec(char[] set, int k, String prefix){
		
		if(k == 0)
			System.out.println(prefix);
		
		else{
			for(int i = 0; i < set.length; i++){
				String newPrefix = prefix + set[i];
				printKLengthRec(set, k-1, newPrefix);
			}
		}
	}
	
	
	public static void main(String[] args) {
		char set[] = {'a', 'b'};
		int k = 3;
		new PrintKLengthStrings().printKLengthRec(set, k, "");
	}
}
