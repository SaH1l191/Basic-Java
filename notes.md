JDK : (creating, compiling, and running Java programs)
JDK
 ├── JRE : provides the environment required to run Java programs
 │    └── JVM : Java first converts it into bytecode,JVM runs Java bytecode.
 └── Development tools : (javac:Java compiler,java,ohter tools)

JRE (everything needed to RUN a Java application)
 ├── JVM
 └── Java libraries



steps : 
Java source code
      ↓
   Compiler
      ↓
  Bytecode (.class) Write Once, Run Anywhere
      ↓
     JVM
      ↓
    Output

major reason Java is called platform-independent


public static void main(String[] args) {}

public : method is accessible from outside the class
JVM needs to be able to access the main method to start the program

static : means the method belongs to the class itself rather than reuqiring an 
object of the class 

main method as an entry point

String[] args:
array of strings used to receive command-line arguments

eG :
public class Test {
    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}
Compile:
javac Test.java
Then run:
java Test Hello
The word Hello gets placed into the args array


Java is case-sensitive.
three different names.
name
Name
NAME


Class names — PascalCase
good egs : 
Student
BankAccount
EmployeeDetails
Car

Variable names — camelCase
Method names — camelCase

Constants — UPPER_SNAKE_CASE
MAX_VALUE
MIN_VALUE
PI
DEFAULT_TIMEOUT


data types : 
byte	Small whole numbers (-128 to 127)
short	Small/medium whole numbers (-32,768 to 32,767)
int	Whole numbers 

(-2,147,483,648
to
2,147,483,647
)

long	Very large whole numbers
float	Decimal numbers
double	More precise decimal numbers
char	A single character
boolean	true or false


float  → less memory, less precision
double → more memory, more precision
need to specify if it is float , double by default 

eg : float c = 99.9f works
and double c = 99.9 works 


primitive types 
byte,short,int,long,float,double,char,bookean //Holds a value directly

Reference types
String
ArrayList (int[],String[])
HashMap,classes/objects
A reference variable stores a reference to an object

Reference variable = points to an object. 
Copying a reference = two variables point to the same object


Type Casting
Converting a value from one data type to another data type
Widening casting  : going from a smaller type to a larger compatible type
You don't need to explicitly cast it.



Narrowing casting
going from a larger type to a smaller type ( can loose information)
Eg : 
double x = 10.5;
int y = (int) x;


if integer overflow happneed,next digit starts from negative (circular)




bit conversion : 
A bit can have only 2 values
1 bit → 2 possible combinations
2 bits → 4 possible combinations
3 bits → 8 possible combinations

n bits = 2ⁿ possible combinations

byte has 8 bits (signed integer : both +ve and -ve)
-2ⁿ⁻¹ to 2ⁿ⁻¹ - 1
for byte  : n = 8

minimum = -2⁷
        = -128

maximum = 2⁷ - 1
        = 127

short has 16 bits


int has 32 bits.
2³¹ = 2,147,483,648
int = 32 bits → -2³¹ to 2³¹ - 1
-2,147,483,648 to 2,147,483,647


long has 64 bits.
-2⁶³ to 2⁶³ - 1


char is: 16bits
UTF-16 code units.
0 to 65,535

boolean has two possible values, but don't assume its Java memory size is 1 bit.



arrays :
int[] num = new int[4]; //initlizes all to 0
same for the boolean -> all false


import java.util.Arrays <- java array utility class


Arrays.toString() function :-
int[] numbers = {30, 10, 50, 20, 40};
System.out.println(Arrays.toString(numbers));

Array.length

Arrays.sort(numbers);
Arrays.copyOf(original, original.length); 

int[] original = {10, 20, 30, 40, 50};
int[] copy = Arrays.copyOfRange(original, 1, 4);
//Arrays.copyOfRange(original, 1, 4); ending is closed interval

Arrays.equals(a,b) ///Compare arrays
Arrays.fill(arr, 0)
Arrays.deepEquals() //Compare 2D/multidimensional arrays


Strings:  Strings in Java are immutable.

String s1 = "Hello";
String s2 = new String("Hello");


method : 
s.length()
s.charAt(0)
String result = s.substring(0, 5); //ending is excluded

indexOf() // returns first occurence of char in string  else -1 

String s = "Hello World"
System.out.println(s.contains("World")); //returns t or f 

