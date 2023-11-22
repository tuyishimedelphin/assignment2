 class multiple2
{
    public static void main(String args[])
    {
        ClassH2 h2 = new ClassH2();
        
        h2.dispH2();
        
        h2.dispH1();
        
        
        
        ClassH3 h3 = new ClassH3();
        
        h3.dispH3();
        
        h3.dispH1();
        
        ClassH4 h4 = new ClassH4();
        
        h4.dispH4();
        h4.dispH1();
    }
}public class ClassH1 
{
    public void dispH1()
    {
        System.out.println("disp() method of ClassH1");
    }
}
public class ClassH2 extends ClassH1 
{
    public void dispH2()
    {
        System.out.println("disp() method of ClassH2");
    }
}
public class ClassH3 extends ClassH1
{
    public void dispH3()
    {
        System.out.println("disp() method of ClassH3");
    }
}
public class ClassH4 extends ClassH1
{
    public void dispH4()
    {
        System.out.println("disp() method of ClassH4");
    }
}
