package firm;

public abstract class Firm{
    private final String name;
    private double salary;
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Firm(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    public abstract void presentInformation();
}
