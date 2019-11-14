package oops.inhertance;

class SingleLevelInheritance {
    public void printName(){
        System.out.println(" some name");
    }
}




class SingleLevelInheritance1 extends SingleLevelInheritance{
    public void printHello(){
        System.out.print("Hello..");
    }
}

class Main
{
    public static void main(String[] args)
    {
        SingleLevelInheritance1 singleLevelInheritance1 = new SingleLevelInheritance1();
        singleLevelInheritance1.printHello();
        singleLevelInheritance1.printName();
    }
}