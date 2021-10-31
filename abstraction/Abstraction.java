package org.example.javaSamplePrograms.abstraction;
// Abstraction - giving only the necessary details
public class Abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
    }
}

class Audi extends Car
{

    @Override
    void start() {
        //7. here car is not starting - different models of car is starting individually
        System.out.println("Audi is starting");
    }
}

class BMW extends Car
{
//3. when an abstract class is created at [2] It has to override
    @Override
    //6. We have to implement start() method to make use of abstract class
    void start() {
        System.out.println("BMW is starting");
    }
}

//4. If you make Abstract function - it should be inside the Abstract class
abstract class Car {
    int price;

// 2. You can create the children into objects
    //5. when a method is of "abstract" it will not have any {body} for it
    abstract void start();
}