startsWith
endsWith

String s = "Hello World";
System.out.println(s.endsWith("World"));  //returns t or f 


toLowerCase()
toUpperCase()
trim() //removes spaces from beginning and from end (not in middle)

replace(): 
String s = "Hello World"; // replaces all char of 'o' to 'a'
String result = s.replace('o', 'a'); 

split()
String s = "Java is very easy";
String[] words = s.split(" ");  

String.valueOf()   //Converts a value into a String


Strings are immutabel in java : 
eg : 
String s = "hello";
s.toUpperCase(); 
System.out.println(s); // still hello
//doesnt work

bcz s.toUpperCase() creates a new string 
//we need to assign it to one 

s=s.toUppercase() ; now it would work 



Java maintains a special memory area called the string pool 
eg : 
String a = "Hello";
String b = "Hello";
Java can reuse the same pooled String

Conceptually:

       String Pool
       ┌─────────┐
a ────►│ "Hello" │◄──── b
       └─────────┘


.equals() //Compares the actual String contents.
String a = "Hello";
String b = "Hello";
System.out.println(a == b);
System.out.println(a.equals(b));

//both true 


Now : 
String a = new String("Hello");
String b = new String("Hello");
System.out.println(a == b); //not same object 
System.out.println(a.equals(b));

output :
false
true

= => compares whether same reference or not ? 
.equals -> same content or not ? 


StringBuilder class : 
it is mutable 

StringBuilder sb = new StringBuilder("Hello");
sb.append("Hello");
sb.insert(5, " World");
sb.delete(5, 11);
sb.reverse();
sb.setCharAt(0, 'Y');

String result = sb.toString(); //back to normal immutable string


StringBuffer // same as stringbuilder



StringBuilder → generally preferred for single-threaded code
StringBuffer  → synchronized / thread-safe


Feature	        StringBuilder	StringBuffer
Mutable	            ✅ Yes	        ✅ Yes
Thread-safe	        ❌ No	        ✅ Yes
Synchronized	    ❌ No	        ✅ Yes
Speed	            ⚡ Faster	    🐢 Slightly slower
Introduced	        Java 5	         java 1.0
Coding tests	    ⭐⭐⭐⭐⭐	    ⭐⭐
Multi-threaded apps	not preferred	  Useful


OOps : 

Collections : 
List → ArrayList, LinkedList
Set → HashSet, LinkedHashSet, TreeSet
Queue → PriorityQueue
Deque → ArrayDeque
Map → HashMap, LinkedHashMap, TreeMap


                 Iterable
                    |
                Collection
              /     |      \
            List    Set    Queue
             |       |       |
        ArrayList  HashSet  PriorityQueue
        LinkedList LinkedHashSet
        Vector     TreeSet
                             
                         Deque
                           |
                       ArrayDeque


                 Map   ← separate from Collection
                  |
          -------------------
          |        |        |
       HashMap  LinkedHashMap TreeMap


List is an interface , arraylist is a class that implements that interface 
LIST :
Allows duplicates
Maintains order
Has indexes
You can access elements using an index

add()
get()
set()
remove()
contains()
size()


For Collections, prefer the interface on the left. For arrays, use the array type directly.

ArrayList :
add()
get()
set()
remove()  //o(n)
contains() //o(n)
size()
isEmpty()
clear()


Usually: this below is preferred
List<Integer> numbers = new ArrayList<>();

instead of:
ArrayList<Integer> numbers = new ArrayList<>();

I only care that numbers behaves like a List. I don't need my code to depend on the specific implementation.
Treat this ArrayList as a List."
That's polymorphism

Linked List : 
List<Integer> list = new LinkedList<>();
add()
addFirst()
addLast()
get() //get elemtn using index
getFirst()
getLast()
removeFirst()
removeLast()
remove() //removes at index , remove(Integer.valueOf(num)) removes first occurence of el
contains()
size()
isEmpty()
clear()

Set :

Set<Integer> num = new HashSet<>(); 
            num.add(10);
            num.add(10);

.add()
.contains()
HashSet : unqiue maintained +  does NOT guarantee insertion order




LinkedHashSet : no duplicates + insertion order preserved 
Set<Integer> set = new LinkedHashSet<>();


TreeSet (just like sorted set )
    No duplicates
    Sorted order




