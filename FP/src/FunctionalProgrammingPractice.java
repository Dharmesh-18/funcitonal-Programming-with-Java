import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingPractice {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1,2,3,4,5,6,7,8,9,10));

        System.out.println("Printing all numbers: " + numbers);

        System.out.println("----------- printing odd numbers only using streams -----------" );
        numbers.stream().filter(number -> number%2 != 0).forEach(System.out :: print);

        System.out.println("\n------------ printing cubes of all the odd numbers --------------");
        numbers.stream().filter( number -> number % 2 != 0).map(number -> number * number * number).forEach(System.out :: println);


        ArrayList<String> courses = new ArrayList<>();
        courses.addAll(List.of("java", "DSA", "AWS" , "GCP", "python", "spring", "spring-boot", "spring-data-jpa", "angular", "devOps"));


        System.out.println("\n----------- printing courses individually using streams -----------" );
        courses.stream().forEach(System.out :: println);

        System.out.println("--------------- printing number of characters in the course name -----------");
        courses.stream().map(course -> course + " : " + course.length()).forEach(System.out :: println );

        System.out.println("---------------- printing courses containing spring using streams ----------------");
        courses.stream().filter(course -> course.contains("spring")).forEach(System.out :: println);

        System.out.println("-------------------- printing courses with name having atleast 4 letters using streams --------------");
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out :: println);




    }
}
