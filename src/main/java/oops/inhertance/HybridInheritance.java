package oops.inhertance;

interface HybridInheritance {
    public void printName();
}
interface HybridInheritance1 extends HybridInheritance{
    public void printHi();
}
interface HybridInheritance2 extends HybridInheritance{
    public void printHello();
}
class HybridInheritance3 implements HybridInheritance1, HybridInheritance2{

    public void printName() {
        System.out.println("Anil");
    }

    public void printHi() {
        System.out.print("Hi ");
    }

    public void printHello() {
        System.out.print("Hello ");
    }
}
class HybridInheritanceMain{
    public static void main(String[] args){
        HybridInheritance3 hybridInheritance3 = new HybridInheritance3();
        hybridInheritance3.printHi();
        hybridInheritance3.printName();
        hybridInheritance3.printHello();
        hybridInheritance3.printName();
    }
}
