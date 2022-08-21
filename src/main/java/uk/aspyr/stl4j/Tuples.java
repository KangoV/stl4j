package uk.aspyr.stl4j;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;

public class Tuples {

    static final int FIRST_INDEX = 0;
    static final boolean EXACT_SIZE = true;
    static final boolean INEXACT_SIZE = false;

    private static final String INPUT_NULL = "%s cannot be null";
    private static final String INPUT_WRONG_SIZE = "%s must have exactly %s element in order to create a %s. Size was %s";

    static <X,T extends Tuple> T fromIterable(
            Iterable<X> input,
            int tupleSize,
            Class<T> tupleType,
            int startIndex,
            boolean exactSize,
            Function<Object[], T> tupleFactory) {

        // check these two as they are the values that can be passed from a factory method on a TupleXX class
        if (input == null) throw new NullPointerException("Need an non null iterable as input");
        if (startIndex < 0 || startIndex > 9) throw new IllegalArgumentException("Need a positive index between 0 and 9, but got "+startIndex);

        assert tupleSize >= 1 && tupleSize <= 10;
        assert tupleType != null;
        assert tupleFactory != null;

        final Iterator<X> iter = input.iterator();

        if (!iter.hasNext()) throw new IllegalArgumentException("Empty input");

        int i = 0;
        while (i < startIndex) { // forward wind to start of where we should start copying from
            if (iter.hasNext()) {
                iter.next();
            } else {
                break;
            }
            i++;
        }

        if (i < startIndex) {
            throw new IllegalArgumentException(
                String.format("Not enough elements for creating a %s. Start index of %s was not reached",
                    tupleType, startIndex));
        }

        Object[] tupleValues = new Object[tupleSize];

        boolean tooFewElements = false;
        int suppliedElementCount = 0;
        if (iter.hasNext()) {
            while (iter.hasNext()) { // start filling the result array from the next point
                if (suppliedElementCount >= tupleValues.length) {
                    tooFewElements = true;
                    break;
                }
                tupleValues[suppliedElementCount] = iter.next();
                suppliedElementCount++;
            }
            if (suppliedElementCount < tupleSize) {
                tooFewElements = true;
            }
        } else {
            tooFewElements = true;
        }

        if (tooFewElements) {
            throw new IllegalArgumentException(
                String.format("Not enough elements for creating a %s. %s needed, but had only %s.",
                    tupleType, tupleSize, suppliedElementCount));
        }

//        if (iter.hasNext() && exactSize) {
//            throw new IllegalArgumentException("Too many elements for creating a %s. ");
//        }

        return tupleFactory.apply(tupleValues);

    }

    static final <X, T extends Tuple> T fromArray(X[] input, int size, Class<T> tupleClass, Supplier<T> tupleFactory) {

        if (input == null) throw new NullPointerException("Need an non null array as input");

        assert size >= 1 && size <= 10;
        assert tupleClass != null;
        assert tupleFactory != null;
        assert input.length == size;

        return tupleFactory.get();
    }

}
