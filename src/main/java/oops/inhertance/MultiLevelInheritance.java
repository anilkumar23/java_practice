package oops.inhertance;

class MultiLevelInheritance {
    public void printSomeOtherName()
    {
        System.out.print(" and some other name");
    }
}
class MultiLevelInheritance1 extends MultiLevelInheritance{
    public void printSomeName()
    {
        System.out.print(" some name");
    }
}
class MultiLevelInheritance2 extends MultiLevelInheritance1{
    public void printHello()
    {
        System.out.print("Hello..");
    }

}
class Test
{
    public static void main(String[] args)
    {
        MultiLevelInheritance2 multiLevelInheritance2 = new MultiLevelInheritance2();
        multiLevelInheritance2.printHello();
        multiLevelInheritance2.printSomeName();
        multiLevelInheritance2.printSomeOtherName();
    }
}
