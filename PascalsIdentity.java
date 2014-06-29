package recursion;

/**
 * This class is used to print all combinations of r elements in a given array.
 * Time complexity is the number of output sets possible : nCr
 * @author ankit
 *
 */
public class PascalsIdentity {

	/**
	 * This method follows the Pascals Identity formula.
	 * ncr = n-1cr + n-1cr-1
	 * 
	 * @param arr
	 * @param n
	 * @param r
	 * @param index
	 * @param data
	 * @param i
	 */
	void combinationUtil(int arr[], int n, int r, int index, int data[], int i){
		
		if( index == r){
			for(int j = 0; j< r; j++)
				System.out.print(data[j]);
			System.out.println();
			return;
		}
		
		if(i >= n)
			return;
		
		//Storing the next value in data
		data[index] = arr[i];
		//Including the current element
		combinationUtil(arr, n, r, index + 1, data, i + 1);
		
		//Excluding the current element
		combinationUtil(arr, n, r, index, data, i + 1);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int data[] = new int[arr.length];
		int r = 3;
		new PascalsIdentity().combinationUtil(arr, arr.length, r, 0, data,0);
	}
}
