package amimals;

public class Tigers extends Animals implements Hunting {
    private String typeOfTiger;

    public Tigers(int id, String name, String typeOfTiger) {
        super(id, name);
        this.typeOfTiger = typeOfTiger;
    }

    public String getTypeOfTiger() {
        return typeOfTiger;
    }

    public void setTypeOfTiger(String typeOfTiger) {
        this.typeOfTiger = typeOfTiger;
    }

    @Override
    public void animalSay(String saySomething) {
        System.out.println(getName() + " says " +saySomething);
    }

    @Override
    public void animalEat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }

    @Override
    public void hunting() {
        System.out.println(getName() +" is hunting");
    }
}
