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
 * A tuple of three elements.
 *
 * @author Daniel Fern&aacute;ndez
 * @author Darren Bell
 */
public final class Tuple3<A,B,C>extends Tuple
        implements
            Item0<A>,
            Item1<B>,
            Item2<C> {

    /**
     * Create tuple with the provided value
     *
     * @param <A>   the value type
     * @param v0    the value
     * @return the tuple
     */
    public static <A,B,C> Tuple3<A,B,C> tuple3(A v0, B v1, C v2) {
        return of(v0,v1,v2);
    }

    /**
     * Create tuple with the provided value
     *
     * @param <A>   the value type
     * @param v0    the value
     * @return the tuple
     */
    public static <A,B,C> Tuple3<A,B,C> of(A v0, B v1, C v2) {
        return new Tuple3<A,B,C>(v0,v1,v2);
    }

    /**
     * Create tuple from array. Array has to have exactly 3 elements.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple3<X,X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE,
            values -> new Tuple3<>(
                values[0],
                values[1],
                values[2]
                ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple3<X,X,X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, Tuples.FIRST_INDEX, Tuples.EXACT_SIZE,
            values -> new Tuple3<>(
                values[0],
                values[1],
                values[2]
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
    public static <X> Tuple3<X,X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, Tuples.INEXACT_SIZE,
            values -> new Tuple3<>(
                values[0],
                values[1],
                values[2]
                ));
    }

    private static final long serialVersionUID = -1877265551599483740L;
    private static final Class<Tuple3> TYPE = Tuple3.class;
    private static final int SIZE = 3;

    private final A val0;
    private final B val1;
    private final C val2;

    Tuple3(
            final A v0,
            final B v1,
            final C v2) {
        super(v0, v1, v2);
        val0 = v0;
        val1 = v1;
        val2 = v2;
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

    public <X0> Tuple4<X0,A,B,C> insertAt0(X0 v0) {
        return new Tuple4<>(v0, val0, val1, val2);
    }
    public <X0> Tuple4<A,X0,B,C> insertAt1(X0 v0) {
        return new Tuple4<>(val0, v0, val1, val2);
    }
    public <X0> Tuple4<A,B,X0,C> insertAt2(X0 v0) {
        return new Tuple4<>(val0, val1, v0, val2);
    }
    public <X0> Tuple4<A,B,C,X0> append(X0 v0) {
        return new Tuple4<>(val0, val1, val2, v0);
    }

    

    public <X0,X1> Tuple5<X0,X1,A,B,C> insertAt0(X0 v0, X1 v1) {
        return new Tuple5<>(v0, v1, val0, val1, val2);
    }
    public <X0,X1> Tuple5<A,X0,X1,B,C> insertAt1(X0 v0, X1 v1) {
        return new Tuple5<>(val0, v0, v1, val1, val2);
    }
    public <X0,X1> Tuple5<A,B,X0,X1,C> insertAt2(X0 v0, X1 v1) {
        return new Tuple5<>(val0, val1, v0, v1, val2);
    }
    public <X0,X1> Tuple5<A,B,C,X0,X1> append(X0 v0, X1 v1) {
        return new Tuple5<>(val0, val1, val2, v0, v1);
    }
    


    public <X0,X1,X2> Tuple6<X0,X1,X2,A,B,C> insertAt0(X0 v0, X1 v1, X2 v2) {
        return new Tuple6<>(v0, v1, v2, val0, val1, val2);
    }
    public <X0,X1,X2> Tuple6<A,X0,X1,X2,B,C> insertAt1(X0 v0, X1 v1, X2 v2) {
        return new Tuple6<>(val0, v0, v1, v2, val1, val2);
    }
    public <X0,X1,X2> Tuple6<A,B,X0,X1,X2,C> insertAt2(X0 v0, X1 v1, X2 v2) {
        return new Tuple6<>(val0, val1, v0, v1, v2, val2);
    }
    public <X0,X1,X2> Tuple6<A,B,C,X0,X1,X2> append(X0 v0, X1 v1, X2 v2) {
        return new Tuple6<>(val0, val1, val2, v0, v1, v2);
    }
    


    public <X0,X1,X2,X3> Tuple7<X0,X1,X2,X3,A,B,C> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple7<>(v0, v1, v2, v3, val0, val1, val2);
    }
    public <X0,X1,X2,X3> Tuple7<A,X0,X1,X2,X3,B,C> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple7<>(val0, v0, v1, v2, v3, val1, val2);
    }
    public <X0,X1,X2,X3> Tuple7<A,B,X0,X1,X2,X3,C> insertAt2(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple7<>(val0, val1, v0, v1, v2, v3, val2);
    }
    public <X0,X1,X2,X3> Tuple7<A,B,C,X0,X1,X2,X3> append(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple7<>(val0, val1, val2, v0, v1, v2, v3);
    }



    public <X0,X1,X2,X3,X4> Tuple8<X0,X1,X2,X3,X4,A,B,C> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple8<>(v0, v1, v2, v3, v4, val0, val1, val2);
    }
    public <X0,X1,X2,X3,X4> Tuple8<A,X0,X1,X2,X3,X4,B,C> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple8<>(val0, v0, v1, v2, v3, v4, val1, val2);
    }
    public <X0,X1,X2,X3,X4> Tuple8<A,B,X0,X1,X2,X3,X4,C> insertAt2(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple8<>(val0, val1, v0, v1, v2, v3, v4, val2);
    }
    public <X0,X1,X2,X3,X4> Tuple8<A,B,C,X0,X1,X2,X3,X4> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple8<>(val0, val1, val2, v0, v1, v2, v3, v4);
    }



    public <X0,X1,X2,X3,X4,X5> Tuple9<X0,X1,X2,X3,X4,X5,A,B,C> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple9<>(v0, v1, v2, v3, v4, v5, val0, val1, val2);
    }
    public <X0,X1,X2,X3,X4,X5> Tuple9<A,X0,X1,X2,X3,X4,X5,B,C> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple9<>(val0, v0, v1, v2, v3, v4, v5, val1, val2);
    }
    public <X0,X1,X2,X3,X4,X5> Tuple9<A,B,X0,X1,X2,X3,X4,X5,C> insertAt2(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple9<>(val0, val1, v0, v1, v2, v3, v4, v5, val2);
    }
    public <X0,X1,X2,X3,X4,X5> Tuple9<A,B,C,X0,X1,X2,X3,X4,X5> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple9<>(val0, val1, val2, v0, v1, v2, v3, v4, v5);
    }



    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<X0,X1,X2,X3,X4,X5,X6,A,B,C> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple10<>(v0, v1, v2, v3, v4, v5, v6, val0, val1, val2);
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<A,X0,X1,X2,X3,X4,X5,X6,B,C> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple10<>(val0, v0, v1, v2, v3, v4, v5, v6, val1, val2);
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<A,B,X0,X1,X2,X3,X4,X5,X6,C> insertAt2(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple10<>(val0, val1, v0, v1, v2, v3, v4, v5, v6, val2);
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<A,B,C,X0,X1,X2,X3,X4,X5,X6> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple10<>(val0, val1, val2, v0, v1, v2, v3, v4, v5, v6);
    }

    

    public <X0> Tuple4<X0,A,B,C> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple4<A,X0,B,C> insertAt1(Tuple1<X0> tuple) {
        return insertAt1(tuple.item0());
    }
    public <X0> Tuple4<A,B,X0,C> insertAt2(Tuple1<X0> tuple) {
        return insertAt2(tuple.item0());
    }
    public <X0> Tuple4<A,B,C,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }
    


    public <X0,X1> Tuple5<X0,X1,A,B,C> insertAt0(Tuple2<X0,X1> tuple) {
        return insertAt0(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple5<A,X0,X1,B,C> insertAt1(Tuple2<X0,X1> tuple) {
        return insertAt1(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple5<A,B,X0,X1,C> insertAt2(Tuple2<X0,X1> tuple) {
        return insertAt2(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple5<A,B,C,X0,X1> append(Tuple2<X0,X1> tuple) {
        return append(tuple.item0(),tuple.item1());
    }

    

    public <X0,X1,X2> Tuple6<X0,X1,X2,A,B,C> insertAt0(Tuple3<X0,X1,X2> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple6<A,X0,X1,X2,B,C> insertAt1(Tuple3<X0,X1,X2> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple6<A,B,X0,X1,X2,C> insertAt2(Tuple3<X0,X1,X2> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple6<A,B,C,X0,X1,X2> append(Tuple3<X0,X1,X2> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2());
    }
    
    

    public <X0,X1,X2,X3> Tuple7<X0,X1,X2,X3,A,B,C> insertAt0(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple7<A,X0,X1,X2,X3,B,C> insertAt1(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple7<A,B,X0,X1,X2,X3,C> insertAt2(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple7<A,B,C,X0,X1,X2,X3> append(Tuple4<X0,X1,X2,X3> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }

    

    public <X0,X1,X2,X3,X4> Tuple8<X0,X1,X2,X3,X4,A,B,C> insertAt0(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple8<A,X0,X1,X2,X3,X4,B,C> insertAt1(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple8<A,B,X0,X1,X2,X3,X4,C> insertAt2(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple8<A,B,C,X0,X1,X2,X3,X4> append(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }

    

    public <X0,X1,X2,X3,X4,X5> Tuple9<X0,X1,X2,X3,X4,X5,A,B,C> insertAt0(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }
    public <X0,X1,X2,X3,X4,X5> Tuple9<A,X0,X1,X2,X3,X4,X5,B,C> insertAt1(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }
    public <X0,X1,X2,X3,X4,X5> Tuple9<A,B,X0,X1,X2,X3,X4,X5,C> insertAt2(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }
    public <X0,X1,X2,X3,X4,X5> Tuple9<A,B,C,X0,X1,X2,X3,X4,X5> append(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }

    

    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<X0,X1,X2,X3,X4,X5,X6,A,B,C> insertAt0(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<A,X0,X1,X2,X3,X4,X5,X6,B,C> insertAt1(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<A,B,X0,X1,X2,X3,X4,X5,X6,C> insertAt2(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertAt2(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple10<A,B,C,X0,X1,X2,X3,X4,X5,X6> append(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }

    

    public <X> Tuple3<X,B,C> set0(X value) {
        return new Tuple3<X,B,C>(value, val1, val2);
    }
    public <X> Tuple3<A,X,C> set1(X value) {
        return new Tuple3<A,X,C>(val0, value, val2);
    }
    public <X> Tuple3<A,B,X> set2(X value) {
        return new Tuple3<A,B,X>(val0, val1, value);
    }
    
    

    public Tuple2<B,C> remove0() {
        return new Tuple2<B,C>(val1, val2);
    }
    public Tuple2<A,C> remove1() {
        return new Tuple2<A,C>(val0, val2);
    }
    public Tuple2<A,B> remove2() {
        return new Tuple2<A,B>(val0, val1);
    }

}
