package oops.inhertance;

public class HierarchicalInheritance {
    public void printName(){
        System.out.println("Anil");
    }
}
class HierarchicalInheritance1 extends HierarchicalInheritance{
    public void printHi(){
        System.out.print("Hi ");
    }
}
class HierarchicalInheritance2 extends HierarchicalInheritance{
    public void printHello(){
        System.out.print("Hello ");
    }
}
class HierarchicalMain{
    public static void main(String[] args){
        HierarchicalInheritance2 hierarchicalInheritance2 = new HierarchicalInheritance2();
        hierarchicalInheritance2.printHello();
        hierarchicalInheritance2.printName();

        HierarchicalInheritance1 hierarchicalInheritance1 = new HierarchicalInheritance1();
        hierarchicalInheritance1.printHi();
        hierarchicalInheritance1.printName();
    }
}
