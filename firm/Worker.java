package firm;

public class Worker extends Firm implements Position{
    public Worker(String name, double salary, String position) {
        super(name, salary,position);
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
