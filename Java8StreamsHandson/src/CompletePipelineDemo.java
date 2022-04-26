import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CompletePipelineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Toby", "Anna", "Leroyyyy", "Alex");
		list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);

		/*
		 * Stream.generate(() -> "Elsa") .filter(n -> n.length() == 4) .sorted()
		 * .limit(2) .forEach(System.out::println); Goes infinite loop
		 */

		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);

		/*
		 * Stream.generate(() -> "Olaf Lazisson") .filter(n -> n.length() == 4)
		 * .limit(2) .sorted() .forEach(System.out::println);
		 */
		/*
		 * --> goes infinite loop
		 */

		System.out.println("-----------------------------------------");
		Stream<Integer> infinite1 = Stream.iterate(1, x -> x + 1);
		infinite1.limit(5).filter(x -> x % 2 == 1).forEach(System.out::println); // 135
		
		
		System.out.println("-----------------------------------------");
		  Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1); infinite2.limit(5)
		  .peek(System.out::print) .filter(x -> x % 2 == 1)
		  .forEach(System.out::println);
		 
		  System.out.println("-----------------------------------------");
		Stream<Integer> infinite3 = Stream.iterate(1, x -> x + 1);
		infinite3.filter(x -> x % 2 == 1).limit(5).forEach(System.out::println); // 13579

		System.out.println("-----------------------------------------");
		Stream<Integer> infinite4 = Stream.iterate(1, x -> x + 1);
		infinite4.filter(x -> x % 2 == 1).peek(System.out::print).limit(5).forEach(System.out::println);

	}

}
