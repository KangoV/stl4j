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

import static uk.aspyr.stl4j.Tuples.*;

/**
 * A tuple of two elements.
 *
 * @author Darren Bell
 *
 */
public final class Tuple2<A,B> extends Tuple
        implements
    Item0<A>,
    Item1<B> {

    /**
     * Create tuple with the provided values
     *
     * @param <A>   the first value type
     * @param <B>   the second value type
     * @param v0    the first value
     * @param v1    the second value
     * @return the tuple
     */
    public static <A,B> Tuple2<A,B> tuple2(A v0, B v1) {
        return new Tuple2<A,B>(v0,v1);
    }

    /**
     * Create tuple with the provided values
     *
     * @param <A>   the first value type
     * @param <B>   the second value type
     * @param v0    the first value
     * @param v1    the second value
     * @return the tuple
     */
    public static <A,B> Tuple2<A,B> of(A v0, B v1) {
        return new Tuple2<A,B>(v0,v1);
    }

    /**
     * Create tuple from array. Array has to have exactly one element.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple2<X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, () ->
            new Tuple2<>(
                input[0],
                input[1]));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple2<X,X> from(Iterable<X> input) {
        if (input == null) throw new NullPointerException("Need an non null array as input");
        return Tuples.fromIterable(input, SIZE, TYPE, FIRST_INDEX, EXACT_SIZE,
            values -> new Tuple2<>(
                values[0],
                values[1]
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
    public static <X> Tuple2<X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, INEXACT_SIZE,
            values -> new Tuple2<>(
                values[0],
                values[1]
                ));
    }

    private static final long serialVersionUID = 2438099850625502138L;
    private static final Class<Tuple2> TYPE = Tuple2.class;
    private static final int SIZE = 2;

    private final A val0;
    private final B val1;

    Tuple2(A v0, B v1) {
        super(v0, v1);
        val0 = v0;
        val1 = v1;
    }

    public A item0() {
        return val0;
    }

    public B item1() {
        return val1;
    }

    @Override
    public int size() {
        return SIZE;
    }


    public <X0> Tuple3<X0,A,B> insertAt0(X0 v0) {
        return new Tuple3<X0,A,B>(v0, val0, val1);
    }
    public <X0> Tuple3<A,X0,B> insertAt1(X0 v0) {
        return new Tuple3<>(val0, v0, val1);
    }
    public <X0> Tuple3<A,B,X0> append(X0 v0) {
        return new Tuple3<>(val0, val1, v0);
    }


    public <X0,X1> Tuple4<X0,X1,A,B> insertAt0(X0 v0, X1 v1) {
        return new Tuple4<>(v0, v1, val0, val1);
    }
    public <X0,X1> Tuple4<A,X0,X1,B> insertAt1(X0 v0, X1 v1) {
        return new Tuple4<>(val0, v0, v1, val1);
    }
    public <X0,X1> Tuple4<A,B,X0,X1> append(X0 v0, X1 v1) {
        return new Tuple4<>(val0, val1, v0, v1);
    }
    

    public <X0,X1,X2> Tuple5<X0,X1,X2,A,B> insertAt0(X0 v0, X1 v1, X2 v2) {
        return new Tuple5<>(v0, v1, v2, val0, val1);
    }
    public <X0,X1,X2> Tuple5<A,X0,X1,X2,B> insertAt1(X0 v0, X1 v1, X2 v2) {
        return new Tuple5<>(val0, v0, v1, v2, val1);
    }
    public <X0,X1,X2> Tuple5<A,B,X0,X1,X2> append(X0 v0, X1 v1, X2 v2) {
        return new Tuple5<>(val0, val1, v0, v1, v2);
    }
    

    public <X0,X1,X2,X3> Tuple6<X0,X1,X2,X3,A,B> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple6<>(v0, v1, v2, v3, val0, val1);
    }
    public <X0,X1,X2,X3> Tuple6<A,X0,X1,X2,X3,B> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple6<>(val0, v0, v1, v2, v3, val1);
    }
    public <X0,X1,X2,X3> Tuple6<A,B,X0,X1,X2,X3> append(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple6<>(val0, val1, v0, v1, v2, v3);
    }


    public <X0,X1,X2,X3,X4> Tuple7<X0,X1,X2,X3,X4,A,B> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple7<>(v0, v1, v2, v3, v4, val0, val1);
    }
    public <X0,X1,X2,X3,X4> Tuple7<A,X0,X1,X2,X3,X4,B> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple7<>(val0, v0, v1, v2, v3, v4, val1);
    }
    public <X0,X1,X2,X3,X4> Tuple7<A,B,X0,X1,X2,X3,X4> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple7<>(val0, val1, v0, v1, v2, v3, v4);
    }


    public <X0,X1,X2,X3,X4,X5> Tuple8<X0,X1,X2,X3,X4,X5,A,B> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple8<>(v0, v1, v2, v3, v4, v5, val0, val1);
    }
    public <X0,X1,X2,X3,X4,X5> Tuple8<A,X0,X1,X2,X3,X4,X5,B> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple8<>(val0, v0, v1, v2, v3, v4, v5, val1);
    }
    public <X0,X1,X2,X3,X4,X5> Tuple8<A,B,X0,X1,X2,X3,X4,X5> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple8<>(val0, val1, v0, v1, v2, v3, v4, v5);
    }


    public <X0,X1,X2,X3,X4,X5,X6> Tuple9<X0,X1,X2,X3,X4,X5,X6,A,B> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple9<>(v0, v1, v2, v3, v4, v5, v6, val0, val1);
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple9<A,X0,X1,X2,X3,X4,X5,X6,B> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple9<>(val0, v0, v1, v2, v3, v4, v5, v6, val1);
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple9<A,B,X0,X1,X2,X3,X4,X5,X6> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple9<>(val0, val1, v0, v1, v2, v3, v4, v5, v6);
    }


    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple10<X0,X1,X2,X3,X4,X5,X6,X7,A,B> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6, X7 v7) {
        return new Tuple10<>(v0, v1, v2, v3, v4, v5, v6, v7, val0, val1);
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple10<A,X0,X1,X2,X3,X4,X5,X6,X7,B> insertAt1(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6, X7 v7) {
        return new Tuple10<>(val0, v0, v1, v2, v3, v4, v5, v6, v7, val1);
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple10<A,B,X0,X1,X2,X3,X4,X5,X6,X7> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6, X7 v7) {
        return new Tuple10<>(val0, val1, v0, v1, v2, v3, v4, v5, v6, v7);
    }

    

    public <X0> Tuple3<X0,A,B> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple3<A,X0,B> insertAt1(Tuple1<X0> tuple) {
        return insertAt1(tuple.item0());
    }
    public <X0> Tuple3<A,B,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }
    


    public <X0,X1> Tuple4<X0,X1,A,B> insertAt0(Tuple2<X0,X1> tuple) {
        return insertAt0(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple4<A,X0,X1,B> insertAt1(Tuple2<X0,X1> tuple) {
        return insertAt1(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple4<A,B,X0,X1> append(Tuple2<X0,X1> tuple) {
        return append(tuple.item0(),tuple.item1());
    }

    

    public <X0,X1,X2> Tuple5<X0,X1,X2,A,B> insertAt0(Tuple3<X0,X1,X2> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple5<A,X0,X1,X2,B> insertAt1(Tuple3<X0,X1,X2> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple5<A,B,X0,X1,X2> append(Tuple3<X0,X1,X2> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2());
    }
    
    

    public <X0,X1,X2,X3> Tuple6<X0,X1,X2,X3,A,B> insertAt0(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple6<A,X0,X1,X2,X3,B> insertAt1(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple6<A,B,X0,X1,X2,X3> append(Tuple4<X0,X1,X2,X3> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }

    

    public <X0,X1,X2,X3,X4> Tuple7<X0,X1,X2,X3,X4,A,B> insertAt0(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple7<A,X0,X1,X2,X3,X4,B> insertAt1(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple7<A,B,X0,X1,X2,X3,X4> append(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }

    

    public <X0,X1,X2,X3,X4,X5> Tuple8<X0,X1,X2,X3,X4,X5,A,B> insertAt0(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }
    public <X0,X1,X2,X3,X4,X5> Tuple8<A,X0,X1,X2,X3,X4,X5,B> insertAt1(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }
    public <X0,X1,X2,X3,X4,X5> Tuple8<A,B,X0,X1,X2,X3,X4,X5> append(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }

    

    public <X0,X1,X2,X3,X4,X5,X6> Tuple9<X0,X1,X2,X3,X4,X5,X6,A,B> insertAt0(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple9<A,X0,X1,X2,X3,X4,X5,X6,B> insertAt1(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple9<A,B,X0,X1,X2,X3,X4,X5,X6> append(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }

    

    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple10<X0,X1,X2,X3,X4,X5,X6,X7,A,B> insertAt0(Tuple8<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6(),tuple.item7());
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple10<A,X0,X1,X2,X3,X4,X5,X6,X7,B> insertAt1(Tuple8<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertAt1(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6(),tuple.item7());
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple10<A,B,X0,X1,X2,X3,X4,X5,X6,X7> append(Tuple8<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6(),tuple.item7());
    }


    public <X> Tuple2<X,B> set0(X value) {
        return new Tuple2<>(value, val1);
    }
    public <X> Tuple2<A,X> set1(X value) {
        return new Tuple2<>(val0, value);
    }
    

    public Tuple1<B> remove0() {
        return new Tuple1<B>(val1);
    }
    public Tuple1<A> remove1() {
        return new Tuple1<A>(val0);
    }

}
