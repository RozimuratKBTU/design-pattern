package Observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDevJobSite jobSite = new JavaDevJobSite();
        jobSite.addVacancy("First Java Pos");
        jobSite.addVacancy("Second Java Pos");

        Observer firstSubs = new Subscriber("Rozi Mir");
        Observer secondSubs = new Subscriber("Samandar Tash");

        jobSite.addObserver(firstSubs);
        jobSite.addObserver(secondSubs);

        jobSite.addVacancy("Third Java Pos");
        jobSite.removeVacancy("Second Java Pos");
    }
}
