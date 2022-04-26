import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stream<T> filter(Predicate<? super T> predicate)
		Stream<String> s1 = Stream.of("Keep", "it", "simple");
		s1.filter(s -> s.length() >-1).forEach(System.out:: println);
		//s1.filter(x -> x.startsWith("K")).forEach(System.out::print);
		
		//Stream<T> distinct()
		Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
		s2.distinct().forEach(System.out::println); // duckgoose
		
		//Stream<T> limit(int maxSize)
		//Stream<T> skip(int n)
		Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
		s3.skip(5).limit(2).forEach(System.out::print); // 67
		
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper)
		Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
		s4.map(String::length).forEach(System.out::print); // 676
		
		//<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);
		
		//Stream<T> sorted()
		//Stream<T> sorted(Comparator<? super T> comparator
		Stream<String> s = Stream.of("brown-", "bear-");
		s.sorted().forEach(System.out::print);
		
		
		Stream<String> s5 = Stream.of("brown bear-", "grizzly-");
		s5.sorted(Comparator.reverseOrder())
		.forEach(System.out::print); // grizzly-brown bear-
		//s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
		
		//Stream<T> peek(Consumer<? super T> action)
		Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly", "gemini");
		long count = stream.filter(sx -> sx.startsWith("g"))
		.peek(System.out::println).count(); // grizzly
		System.out.println(count); // 1
		
		List<Integer> numbers = new ArrayList<>();
		List<Character> letters = new ArrayList<>();
		StringBuilder builder = new StringBuilder();
		Stream<List<?>> good = Stream.of(numbers, letters);
		good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::print); // 11
		System.out.println(builder);
		
		
		/*
		 * List<Integer> numbers1 = new ArrayList<>(); List<Character> letters1 = new
		 * ArrayList<>(); Stream<List<?>> bad = Stream.of(numbers1, letters1);
		 * bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::print); // 00 
		 * -----givign exception
		 */		
		
		
		
		
		
		
		
		

	}

}
