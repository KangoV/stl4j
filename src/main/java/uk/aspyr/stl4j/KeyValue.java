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
 * A tuple of two elements, with positions 0 and 1 renamed as "key" and
 * "value", respectively.
 *
 * @author Darren Bell
 *
 */
public final class KeyValue<A,B> extends Tuple implements ValueKey<A>, ValueValue<B> {

    /**
     * Create tuple with the provided values
     *
     * @param <A>   the first value type
     * @param <B>   the second value type
     * @param v0    the first value
     * @param v1    the second value
     * @return the tuple
     */
    public static <A,B> KeyValue<A,B> keyValue(A v0, B v1) {
        return new KeyValue<A,B>(v0,v1);
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
    public static <A,B> KeyValue<A,B> of(A v0, B v1) {
        return new KeyValue<A,B>(v0,v1);
    }

    /**
     * Create tuple from array. Array has to have exactly one element.
     *
     * @param <X>   the array component type
     * @param input the array to be converted to a tuple
     * @return the tuple
     */
    public static <X> KeyValue<X,X> from(X[] input) {
        return Tuples.fromArray(input, SIZE, TYPE, values ->
            new KeyValue<>(
                values[0],
                values[1]));
    }

    /**
     * Create tuple from input. Iterable has to have exactly one element.
     *
     * @param <X> the input component type
     * @param input the input to be converted to a tuple
     * @return the tuple
     */
    public static <X> KeyValue<X,X> from(Iterable<X> input) {
        if (input == null) throw new NullPointerException("Need an non null array as input");
        return Tuples.fromIterable(input, SIZE, TYPE, FIRST_INDEX, EXACT_SIZE,
            values -> new KeyValue<>(
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
    public static <X> KeyValue<X,X> from(Iterable<X> input, int startIndex) {
        return Tuples.fromIterable(input, SIZE, TYPE, startIndex, INEXACT_SIZE,
            values -> new KeyValue<>(
                values[0],
                values[1]
            ));
    }

    private static final long serialVersionUID = 3460957157833872509L;
    private static final Class<KeyValue> TYPE = KeyValue.class;
    private static final int SIZE = 2;

    private final A key;
    private final B value;

    public KeyValue(final A key, final B value) {
        super(key, value);
        this.key = key;
        this.value = value;
    }

    public A key() {
        return this.key;
    }

    public B value() {
        return this.value;
    }

    public <X> KeyValue<X,B> setKey(final X key) {
        return new KeyValue<X,B>(key, this.value);
    }
    
    public <Y> KeyValue<A,Y> setValue(final Y value) {
        return new KeyValue<A,Y>(this.key, value);
    }

}
