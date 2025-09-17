import java.util.Scanner;


class Animal {
    int age;
    String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        return !(this instanceof Fish);
    }

    public void mate() {
        System.out.println("Animal is mating...");
    }
}

// Duck class
class Duck extends Animal {
    String beakColor;

    public Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }

    public void swim() {
        System.out.println("Duck swims in water.");
    }

    public void quack() {
        System.out.println("Duck says Quack!");
    }
}

// Fish class
class Fish extends Animal {
    private int sizeInFt;
    private boolean canEat;

    public Fish(int age, String gender, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;
    }

    private void swim() {
        System.out.println("Fish swims silently.");
    }

    public void startSwimming() {
        swim();
    }
}

// Zebra class
class Zebra extends Animal {
    boolean isWild;

    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }

    public void run() {
        System.out.println("Zebra runs fast in the wild.");
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Duck
        System.out.println("Enter Duck details:");
        System.out.print("Age: ");
        int duckAge = scanner.nextInt();
        System.out.print("Gender: ");
        String duckGender = scanner.next();
        System.out.print("Beak Color: ");
        String beakColor = scanner.next();

        Duck duck = new Duck(duckAge, duckGender, beakColor);
        duck.swim();
        duck.quack();
        System.out.println("Is Duck a mammal? " + duck.isMammal());

        System.out.println();

        // Fish
        System.out.println("Enter Fish details:");
        System.out.print("Age: ");
        int fishAge = scanner.nextInt();
        System.out.print("Gender: ");
        String fishGender = scanner.next();
        System.out.print("Size (in ft): ");
        int sizeInFt = scanner.nextInt();
        System.out.print("Can it eat? (true/false): ");
        boolean canEat = scanner.nextBoolean();

        Fish fish = new Fish(fishAge, fishGender, sizeInFt, canEat);
        fish.startSwimming();
        System.out.println("Is Fish a mammal? " + fish.isMammal());

        System.out.println();

        // Zebra
        System.out.println("Enter Zebra details:");
        System.out.print("Age: ");
        int zebraAge = scanner.nextInt();
        System.out.print("Gender: ");
        String zebraGender = scanner.next();
        System.out.print("Is it wild? (true/false): ");
        boolean isWild = scanner.nextBoolean();

        Zebra zebra = new Zebra(zebraAge, zebraGender, isWild);
        if (zebra.isMammal()) {
            zebra.run();
        }
        System.out.println("Is Zebra a mammal? " + zebra.isMammal());

        scanner.close();
    }
}
