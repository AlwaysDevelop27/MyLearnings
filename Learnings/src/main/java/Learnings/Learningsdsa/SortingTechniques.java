package Learnings.Learningsdsa;

public class SortingTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selectionSort
		int[] arr = new int[] {7, 5, 9, 2, 8};
		
		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i]>arr[j]) { int temp = arr[j]; arr[j]=arr[i]; arr[i]=temp; } }
		 * System.out.println(arr[i]+",");
		 * 
		 * } System.out.println("max: "+arr[arr.length-1]);
		 */
		 int temp;
	        for(int i=0;i<=arr.length-1;i++){
	            if(arr[i]<arr[i+1]){
	                temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	            }
	            
	            
	        }
	       System.out.println(arr[arr.length-1]);
		
	}

}
