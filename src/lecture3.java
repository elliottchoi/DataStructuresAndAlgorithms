public class lecture3 {
	public static void main(String[] args) {
		
		A1 a = new A1();
		System.out.println("A#doString(\"foo\"): "+ a.doString("foo"));//output is 3
		B1 b = new B1();
		System.out.println("B#doString(\"foo\"): "+ b.doString("foo"));//output is 5
	}
}


//An example of object Composition 
public class Name{
	/** first name */
	private String first;
	/** last name */
	private String last;
	
	//Constructor -->constructs a full name
	public Name(String firstName, String lastName) {
				first = firstName;
				last = lastName;
				}
		//Setter or Getter Functions		
		public void setFirst(String firstName) { first = firstName; }
		public void setLast (String lastName) { last = lastName; }
		public String getFullName() { return first + ' ' + last; }
}

//Student Class CONTAINS name class 
public class Student {
	  /** full name of the student, name is a field of Student*/
	  private final Name fullName;
	  /** identification number */
	  private final String id;

	  public Student(Name studentName, String studentId) {
	      fullName = studentName;
	      id = studentId;
	  }

	  public Name getName() { return fullName; }
	  public String getId() { return id; }
	}

//An example on inheritence 
public class Vehicle {
	// this should be private, protected is usually an anti-pattern
	protected final String make;
	
	//Base or 'Super' constructor 
		public Vehicle(String make) {
		this.make = make;
	}
}

//Derived Class
public class Boat extends Vehicle {
	private final int length;
	
	//Constructor calls the "super's" constructor 
	public Boat(String make, int length) {
		//Vehicle object is made
		super(make);
		//length for new "vehicle object" of make (boat type)
	this.length = length;
	}
}

//An Example of access 
//package ca.uwo.a;
public class A {
	private int a;
	/*default*/ int b; //recall default is private 
	protected int c;
	public int d;
	public A() {}
}

//package ca.uwo.b;
//B is a derived class of super A
public class B extends A {
	public B() {
		//this.a = 1;<--cannot access b/c it is private
		//this.b = 2; default is private not accessible 
		this.c = 3;//when protected only derived and super class can access 
		this.d = 4;//anything public can be accessed whether it is derived or not
	}
}

//An Example of method overriding 
//requirements-->Same name, return type and params
public class A1 {
	public A1() {}
	public int doString(String value)
	{
		return value.length();
	}
}

//B1 is derived class of A1
public class B1 extends A1 {
	//Calls default constructor of super 
public B1() { }
@Override // 
	public int doString(String value)
	{
	//super.-->method, calls the overridden method in super class
	int fromSuper = super.doString(value);
	return fromSuper + 2;
	}
}
//Note placing final in a method prevents it from being overidden

//An Example of overloading method
public class A2 {
	//do Value is repeated twice
	public int doVal(String value) {
	return value.length();
	}
	
	public int doVal(int value) {
	return value;
	}
}

//All Objects implicitly extend the java.lang.Object class

//Abstract Class require a subclass to implement
abstract class AbstractFoo {
	public AbstractFoo() { }
	// Abstract method:
	public abstract void bar();
	//This cannot be called 
}

class RealFoo extends AbstractFoo {
public RealFoo() { super(); }
//bar implements the abstract version of bar in super class
public void bar() { }
}

//An interface is a pure virtual class, all methods are implicitly public and must be public
interface IFoo {
	// implicitly public
	void foo();
	}
//IFoo can not be initialized because it is an interface (think pure virtual class)

//Another Interface (pure virtual class)
interface IBar {
void bar();
}

//RealFoo implements two interfaces making for this idea of "multiple inheritence" 
class RealFoo implements IFoo, IBar {
@Overrides
public void foo() { }
@Overrides
public void bar() { }
}

//An Example of Polymorphism 
//Recall case of inheritence with method overriding, the method called depends on object type 
//It will either be of super type, or derived type 

//Encapsulation 
//Tl;DR data hiding, keep as much data private, basically use methods to interact with class
//actual data held in class is never exposed for the user to directly modify

//Abstraction: Conditions of your method/design specification 
//import static com.google.common.base.Preconditions.*;<-- this is java library you import
public class A3 {
// must specify non-null string and i > 10
	public void check(@Nonnull String value, int i) {
		checkNotNull(value,"value == null"); // NullPointerException <--native to imported library
		checkArgument(i > 10,"i <= 10"); // IllegalArgumentException<--native to imported library
		// do something with value and i
		}
}

//Generic Types-->Java's version of C++ Templates
interface Iterator<T> {//Iterator <T> T will define data type
boolean hasNext();
T next();
}

//Comparable <T> very similar to operator overloading 
class Bar {}
//Specifies we are comparing Foo and Bar data types
class Foo implements Comparable<Foo>, Comparable<Bar> {
	
	private int v;
	//Foo object 
	Foo(int v) { this.v = v; }
	
	//Foo Comparison to Foo
	public int compareTo(Foo other) {
	checkNotNull(other); // make sure other is not null
	return Integer.compareTo(this.v, other.v);
	}
	
	//Foo Comparison to Bar
	public int compareTo(Bar other) {
	return -1; // this always < other
	}
}
