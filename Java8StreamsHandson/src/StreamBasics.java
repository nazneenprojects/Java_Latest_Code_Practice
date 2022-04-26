import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		List<Double> list1 = Arrays.asList(12.0,3.4, 8.9, 9.90);
		Stream<Double> fromList1 = list1.stream();
		Stream<Double> fromParallelList1 = list1.parallelStream();
		
		Stream<Double> list2 = Stream.generate(Math :: random).limit(5);
		list2.forEach(System.out::println);
		
		Stream<Integer> listoddNum = Stream.iterate(1, n -> n+2).limit(10);
		listoddNum.forEach(System.out :: println);
		
		
		
		

	}

}
