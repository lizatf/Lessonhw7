package firm;

public class Accountant extends Firm implements Position{
    public Accountant(String name, double salary,String position) {
        super(name, salary, position);
    }

    @Override
    public void presentInformation() {
        System.out.println(", имя: " +getName() + ", зарплата составляет: " +getSalary());
    }

    @Override
    public String printPositionOfWorker() {
        System.out.print("Должность: " +getPosition());
        return " ";
    }
}
