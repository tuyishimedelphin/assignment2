class multiple2{
    
    public static void main(String[] args) {
        PrepBytes pb= new PrepBytes();
        pb.test();
    }
}interface Vehicle{
    default void test(){
        System.out.println("Testing a vehicle");
    }
}
interface Car extends Vehicle{
}
interface Bike extends Vehicle{
}
