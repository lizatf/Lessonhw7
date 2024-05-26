package amimals;

public class Fish extends Animals{
    private String typeOfFish;

    public Fish(int id, String name,String typeOfFish) {
        super(id, name);
        this.typeOfFish = typeOfFish;
    }

    public String getTypeOfFish() {
        return typeOfFish;
    }

    public void setTypeOfFish(String typeOfFish) {
        this.typeOfFish = typeOfFish;
    }

    @Override
    public void animalSay(String saySomething) {}

    @Override
    public void animalEat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }
    public void swim(){
        System.out.println(getName() + " swims");
    }
}
