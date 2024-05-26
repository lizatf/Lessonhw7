package amimals;

public class Crows extends Animals {
    private String colorOfFeathers;

    public Crows(int id, String name, String colorOfFeathers) {
        super(id, name);
        this.colorOfFeathers = colorOfFeathers;
    }

    public String getColorOfFeathers() {
        return colorOfFeathers;
    }

    public void setColorOfFeathers(String colorOfFeathers) {
        this.colorOfFeathers = colorOfFeathers;
    }

    @Override
    public void animalSay(String saySomething) {
        System.out.println(getName() + " says " +saySomething);
    }

    @Override
    public void animalEat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }
    public void fly(){
        System.out.println(getName() + " is flying");
    }
}
