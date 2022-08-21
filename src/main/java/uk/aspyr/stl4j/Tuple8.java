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
 * A tuple of eight elements.
 *
 * @author Daniel Fern&aacute;ndez
 * @author Darren Bell
 */
public final class Tuple8<A,B,C,D,E,F,G,H>
        extends Tuple
        implements
            Item0<A>,
            Item1<B>,
            Item2<C>,
            Item3<D>,
            Item4<E>,
            Item5<F>,
            Item6<G>,
            Item7<H> {

    /**
     * Create tuple with the provided values
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G,H> Tuple8<A,B,C,D,E,F,G,H> tuple8(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7) {
        return new Tuple8<>(v0, v1, v2, v3, v4, v5, v6, v7);
    }

    /**
     * Create tuple with the provided values
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G,H> Tuple8<A,B,C,D,E,F,G,H> of(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7) {
        return new Tuple8<>(v0, v1, v2, v3, v4, v5, v6, v7);
    }

    /**
     * Create tuple from array. Array has to have exactly 7 elements.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple8<X,X,X,X,X,X,X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, () ->
            new Tuple8<>(
                input[0],
                input[1],
                input[2],
                input[3],
                input[4],
                input[5],
                input[6],
                input[7]
            ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple8<X,X,X,X,X,X,X,X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, Tuples.FIRST_INDEX, Tuples.EXACT_SIZE,
            values -> new Tuple8<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6],
                values[7]
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
    public static <X> Tuple8<X,X,X,X,X,X,X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, Tuples.INEXACT_SIZE,
            values -> new Tuple8<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6],
                values[7]
            ));
    }

    private static final long serialVersionUID = -1187955276020306879L;
    private static final Class<Tuple8> TYPE = Tuple8.class;
    private static final int SIZE = 8;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;

    public Tuple8(
            final A v0,
            final B v1,
            final C v2,
            final D v3,
            final E v4,
            final F v5,
            final G v6,
            final H v7) {
        super(v0, v1, v2, v3, v4, v5, v6, v7);
        val0 = v0;
        val1 = v1;
        val2 = v2;
        val3 = v3;
        val4 = v4;
        val5 = v5;
        val6 = v6;
        val7 = v7;
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

    public H item7() {
        return val7;
    }



    public <X0> Tuple9<X0,A,B,C,D,E,F,G,H> insertAt0(X0 v0) {
        return new Tuple9<>(v0, val0, val1, val2, val3, val4, val5, val6, val7);
    }
    public <X0> Tuple9<A,X0,B,C,D,E,F,G,H> insertAt1(X0 v0) {
        return new Tuple9<>(val0, v0, val1, val2, val3, val4, val5, val6, val7);
    }
    public <X0> Tuple9<A,B,X0,C,D,E,F,G,H> insertAt2(X0 v0) {
        return new Tuple9<>(val0, val1, v0, val2, val3, val4, val5, val6, val7);
    }
    public <X0> Tuple9<A,B,C,X0,D,E,F,G,H> insertAt3(X0 v0) {
        return new Tuple9<>(val0, val1, val2, v0, val3, val4, val5, val6, val7);
    }
    public <X0> Tuple9<A,B,C,D,X0,E,F,G,H> insertAt4(X0 v0) {
        return new Tuple9<>(val0, val1, val2, val3, v0, val4, val5, val6, val7);
    }
    public <X0> Tuple9<A,B,C,D,E,X0,F,G,H> insertAt5(X0 v0) {
        return new Tuple9<>(val0, val1, val2, val3, val4, v0, val5, val6, val7);
    }
    public <X0> Tuple9<A,B,C,D,E,F,X0,G,H> insertAt6(X0 v0) {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, v0, val6, val7);
    }
    public <X0> Tuple9<A,B,C,D,E,F,G,X0,H> insertAt7(X0 v0) {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, val6, v0, val7);
    }
    public <X0> Tuple9<A,B,C,D,E,F,G,H,X0> append(X0 v0) {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, val6, val7, v0);
    }

    

    public <X0,X1> Tuple10<X0,X1,A,B,C,D,E,F,G,H> insertAt0(X0 v0, X1 v1) {
        return new Tuple10<>(v0, v1, val0, val1, val2, val3, val4, val5, val6, val7);
    }
    public <X0,X1> Tuple10<A,X0,X1,B,C,D,E,F,G,H> insertAt1(X0 v0, X1 v1) {
        return new Tuple10<>(val0, v0, v1, val1, val2, val3, val4, val5, val6, val7);
    }
    public <X0,X1> Tuple10<A,B,X0,X1,C,D,E,F,G,H> insertAt2(X0 v0, X1 v1) {
        return new Tuple10<>(val0, val1, v0, v1, val2, val3, val4, val5, val6, val7);
    }
    public <X0,X1> Tuple10<A,B,C,X0,X1,D,E,F,G,H> insertAt3(X0 v0, X1 v1) {
        return new Tuple10<>(val0, val1, val2, v0, v1, val3, val4, val5, val6, val7);
    }
    public <X0,X1> Tuple10<A,B,C,D,X0,X1,E,F,G,H> insertAt4(X0 v0, X1 v1) {
        return new Tuple10<>(val0, val1, val2, val3, v0, v1, val4, val5, val6, val7);
    }
    public <X0,X1> Tuple10<A,B,C,D,E,X0,X1,F,G,H> insertAt5(X0 v0, X1 v1) {
        return new Tuple10<>(val0, val1, val2, val3, val4, v0, v1, val5, val6, val7);
    }
    public <X0,X1> Tuple10<A,B,C,D,E,F,X0,X1,G,H> insertAt6(X0 v0, X1 v1) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, v0, v1, val6, val7);
    }
    public <X0,X1> Tuple10<A,B,C,D,E,F,G,X0,X1,H> insertAt7(X0 v0, X1 v1) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, val6, v0, v1, val7);
    }
    public <X0,X1> Tuple10<A,B,C,D,E,F,G,H,X0,X1> append(X0 v0, X1 v1) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, val6, val7, v0, v1);
    }
    
    

    public <X0> Tuple9<X0,A,B,C,D,E,F,G,H> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple9<A,X0,B,C,D,E,F,G,H> insertAt1(Tuple1<X0> tuple) {
        return insertAt1(tuple.item0());
    }
    public <X0> Tuple9<A,B,X0,C,D,E,F,G,H> insertAt2(Tuple1<X0> tuple) {
        return insertAt2(tuple.item0());
    }
    public <X0> Tuple9<A,B,C,X0,D,E,F,G,H> insertAt3(Tuple1<X0> tuple) {
        return insertAt3(tuple.item0());
    }
    public <X0> Tuple9<A,B,C,D,X0,E,F,G,H> insertAt4(Tuple1<X0> tuple) {
        return insertAt4(tuple.item0());
    }
    public <X0> Tuple9<A,B,C,D,E,X0,F,G,H> insertAt5(Tuple1<X0> tuple) {
        return insertAt5(tuple.item0());
    }
    public <X0> Tuple9<A,B,C,D,E,F,X0,G,H> insertAt6(Tuple1<X0> tuple) {
        return insertAt6(tuple.item0());
    }
    public <X0> Tuple9<A,B,C,D,E,F,G,X0,H> insertAt7(Tuple1<X0> tuple) {
        return insertAt7(tuple.item0());
    }
    public <X0> Tuple9<A,B,C,D,E,F,G,H,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }
    


    public <X0,X1> Tuple10<X0,X1,A,B,C,D,E,F,G,H> insertAt0(Tuple2<X0,X1> tuple) {
        return insertAt0(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,X0,X1,B,C,D,E,F,G,H> insertAt1(Tuple2<X0,X1> tuple) {
        return insertAt1(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,B,X0,X1,C,D,E,F,G,H> insertAt2(Tuple2<X0,X1> tuple) {
        return insertAt2(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,B,C,X0,X1,D,E,F,G,H> insertAt3(Tuple2<X0,X1> tuple) {
        return insertAt3(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,B,C,D,X0,X1,E,F,G,H> insertAt4(Tuple2<X0,X1> tuple) {
        return insertAt4(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,B,C,D,E,X0,X1,F,G,H> insertAt5(Tuple2<X0,X1> tuple) {
        return insertAt5(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,B,C,D,E,F,X0,X1,G,H> insertAt6(Tuple2<X0,X1> tuple) {
        return insertAt6(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,B,C,D,E,F,G,X0,X1,H> insertAt7(Tuple2<X0,X1> tuple) {
        return insertAt7(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple10<A,B,C,D,E,F,G,H,X0,X1> append(Tuple2<X0,X1> tuple) {
        return append(tuple.item0(),tuple.item1());
    }



    public <X> Tuple8<X,B,C,D,E,F,G,H> set0(X value) {
        return new Tuple8<>(value, val1, val2, val3, val4, val5, val6, val7);
    }
    public <X> Tuple8<A,X,C,D,E,F,G,H> set1(X value) {
        return new Tuple8<>(val0, value, val2, val3, val4, val5, val6, val7);
    }
    public <X> Tuple8<A,B,X,D,E,F,G,H> set2(X value) {
        return new Tuple8<>(val0, val1, value, val3, val4, val5, val6, val7);
    }
    public <X> Tuple8<A,B,C,X,E,F,G,H> set3(X value) {
        return new Tuple8<>(val0, val1, val2, value, val4, val5, val6, val7);
    }
    public <X> Tuple8<A,B,C,D,X,F,G,H> set4(X value) {
        return new Tuple8<>(val0, val1, val2, val3, value, val5, val6, val7);
    }
    public <X> Tuple8<A,B,C,D,E,X,G,H> set5(X value) {
        return new Tuple8<>(val0, val1, val2, val3, val4, value, val6, val7);
    }
    public <X> Tuple8<A,B,C,D,E,F,X,H> set6(X value) {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, value, val7);
    }
    public <X> Tuple8<A,B,C,D,E,F,G,X> set7(X value) {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, val6, value);
    }
    

    
    public Tuple7<B,C,D,E,F,G,H> remove0() {
        return new Tuple7<>(val1, val2, val3, val4, val5, val6, val7);
    }
    public Tuple7<A,C,D,E,F,G,H> remove1() {
        return new Tuple7<>(val0, val2, val3, val4, val5, val6, val7);
    }
    public Tuple7<A,B,D,E,F,G,H> remove2() {
        return new Tuple7<>(val0, val1, val3, val4, val5, val6, val7);
    }
    public Tuple7<A,B,C,E,F,G,H> remove3() {
        return new Tuple7<>(val0, val1, val2, val4, val5, val6, val7);
    }
    public Tuple7<A,B,C,D,F,G,H> remove4() {
        return new Tuple7<>(val0, val1, val2, val3, val5, val6, val7);
    }
    public Tuple7<A,B,C,D,E,G,H> remove5() {
        return new Tuple7<>(val0, val1, val2, val3, val4, val6, val7);
    }
    public Tuple7<A,B,C,D,E,F,H> remove6() {
        return new Tuple7<>(val0, val1, val2, val3, val4, val5, val7);
    }
    public Tuple7<A,B,C,D,E,F,G> remove7() {
        return new Tuple7<>(val0, val1, val2, val3, val4, val5, val6);
    }

}
