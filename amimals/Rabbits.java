package amimals;

public class Rabbits extends Animals implements Play{
    private String colorOfRabbit;

    public Rabbits(int id, String name, String colorOfRabbit) {
        super(id, name);
        this.colorOfRabbit = colorOfRabbit;
    }

    public String getColorOfRabbit() {
        return colorOfRabbit;
    }

    public void setColorOfRabbit(String colorOfRabbit) {
        this.colorOfRabbit = colorOfRabbit;
    }

    @Override
    public void animalSay(String saySomething) {}

    @Override
    public void animalEat(String nameOfFood) {
        System.out.println(getName() +" eats " +nameOfFood);
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }
}
