package J.Day13;

abstract class Day18Abstraction {

    //Abstraction - showing neccesary information and Hiding unneccssary info is called abstraction
    //you can achieve abstraction using abstract and interface
    //abstract class contains both non-abstrat methods and abstract methods
    //abstract class is a class which cannot be instantiated
    //abstract method does not contain body

    //Non-Abstract Method
    public void Hey(){
        System.out.println("NON ABSTRACT METHOD WELCOMES YOU");
    };

    public void Hmm(){}

    //Abstract Method -  if we extend this abstract class then the abstract method should override compulsory.
    abstract public void Hii();
}
