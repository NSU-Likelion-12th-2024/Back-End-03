package Session;
interface Animal{
    public static final String name = "동물";
    public abstract void move();
    public abstract  void bark();
}

class Dog implements Animal{
    public void move(){
        System.out.println(Animal.name +
                "타다다닥");
    }
    public void bark() {
        System.out.println("왈왈");
    }
}

class Horse implements Animal {
    public void move() {
        System.out.println("다그닥 다그닥");
    }

    public void bark() {
        System.out.println("히이잉");
    }
}

public class example {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        dog.move();
        dog.bark();
        horse.move();
        horse.bark();
    }
}
