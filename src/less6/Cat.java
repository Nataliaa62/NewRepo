package less6;

import java.util.concurrent.Callable;

public class Cat extends AllAnimals {

    private String color;
    private static int catCount;

    public Cat (String name, String sex, String breedOfAnimal, int age, boolean graft, String sound, String color) {
        super(name, sex, breedOfAnimal, age, graft, sound); // обращаемся к родительскому конструктору с набором аргументов
        this.color = color; // поле только для класса Cat

    }


    @Override  // это указание, что это не собственный метод cat, а позаимнстованный у род.класса. Мы изменили форму поведения объекта (т.е. тело) (принцип полиморфизма).
    public void run (int distance) {  // если мы уберем @Override, то метод станем собственным класса cat
        if (distance <=200) {
            System.out.println(name + " run " + distance + " m");
            }
        else {
            System.out.println("Very long distance for the cat " + name);
        }
    }
    @Override
    public void swim (int distance) {
        System.out.println("The cat can't swim");
    }
}


