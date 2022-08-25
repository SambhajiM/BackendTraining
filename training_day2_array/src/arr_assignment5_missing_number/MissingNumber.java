package arr_assignment5_missing_number;

public class MissingNumber {

	public int findMissingNumber(int []arr, int range){
		int sumOfRange = range * (range + 1) / 2;
		int sumOfArray = 0;
	

		for(int i=0; i<range - 1; i++){
			sumOfArray += arr[i];

		}
	
	return(sumOfRange - sumOfArray);
	}
}
