/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for (int indexToCompare = 1; indexToCompare < elements.size(); indexToCompare++){
                String valueToInsert = elements.get(indexToCompare);
                for (int indexBeingCompared = indexToCompare - 1; indexBeingCompared >= 0; indexBeingCompared--){
                    // System.out.println("at index " + indexBeingCompared + " this " + elements);
                    if (indexBeingCompared == 0 && valueToInsert.compareTo(elements.get(indexBeingCompared)) <= 0 ) {
                        shift(indexBeingCompared);
                        dropValue(0, valueToInsert);
                    }
                    else if (valueToInsert.compareTo(elements.get(indexBeingCompared)) < 0){
                        shift(indexBeingCompared);
                    }
                    else{
                        dropValue(indexBeingCompared + 1, valueToInsert);
                        break;
                    }
                }
            }
    }
    private void shift(int shiftFrom){
        elements.set(shiftFrom + 1, elements.get(shiftFrom));
    }
    private void dropValue(int indexToDrop, String value){
    elements.set(indexToDrop, value);
}
}
