import java.util.*;

public class IsInList {
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14));
        ArrayList<Integer> smallerList = new ArrayList<Integer>(Arrays.asList(4,8,12,16));
        if (list.containsAll(smallerList)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // Check if list contains all of the following elements: 4,8,12,16
        // Print "true" if it contains all, otherwise print "false"
        // Can you do both the different approaches you tried in the previous one?

    }
}
