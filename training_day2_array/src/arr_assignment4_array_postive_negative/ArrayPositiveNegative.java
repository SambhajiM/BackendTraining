package arr_assignment4_array_postive_negative;

public class ArrayPositiveNegative {

	public int[] arrangePositiveNegative(int [] arr, int size){
		int key, j;
		for(int i=1; i<size; i++){
			key = arr[i];

			//if current element is positive
			//do nothing
			if(key > 0)
				continue;
			
			/*if current element is negative
			*shift positive elements of arr[0...i-1],
			*to one positive to their right
			*/
		
			j=i-1;
			while(j >= 0 && arr[j] > 0){
				arr[j + 1] = arr[j];
				j = j - 1;
			}

			//Put negative element at its right position
			arr[j + 1] = key;
		}
			return arr;
	}
}