Queue : 
Queue<Integer> queue = new LinkedList<>();
but often used ArrayDeque for ordinary queue behavior: 
Queue<Integer> queue = new ArrayDeque<>();


queue.offer(10); //add 
queue.poll(); ///remove 
queue.peek(); //front


PriorityQueue
PriorityQueue<Integer> pq = new PriorityQueue<>(); //smallest element first

if want max heap use : 
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder())


Dequeue:
Deque<Integer> deque = new ArrayDeque<>();

addFirst
addLast
removeFirst
removeLast


ArrayDeque is extremely useful.
It can act as:
Queue + Stack 


Map : 
Hashmap doesnt contain duplicate keys 
Map<String,Integer> m = new HashMap<>()

put()
get()
containsKey()
remove()
size()
isEmpty()

map.getOrDefault(key, defaultValue)
if key exists give me value else give me 0 

Iteration over keys : 
for (String key : map.keySet()) {
    System.out.println(key);
}

for (int value : map.values()) {
    System.out.println(value);
}

for (var entry : map.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}

map.keySet()    → all keys
map.values()    → all values
map.entrySet()  → all key-value pairs


LinkedHashMap
Same as HashMap, but preserves insertion order.

Map<String, Integer> map = new LinkedHashMap<>();


TreeMap
keys sorted
Map<Integer, String> map = new TreeMap<>();



IMPORTANT Utility classes : 
import java.util.Arrays;

int[] arr = {5, 2, 8, 1, 3};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
Arrays.fill(arr, 0);
Arrays.fill(arr, 1, 4, 10); // filling a range ending is exlcusive


int[] arr = {10, 20, 30};
int[] copy = Arrays.copyOf(arr, 5); //copy arr but copy size is 5


System.out.println(Arrays.equals(a, b));
//whether two arrays contain the same elements in the same order


Arrays.binarySearch()


Arrays      → utility methods for arrays
Collections → utility methods for collections


a utility class contains methods that you can use without creating an object.

List<Integer> list = new ArrayList<>();

Collections — utility class for collections
Java provides a utility class called Collections:


Collections.sort(list);
Collections.reverse(list);
Collections.max(list);
Collections.min(list);


Math.max(10, 20);
Math.min(10, 20);
Math.abs(-10);
Math.sqrt(25);
Math.pow(2, 3);



Exception Handling
event that occurs during program execution that interrupts the normal flow of the program

For example:
int x = 10 / 0;
You cannot divide an integer by zero, so Java throws:
ArithmeticException


put that peice of code likely to throw error : 
in try block  
Try running this code



catch handles an exception

try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}

e is the exception object
System.out.println(e.getMessage());
or:
e.printStackTrace();


finally
finally runs after try/catch in normal exception-handling flow, whether an exception occurred or not.


try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error");
} finally {
    System.out.println("Done");
}


throw
used when you explicitly want to throw an exception
int age = 15;
if (age < 18) {
    throw new IllegalArgumentException("Age must be 18 or above");
}

throws
used in a method declaration
//This method may throw this exception


public static void test() throws Exception {
    // code
}
Then whoever calls test() may need to handle that exception.



Difference
throw
 ↓
Actually throws an exception


throws
 ↓
Declares that a method may throw an exception
This distinction is very commonly tested.



Checked exceptions : 
these are checked by the compiler 

IOException
SQLException
FileNotFoundException

so it must be used within : 
catch it
or declare it with throws keyword

unchecked expcetion :
are subclasses of RuntimeException

RuntimeException
├── ArithmeticException
├── NullPointerException
├── ArrayIndexOutOfBoundsException



Throwable (The top-level class for things that can be thrown)
   │
   ├── Error (Usually serious JVM/system-level problems) -> OutOfMemoryError,StackOverflowError
   │
   └── Exception(Represents conditions that programs can potentially handle)
         │
         ├── RuntimeException
         │     ├── ArithmeticException
         │     ├── NullPointerException
         │     └── ArrayIndexOutOfBoundsException
         │
         └── Other checked exceptions






NullPointerException 
try {
    String s = null;
    System.out.println(s.length());
} catch (NullPointerException e) {
    System.out.println("Null!");
}


ArrayIndexOutOfBoundsException
try {
    int[] arr = {10, 20, 30};
    System.out.println(arr[5]);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array error");
} catch (Exception e) {
    System.out.println("Some other error");
}


