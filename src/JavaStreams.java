
//Streams/Uses lambda expressions

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;




public class JavaStreams {
    public static void main(String[] args) {
        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println();

        // 2. Integer Stream with skip
        IntStream
                .range(1, 10) //10 not included in when counted in range
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();

        // 3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5) //5 not included in when counted in range
                        .sum());  // 1 + 2 +3 +4 =10
        System.out.println();

        // 4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
                    //Alberto
        System.out.println();

        // 5. Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)	// same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println); //for each item we sort, we print it out

        // 6. average of squares of an int array

        int numbahs [] = {2, 4, 6, 8, 10};
        Arrays.stream(numbahs)
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);


        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
        //ankit, amanda

// WHY DOUBLE COLON???       Syntax:
//
//<Class name>::<method name>
//        Example: To print all elements of the stream:
//
//        Using Lambda expression:
//        stream.forEach( s-> System.out.println(s));

        // 8. Stream rows from text file, sort, filter, and print
//        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
//        bands
//                .sorted()
//                .filter(x -> x.length() > 13)
//                .forEach(System.out::println);
//        bands.close();









    }
}


//source: https:
//github.com/joeyajames/Java/blob/master/Java%208%20Streams/JavaStreams.java

