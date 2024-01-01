package Decorator;

public class Task {
    public static void main(String[] args) {

        Developer developer = new SeniorJavaDev(new JavaDeveloper());
        System.out.println(developer.makeJob());

        JavaDeveloper javaDeveloper = new JavaDeveloper();

        System.out.println(javaDeveloper.makeJob());

        DeveloperDecorator developerDecorator = new DeveloperDecorator(new JavaDeveloper());

        System.out.println(developerDecorator.makeJob());


    }
}
