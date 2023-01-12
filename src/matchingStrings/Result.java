package matchingStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Result {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */


	public static List<Integer> matchingStrings(List<String> strings, List<String> queries){
		List<Integer> matchValues = new ArrayList<>();
		for (Iterator<String> iterator = queries.iterator(); iterator.hasNext();) {
			String value = (String) iterator.next();
			matchValues.add((int) strings.stream().filter(x -> x == value).count());
		}
		return matchValues;
    }
	
	// qual sera a escrita qual melhor qualidade?
	public static List<Integer> matchingStrings2(List<String> strings, List<String> queries){
		List<Integer> result = new ArrayList<>();
		queries.forEach(e -> {
		  int count = (int) strings.stream().filter(s -> s.equals(e)).count();
		  result.add(count);
		});
		return result;
    }

}
