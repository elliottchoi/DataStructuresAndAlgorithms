import java.util.Arrays;

//January 12th 2017 Notes
public class lecture_2 {

	public static void main(String[] args) {
		
		//Defining an array
		int[]myArray={4,5,6,10};
		//Array Access
		System.out.println(myArray[0]); 
		
		//Initializing an Array
		int []target=new int[10]; 
		//Recall Arrays are 0 based, so index ranges from 0 to target.length-1; 
		
		//Java ARrays are references
		double [] list1 = new double[10];
		double [] list2 = new double[10];
		list2 = list1;
		list1[0] = 20.0;
		//Will print out 20.0 b/c list 2 points to list 1 array 
		System.out.println(list2[0]);
		
		//Copying an array via for loop
		int[] source = { 4, 5, 6, 10 };
		int[] target1 = new int[source.length];
		for (int i = 0; i < source.length; ++i) {
		target1[i] = source[i]; // assign the value from target <- list1
		}
		source[0] = 20;
		System.out.println(target1[0]);
		
		//It is MORE efficient to do the following 
		int[] source1 = { 4, 5, 6, 10 };
		int[] target2 = new int[source1.length];
		//params (source array, index of source array, destination array, destination index, number of elements to be copied)
		System.arraycopy(source1, 0, target2, 0, source.length);
		
		//Java checks equality by reference
		boolean a=(myArray==target);
		System.out.println(a);
		a=Arrays.equals(target,myArray);

		//2-D Array
		int [][]eye={{0,0,1},{0,1,0},{1,0,0,}};
		//[0,0,1]
		//[0,1,0]
		//[1,0,0]
		
		int[][]unEvenEye={{0,0,1},{0,1},{1}};
		//[0,0,1]
		//[0,1]
		//[1]
		
		//Using Object Class for Object Construction 
		Circle foo= new Circle (2.0); //Sends param 2.0 as radius
		Circle defaultFoo=new Circle();//Uses default of 1.0

		
		//Objects are always references, primitives are allocated memory
		int i=0;
		int j=i;
		i=4;
		System.out.println(i);//allocated memory, do not share reference, prints 4
		System.out.println(j);//prints 0
		
		//Objects are references
		Circle c1= new Circle (4.0);
		Circle c2=c1;
		c1.setRadius(2.0);
		System.out.println(c2.getRadius());
		//Will print out 2.0 because objects are references to memory, both c1 and c2 point to same object memory
		
		//Static vs Instance
		//Instance is bound to an instance of a class 
		//Static are bound to the class itself and exist even if an object has not been created
		
		
		//Java has garbage collection 
		System.out.println(Foo.SOME_VALUE);
		}
	System.out.println (myEnum.Foo.getTag());
	}

//Example of a Class in Java
class Circle {//All classes implicitly extend object class 
	private double radius;
	//Since a constructor is specified, default constructor is not automatically created
	Circle (double radius)
	{
		this.radius=radius;
	}
	Circle (){//default constructor 
		this(1.0);
	}
	public void setRadius(double x)
	{
		this.radius=x;
	}
	public double getRadius()
	{
		return radius; 
	}
	public double getArea() { // method
		return radius * radius * Math.PI;
	}
}

//SOME_VALUE can be accessed as seen in the main w/o object FOO
class Foo{
	//Shared by all instances of the class 
	public static final String SOME_VALUE="S";
}

class Foo2 {
	int i = 0;
	public static void doBar() {
		//return this.i * 4;//instant classes do not have this operator
		//Also this method is void so lmao 
}
public void doBaz() {
	//return i * 3; // void methods cannot return a value
	System.out.println(i*3);
}
}

//The values are not allocated until one is used first 
//Enum can take any of the designated values inside the class 
enum Enum{
	VALUE_1,
	VALUE_2,
	VALUE_3;
}

//Very useful for muliple states
enum myEnum{
	Foo("foo"),Bar("bar");
	private final String tag;
	private myEnum(String tag)
	{
		this.tag=tag;
	}
	private String getTag(){return tag;}
}

