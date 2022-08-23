/*
 * =============================================================================
 * 
 *   Copyright (c) 2010, Aspyr
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package uk.aspyr.stl4j;

/**
 * A tuple of five elements.
 *
 * @author Daniel Fern&aacute;ndez
 * @author Darren Bell
 */
public final class Tuple5<A,B,C,D,E> extends Tuple
        implements Item0<A>,
            Item1<B>,
            Item2<C>,
            Item3<D>,
            Item4<E> {
    
    /**
     * Create tuple with the provided values
     *
     * @param <A>   the value type
     * @param v0    the value
     * @return the tuple
     */
    public static <A,B,C,D,E> Tuple5<A,B,C,D,E> tuple5(A v0, B v1, C v2, D v3, E v4) {
        return of(v0, v1, v2, v3, v4);
    }

    /**
     * Create tuple with the provided values
     *
     * @param <A>   the value type
     * @param v0    the value
     * @return the tuple
     */
    public static <A,B,C,D,E> Tuple5<A,B,C,D,E> of(A v0, B v1, C v2, D v3, E v4) {
        return new Tuple5<>(v0, v1, v2, v3, v4);
    }

    /**
     * Create tuple from array. Array has to have exactly 5 elements.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple5<X,X,X,X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, values ->
            new Tuple5<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4]
            ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple5<X,X,X,X,X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, Tuples.FIRST_INDEX, Tuples.EXACT_SIZE,
            values -> new Tuple5<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4]
            ));
    }

    /**
     * Create tuple from input, starting from the specified startIndex. Iterable
     * can have more (or less) elements than the tuple to be created.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple5<X,X,X,X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, Tuples.INEXACT_SIZE,
            values -> new Tuple5<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4]
            ));
    }

    private static final long serialVersionUID = -1579008485383872628L;
    private static final Class<Tuple5> TYPE = Tuple5.class;
    private static final int SIZE = 5;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;

    Tuple5(
            final A v0,
            final B v1,
            final C v2,
            final D v3,
            final E v4) {
        super(v0, v1, v2, v3, v4);
        val0 = v0;
        val1 = v1;
        val2 = v2;
        val3 = v3;
        val4 = v4;
    }

    public A item0() {
        return val0;
    }

    public B item1() {
        return val1;
    }

    public C item2() {
        return val2;
    }

    public D item3() {
        return val3;
    }

    public E item4() {
        return val4;
    }

    @Override
    public int size() {
        return SIZE;
    }
    

    public <X0> Tuple6<X0,A,B,C,D,E> insertAt0(X0 v0) {
        return new Tuple6<>(v0, val0, val1, val2, val3, val4);
    }
    public <X0> Tuple6<A,X0,B,C,D,E> insertAt1(X0 v0) {
        return new Tuple6<>(val0, v0, val1, val2, val3, val4);
    }
    public <X0> Tuple6<A,B,X0,C,D,E> insertAt2(X0 v0) {
        return new Tuple6<>(val0, val1, v0, val2, val3, val4);
    }
    public <X0> Tuple6<A,B,C,X0,D,E> insertAt3(X0 v0) {
        return new Tuple6<>(val0, val1, val2, v0, val3, val4);
    }
    public <X0> Tuple6<A,B,C,D,X0,E> insertAt4(X0 v0) {
        return new Tuple6<>(val0, val1, val2, val3, v0, val4);
    }
    public <X0> Tuple6<A,B,C,D,E,X0> append(X0 v0) {
        return new Tuple6<>(val0, val1, val2, val3, val4, v0);
    }


    public <X0,X1> Tuple7<X0,X1,A,B,C,D,E> insertAt0(X0 v0, X1 v1) {
        return new Tuple7<>(v0, v1, val0, val1, val2, val3, val4);
    }
    public <X0,X1> Tuple7<A,X0,X1,B,C,D,E> insertAt1(X0 v0, X1 v1) {
        return new Tuple7<>(val0, v0, v1, val1, val2, val3, val4);
    }
    public <X0,X1> Tuple7<A,B,X0,X1,C,D,E> insertAt2(X0 v0, X1 v1) {
        return new Tuple7<>(val0, val1, v0, v1, val2, val3, val4);
    }
    public <X0,X1> Tuple7<A,B,C,X0,X1,D,E> insertAt3(X0 v0, X1 v1) {
        return new Tuple7<>(val0, val1, val2, v0, v1, val3, val4);
    }
    public <X0,X1> Tuple7<A,B,C,D,X0,X1,E> insertAt4(X0 v0, X1 v1) {
        return new Tuple7<>(val0, val1, val2, val3, v0, v1, val4);
    }
    public <X0,X1> Tuple7<A,B,C,D,E,X0,X1> append(X0 v0, X1 v1) {
        return new Tuple7<>(val0, val1, val2, val3, val4, v0, v1);
    }
    

    public <X0,X1,X2> Tuple8<X0,X1,X2,A,B,C,D,E> insertAt0(X0 v0, X1 v1, X2 v2) {
        return new Tuple8<>(v0, v1, v2, val0, val1, val2, val3, val4);
    }
    public <X0,X1,X2> Tuple8<A,X0,X1,X2,B,C,D,E> insertAt1(X0 v0, X1 v1, X2 v2) {
        return new Tuple8<>(val0, v0, v1, v2, val1, val2, val3, val4);
    }
    public <X0,X1,X2> Tuple8<A,B,X0,X1,X2,C,D,E> insertAt2(X0 v0, X1 v1, X2 v2) {
        return new Tuple8<>(val0, val1, v0, v1, v2, val2, val3, val4);
    }
    public <X0,X1,X2> Tuple8<A,B,C,X0,X1,X2,D,E> insertAt3(X0 v0, X1 v1, X2 v2) {
        return new Tuple8<>(
            val0, val1, val2, v0, v1, v2, val3, val4);
    }
    public <X0,X1,X2> Tuple8<A,B,C,D,X0,X1,X2,E> insertAt4(X0 v0, X1 v1, X2 v2) {
        return new Tuple8<>(val0, val1, val2, val3, v0, v1, v2, val4);
    }
    public <X0,X1,X2> Tuple8<A,B,C,D,E,X0,X1,X2> append(X0 v0, X1 v1, X2 v2) {
        return new Tuple8<>(val0, val1, val2, val3, val4, v0, v1, v2);
    }
    

    public <X0,X1,X2,X3> Tuple9<X0,X1,X2,X3,A,B,C,D,E> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple9<>(v0, v1, v2, v3, val0, val1, val2, val3, val4);
    }
    public <X0,X1,X2,X3> Tuple9<A,X0,X1,X2,X3,B,C,D,E> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple9<>(val0, v0, v1, v2, v3, val1, val2, val3, val4);
    }
    public <X0,X1,X2,X3> Tuple9<A,B,X0,X1,X2,X3,C,D,E> insertAt2(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple9<>(val0, val1, v0, v1, v2, v3, val2, val3, val4);
    }
    public <X0,X1,X2,X3> Tuple9<A,B,C,X0,X1,X2,X3,D,E> insertAt3(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple9<>(val0, val1, val2, v0, v1, v2, v3, val3, val4);
    }
    public <X0,X1,X2,X3> Tuple9<A,B,C,D,X0,X1,X2,X3,E> insertAt4(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple9<>(val0, val1, val2, val3, v0, v1, v2, v3, val4);
    }
    public <X0,X1,X2,X3> Tuple9<A,B,C,D,E,X0,X1,X2,X3> append(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple9<>(val0, val1, val2, val3, val4, v0, v1, v2, v3);
    }


    public <X0,X1,X2,X3,X4> Tuple10<X0,X1,X2,X3,X4,A,B,C,D,E> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple10<>(v0, v1, v2, v3, v4, val0, val1, val2, val3, val4);
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,X0,X1,X2,X3,X4,B,C,D,E> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple10<>(val0, v0, v1, v2, v3, v4, val1, val2, val3, val4);
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,X0,X1,X2,X3,X4,C,D,E> insertAt2(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple10<>(val0, val1, v0, v1, v2, v3, v4, val2, val3, val4);
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,C,X0,X1,X2,X3,X4,D,E> insertAt3(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple10<>(val0, val1, val2, v0, v1, v2, v3, v4, val3, val4);
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,C,D,X0,X1,X2,X3,X4,E> insertAt4(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple10<>(val0, val1, val2, val3, v0, v1, v2, v3, v4, val4);
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,C,D,E,X0,X1,X2,X3,X4> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple10<>(val0, val1, val2, val3, val4, v0, v1, v2, v3, v4);
    }


    public <X0> Tuple6<X0,A,B,C,D,E> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple6<A,X0,B,C,D,E> insertAt1(Tuple1<X0> tuple) {
        return insertAt1(tuple.item0());
    }
    public <X0> Tuple6<A,B,X0,C,D,E> insertAt2(Tuple1<X0> tuple) {
        return insertAt2(tuple.item0());
    }
    public <X0> Tuple6<A,B,C,X0,D,E> insertAt3(Tuple1<X0> tuple) {
        return insertAt3(tuple.item0());
    }
    public <X0> Tuple6<A,B,C,D,X0,E> insertAt4(Tuple1<X0> tuple) {
        return insertAt4(tuple.item0());
    }
    public <X0> Tuple6<A,B,C,D,E,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }
    

    public <X0,X1> Tuple7<X0,X1,A,B,C,D,E> insertAt0(Tuple2<X0,X1> tuple) {
        return insertAt0(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple7<A,X0,X1,B,C,D,E> insertAt1(Tuple2<X0,X1> tuple) {
        return insertAt1(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple7<A,B,X0,X1,C,D,E> insertAt2(Tuple2<X0,X1> tuple) {
        return insertAt2(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple7<A,B,C,X0,X1,D,E> insertAt3(Tuple2<X0,X1> tuple) {
        return insertAt3(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple7<A,B,C,D,X0,X1,E> insertAt4(Tuple2<X0,X1> tuple) {
        return insertAt4(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple7<A,B,C,D,E,X0,X1> append(Tuple2<X0,X1> tuple) {
        return append(tuple.item0(),tuple.item1());
    }


    public <X0,X1,X2> Tuple8<X0,X1,X2,A,B,C,D,E> insertAt0(Tuple3<X0,X1,X2> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple8<A,X0,X1,X2,B,C,D,E> insertAt1(Tuple3<X0,X1,X2> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple8<A,B,X0,X1,X2,C,D,E> insertAt2(Tuple3<X0,X1,X2> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple8<A,B,C,X0,X1,X2,D,E> insertAt3(Tuple3<X0,X1,X2> tuple) {
        return insertAt3(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple8<A,B,C,D,X0,X1,X2,E> insertAt4(Tuple3<X0,X1,X2> tuple) {
        return insertAt4(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple8<A,B,C,D,E,X0,X1,X2> append(Tuple3<X0,X1,X2> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2());
    }
    

    public <X0,X1,X2,X3> Tuple9<X0,X1,X2,X3,A,B,C,D,E> insertAt0(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple9<A,X0,X1,X2,X3,B,C,D,E> insertAt1(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple9<A,B,X0,X1,X2,X3,C,D,E> insertAt2(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple9<A,B,C,X0,X1,X2,X3,D,E> insertAt3(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt3(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple9<A,B,C,D,X0,X1,X2,X3,E> insertAt4(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt4(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple9<A,B,C,D,E,X0,X1,X2,X3> append(Tuple4<X0,X1,X2,X3> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }


    public <X0,X1,X2,X3,X4> Tuple10<X0,X1,X2,X3,X4,A,B,C,D,E> insertAt0(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,X0,X1,X2,X3,X4,B,C,D,E> insertAt1(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,X0,X1,X2,X3,X4,C,D,E> insertAt2(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,C,X0,X1,X2,X3,X4,D,E> insertAt3(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt3(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,C,D,X0,X1,X2,X3,X4,E> insertAt4(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt4(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple10<A,B,C,D,E,X0,X1,X2,X3,X4> append(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }


    public <X> Tuple5<X,B,C,D,E> set0(X value) {
        return new Tuple5<>(value, val1, val2, val3, val4);
    }
    public <X> Tuple5<A,X,C,D,E> set1(X value) {
        return new Tuple5<>(val0, value, val2, val3, val4);
    }
    public <X> Tuple5<A,B,X,D,E> set2(X value) {
        return new Tuple5<>(val0, val1, value, val3, val4);
    }
    public <X> Tuple5<A,B,C,X,E> set3(X value) {
        return new Tuple5<>(val0, val1, val2, value, val4);
    }
    public <X> Tuple5<A,B,C,D,X> set4(X value) {
        return new Tuple5<>(val0, val1, val2, val3, value);
    }
    

    public Tuple4<B,C,D,E> remove0() {
        return new Tuple4<>(val1, val2, val3, val4);
    }
    public Tuple4<A,C,D,E> remove1() {
        return new Tuple4<>(val0, val2, val3, val4);
    }
    public Tuple4<A,B,D,E> remove2() {
        return new Tuple4<>(val0, val1, val3, val4);
    }
    public Tuple4<A,B,C,E> remove3() {
        return new Tuple4<>(val0, val1, val2, val4);
    }
    public Tuple4<A,B,C,D> remove4() {
        return new Tuple4<>(val0, val1, val2, val3);
    }

}