EG : below eg 2nd cathc is unreachable code 
try {
    // code
} catch (Exception e) {
    // ...
} catch (ArithmeticException e) {
    // ...
}


this below is valid : 
try {
    // risky code
} catch (ArithmeticException e) {
    // handle arithmetic
} catch (NullPointerException e) {
    // handle null
} catch (Exception e) {
    // handle anything else
}


EG :
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Main {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}




throw + throws together

This is a very common pattern:
public static void checkAge(int age) throws Exception {

    if (age < 18) {
        throw new Exception("Too young");
    }
}

Here:
throws Exception
means:
    This method may throw an exception.
And:
throw new Exception(...)
means:
    Actually throw this exception right now.



Tricky EG :
public static int test() {
    try {
        return 10;
    } finally {
        System.out.println("Finally");
    }
}
Remember : 
finally gets a chance to execute even when try contains return.



Stack : 
associated with method calls and local variables.
faster , limited and automatically garbage collected 

When the method finishes, its stack frame goes away



Heap
Objects are generally allocated in the heap.


              MEMORY
             /      \
         WHERE?     WHEN/HOW?
           ↓           ↓
      Stack/Heap   Static/Dynamic

eg : int[] arr = new int[3];

WHERE?
arr/reference     → Stack (conceptually)
array object      → Heap

HOW/WHEN?
new int[3]        → Dynamically created at runtime
array length      → Fixed after creation


eG: 
int arr[10]; -> static allocation 


Garbage Collection
Java automatically manages memory using Garbage Collection 

Student s = new Student();
s = null;

Initially:
s ─────→ Student object
After:
s = null;

The object becomes eligible for garbage collection.

 

Does Java pass objects by reference ? 


No. Java is always pass-by-value. When an object is passed, the value being copied is the reference to that object. Therefore, a method can modify the object's state through that reference, but reassigning the local reference does not change the caller's reference.

proof :

class Main {
    public static void change(int x){
        int a = x; 
        a = 100;
    }
    public static void main(String[] args) {
        int x = 10;
        change(x);
        System.out.println(x); //still 10
    }
}
Java copied the actual value


now the part with arrays/objects 
int[] numbers = {10, 20, 30};
numbers does not directly contain the array
it is an arrow pointing to the array , numbers is a reference variable
The actual array is somewhere else in memory

What does Java pass?
It copies the reference. (bcz nums was a reference only anyways)

eg1
class Main {
    public static void change(int[]x){
        x[0]=100;
        x[1]=200;
    }
    public static void main(String[] args) {
        int[] x = {10,20};
        change(x);
        System.out.println(x[0]);//prints 100
    }
}

eg2
class Main {
    public static void change(int[]x){
        int[] newx= new int[2];
        newx[0]=100;
        newx[1]=200;
    }
    public static void main(String[] args) {
        int[] x = {10,20};
        change(x);
        System.out.println(x[0]);//prints 10 now
    }
}


Without Lambda : 
interface Calculator {
    int calculate(int a, int b);
}
it says : "Any class that implements me must have a calculate() method."

So normally : 
class MyCalculator implements Calculator {
    public int calculate(int a, int b) {
        return a + b;
    }
}

Lambda removes the unnecessary class

Because Calculator has only one abstract method:
int calculate(int a, int b);
Java allows you to write:
Calculator c = (a, b) -> a + b;
meaning -> Create a Calculator whose calculate() method does a + b

is roughly equivalent to:
Calculator c = new Calculator() {
    public int calculate(int a, int b) {
        return a + b;
    }
};


//continue from phase 7
















multithreading  remaining 
Process vs thread
Creating threads
Thread
Runnable
start()
run()
sleep()
Synchronization
Race condition
Deadlock — basic understanding



Must master 🔴
Syntax → Arrays → Strings → OOP → HashMap → ArrayList → HashSet → PriorityQueue → Stack/Queue → Sorting/Binary Search

Should know 🟡
Exceptions → Generics → Wrapper classes → Arrays/Collections → Java 8 streams/lambdas

Know conceptually 🟢
JVM/JDK/JRE → GC → Threads → Runnable → synchronization

Ignore for now ⚪
Spring Boot / Hibernate / JPA / Microservices




