package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> aparts, int firstN) {
        if (aparts.size() == 0) return new ArrayList<String>();
        var strs = aparts.stream()
            .sorted((h1,h2) -> h1.compareTo(h2))
            .map(h -> h.toString())
            .toList();
        return strs.subList(0, firstN);
    }

    // public static void Main(String... args) {
    //    List<Home> apartments = new ArrayList<>(List.of(
    //         new Flat(41, 3, 10),
    //         new Cottage(125.5, 2),
    //         new Flat(80, 10, 2),
    //         new Cottage(150, 3)
    //     ));     
    //     buildApartmentsList(apartments, 3);
    // }
}
// END
