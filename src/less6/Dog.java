package less6;

public class Dog extends AllAnimals {

    private String size;



    public Dog (String name, String sex, String breedOfAnimal, int age, String size, boolean graft, String sound) {
        super(name, sex, breedOfAnimal, age, graft, sound);
        this.size = size;

    }
    @Override
    public void run (int distance) {
        if (distance <=500) {
            System.out.println(name + " run " + distance + " m");
        }  else {
            System.out.println("Very long distance for the dog");
        }
    }

    @Override
    public void swim (int distance) {
        if (distance <= 10) {
            System.out.println(name + " swim " + distance + " m");
        }
        else {
            System.out.println("Very long distance for the dog " + name);
        }
    }
  }
