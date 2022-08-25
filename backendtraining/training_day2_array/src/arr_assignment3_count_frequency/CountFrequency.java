package arr_assignment3_count_frequency;

public class CountFrequency {

	public void countFrequency(int []arr, int size){
		int[] visitedArray = new int[size];
		int visited = -1;
		for(int i=0; i<arr.length; i++){
			int count=1;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					count++;
					visitedArray[j] = visited;
				}
			}
			if(visitedArray[i] != visited){
				visitedArray[i] = count;
			}
		}
		for(int i=0; i<visitedArray.length;i++){
			if(visitedArray[i] != visited){
				System.out.println("Frequency of " + arr[i] + ":" + visitedArray[i]);
			}
		}
	}
}
