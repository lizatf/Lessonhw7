package amimals;

public abstract class Animals {
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Animals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void animalSay(String saySomething);
    public abstract void animalEat(String nameOfFood);

}
