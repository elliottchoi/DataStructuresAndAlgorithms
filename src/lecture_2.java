import java.util.Arrays;

public class lecture_2 {

	public static void main(String[] args) {
		
		//Prof Notes
		
		//Defining an array
		int[]myArray={4,5,6,10};
		System.out.println(myArray[0]); 
		
		//DMA
		int []target=new int[10]; 
		
		//Java checks equality by reference
		boolean a=(myArray==target);
		System.out.println(a);
		a=Arrays.equals(target,myArray);

		//2-D Array
		int [][]eye={{0,0,1},{0,1,0},{1,0,0,}};
		
		//dynamic object<--reference
		//Circle foo = new Circle(2.0)
		//Objects are always references, primitives are allocated memory
		//Java has garbage collection 
		System.out.println(Foo.SOME_VALUE);
		}
	//System.out.println (myEnum.Foo.getTag());
	}

class Foo{
	//Shared by all instances of the class 
	public static final String SOME_VALUE="S";
}

//This references to the current instance of an object
//Static method has no instances
//public static void doBar(){
//return this.I*4

class Circle {
	private double radius;
	Circle (double radius)
	{
		this.radius=radius;
	}
	Circle (){
		this(1.0);
	}
}

//The values are not allocated until one is used first 
//Enum can take any of the designated values inside the class 
enum Enum{
	VALUE_1,
	VALUE_2,
	VALUE_3;
}

//Very useful for mutliple states
enum myEnum{
	Foo("foo"),Bar("bar");
	private final String tag;
	private myEnum(String tag)
	{
		this.tag=tag;
	}
	private String getTag(){return tag;}
}

