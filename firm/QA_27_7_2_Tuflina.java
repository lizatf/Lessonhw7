package firm;

public class QA_27_7_2_Tuflina {
    public static void main(String[] args) {
        Director director = new Director("Boris",4560.70,"директор");
        Accountant accountant = new Accountant("Irina", 3430.20,"бухгалтер");
        Worker worker = new Worker("Vladislav", 2500, "рабочий");

        director.printPositionOfWorker();
        director.presentInformation();

        accountant.printPositionOfWorker();
        accountant.presentInformation();

        worker.printPositionOfWorker();
        worker.presentInformation();

    }
}
