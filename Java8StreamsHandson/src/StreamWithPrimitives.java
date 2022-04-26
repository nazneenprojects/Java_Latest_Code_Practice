import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class StreamWithPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// IntStream: Used for the primitive types int, short, byte, and char
		//LongStream: Used for the primitive type long
		// DoubleStream: Used for the primitive types double and float
		
		DoubleStream f  = DoubleStream.of(12,34,34.89, 34F);
	
		
		OptionalDouble avgd = f.average();
		
		System.out.println(avgd);
		System.out.println(avgd.getAsDouble());
		

	}

}
