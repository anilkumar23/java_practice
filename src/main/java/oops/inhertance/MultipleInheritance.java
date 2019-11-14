package oops.inhertance;

interface MultipleInheritance {
    public void printWelcome();
}
interface MultipleInheritance1 {
    public void printTo();
}
interface MultipleInheritance2 extends MultipleInheritance,MultipleInheritance1{
    public void printJavaWorld();
}

class Result implements MultipleInheritance2{
    public static void main(String[] args){
        Result result = new Result();
        result.printWelcome();
        result.printTo();
        result.printJavaWorld();
    }

    public void printWelcome() {
        System.out.print("Welcome");
    }

    public void printTo() {
        System.out.print(" To");
    }

    public void printJavaWorld() {
        System.out.print(" The JavaWorld");
    }
}