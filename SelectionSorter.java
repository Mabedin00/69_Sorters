import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }

    /**
      pre-condition: given a list of 1 or more elements

      Select the smallest element
      Swap it with the value at the boundary.

      Post-condition a sorted list of elements
     */
    public void mySort() {
        for( int idx = 0; idx < elements.size() -1; idx++) {
            elements.set( idx , elements.set(dweebIndex(idx), elements.get(idx)));
        }
    }

    private int dweebIndex( int startAt) {
        // use the starting element as a first guess
        int dweebAt = startAt;
        String dweeb = elements.get(dweebAt);

        for( int testAt = startAt +1
           ; testAt < elements.size()
           ; testAt++)
            if( elements.get( testAt).compareTo( dweeb) < 0) {
                // Found a smaller value. Remember it.
                dweebAt = testAt;
                dweeb = elements.get( dweebAt);
            }
        return dweebAt;
     }



}
