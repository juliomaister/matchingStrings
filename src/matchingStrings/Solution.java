package matchingStrings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
//	 public static void main(String[] args) throws IOException {
//
//	        String s = "12:45:54PM";
//		    List<String> sList = Arrays.asList("12:45:54PM", "3:01:00AM", "6:01:00AM", "3:01:00PM", "8:01:00PM", "12:01:00PM");
//	        
//		    for (Iterator iterator = sList.iterator(); iterator.hasNext();) {
//				String string = (String) iterator.next();
//				String result = Result.timeConversion(string);
//				System.out.println(result);
//			}
//
//	    }
	    public static void main(String[] args) throws IOException {
	    	List<String> strings = Arrays.asList //("aba", "baba", "aba", "xzxb"); 
	    	("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf");
	    	List<String> queries = Arrays.asList//("aba", "xzxb", "ab"); 
	    	("abcde", "sdaklfj", "asdjf", "na", "basdn");
	        List<Integer> res = Result.matchingStrings(strings, queries);
	        
	        for (Iterator iterator = res.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();
				System.out.println(integer);
			}
	    }
}
