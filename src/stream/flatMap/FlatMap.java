package stream.flatMap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static List<String> transform(List<List<String>> collection) {
//        List<String> newCollection = new ArrayList<>();
//        for (List<String> subCollection : collection) {
//            for (String value : subCollection) {
//                newCollection.add(value);
//            }
//        }
//        return newCollection;
//    }
        return collection.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
    }
}
