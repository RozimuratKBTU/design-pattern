package Decorator;

public class SeniorJavaDev extends DeveloperDecorator{

    public SeniorJavaDev(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }

    public String makeCodeReview(){
        return "Make review Code. ";
    }


}
