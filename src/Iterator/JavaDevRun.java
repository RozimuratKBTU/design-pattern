package Iterator;

public class JavaDevRun {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Rozi Mirpulatov", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("DEV: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString()+" ");
        }
    }
}

