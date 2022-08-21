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
 * A tuple of ten elements.
 *
 * @author Daniel Fern&aacute;ndez
 * @author Darren Bell
 */
public final class Tuple10<A,B,C,D,E,F,G,H,I,J>
        extends Tuple
        implements Item0<A>,
    Item1<B>,
    Item2<C>,
    Item3<D>,
    Item4<E>,
            Item5<F>,
            Item6<G>,
            Item7<H>,
            Item8<I>,
            Item9<J> {

    /**
     * Create tuple with the provided values
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G,H,I,J> Tuple10<A,B,C,D,E,F,G,H,I,J> tuple10(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8, J v9) {
        return of(v0, v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    /**
     * Create tuple with the provided values
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A,B,C,D,E,F,G,H,I,J> Tuple10<A,B,C,D,E,F,G,H,I,J> of(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8, J v9) {
        return new Tuple10<>(v0, v1, v2, v3, v4, v5, v6, v7, v8, v9);
    }

    /**
     * Create tuple from array. Array has to have exactly 9 elements.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple10<X,X,X,X,X,X,X,X,X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, () ->
            new Tuple10<>(
                input[0],
                input[1],
                input[2],
                input[3],
                input[4],
                input[5],
                input[6],
                input[7],
                input[8],
                input[9]
            ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple10<X,X,X,X,X,X,X,X,X,X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, Tuples.FIRST_INDEX, Tuples.EXACT_SIZE,
            values -> new Tuple10<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6],
                values[7],
                values[8],
                values[9]
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
    public static <X> Tuple10<X,X,X,X,X,X,X,X,X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, Tuples.INEXACT_SIZE,
            values -> new Tuple10<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5],
                values[6],
                values[7],
                values[8],
                values[9]
            ));
    }

    private static final long serialVersionUID = -1607420937567707033L;
    private static final Class<Tuple10> TYPE = Tuple10.class;
    private static final int SIZE = 10;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;
    private final G val6;
    private final H val7;
    private final I val8;
    private final J val9;

    public Tuple10(A v0, B v1, C v2, D v3, E v4, F v5, G v6, H v7, I v8, J v9) {
        super(v0, v1, v2, v3, v4, v5, v6, v7, v8, v9);
        val0 = v0;
        val1 = v1;
        val2 = v2;
        val3 = v3;
        val4 = v4;
        val5 = v5;
        val6 = v6;
        val7 = v7;
        val8 = v8;
        val9 = v9;
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

    public J item9() {
        return val9;
    }

    @Override
    public int size() {
        return SIZE;
    }
    


    public <X> Tuple10<X,B,C,D,E,F,G,H,I,J> set0(X value) {
        return new Tuple10<>(value, val1, val2, val3, val4, val5, val6, val7, val8, val9);
    }
    public <X> Tuple10<A,X,C,D,E,F,G,H,I,J> set1(X value) {
        return new Tuple10<>(val0, value, val2, val3, val4, val5, val6, val7, val8, val9);
    }
    public <X> Tuple10<A,B,X,D,E,F,G,H,I,J> set2(X value) {
        return new Tuple10<>(val0, val1, value, val3, val4, val5, val6, val7, val8, val9);
    }
    public <X> Tuple10<A,B,C,X,E,F,G,H,I,J> set3(X value) {
        return new Tuple10<>(val0, val1, val2, value, val4, val5, val6, val7, val8, val9);
    }
    public <X> Tuple10<A,B,C,D,X,F,G,H,I,J> set4(X value) {
        return new Tuple10<>(val0, val1, val2, val3, value, val5, val6, val7, val8, val9);
    }
    public <X> Tuple10<A,B,C,D,E,X,G,H,I,J> set5(X value) {
        return new Tuple10<>(val0, val1, val2, val3, val4, value, val6, val7, val8, val9);
    }
    public <X> Tuple10<A,B,C,D,E,F,X,H,I,J> set6(X value) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, value, val7, val8, val9);
    }
    public <X> Tuple10<A,B,C,D,E,F,G,X,I,J> set7(X value) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, val6, value, val8, val9);
    }
    public <X> Tuple10<A,B,C,D,E,F,G,H,X,J> set8(X value) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, val6, val7, value, val9);
    }
    public <X> Tuple10<A,B,C,D,E,F,G,H,I,X> set9(X value) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, val6, val7, val8, value);
    }
    


    public Tuple9<B,C,D,E,F,G,H,I,J> remove0() {
        return new Tuple9<>(val1, val2, val3, val4, val5, val6, val7, val8, val9);
    }
    public Tuple9<A,C,D,E,F,G,H,I,J> remove1() {
        return new Tuple9<>(val0, val2, val3, val4, val5, val6, val7, val8, val9);
    }
    public Tuple9<A,B,D,E,F,G,H,I,J> remove2() {
        return new Tuple9<>(val0, val1, val3, val4, val5, val6, val7, val8, val9);
    }
    public Tuple9<A,B,C,E,F,G,H,I,J> remove3() {
        return new Tuple9<>(val0, val1, val2, val4, val5, val6, val7, val8, val9);
    }
    public Tuple9<A,B,C,D,F,G,H,I,J> remove4() {
        return new Tuple9<>(val0, val1, val2, val3, val5, val6, val7, val8, val9);
    }
    public Tuple9<A,B,C,D,E,G,H,I,J> remove5() {
        return new Tuple9<>(val0, val1, val2, val3, val4, val6, val7, val8, val9);
    }
    public Tuple9<A,B,C,D,E,F,H,I,J> remove6() {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, val7, val8, val9);
    }
    public Tuple9<A,B,C,D,E,F,G,I,J> remove7() {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, val6, val8, val9);
    }
    public Tuple9<A,B,C,D,E,F,G,H,J> remove8() {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, val6, val7, val9);
    }
    public Tuple9<A,B,C,D,E,F,G,H,I> remove9() {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, val6, val7, val8);
    }

}
