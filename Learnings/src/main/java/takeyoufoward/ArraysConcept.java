package takeyoufoward;

import java.util.Scanner;

public class ArraysConcept {
	
	//Find missing number in an array
	static int missingNumber(int[] nums,int n) {
		int sum=0;
		int sumOfN=n*(n+1)/2;
		System.out.println("sumofN: "+sumOfN);
		for(int i=0;i<nums.length-1;i++) {
			sum+= nums[i];
		}
		System.out.println("sum: "+sum);
		int finalNo = sumOfN-sum;
		
		return finalNo;
	}

	static int findIndex(int[] nums,int n) {
		System.out.println("n val: "+n);
		int index = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==n) {
				index=i;
			}else {
				index = -1;
				
			}
			
			//System.out.println(index);
		}
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int[] arr = new
		 * int[n];
		 * 
		 * 
		 * for(int i=0;i<n;i++) { arr[i] = sc.nextInt(); } int ele=sc.nextInt();
		 * //System.out.println("missing number is: "+missingNumber(arr, n));
		 * System.out.println("no is at position: "+findIndex(arr, ele));
		 */
		int arr[] = {2,3,2,3,5};
				int N=5; int P =5;
		
				 int[] count=new int[P+1];
			        // code here
			        for(int i=0;i<N;i++){
			           
			             if (arr[i] >= 1 && arr[i] <= P) {
			            count[arr[i]]++;
			           // System.out.println(count[arr[i]]++);
			        }
			    }

			    // Update arr to contain frequency counts for elements from 1 to P
			    for (int i = 0; i < N; i++) {
			        if (i + 1 <= P) {
			            arr[i] = count[i + 1];
			        } else {
			            arr[i] = 0;
			        }
			    
			        System.out.println(arr[i]);
			        }
			    

	}

}
