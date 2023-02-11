package lesson11;

public class President extends Worker {

    public President(String nameWorker, int ageWorker) {
        super(nameWorker, ageWorker);
    }

    @Override
    public String print() {
        return "Class President has fields: nameWorker " + getNameWorker() + " , ageWorker " + getAgeWorker();
    }
}
