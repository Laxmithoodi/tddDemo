package conversions;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 5/25/17.
 */
public final class StreamConverter extends PersonConversionAgent<Stream<Person>> {
    private final List<Person> personList;
    public StreamConverter(Stream<Person> people) {
        super(people);
        this.personList = super.objectSequence.collect(Collectors.toList());
    }

    public StreamConverter(int collectionSize) {
        this(PersonFactory.createPersonStream(collectionSize));
        /** Implementation of adapter pattern for testing purposes
         *  @param collectionSize  - count of Stream to be generated */
    }

    // TODO
    public List<Person> toList() {
        //return super.objectSequence.collect(Collectors.toList());
        //Stream<Person> people = super.objectSequence;
        return this.personList;
    }

    // TODO
    public Stream<Person> toStream() {
        return personList.stream();
    }

    // TODO
    public Person[] toArray() {
        // Stream<Person> people = super.objectSequence;
        return personList.stream().toArray(Person[]::new);
    }
}

