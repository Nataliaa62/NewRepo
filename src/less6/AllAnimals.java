package less6;

public class AllAnimals {     // создаем родительский класс (общая модель)
    protected String name;   //  С помощью protected даем доступ наследникам
    protected String sex;
    protected String breedOfAnimal;
    protected int age;
    protected boolean graft;
    protected String sound;

    public AllAnimals(String name, String sex, String breedOfAnimal, int age, boolean graft, String sound) { //создаем конструктор род.класса
        this.name = name;
        this.sex = sex;
        this.breedOfAnimal = breedOfAnimal;
        this.age = age;
        this.graft = graft;
        this.sound = sound;
    }

    public void run (int distance) {
            System.out.println(name + " run " + distance + " m");
        }

    public void swim (int distance) {
            System.out.println(name + " run " + distance + " m");
    }


}


/*    public void speak() {
        System.out.println(name + " says " + sound);
    }*/

// public abstract void jump ();