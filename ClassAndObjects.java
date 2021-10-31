package org.example.javaSamplePrograms;

import org.example.javaSamplePrograms.encapsulation.Encapsulation;

// 1. This is the main class and is preceded with "public" and should be same as file name
public class ClassAndObjects {
    public static void main(String[] args) {
        //5. We are creating a new object for existing class using keyword "new"
        Person p1 = new Person();
        //14. "new" will call a default constructor

        //6. with "." we can access all properties and behaviour of class Person()
        p1.name = "Sanjay";
        p1.age = 24;
        System.out.println(p1.age +" "+p1.name);

        //7. We can create multiple objects for the same class Person()
        //15. We are calling a default constructor here as well
        //10. Properties
        Person p2 = new Person(31, "Shivam");
        //22. Since we are initialising parameters in Person(newAge, newName) no need to write below
//        p2.name = "Suraj";
//        p2.age = 25;

        p1.eat(); //9. Behaviour
        p2.walk(); //will execute 11.a
        p2.walk(2); //will execute 12.a

        System.out.println(Person.count);


        Developer d1 = new Developer(24, "Sanjay");
        d1.walk();
        //27. d1 searches in Developer for walk, then in nearest parent Person class for walk() when found, will execute
        //28. The parent of all classes is an object class (super Parent)

        //32. calling Encapsulation here from Encapsulation.java
        Encapsulation obj = new Encapsulation();
        //33. will be visible when doWork is public - else compileTime error (not visible)
        //obj.doWork();
    }
}

//24. Inheritence = child class inherits parent class (person(Doctor, vendor))
class Developer extends Person
{
    //25. when class extends - required to specify age and name
    public Developer(int age, String name)
    {
        //26. Super is used to call the parent constructor
        //27. So when a new Developer is created, Person count is incremented
        super(age, name);
    }
    //28. Developer can have a different walk method too
    //29. Runtime Polymorphism - walk() is acting diff in Person and Developer (d1.walk())
    void walk(int steps)
    {
        System.out.println("Our Developer "+name+" has walked "+steps+ " steps");
    }
}

//sum of numbers using lists, oops - example-encapsulation, linear n binary search, stringlength n factorial
//2. We can create multiple class other than the main class just without public (access specifier)
class Person{
    //3. Here Person is a blueprint - u can use this person where ever you want
    //4. Just like from one blueprint we can construct many houses
    //20. When we are initializing properties like name and age we make use of constructors
    //34. Protected - Only person and Developer can access this property - nobody else (only child classes)
    protected String name;
    int age;

    //18. As and when person number is rising count++
    //20. To access count, we should do it as static
    static int count;

    //16. We are here calling new Constructor
    public Person()
    {
        //19. when a new person is created, count is incremented
        count++;
        System.out.println("Creating new object");
        //17. This will be printed 2 times as we are calling it at [14] and [15] Points
    }

    //21. Constructor overloading (more than one parameter in same class name Person
    public Person(int newAge, String newName)
    {
        this();//23. this is used to call the constructor of this Person
        this.name = newName; //24. Here "this" is used to call the other parameters
        this.age = newAge;
    }

    //8. Methods - can be created within same class where Person (blueprint) is defined (Method == Function)
    //11. Method Return Type = Void
    //30. CompileTime Polymorphism - Program can decide which to call at Compile time - on args/noArgs
    void walk() //11.a
    {
        System.out.println(name+" is walking");
    }
    void eat()
    {
        System.out.println(name+ " is eating");
    }
    //12. Passing arguments within Methods
    //31. CompileTime Polymorphism - Program can decide which to call at Compile time - on args/noArgs
    void walk(int steps) //12.a
    {
        System.out.println(name+" has walked "+steps+ " steps");
    }

    /*
    13. PoLYMORPHISM -- We have 11 and 12 walk() and walk(int steps) same method name but
    Compile Time Polymorphism Occurs here at p2.walk and p2.walk(2)
     */
//18.15

}
