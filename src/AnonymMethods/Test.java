package AnonymMethods;

class Animal{
    void getName(){
        System.out.println("Saman");
    }
}

class MilkAnimal extends Animal{
    @Override
    void getName() {
        System.out.println("Milk Animal");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.getName();

        Animal milk = new Animal() {
            @Override
            void getName() {
                System.out.println("Milk Animal");
            }
        };
        milk.getName();

        Animal animal1 = new MilkAnimal();
        MilkAnimal milkAnimal = new MilkAnimal();
        milkAnimal.getName();
        animal1.getName();


    }
}
