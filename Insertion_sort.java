
public class Insertion_sort {
    //Function to sort array, using insertion sort
    public void insertionSort(int array[])
    {
        int item = array.length;
        for(int i=1; i<item; ++i)
        {
            int key = array[i];
            int j = i-1;
            
        //Moving elements of array that are greater than key value
        while(j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
     }
    // The function to print array of size n
    static void printArray(int arr[])
        {
            int n = arr.length;
            System.out.println("The sorted array using insertion sort is :");
            for(int i=0; i<n; ++i)
            {                
                System.out.print(" "+arr[i]+" ");
                System.out.println();
            }
        }        
      //Main Method
      public static void main (String args[])
            {
                int arr[] ={12,54,56,20,45,62};
                
                //Creating object
                Insertion_sort is = new Insertion_sort();
                
                is.insertionSort(arr);
                printArray(arr);            
        }
}
