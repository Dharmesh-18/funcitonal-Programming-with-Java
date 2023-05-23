import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalPractice {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(List.of("goal", "moal", "golden", "zelda", "raven", "flyingBeast", "warlord"));

        Predicate<? super String> namesOnCondition = name -> name.contains("r");
        Optional<String> predicatedNames = names.stream().filter(namesOnCondition).findFirst();
        System.out.println(predicatedNames.isEmpty());
        System.out.println(predicatedNames);
        System.out.println(predicatedNames.get());


    }

}
