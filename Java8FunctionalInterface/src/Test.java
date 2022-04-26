@FunctionalInterface
interface Square {
	int calculate(int x);
}

class Test {
	public static void main(String args[])
	{
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int x) -> x * x;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}

/* ---------------------Converted  :
 * Runnable –> This interface only contains the run() method. 
 * Comparable –> This interface only contains the compareTo() method. 
 * ActionListener –> This interface only contains the actionPerformed() method. 
 * Callable –> This interface only contains the call() method.
 * 
 * -----------------------Added :

	Consumer - only one arg, no return
	Consumer -> Bi-Consumer (two arguments)
			 -> DoubleConsumer, IntConsumer, and LongConsumer. These variants accept primitive values as arguments. 
			 -> Consumer<Integer> consumer = (value) -> System.out.println(value);
    --------------------------------------------------------------------------------------------------------------------------------------------------------------------
    Predicate - arg, return booleans value
	Predicate -> Bi-Predicate (two arg, reutrn boolean)
			  -> IntPredicate, DoublePredicate, and LongPredicate. These types of predicate functional interfaces accept only primitive data types or values as arguments.  
			  ->1. 	  
			  public interface Predicate<T> {
    				boolean test(T t);  }
    		  ->2.
    			public class CheckForNull implements Predicate {
    				@Override
    				public boolean test(Object o) {
        			return o != null; } 
        			}
        	 -> 3. Predicate predicate = (value) -> value != null;
    -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	Function  - one arg, return value
	Function -> Bi-Function, Unary Operator, Binary Operator 
			-> @FunctionalInterface
				public interface BiFunction<T, U, R> 
				{
   					R apply(T t, U u);
    				.......

				}

				1. Unary Operator
				@FunctionalInterface
				public interface UnaryOperator<T> extends Function<T, U> 
				{
				    ……...
				}
				 2. Binary Operator
				
				@FunctionalInterface
				public interface BinaryOperator<T> extends BiFunction<T, U, R> 
				{
				    ……...
				}
	------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	Supplier -> BooleanSupplier, DoubleSupplier, LongSupplier, and IntSupplier
					@FunctionalInterface
				public interface Supplier<T>{
				 
				// gets a result
				………….
				 
				// returns the specific result
				…………
				 
				T.get();
				 
				}
				
	-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */



