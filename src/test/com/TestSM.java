package test.com;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestSM {

	public static void main(String args[]) {
		/*
		 * String separator = ","; Arrays.asList("a", "b", "d").forEach((String e) ->
		 * System.out.print(e + separator));
		 */

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();

		System.out.print(filtered.toString()+" Count: "+count);

		// Get the local date and local time
		final Clock clock = Clock.systemUTC();
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now( clock );
		        
		System.out.println(" Date: "+ date );
		System.out.println(" Date: "+ dateFromClock );
		
		// Get the local date/time
		final LocalDateTime datetime = LocalDateTime.now();
		final LocalDateTime datetimeFromClock = LocalDateTime.now( clock );
		
		System.out.println("/t datetime: "+ datetime );
		System.out.println(" Date: "+ datetimeFromClock );
		
		 StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
         
	        // Adding values to StringJoiner  
	        joinNames.add("Rahul");  
	        joinNames.add("Raju");  
	        joinNames.add("Peter");  
	        joinNames.add("Raheem");  
	                  
	        System.out.println(joinNames);  
	       Predicate<Integer> it = i ->i%2==0;
	       
	        System.out.println("Date:"+it.test(1));

	        String[] words = new String[10];  
	        Optional<String> checkNull = 
	                      Optional.ofNullable(words[5]);  
	        if (checkNull.isPresent()) {  
	            String word = words[5].toLowerCase();  
	            System.out.print(word);  
	        } else  
	            System.out.println("word is null"); 
	        
	        HashMap<Integer, String> testHas= new HashMap<Integer, String>();
	        testHas.put(100,"Amit");    
	        testHas.put(101,"Vijay");    
	        testHas.put(102,"Rahul");  
			for (Entry<Integer, String> m : testHas.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}  
	}

	interface Test {
		default void test() {
			System.out.println("Hello, this is default method");
		}

		static int v = 0;
		static void testing() {
			System.out.println("Hello, this is default method");
		}
		public int testss();
	}

//	public int x = 0;
//
//	class FirstLevel {
//
//		public int x = 1;
//
//		void methodInFirstLevel(int x) {
//
//			int z = 2;
//			++this.x;
//			Consumer<Integer> myConsumer = (y) -> {
//				// The following statement causes the compiler to generate
//				// the error "Local variable z defined in an enclosing scope
//				// must be final or effectively final"
//				//
//				// z = 99;
//
//				System.out.println("x = " + this.x);
//				System.out.println("y = " + y);
//				System.out.println("z = " + z);
//				System.out.println("this.x = " + this.x);
//				System.out.println("LambdaScopeTest.this.x = " + TestSM.this.x);
//			};
//
//			myConsumer.accept(x);
//
//		}
//	}
//
//	public static void main(String... args) {
//		TestSM st = new TestSM();
//		TestSM.FirstLevel fl = st.new FirstLevel();
//		fl.methodInFirstLevel(23);
//	}

}
