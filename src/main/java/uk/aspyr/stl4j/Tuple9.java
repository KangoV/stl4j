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
 * A tuple of nine elements.
 *
 * @author Daniel Fern&aacute;ndez
 * @author Darren Bell
 */
public final class Tuple9<A,B,C,D,E,F,G,H,I>
        extends Tuple
        implements Item0<A>,
    Item1<B>,
    Item2<C>,
    Item3<D>,
    Item4<E>,
            Item5<F>,
            Item6<G>,
            Item7<H>,
            Item8<I> {

    /**
     * Create tuple with the provided values
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G,H,I> Tuple9<A,B,C,D,E,F,G,H,I> tuple9(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8) {
        return new Tuple9<>(v0, v1, v2, v3, v4, v5, v6, v7, v8);
    }

    /**
     * Create tuple with the provided values
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G,H,I> Tuple9<A,B,C,D,E,F,G,H,I> of(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8) {
        return new Tuple9<>(v0, v1, v2, v3, v4, v5, v6, v7, v8);
    }

    /**
     * Create tuple from array. Array has to have exactly 9 elements.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple9<X,X,X,X,X,X,X,X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, () ->
            new Tuple9<>(
                input[0],
                input[1],
                input[2],
                input[3],
                input[4],
                input[5],
                input[6],
                input[7],
                input[8]
            ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple9<X,X,X,X,X,X,X,X,X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, Tuples.FIRST_INDEX, Tuples.EXACT_SIZE,
            values -> new Tuple9<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6],
                values[7],
                values[8]
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
    public static <X> Tuple9<X,X,X,X,X,X,X,X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, Tuples.INEXACT_SIZE,
            values -> new Tuple9<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6],
                values[7],
                values[8]
            ));
    }

    private static final long serialVersionUID = -4782141390960730966L;
    private static final Class<Tuple9> TYPE = Tuple9.class;
    private static final int SIZE = 9;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;
    private final I val8;

    public Tuple9(
            final A v0,
            final B v1,
            final C v2,
            final D v3,
            final E v4,
            final F v5,
            final G v6,
            final H v7,
            final I v8) {
        super(v0, v1, v2, v3, v4, v5, v6, v7, v8);
        val0 = v0;
        val1 = v1;
        val2 = v2;
        val3 = v3;
        val4 = v4;
        val5 = v5;
        val6 = v6;
        val7 = v7;
        val8 = v8;
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

    public I item8() {
        return val8;
    }

    @Override
    public int size() {
        return SIZE;
    }

    

    public <X0> Tuple10<X0,A,B,C,D,E,F,G,H,I> insertAt0(X0 v0) {
        return new Tuple10<X0,A,B,C,D,E,F,G,H,I>(v0, val0, val1, val2, val3, val4, val5, val6, val7, val8);
    }
    public <X0> Tuple10<A,X0,B,C,D,E,F,G,H,I> insertAt1(X0 v0) {
        return new Tuple10<A,X0,B,C,D,E,F,G,H,I>(val0, v0, val1, val2, val3, val4, val5, val6, val7, val8);
    }
    public <X0> Tuple10<A,B,X0,C,D,E,F,G,H,I> insertAt2(X0 v0) {
        return new Tuple10<A,B,X0,C,D,E,F,G,H,I>(val0, val1, v0, val2, val3, val4, val5, val6, val7, val8);
    }
    public <X0> Tuple10<A,B,C,X0,D,E,F,G,H,I> insertAt3(X0 v0) {
        return new Tuple10<A,B,C,X0,D,E,F,G,H,I>(val0, val1, val2, v0, val3, val4, val5, val6, val7, val8);
    }
    public <X0> Tuple10<A,B,C,D,X0,E,F,G,H,I> insertAt4(X0 v0) {
        return new Tuple10<A,B,C,D,X0,E,F,G,H,I>(val0, val1, val2, val3, v0, val4, val5, val6, val7, val8);
    }
    public <X0> Tuple10<A,B,C,D,E,X0,F,G,H,I> insertAt5(X0 v0) {
        return new Tuple10<A,B,C,D,E,X0,F,G,H,I>(val0, val1, val2, val3, val4, v0, val5, val6, val7, val8);
    }
    public <X0> Tuple10<A,B,C,D,E,F,X0,G,H,I> insertAt6(X0 v0) {
        return new Tuple10<A,B,C,D,E,F,X0,G,H,I>(val0, val1, val2, val3, val4, val5, v0, val6, val7, val8);
    }
    public <X0> Tuple10<A,B,C,D,E,F,G,X0,H,I> insertAt7(X0 v0) {
        return new Tuple10<A,B,C,D,E,F,G,X0,H,I>(val0, val1, val2, val3, val4, val5, val6, v0, val7, val8);
    }
    public <X0> Tuple10<A,B,C,D,E,F,G,H,X0,I> insertAt8(X0 v0) {
        return new Tuple10<A,B,C,D,E,F,G,H,X0,I>(val0, val1, val2, val3, val4, val5, val6, val7, v0, val8);
    }
    public <X0> Tuple10<A,B,C,D,E,F,G,H,I,X0> append(X0 v0) {
        return new Tuple10<A,B,C,D,E,F,G,H,I,X0>(val0, val1, val2, val3, val4, val5, val6, val7, val8, v0);
    }

    
    
    public <X0> Tuple10<X0,A,B,C,D,E,F,G,H,I> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple10<A,X0,B,C,D,E,F,G,H,I> insertAt1(Tuple1<X0> tuple) {
        return insertAt1(tuple.item0());
    }
    public <X0> Tuple10<A,B,X0,C,D,E,F,G,H,I> insertAt2(Tuple1<X0> tuple) {
        return insertAt2(tuple.item0());
    }
    public <X0> Tuple10<A,B,C,X0,D,E,F,G,H,I> insertAt3(Tuple1<X0> tuple) {
        return insertAt3(tuple.item0());
    }
    public <X0> Tuple10<A,B,C,D,X0,E,F,G,H,I> insertAt4(Tuple1<X0> tuple) {
        return insertAt4(tuple.item0());
    }
    public <X0> Tuple10<A,B,C,D,E,X0,F,G,H,I> insertAt5(Tuple1<X0> tuple) {
        return insertAt5(tuple.item0());
    }
    public <X0> Tuple10<A,B,C,D,E,F,X0,G,H,I> insertAt6(Tuple1<X0> tuple) {
        return insertAt6(tuple.item0());
    }
    public <X0> Tuple10<A,B,C,D,E,F,G,X0,H,I> insertAt7(Tuple1<X0> tuple) {
        return insertAt7(tuple.item0());
    }
    public <X0> Tuple10<A,B,C,D,E,F,G,H,X0,I> insertAt8(Tuple1<X0> tuple) {
        return insertAt8(tuple.item0());
    }
    public <X0> Tuple10<A,B,C,D,E,F,G,H,I,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }
    


    public <X> Tuple9<X,B,C,D,E,F,G,H,I> set0(X value) {
        return new Tuple9<X,B,C,D,E,F,G,H,I>(value, val1, val2, val3, val4, val5, val6, val7, val8);
    }
    public <X> Tuple9<A,X,C,D,E,F,G,H,I> set1(X value) {
        return new Tuple9<A,X,C,D,E,F,G,H,I>(val0, value, val2, val3, val4, val5, val6, val7, val8);
    }
    public <X> Tuple9<A,B,X,D,E,F,G,H,I> set2(X value) {
        return new Tuple9<A,B,X,D,E,F,G,H,I>(val0, val1, value, val3, val4, val5, val6, val7, val8);
    }
    public <X> Tuple9<A,B,C,X,E,F,G,H,I> set3(X value) {
        return new Tuple9<A,B,C,X,E,F,G,H,I>(val0, val1, val2, value, val4, val5, val6, val7, val8);
    }
    public <X> Tuple9<A,B,C,D,X,F,G,H,I> set4(X value) {
        return new Tuple9<A,B,C,D,X,F,G,H,I>(val0, val1, val2, val3, value, val5, val6, val7, val8);
    }
    public <X> Tuple9<A,B,C,D,E,X,G,H,I> set5(X value) {
        return new Tuple9<A,B,C,D,E,X,G,H,I>(val0, val1, val2, val3, val4, value, val6, val7, val8);
    }
    public <X> Tuple9<A,B,C,D,E,F,X,H,I> set6(X value) {
        return new Tuple9<A,B,C,D,E,F,X,H,I>(val0, val1, val2, val3, val4, val5, value, val7, val8);
    }
    public <X> Tuple9<A,B,C,D,E,F,G,X,I> set7(X value) {
        return new Tuple9<A,B,C,D,E,F,G,X,I>(val0, val1, val2, val3, val4, val5, val6, value, val8);
    }
    public <X> Tuple9<A,B,C,D,E,F,G,H,X> set8(X value) {
        return new Tuple9<A,B,C,D,E,F,G,H,X>(val0, val1, val2, val3, val4, val5, val6, val7, value);
    }
    


    public Tuple8<B,C,D,E,F,G,H,I> remove0() {
        return new Tuple8<>(val1, val2, val3, val4, val5, val6, val7, val8);
    }
    public Tuple8<A,C,D,E,F,G,H,I> remove1() {
        return new Tuple8<>(val0, val2, val3, val4, val5, val6, val7, val8);
    }
    public Tuple8<A,B,D,E,F,G,H,I> remove2() {
        return new Tuple8<>(val0, val1, val3, val4, val5, val6, val7, val8);
    }
    public Tuple8<A,B,C,E,F,G,H,I> remove3() {
        return new Tuple8<>(val0, val1, val2, val4, val5, val6, val7, val8);
    }
    public Tuple8<A,B,C,D,F,G,H,I> remove4() {
        return new Tuple8<>(val0, val1, val2, val3, val5, val6, val7, val8);
    }
    public Tuple8<A,B,C,D,E,G,H,I> remove5() {
        return new Tuple8<>(val0, val1, val2, val3, val4, val6, val7, val8);
    }
    public Tuple8<A,B,C,D,E,F,H,I> remove6() {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, val7, val8);
    }
    public Tuple8<A,B,C,D,E,F,G,I> remove7() {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, val6, val8);
    }
    public Tuple8<A,B,C,D,E,F,G,H> remove8() {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, val6, val7);
    }

}
