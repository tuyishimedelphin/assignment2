 multipletwo {
  public static void main(String[] args) {

    
    Dog labrador = new Dog();

   
    labrador.name = "Rohu";
    labrador.display();

    
    labrador.eat();

  }
}Class PetAnimal {

  
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

class Dog extends PetAnimal {


  public void display() {
    System.out.println("My name is " + name);
  }
}

