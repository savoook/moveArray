package stream.getTheOldestPerson;

import java.util.List;

public class MaxAndComparator {
    public static Person getOldestPerson(List<Person> people) {
//        Person oldestPerson = new Person("", 0);
//        for (Person person : people) {
//            if (person.getAge() > oldestPerson.getAge()) {
//                oldestPerson = person;
//            }
//        }
//        return oldestPerson;
        return people.stream().reduce((p1, p2) ->
                p1.getAge() > p2.getAge() ? p1 : p2).orElseGet(null);
    }
}
