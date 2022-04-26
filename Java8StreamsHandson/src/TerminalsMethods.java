import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//count
		Stream<String> s1 = Stream.of("Nazneen", "Mulani", "Kadepur");
		System.out.println(s1.count());
		
		
		//Optional<T> min(<? super T> comparator)
		//Optional<T> max(<? super T> comparator)
		Stream<Integer> s2 = Stream.of(12,3,4,12,55,67);
		Stream<String> s3 = Stream.of("Keep", "it", "Simple");
		Optional<String> o2 =  s3.min((x1, x2 ) -> x1.length() - x2.length());
		o2.ifPresent(System.out::println);
		
		Optional<?> minEmpty = Stream.empty().min((m1, m2) -> 0);
		System.out.println(minEmpty.isPresent()); // false
		
		
	
		//Optional<T> findAny()
		//Optional<T> findFirst()
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		Stream<String> st = Stream.of("monkey", "gorilla", "bonobo");
		
		s.findAny().ifPresent(System.out::println); // monkey
		infinite.findAny().ifPresent(System.out::println); // chimp
		st.findFirst().ifPresent(System.out::println); //monkey
		
		//boolean anyMatch(Predicate <? super T> predicate)
		//boolean allMatch(Predicate <? super T> predicate)
		//boolean noneMatch(Predicate <? super T> predicate)
		List<String> list4 = Arrays.asList("monkey", "2", "chimp");
		Stream<String> infinite4 = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list4.stream().anyMatch(pred)); // true
		System.out.println(list4.stream().allMatch(pred)); // false
		System.out.println(list4.stream().noneMatch(pred)); // false
		System.out.println(infinite4.anyMatch(pred)); // true
		
		//void forEach(Consumer<? super T> action)
		Stream<String> s5 = Stream.of("Monkey", "Gorilla", "Bonobo");
		s5.forEach(System.out::print); // MonkeyGorillaBonobo
		
		
		//T reduce(T identity, BinaryOperator<T> accumulator)
		//Optional<T> reduce(BinaryOperator<T> accumulator)
		//<U> U reduce(U identity, BiFunction<U,? super T,U> accumulator,
		//BinaryOperator<U> combiner)
		
		String[] array = new String[] { "w", "o", "l", "f" };
		String result = "";
		for (String s6: array) result = result + s6;
		System.out.println(result);
		
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", String::concat);
		System.out.println(word); // wolf
		
		
		Stream<Integer> stream7 = Stream.of(3, 5, 6);
		System.out.println(stream7.reduce(1, (a, b) -> a*b));
		
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> empty = Stream.empty();
		Stream<Integer> oneElement = Stream.of(3);
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		empty.reduce(op).ifPresent(System.out::print); // no output
		oneElement.reduce(op).ifPresent(System.out::print); // 3
		threeElements.reduce(op).ifPresent(System.out::print); // 90
		
		
		BinaryOperator<Integer> op1 = (a, b) -> a * b;
		Stream<Integer> stream8 = Stream.of(3, 5, 6);
		System.out.println(stream8.reduce(1, op1, op1)); // 90
		
		//<R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,BiConsumer<R, R> combiner)
		//<R,A> R collect(Collector<? super T, A,R> collector)
		Stream<String> stream9 = Stream.of("w", "o", "l", "f");
		StringBuilder word1 = stream9.collect(StringBuilder::new,StringBuilder::append, StringBuilder::append);
		
		Stream<String> stream10 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set = stream10.collect(TreeSet::new, TreeSet::add,TreeSet::addAll);
		System.out.println(set); // [f, l, o, w]
		
		Stream<String> stream11 = Stream.of("w", "o", "l", "f");
		TreeSet<String> set1 = stream11.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set1); // [f, l, o, w]
		
		Stream<String> stream12 = Stream.of("w", "o", "l", "f");
		Set<String> set2 = stream12.collect(Collectors.toSet());
		System.out.println(set2); // [f, w, l, o]
		
		
		
		
		
		
		
		
		

	}

}
