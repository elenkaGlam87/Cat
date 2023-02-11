package lesson11;

public class Security extends  Worker {
    public Security(String nameWorker, int ageWorker) {
        super(nameWorker, ageWorker);
    }

    @Override
    public String print() {
        return "Class Security has fields: nameWorker " + getNameWorker() + " , ageWorker " + getAgeWorker();
    }
}
