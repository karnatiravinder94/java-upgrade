package imperative_vs_declarative.imperativeVsDelcarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
 public static void main(String[] args) {
	 List<Integer> duplicateNumbers=Arrays.asList(1,2,2,3,3,4,5,6,6,7,8,9);
	 /*
	  * Imperative way remove duplicates
	  */
	 List<Integer> imperativeUniqueNumbers=new ArrayList<>();
	 for(Integer num:duplicateNumbers) {
		 if(!imperativeUniqueNumbers.contains(num)) {
			 imperativeUniqueNumbers.add(num);
		 }
	 }
	 System.out.println("Imperatve unquie numbers ---> "+imperativeUniqueNumbers);
	 
	 List<Integer> declarativeUniqueNums = duplicateNumbers.stream()
	 .distinct()
	 .collect(Collectors.toList());
	 System.out.println("Declarative unique numbers --> "+declarativeUniqueNums);
	 
 }
}
