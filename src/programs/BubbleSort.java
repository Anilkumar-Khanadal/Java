package programs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {4,5,2,1,3,0,9};

// Approach 1
		System.out.println("Array Before Sortig : "+Arrays.toString(a));
		
		int n=a.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j]>a[j+1]) // i=0  4521309 / 4251309 / 4215309 /4213509 / 4213059
					            // i=1  2413059 / 2143059 / 2134059 / 2130459 
					            // i=2  1230459 / 1203459
					            // i=3  1023459
					            // i=4  0123459
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		} 
		
		System.out.println("After sorting array : "+Arrays.toString(a));
		
// Approach 2
		
		// Ascending order
/*		System.out.println("Array Before Sortig : "+Arrays.toString(a));
		Arrays.parallelSort(a); // Arrays.sort(a);
		
		System.out.println("After sorting array : "+Arrays.toString(a));
		
		// Decending order
		Integer b[]= {4,5,2,1,3};
		
		System.out.println("Array Before Sortig : "+Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println("After sorting array : "+Arrays.toString(b));
		*/
	}
}