package day41_exceptions.Library;

public class Library {
    /*
    Exception & Abstraction Practice

----------------------------------------------------------------------

Create a class NonResidentException
    make this a unchecked exception

    create a constructor to accept the String argument and pass it to the super constructor

 Create a class FailToCheckOutException
    make this a checked exception

    create a constructor to accept the String argument and pass it to the super constructor

Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file

Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution

----------------------------------------------------------------------
Create an abstract class Car

    define an abstract method start (void)

Create a concrete class Toyota
    sub class of Car

    override the start method to print:
        turning key to start

Create a concrete class BMW
    sub class of Car

    override the start method to print:
        pressing button to start

Create a abstract class ElectricCar
    sub class of Car

    define an abstract method charge (void)

Create a concrete class Tesla
     sub class of ElectricCar

    override the start method to print:
        key card near by, starting car

    override the charge method to print:
        at tesla charging station

----------------------------------------------------------------------

Create an abstract class Shape

    define a final variable name

    define a constructor to initialize the name of the shape

    define two abstract methods:

        area()
        perimeter()

    override the toString to return the name, area and perimeter

Create a concrete class Circle
    sub class of Sharpe

    create an instance variable radius

    call the parent constructor to set the name of the shape to "Circle" & initialize the radius value for the circle

    implement the two abstract methods for a circle shape

        area()
        perimeter()

    override the toString to return the name, area, perimeter, and radius

Create a concrete class Rectangle
    sub class of Sharpe

    create an instance variable length
    create an instance variable width

     */
}
