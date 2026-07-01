/* 
Linear Search is the simplest searching algorithm that checks each element sequentially until a match is found. It is good for unsorted arrays and small datasets.

Given an array a[] of n elements, write a function to search for a given element x in a[] and return the index of the element where it is present. If the element is not present in the array, then return -1.

Input/Output:

Input: a = [ 1, 2, 3, 5, 7], x = 3
Output = Element found at index: 2

Input a = [1, 2, 3, 5, 7] x = 8
Output = -1

*/

/*
Algorithm for Linear Search
Start 
Declare an array and search element as the key.
Traverse the array until the number is found.
If the key element is found, return the index position of the array element
If the key element is not found, return -1
Stop.
*/

// Java code for linearly search x in arr[]. If x
// is present then return its location, otherwise
// return -1
class Linear_Search
{

  	static int search(int a[], int n, int x)
    {
        for (int i = 0; i < n; i++) {
            if (a[i] == x)
                return i;
        }

        // return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args)
    {
        int[] a = { 3, 4, 1, 7, 5 };
        int n = a.length;
        
        int x = 7;

        int index = search(a, n, x);
        
      	if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element found at index: " + index);
    }
}