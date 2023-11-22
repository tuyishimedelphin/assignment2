class mum {
 
    
    public static void main(String args[])
    {
 
        TestClass d = new TestClass();
 
        d.show();
    }
}interface GPI {
 
    default void show()
    {
 
        System.out.println("Default GPI");
    }
}
 

interface PI1 extends GPI {
}
 
 
interface PI2 extends GPI {
}
 

