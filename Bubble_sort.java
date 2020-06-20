
public class Bubble_sort {
    //Function to sort array, using bubble sort
    public void bubbleSort(int array[]){
        
        int items = array.length;
        
        for (int i = 0; i < items-1; i++) {
            for (int j = 0; j < items-i-1; j++) {
              
                if(array[j] > array[j+1]){
                    //Swapping the elements
                     int key = array[j];
                     array[j] = array[j+1];
                     array[j+1] = key;
                }
                else{}               
            }           
            }            
        }
    //Function for printing the array
    public void printArray(int array[]){
        int items = array.length;
        
        System.out.println("The sorted array using bubble sort is :");
        for (int i = 0; i < items; i++) {
            System.out.println(" " + array[i]+" ");
        }
    }    
    //Defining the main method
    public static void main(String[] args) {
        
        //Creating an object
        Bubble_sort bs = new Bubble_sort();
        
        //Initializing the array 
        int array[] = {122,65,54,16,27};
        bs.bubbleSort(array);
        bs.printArray(array);        
    }    
}
