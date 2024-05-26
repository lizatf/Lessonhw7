package amimals;

public class Dogs extends Animals implements Play{
    private int hoursOfPlayOutside;

    public Dogs(int id, String name, int hoursOfPlayOutside) {
        super(id, name);
        this.hoursOfPlayOutside = hoursOfPlayOutside;
    }

    public int getHoursOfPlayOutside() {
        return hoursOfPlayOutside;
    }

    public void setHoursOfPlayOutside(int hoursOfPlayOutside) {
        this.hoursOfPlayOutside = hoursOfPlayOutside;
    }

    @Override
    public void animalSay(String saySomething) {
        System.out.println( getName() + " says " +saySomething);
    }

    @Override
    public void animalEat(String nameOfFood) {
        System.out.println(getName() + " eats " +nameOfFood);
    }

    public void walk(){
        System.out.println(getName() + " is walking");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing");
    }
}
