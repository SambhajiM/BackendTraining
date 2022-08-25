package arr_assignment1_min_max;

/*
* finding min and max value in an array 
*/
public class ArrayMinMax {

	//method for finding min and max value in an array
	public int [] getMinMax(int [] arr, int size){
		int min = arr[0];
		int max =  arr[0];
		int [] array = new int[2];
		for(int i=0; i<size; i++){
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]){
				min = arr[i];
			}
		}
		array[0] = min;
		array[1] = max;
 
		return array;
	}
}
