package amimals;

public class Cats extends Animals implements Hunting,Play {
    private final int numberOfLives;

    public Cats(int id, String name, int numberOfLives) {
        super(id, name);
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    @Override
    public void animalSay(String saySomething) {
        System.out.println( getName() + " says " +saySomething);
    }

    @Override
    public void animalEat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }

    @Override
    public void hunting() {
        System.out.println( getName() + " is hunting");
    }

    @Override
    public void play() {
        System.out.println(getName() + "is playing");
    }
}
