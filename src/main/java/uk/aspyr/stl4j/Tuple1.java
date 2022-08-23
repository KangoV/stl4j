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
 * A tuple of one element.
 *
 * @author Darren Bell
 *
 */
public final class Tuple1<A> extends Tuple
        implements Item0<A> {

    /**
     * Create tuple with the provided value
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A> Tuple1<A> tuple1(A v0) {
        return new Tuple1<A>(v0);
    }

    /**
     * Create tuple with the provided value
     *
     * @param <A>   type of value 0
     * @param v0    value 0
     * @return the tuple
     */
    public static <A> Tuple1<A> of(A v0) {
        return new Tuple1<A>(v0);
    }

    /**
     * Create tuple from array. Array has to have exactly one element.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple1<X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE,
            values -> new Tuple1<X>(
                values[0]
                ));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple1<X> from(Iterable<X> input) {
        return Tuples.fromIterable(input, SIZE, TYPE, FIRST_INDEX, EXACT_SIZE,
            values -> new Tuple1(
                values[0]
                ));
    }

    /**
     * Create tuple from input, starting from the specified index. Iterable
     * can have more (or less) elements than the tuple to be created.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> Tuple1<X> from(Iterable<X> input, int index) {
        return Tuples.fromIterable(input, SIZE, TYPE, index, INEXACT_SIZE,
            values -> new Tuple1(
                values[0]
                ));
    }

    private static final long serialVersionUID = -9113114724069537096L;
    private static final Class<Tuple1> TYPE = Tuple1.class;
    private static final int SIZE = 1;

    private final A val0;

    public Tuple1(A v0) {
        super(v0);
        val0 = v0;
    }

    public A item0() {
        return val0;
    }

    public <X0> Tuple2<X0,A> insertAt0(X0 v0) {
        return new Tuple2<>(v0, val0);
    }
    public <X0> Tuple2<A,X0> append(X0 v0) {
        return new Tuple2<>(val0, v0);
    }

    public <X0,X1> Tuple3<X0,X1,A> insertAt0(X0 v0, X1 v1) {
        return new Tuple3<>(v0, v1, val0);
    }
    public <X0,X1> Tuple3<A,X0,X1> append(X0 v0, X1 v1) {
        return new Tuple3<>(val0, v0, v1);
    }

    public <X0,X1,X2> Tuple4<X0,X1,X2,A> insertAt0(X0 v0, X1 v1, X2 v2) {
        return new Tuple4<>(v0, v1, v2, val0);
    }
    public <X0,X1,X2> Tuple4<A,X0,X1,X2> append(X0 v0, X1 v1, X2 v2) {
        return new Tuple4<>(val0, v0, v1, v2);
    }

    public <X0,X1,X2,X3> Tuple5<X0,X1,X2,X3,A> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple5<>(v0, v1, v2, v3, val0);
    }
    public <X0,X1,X2,X3> Tuple5<A,X0,X1,X2,X3> append(X0 v0, X1 v1, X2 v2, X3 v3) {
        return new Tuple5<>(val0, v0, v1, v2, v3);
    }

    public <X0,X1,X2,X3,X4> Tuple6<X0,X1,X2,X3,X4,A> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple6<>(v0, v1, v2, v3, v4, val0);
    }
    public <X0,X1,X2,X3,X4> Tuple6<A,X0,X1,X2,X3,X4> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4) {
        return new Tuple6<>(val0, v0, v1, v2, v3, v4);
    }

    public <X0,X1,X2,X3,X4,X5> Tuple7<X0,X1,X2,X3,X4,X5,A> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple7<>(v0, v1, v2, v3, v4, v5, val0);
    }
    public <X0,X1,X2,X3,X4,X5> Tuple7<A,X0,X1,X2,X3,X4,X5> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5) {
        return new Tuple7<>(val0, v0, v1, v2, v3, v4, v5);
    }

    public <X0,X1,X2,X3,X4,X5,X6> Tuple8<X0,X1,X2,X3,X4,X5,X6,A> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple8<>(v0, v1, v2, v3, v4, v5, v6, val0);
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple8<A,X0,X1,X2,X3,X4,X5,X6> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6) {
        return new Tuple8<>(val0, v0, v1, v2, v3, v4, v5, v6);
    }

    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple9<X0,X1,X2,X3,X4,X5,X6,X7,A> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6, X7 v7) {
        return new Tuple9<>(v0, v1, v2, v3, v4, v5, v6, v7, val0);
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple9<A,X0,X1,X2,X3,X4,X5,X6,X7> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6, X7 v7) {
        return new Tuple9<>(val0, v0, v1, v2, v3, v4, v5, v6, v7);
    }

    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Tuple10<X0,X1,X2,X3,X4,X5,X6,X7,X8,A> insertAt0(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6, X7 v7, X8 v8) {
        return new Tuple10<>(v0, v1, v2, v3, v4, v5, v6, v7, v8, val0);
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Tuple10<A,X0,X1,X2,X3,X4,X5,X6,X7,X8> append(X0 v0, X1 v1, X2 v2, X3 v3, X4 v4, X5 v5, X6 v6, X7 v7, X8 v8) {
        return new Tuple10<>(val0, v0, v1, v2, v3, v4, v5, v6, v7, v8);
    }

    

    public <X0> Tuple2<X0,A> insertAt0(Tuple1<X0> tuple) {
        return insertAt0(tuple.item0());
    }
    public <X0> Tuple2<A,X0> append(Tuple1<X0> tuple) {
        return append(tuple.item0());
    }


    public <X0,X1> Tuple3<X0,X1,A> insertAt0(Tuple2<X0,X1> tuple) {
        return insertAt0(tuple.item0(),tuple.item1());
    }
    public <X0,X1> Tuple3<A,X0,X1> append(Tuple2<X0,X1> tuple) {
        return append(tuple.item0(),tuple.item1());
    }


    public <X0,X1,X2> Tuple4<X0,X1,X2,A> insertAt0(Tuple3<X0,X1,X2> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2());
    }
    public <X0,X1,X2> Tuple4<A,X0,X1,X2> append(Tuple3<X0,X1,X2> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2());
    }

    public <X0,X1,X2,X3> Tuple5<X0,X1,X2,X3,A> insertAt0(Tuple4<X0,X1,X2,X3> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }
    public <X0,X1,X2,X3> Tuple5<A,X0,X1,X2,X3> append(Tuple4<X0,X1,X2,X3> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3());
    }

    public <X0,X1,X2,X3,X4> Tuple6<X0,X1,X2,X3,X4,A> insertAt0(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }
    public <X0,X1,X2,X3,X4> Tuple6<A,X0,X1,X2,X3,X4> append(Tuple5<X0,X1,X2,X3,X4> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4());
    }

    public <X0,X1,X2,X3,X4,X5> Tuple7<X0,X1,X2,X3,X4,X5,A> insertAt0(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }
    public <X0,X1,X2,X3,X4,X5> Tuple7<A,X0,X1,X2,X3,X4,X5> append(Tuple6<X0,X1,X2,X3,X4,X5> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5());
    }

    public <X0,X1,X2,X3,X4,X5,X6> Tuple8<X0,X1,X2,X3,X4,X5,X6,A> insertAt0(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }
    public <X0,X1,X2,X3,X4,X5,X6> Tuple8<A,X0,X1,X2,X3,X4,X5,X6> append(Tuple7<X0,X1,X2,X3,X4,X5,X6> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6());
    }

    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple9<X0,X1,X2,X3,X4,X5,X6,X7,A> insertAt0(Tuple8<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6(),tuple.item7());
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7> Tuple9<A,X0,X1,X2,X3,X4,X5,X6,X7> append(Tuple8<X0,X1,X2,X3,X4,X5,X6,X7> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6(),tuple.item7());
    }

    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Tuple10<X0,X1,X2,X3,X4,X5,X6,X7,X8,A> insertAt0(Tuple9<X0,X1,X2,X3,X4,X5,X6,X7,X8> tuple) {
        return insertAt0(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6(),tuple.item7(),tuple.item8());
    }
    public <X0,X1,X2,X3,X4,X5,X6,X7,X8> Tuple10<A,X0,X1,X2,X3,X4,X5,X6,X7,X8> append(Tuple9<X0,X1,X2,X3,X4,X5,X6,X7,X8> tuple) {
        return append(tuple.item0(),tuple.item1(),tuple.item2(),tuple.item3(),tuple.item4(),tuple.item5(),tuple.item6(),tuple.item7(),tuple.item8());
    }


    public <X> Tuple1<X> set(X value) {
        return new Tuple1<X>(value);
    }

}
