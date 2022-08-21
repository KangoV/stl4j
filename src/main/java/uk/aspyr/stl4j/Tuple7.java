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
 * A tuple of seven elements.
 *
 * @author Daniel Fern&aacute;ndez
 * @author Darren Bell
 */
public final class Tuple7<A,B,C,D,E,F,G>
        extends Tuple
        implements Item0<A>, Item1<B>, Item2<C>, Item3<D>, Item4<E>, Item5<F>, Item6<G> {

    /**
     * Create tuple with the provided value
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G> Tuple7<A,B,C,D,E,F,G> tuple7(A v0, B v1, C v2, D v3, E v4, F v5, G v6) {
        return new Tuple7<>(v0, v1, v2, v3, v4, v5, v6);
    }

    /**
     * Create tuple with the provided value
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G> Tuple7<A,B,C,D,E,F,G> of(A v0, B v1, C v2, D v3, E v4, F v5, G v6) {
        return new Tuple7<>(v0, v1, v2, v3, v4, v5, v6);
    }

    /**
     * Create tuple from array. Array has to have exactly 7 elements.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple7<X,X,X,X,X,X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, () ->
            new Tuple7<>(
                input[0],
                input[1],
                input[2],
                input[3],
                input[4],
                input[5],
                input[6]
            ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple7<X,X,X,X,X,X,X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, Tuples.FIRST_INDEX, Tuples.EXACT_SIZE,
            values -> new Tuple7<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6]
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
    public static <X> Tuple7<X,X,X,X,X,X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, Tuples.INEXACT_SIZE,
            values -> new Tuple7<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6]
                ));
    }


    private static final long serialVersionUID = -2133846648934305169L;
    private static final Class<Tuple7> TYPE = Tuple7.class;
    private static final int SIZE = 7;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;

    Tuple7(
            final A v0,
            final B v1,
            final C v2,
            final D v3,
            final E v4,
            final F v5,
            final G v6) {
        super(v0, v1, v2, v3, v4, v5, v6);
        val0 = v0;
        val1 = v1;
        val2 = v2;
        val3 = v3;
        val4 = v4;
        val5 = v5;
        val6 = v6;
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

    public F item5() {
        return val5;
    }

    public G item6() {
        return val6;
    }
    

    public <X0> Tuple8<X0,A,B,C,D,E,F,G> insertAt0(X0 v0) {
        return new Tuple8<>(v0, val0, val1, val2, val3, val4, val5, val6);
    }
    public <X0> Tuple8<A,X0,B,C,D,E,F,G> insertAt1(X0 v0) {
        return new Tuple8<>(val0, v0, val1, val2, val3, val4, val5, val6);
    }
    public <X0> Tuple8<A,B,X0,C,D,E,F,G> insertAt2(X0 v0) {
        return new Tuple8<>(val0, val1, v0, val2, val3, val4, val5, val6);
    }
    public <X0> Tuple8<A,B,C,X0,D,E,F,G> insertAt3(X0 v0) {
        return new Tuple8<>(val0, val1, val2, v0, val3, val4, val5, val6);
    }
    public <X0> Tuple8<A,B,C,D,X0,E,F,G> insertAt4(X0 v0) {
        return new Tuple8<>(val0, val1, val2, val3, v0, val4, val5, val6);
    }
    public <X0> Tuple8<A,B,C,D,E,X0,F,G> insertAt5(X0 v0) {
        return new Tuple8<>(val0, val1, val2, val3, val4, v0, val5, val6);
    }
    public <X0> Tuple8<A,B,C,D,E,F,X0,G> insertAt6(X0 v0) {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, v0, val6);
    }
    public <X0> Tuple8<A,B,C,D,E,F,G,X0> append(X0 v0) {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, val6, v0);
    }

    

    public <X0,X1> Tuple9<X0,X1,A,B,C,D,E,F,G> insertAt0(X0 v0, X1 v1) {
        return new Tuple9<>(v0, v1, val0, val1, val2, val3, val4, val5, val6);
    }
    public <X0,X1> Tuple9<A,X0,X1,B,C,D,E,F,G> insertAt1(X0 v0, X1 v1) {
        return new Tuple9<>(val0, v0, v1, val1, val2, val3, val4, val5, val6);
    }
    public <X0,X1> Tuple9<A,B,X0,X1,C,D,E,F,G> insertAt2(X0 v0, X1 v1) {
        return new Tuple9<>(val0, val1, v0, v1, val2, val3, val4, val5, val6);
    }
    public <X0,X1> Tuple9<A,B,C,X0,X1,D,E,F,G> insertAt3(X0 v0, X1 v1) {
        return new Tuple9<>(val0, val1, val2, v0, v1, val3, val4, val5, val6);
    }
    public <X0,X1> Tuple9<A,B,C,D,X0,X1,E,F,G> insertAt4(X0 v0, X1 v1) {
        return new Tuple9<>(val0, val1, val2, val3, v0, v1, val4, val5, val6);
    }
    public <X0,X1> Tuple9<A,B,C,D,E,X0,X1,F,G> insertAt5(X0 v0, X1 v1) {
        return new Tuple9<>(val0, val1, val2, val3, val4, v0, v1, val5, val6);
    }
    public <X0,X1> Tuple9<A,B,C,D,E,F,X0,X1,G> insertAt6(X0 v0, X1 v1) {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, v0, v1, val6);
    }
    public <X0,X1> Tuple9<A,B,C,D,E,F,G,X0,X1> append(X0 v0, X1 v1) {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, val6, v0, v1);
    }
    


    public <X0,X1,X2> Tuple10<X0,X1,X2,A,B,C,D,E,F,G> insertAt0(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(v0, v1, v2, val0, val1, val2, val3, val4, val5, val6);
    }
    public <X0,X1,X2> Tuple10<A,X0,X1,X2,B,C,D,E,F,G> insertAt1(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(val0, v0, v1, v2, val1, val2, val3, val4, val5, val6);
    }
    public <X0,X1,X2> Tuple10<A,B,X0,X1,X2,C,D,E,F,G> insertAt2(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(val0, val1, v0, v1, v2, val2, val3, val4, val5, val6);
    }
    public <X0,X1,X2> Tuple10<A,B,C,X0,X1,X2,D,E,F,G> insertAt3(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(val0, val1, val2, v0, v1, v2, val3, val4, val5, val6);
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,X0,X1,X2,E,F,G> insertAt4(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(val0, val1, val2, val3, v0, v1, v2, val4, val5, val6);
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,E,X0,X1,X2,F,G> insertAt5(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(val0, val1, val2, val3, val4, v0, v1, v2, val5, val6);
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,E,F,X0,X1,X2,G> insertAt6(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, v0, v1, v2, val6);
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,E,F,G,X0,X1,X2> append(X0 v0, X1 v1, X2 v2) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, val6, v0, v1, v2);
    }
    
    

    public <X0> Tuple8<X0,A,B,C,D,E,F,G> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple8<A,X0,B,C,D,E,F,G> insertAt1(Tuple1<X0> tuple) {
        return insertAt1(tuple.item0());
    }
    public <X0> Tuple8<A,B,X0,C,D,E,F,G> insertAt2(Tuple1<X0> tuple) {
        return insertAt2(tuple.item0());
    }
    public <X0> Tuple8<A,B,C,X0,D,E,F,G> insertAt3(Tuple1<X0> tuple) {
        return insertAt3(tuple.item0());
    }
    public <X0> Tuple8<A,B,C,D,X0,E,F,G> insertAt4(Tuple1<X0> tuple) {
        return insertAt4(tuple.item0());
    }
    public <X0> Tuple8<A,B,C,D,E,X0,F,G> insertAt5(Tuple1<X0> tuple) {
        return insertAt5(tuple.item0());
    }
    public <X0> Tuple8<A,B,C,D,E,F,X0,G> insertAt6(Tuple1<X0> tuple) {
        return insertAt6(tuple.item0());
    }
    public <X0> Tuple8<A,B,C,D,E,F,G,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }
    

    
    public <X0,X1> Tuple9<X0,X1,A,B,C,D,E,F,G> insertAt0(Tuple2<X0,X1> tuple) {
        return insertAt0(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple9<A,X0,X1,B,C,D,E,F,G> insertAt1(Tuple2<X0,X1> tuple) {
        return insertAt1(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple9<A,B,X0,X1,C,D,E,F,G> insertAt2(Tuple2<X0,X1> tuple) {
        return insertAt2(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple9<A,B,C,X0,X1,D,E,F,G> insertAt3(Tuple2<X0,X1> tuple) {
        return insertAt3(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple9<A,B,C,D,X0,X1,E,F,G> insertAt4(Tuple2<X0,X1> tuple) {
        return insertAt4(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple9<A,B,C,D,E,X0,X1,F,G> insertAt5(Tuple2<X0,X1> tuple) {
        return insertAt5(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple9<A,B,C,D,E,F,X0,X1,G> insertAt6(Tuple2<X0,X1> tuple) {
        return insertAt6(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple9<A,B,C,D,E,F,G,X0,X1> append(Tuple2<X0,X1> tuple) {
        return append(tuple.item0(),tuple.item1());
    }

    

    public <X0,X1,X2> Tuple10<X0,X1,X2,A,B,C,D,E,F,G> insertAt0(Tuple3<X0,X1,X2> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple10<A,X0,X1,X2,B,C,D,E,F,G> insertAt1(Tuple3<X0,X1,X2> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple10<A,B,X0,X1,X2,C,D,E,F,G> insertAt2(Tuple3<X0,X1,X2> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple10<A,B,C,X0,X1,X2,D,E,F,G> insertAt3(Tuple3<X0,X1,X2> tuple) {
        return insertAt3(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,X0,X1,X2,E,F,G> insertAt4(Tuple3<X0,X1,X2> tuple) {
        return insertAt4(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,E,X0,X1,X2,F,G> insertAt5(Tuple3<X0,X1,X2> tuple) {
        return insertAt5(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,E,F,X0,X1,X2,G> insertAt6(Tuple3<X0,X1,X2> tuple) {
        return insertAt6(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple10<A,B,C,D,E,F,G,X0,X1,X2> append(Tuple3<X0,X1,X2> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2());
    }
    
    

    public <X> Tuple7<X,B,C,D,E,F,G> set0(X value) {
        return new Tuple7<>(value, val1, val2, val3, val4, val5, val6);
    }
    public <X> Tuple7<A,X,C,D,E,F,G> set1(X value) {
        return new Tuple7<>(val0, value, val2, val3, val4, val5, val6);
    }
    public <X> Tuple7<A,B,X,D,E,F,G> set2(X value) {
        return new Tuple7<>(val0, val1, value, val3, val4, val5, val6);
    }
    public <X> Tuple7<A,B,C,X,E,F,G> set3(X value) {
        return new Tuple7<>(val0, val1, val2, value, val4, val5, val6);
    }
    public <X> Tuple7<A,B,C,D,X,F,G> set4(X value) {
        return new Tuple7<>(val0, val1, val2, val3, value, val5, val6);
    }
    public <X> Tuple7<A,B,C,D,E,X,G> set5(X value) {
        return new Tuple7<>(val0, val1, val2, val3, val4, value, val6);
    }
    public <X> Tuple7<A,B,C,D,E,F,X> set6(X value) {
        return new Tuple7<>(val0, val1, val2, val3, val4, val5, value);
    }
    


    public Tuple6<B,C,D,E,F,G> remove0() {
        return new Tuple6<>(val1, val2, val3, val4, val5, val6);
    }
    public Tuple6<A,C,D,E,F,G> remove1() {
        return new Tuple6<>(val0, val2, val3, val4, val5, val6);
    }
    public Tuple6<A,B,D,E,F,G> remove2() {
        return new Tuple6<>(val0, val1, val3, val4, val5, val6);
    }
    public Tuple6<A,B,C,E,F,G> remove3() {
        return new Tuple6<>(val0, val1, val2, val4, val5, val6);
    }
    public Tuple6<A,B,C,D,F,G> remove4() {
        return new Tuple6<>(val0, val1, val2, val3, val5, val6);
    }
    public Tuple6<A,B,C,D,E,G> remove5() {
        return new Tuple6<>(val0, val1, val2, val3, val4, val6);
    }
    public Tuple6<A,B,C,D,E,F> remove6() {
        return new Tuple6<>(val0, val1, val2, val3, val4, val5);
    }

}
