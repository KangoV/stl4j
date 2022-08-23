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
 * A tuple of six elements.
 *
 * @author Daniel Fern&aacute;ndez
 * @author Darren Bell
 */
public final class Tuple6<A,B,C,D,E,F>
        extends Tuple
        implements
            Item1<B>,
            Item3<D>,
            Item4<E>,
            Item5<F> {

    /**
     * Create tuple with the provided value
     *
     * @param <A>   the value type
     * @param v0    the value
     * @return the tuple
     */
    public static <A,B,C,D,E,F> Tuple6<A,B,C,D,E,F> tuple6(A v0, B v1, C v2, D v3, E v4, F v5) {
        return new Tuple6<A,B,C,D,E,F>(v0,v1,v2,v3,v4,v5);
    }

    /**
     * Create tuple with the provided value
     *
     * @param <A>   the value type
     * @param v0    the value
     * @return the tuple
     */
    public static <A,B,C,D,E,F> Tuple6<A,B,C,D,E,F> of(A v0, B v1, C v2, D v3, E v4, F v5) {
        return new Tuple6<A,B,C,D,E,F>(v0,v1,v2,v3,v4,v5);
    }

    /**
     * Create tuple from array. Array has to have exactly 6 elements.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple6<X,X,X,X,X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, values ->
            new Tuple6<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5]
            ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple6<X,X,X,X,X,X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, Tuples.FIRST_INDEX, Tuples.EXACT_SIZE,
            values -> new Tuple6<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5]
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
    public static <X> Tuple6<X,X,X,X,X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, Tuples.INEXACT_SIZE,
            values -> new Tuple6<>(
                values[0],
                values[1],
                values[2],
                values[3],
                values[4],
                values[5]
            ));
    }

    private static final long serialVersionUID = -367678052827219823L;
    private static final Class<Tuple6> TYPE = Tuple6.class;
    private static final int SIZE = 6;

    private final A val0;
    private final B val1;
    private final C val2;
    private final D val3;
    private final E val4;
    private final F val5;

    Tuple6(
            final A v0,
            final B v1,
            final C v2,
            final D v3,
            final E v4,
            final F v5) {
        super(v0, v1, v2, v3, v4, v5);
        val0 = v0;
        val1 = v1;
        val2 = v2;
        val3 = v3;
        val4 = v4;
        val5 = v5;
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
    
    @Override
    public int size() {
        return SIZE;
    }
    
    
    
    public <X0> Tuple7<X0,A,B,C,D,E,F> insertAt0(X0 v0) {
        return new Tuple7<>(v0, val0, val1, val2, val3, val4, val5);
    }
    public <X0> Tuple7<A,X0,B,C,D,E,F> insertAt1(X0 v0) {
        return new Tuple7<A,X0,B,C,D,E,F>(val0, v0, val1, val2, val3, val4, val5);
    }
    public <X0> Tuple7<A,B,X0,C,D,E,F> insertAt2(X0 v0) {
        return new Tuple7<>(val0, val1, v0, val2, val3, val4, val5);
    }
    public <X0> Tuple7<A,B,C,X0,D,E,F> insertAt3(X0 v0) {
        return new Tuple7<>(val0, val1, val2, v0, val3, val4, val5);
    }
    public <X0> Tuple7<A,B,C,D,X0,E,F> insertAt4(X0 v0) {
        return new Tuple7<>(val0, val1, val2, val3, v0, val4, val5);
    }
    public <X0> Tuple7<A,B,C,D,E,X0,F> insertAt5(X0 v0) {
        return new Tuple7<>(val0, val1, val2, val3, val4, v0, val5);
    }
    public <X0> Tuple7<A,B,C,D,E,F,X0> append(X0 v0) {
        return new Tuple7<>(val0, val1, val2, val3, val4, val5, v0);
    }

    
    
    public <X0,X1> Tuple8<X0,X1,A,B,C,D,E,F> insertAt0(X0 v0, X1 v1) {
        return new Tuple8<>(v0, v1, val0, val1, val2, val3, val4, val5);
    }
    public <X0,X1> Tuple8<A,X0,X1,B,C,D,E,F> insertAt1(X0 v0, X1 v1) {
        return new Tuple8<>(val0, v0, v1, val1, val2, val3, val4, val5);
    }
    public <X0,X1> Tuple8<A,B,X0,X1,C,D,E,F> insertAt2(X0 v0, X1 v1) {
        return new Tuple8<>(val0, val1, v0, v1, val2, val3, val4, val5);
    }
    public <X0,X1> Tuple8<A,B,C,X0,X1,D,E,F> insertAt3(X0 v0, X1 v1) {
        return new Tuple8<>(val0, val1, val2, v0, v1, val3, val4, val5);
    }
    public <X0,X1> Tuple8<A,B,C,D,X0,X1,E,F> insertAt4(X0 v0, X1 v1) {
        return new Tuple8<>(val0, val1, val2, val3, v0, v1, val4, val5);
    }
    public <X0,X1> Tuple8<A,B,C,D,E,X0,X1,F> insertAt5(X0 v0, X1 v1) {
        return new Tuple8<>(val0, val1, val2, val3, val4, v0, v1, val5);
    }
    public <X0,X1> Tuple8<A,B,C,D,E,F,X0,X1> append(X0 v0, X1 v1) {
        return new Tuple8<>(val0, val1, val2, val3, val4, val5, v0, v1);
    }
    

    
    public <X0,X1,X2> Tuple9<X0,X1,X2,A,B,C,D,E,F> insertAt0(X0 v0, X1 v1, X2 v2) {
        return new Tuple9<>(v0, v1, v2, val0, val1, val2, val3, val4, val5);
    }
    public <X0,X1,X2> Tuple9<A,X0,X1,X2,B,C,D,E,F> insertAt1(X0 v0, X1 v1, X2 v2) {
        return new Tuple9<>(val0, v0, v1, v2, val1, val2, val3, val4, val5);
    }
    public <X0,X1,X2> Tuple9<A,B,X0,X1,X2,C,D,E,F> insertAt2(X0 v0, X1 v1, X2 v2) {
        return new Tuple9<>(val0, val1, v0, v1, v2, val2, val3, val4, val5);
    }
    public <X0,X1,X2> Tuple9<A,B,C,X0,X1,X2,D,E,F> insertAt3(X0 v0, X1 v1, X2 v2) {
        return new Tuple9<>(val0, val1, val2, v0, v1, v2, val3, val4, val5);
    }
    public <X0,X1,X2> Tuple9<A,B,C,D,X0,X1,X2,E,F> insertAt4(X0 v0, X1 v1, X2 v2) {
        return new Tuple9<>(val0, val1, val2, val3, v0, v1, v2, val4, val5);
    }
    public <X0,X1,X2> Tuple9<A,B,C,D,E,X0,X1,X2,F> insertAt5(X0 v0, X1 v1, X2 v2) {
        return new Tuple9<>(val0, val1, val2, val3, val4, v0, v1, v2, val5);
    }
    public <X0,X1,X2> Tuple9<A,B,C,D,E,F,X0,X1,X2> append(X0 v0, X1 v1, X2 v2) {
        return new Tuple9<>(val0, val1, val2, val3, val4, val5, v0, v1, v2);
    }
    

    
    public <X0,X1,X2,X3> Tuple10<X0,X1,X2,X3,A,B,C,D,E,F> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple10<>(v0, v1, v2, v3, val0, val1, val2, val3, val4, val5);
    }
    public <X0,X1,X2,X3> Tuple10<A,X0,X1,X2,X3,B,C,D,E,F> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple10<>(val0, v0, v1, v2, v3, val1, val2, val3, val4, val5);
    }
    public <X0,X1,X2,X3> Tuple10<A,B,X0,X1,X2,X3,C,D,E,F> insertAt2(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple10<>(val0, val1, v0, v1, v2, v3, val2, val3, val4, val5);
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,X0,X1,X2,X3,D,E,F> insertAt3(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple10<>(val0, val1, val2, v0, v1, v2, v3, val3, val4, val5);
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,X0,X1,X2,X3,E,F> insertAt4(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple10<>(val0, val1, val2, val3, v0, v1, v2, v3, val4, val5);
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,X0,X1,X2,X3,F> insertAt5(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple10<>(val0, val1, val2, val3, val4, v0, v1, v2, v3, val5);
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,F,X0,X1,X2,X3> append(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple10<>(val0, val1, val2, val3, val4, val5, v0, v1, v2, v3);
    }

    
    
    public <X0> Tuple7<X0,A,B,C,D,E,F> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple7<A,X0,B,C,D,E,F> insertAt1(Tuple1<X0> tuple) {
        return insertAt1(tuple.item0());
    }
    public <X0> Tuple7<A,B,X0,C,D,E,F> insertAt2(Tuple1<X0> tuple) {
        return insertAt2(tuple.item0());
    }
    public <X0> Tuple7<A,B,C,X0,D,E,F> insertAt3(Tuple1<X0> tuple) {
        return insertAt3(tuple.item0());
    }
    public <X0> Tuple7<A,B,C,D,X0,E,F> insertAt4(Tuple1<X0> tuple) {
        return insertAt4(tuple.item0());
    }
    public <X0> Tuple7<A,B,C,D,E,X0,F> insertAt5(Tuple1<X0> tuple) {
        return insertAt5(tuple.item0());
    }
    public <X0> Tuple7<A,B,C,D,E,F,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }
    

    
    public <X0,X1> Tuple8<X0,X1,A,B,C,D,E,F> insertAt0(Tuple2<X0,X1> tuple) {
        return insertAt0(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple8<A,X0,X1,B,C,D,E,F> insertAt1(Tuple2<X0,X1> tuple) {
        return insertAt1(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple8<A,B,X0,X1,C,D,E,F> insertAt2(Tuple2<X0,X1> tuple) {
        return insertAt2(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple8<A,B,C,X0,X1,D,E,F> insertAt3(Tuple2<X0,X1> tuple) {
        return insertAt3(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple8<A,B,C,D,X0,X1,E,F> insertAt4(Tuple2<X0,X1> tuple) {
        return insertAt4(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple8<A,B,C,D,E,X0,X1,F> insertAt5(Tuple2<X0,X1> tuple) {
        return insertAt5(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple8<A,B,C,D,E,F,X0,X1> append(Tuple2<X0,X1> tuple) {
        return append(tuple.item0(),tuple.item1());
    }

    
    
    public <X0,X1,X2> Tuple9<X0,X1,X2,A,B,C,D,E,F> insertAt0(Tuple3<X0,X1,X2> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple9<A,X0,X1,X2,B,C,D,E,F> insertAt1(Tuple3<X0,X1,X2> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple9<A,B,X0,X1,X2,C,D,E,F> insertAt2(Tuple3<X0,X1,X2> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple9<A,B,C,X0,X1,X2,D,E,F> insertAt3(Tuple3<X0,X1,X2> tuple) {
        return insertAt3(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple9<A,B,C,D,X0,X1,X2,E,F> insertAt4(Tuple3<X0,X1,X2> tuple) {
        return insertAt4(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple9<A,B,C,D,E,X0,X1,X2,F> insertAt5(Tuple3<X0,X1,X2> tuple) {
        return insertAt5(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple9<A,B,C,D,E,F,X0,X1,X2> append(Tuple3<X0,X1,X2> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2());
    }
    
    

    public <X0,X1,X2,X3> Tuple10<X0,X1,X2,X3,A,B,C,D,E,F> insertAt0(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple10<A,X0,X1,X2,X3,B,C,D,E,F> insertAt1(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple10<A,B,X0,X1,X2,X3,C,D,E,F> insertAt2(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,X0,X1,X2,X3,D,E,F> insertAt3(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt3(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,X0,X1,X2,X3,E,F> insertAt4(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt4(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,X0,X1,X2,X3,F> insertAt5(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt5(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple10<A,B,C,D,E,F,X0,X1,X2,X3> append(Tuple4<X0,X1,X2,X3> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }

    

    public <X> Tuple6<X,B,C,D,E,F> set0(X value) {
        return new Tuple6<>(value, val1, val2, val3, val4, val5);
    }
    public <X> Tuple6<A,X,C,D,E,F> set1(X value) {
        return new Tuple6<>(val0, value, val2, val3, val4, val5);
    }
    public <X> Tuple6<A,B,X,D,E,F> set2(X value) {
        return new Tuple6<>(val0, val1, value, val3, val4, val5);
    }
    public <X> Tuple6<A,B,C,X,E,F> set3(X value) {
        return new Tuple6<>(val0, val1, val2, value, val4, val5);
    }
    public <X> Tuple6<A,B,C,D,X,F> set4(X value) {
        return new Tuple6<>(val0, val1, val2, val3, value, val5);
    }
    public <X> Tuple6<A,B,C,D,E,X> set5(X value) {
        return new Tuple6<>(val0, val1, val2, val3, val4, value);
    }
    


    public Tuple5<B,C,D,E,F> remove0() {
        return new Tuple5<>(val1, val2, val3, val4, val5);
    }
    public Tuple5<A,C,D,E,F> remove1() {
        return new Tuple5<>(val0, val2, val3, val4, val5);
    }
    public Tuple5<A,B,D,E,F> remove2() {
        return new Tuple5<>(val0, val1, val3, val4, val5);
    }
    public Tuple5<A,B,C,E,F> remove3() {
        return new Tuple5<>(val0, val1, val2, val4, val5);
    }
    public Tuple5<A,B,C,D,F> remove4() {
        return new Tuple5<>(val0, val1, val2, val3, val5);
    }
    public Tuple5<A,B,C,D,E> remove5() {
        return new Tuple5<>(val0, val1, val2, val3, val4);
    }

}
