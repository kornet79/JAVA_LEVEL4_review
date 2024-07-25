package Java_level_3_test.GPT문제.GPT문제4;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal[] animal = {new Dog(), new Cat(), new Bird()};

        System.out.println("동물을 선택하세요.");
        System.out.println("[1] : Dog");
        System.out.println("[2] : Cat");
        System.out.println("[3] : Bird");

        int choice = sc.nextInt();

        selectedAnimal(animal[choice -1]);

    }
    private static void selectedAnimal(Animal animal) {
        animal.sound();

        if(animal instanceof Dog) {
            ((Dog) animal).description();
        } else if(animal instanceof Cat) {
            ((Cat) animal).description();
        } else if(animal instanceof  Bird) {
            ((Bird) animal).description();
        }
    }
}
