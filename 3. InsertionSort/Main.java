/////////////////INSERTION SORT
public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        //////////////////////////////
        //We don't swap elements, we shift elements
        //We're growing the sorted partition from left to right
        //So the first unsorted index is going 
        //to be increasing by one after every iteration.
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++) {
                //The first thing we're going to do is save the value of the element 
                //we were going to insert into new element 
                //because when we do the shifting 
                //that position/the element is going to be overwritten
            int newElement = intArray[firstUnsortedIndex];
            
            //Declare i outside of the loop
            //because I will need it after the loop
            int i;
            
            //Now this loop is going to do the traversal of the sorted partition
            // and looks for the correct position to insert new element.
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        /////////////////////////////
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
