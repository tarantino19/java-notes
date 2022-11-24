import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Array - DOES have a fix size
        String [] friends = new String [4];

        String [] friendsArray = {"John", "Chris", "Eric", "Luke"};

        //ArrayList  - DO NOT have a fix size

        ArrayList<String> friendsArrayList = new ArrayList<>();
        friendsArrayList.add("Joji");
        friendsArrayList.add("Kamote");
        ArrayList<String> friendsArrayList2 =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
        //I can remove newArrayList but that would make it immutable

        System.out.println(friendsArray[1]); //Chris
        System.out.println(friendsArrayList.get(0)); //Joji

        System.out.println(friendsArrayList);
        System.out.println(friendsArrayList2);

        //length of an array

        System.out.println(friendsArray.length); //4
        System.out.println(friendsArrayList.size());  //a method call/dot size for an arraylist

        //add an element in the end of an arraylist
        // CANT DO IT IN AN ARRAY
        // ARRAYLIST

        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(2)); //Mitch

        //change an element of a specific index
        friendsArray[0] = "Carol";
        System.out.println(friendsArray[0]); //Carol
        friendsArrayList.set (0, "Carl");
        System.out.println(friendsArrayList.get(0));
        System.out.println(friendsArrayList);

        //remove - cant do it with arrays
        //remove for arraylist - int index or the object itself
        friendsArrayList.remove("Kamote");
        System.out.println(friendsArrayList.get(1)); //Mitch instead of Kamote cause it got deleted already






    }



}