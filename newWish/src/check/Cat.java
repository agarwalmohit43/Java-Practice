package check;

 class Animals {
	 
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

public class Cat extends Animals {
	
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animals myAnimal = myCat;
        Animals.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
