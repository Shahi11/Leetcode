class Solution {
public List<Integer> pancakeSort(int[] arr) {
	List<Integer> list = new ArrayList<Integer>();
	for(int i=arr.length-1;i>0;i--){
		int largestNumberIndex = findIndex(arr,i);
		if(largestNumberIndex != i){
			flip(arr, largestNumberIndex);
			flip(arr, i);
			list.add(largestNumberIndex+1);
			list.add(i+1);
		}
	}
	return list;
}
// method for flipping the array
public void flip(int[] arr, int k){
	int i=0;
	int j=k;
	while(i<j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
	}
}
// method to find the largestNumberIndex
public int findIndex(int[] arr, int k){
	int index = k;
	for(int i=k-1;i>=0;i--){
		if(arr[i]>arr[index]) index=i;
	}
	return index;
}
}