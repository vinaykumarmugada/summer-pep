package summerpep;



import java.util.*;
import java.util.stream.Collectors;
public class FilterStringLength {
	    public static void main(String[] args) {
	        List<String> words = Arrays.asList("cat", "dog", "apple", "bat", "car", "pen");
	        List<Integer> numbers = Arrays.asList(10, 55, 43, 99, 60, 22, 75, 33);

	        long count = words.stream()
	                          .filter(word -> word.length() > 3)
	                          .count();

	        System.out.println("Number of strings with length 3: " + count);
	        List<Integer> greaterThan50 = numbers.stream()
                    .filter(num -> num > 50)
                    .collect(Collectors.toList());
	        System.out.println("Numbers greater than 50: " + greaterThan50);
	    }
	}
