package uk.aspyr.stl4j;

import org.assertj.core.api.AssertionsForClassTypes;
import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static uk.aspyr.stl4j.Tuple2.tuple2;

public class TupleTest extends TupleTestBase{

    @Test
    @DisplayName("Test size")
    void test_size() {
        assertThat( Tuple1.of(OBJ_0).size()).isEqualTo(1);
        assertThat( Tuple2.of(OBJ_0, OBJ_1).size()).isEqualTo(2);
        assertThat( Tuple3.of(OBJ_0, OBJ_1, OBJ_2).size()).isEqualTo(3);
        assertThat( Tuple4.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3).size()).isEqualTo(4);
        assertThat( Tuple5.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4).size()).isEqualTo(5);
        assertThat( Tuple6.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5).size()).isEqualTo(6);
        assertThat( Tuple7.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6).size()).isEqualTo(7);
        assertThat( Tuple8.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7).size()).isEqualTo(8);
        assertThat( Tuple9.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).size()).isEqualTo(9);
        assertThat(Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).size()).isEqualTo(10);
    }

    @Test()
    @DisplayName("test iterator")
    void test_iterator() {
        assertThat( Tuple1.of(OBJ_0).iterator()).toIterable().containsExactly(OBJ_0);
        assertThat( Tuple2.of(OBJ_0, OBJ_1).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1);
        assertThat( Tuple3.of(OBJ_0, OBJ_1, OBJ_2).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2);
        assertThat( Tuple4.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2, OBJ_3);
        assertThat( Tuple5.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4);
        assertThat( Tuple6.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5);
        assertThat( Tuple7.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6);
        assertThat( Tuple8.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7);
        assertThat( Tuple9.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8);
        assertThat(Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).iterator()).toIterable().containsExactly(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);

    }

    @Test()
    @DisplayName("test contains")
    void test_contains() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9 };
        Tuple10 tuple = Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);
        for (int i = 0; i < objects.length; i++) {
            assertThat(tuple.contains(objects[i])).isTrue();
        }
        assertThat(tuple.contains("UNKNOWN")).isFalse();
        assertThat(tuple.contains(null)).isFalse();
        assertThat(tuple2(OBJ_0, null).contains(null)).isTrue();
    }

    @Test()
    @DisplayName("test containsAll(Array)")
    void test_contains_arry() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9 };
        Tuple10 tuple = Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);
        assertThat(tuple.containsAll(objects)).isTrue();
        assertThat(tuple.containsAll(OBJ_0, "UNKNOWN")).isFalse();
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
            tuple.containsAll((Object[])null);
        });
    }

    @Test()
    @DisplayName("test containsAll(Collection)")
    void test_contains_collection() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9 };
        Tuple10 tuple = Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);
        assertThat(tuple.containsAll(Arrays.asList(OBJ_0, "UNKNOWN"))).isFalse();
        assertThat(tuple.containsAll(Arrays.asList(objects))).isTrue();
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> {
            tuple.containsAll((Collection<?>) null);
        });
    }

    @Test()
    @DisplayName("test indexOf")
    void test_indexOf() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9 };
        Tuple10 tuple = Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);
        for (int i = 0; i < objects.length; i++) {
            assertThat(tuple.indexOf(objects[i])).isEqualTo(i);
        }
        assertThat(tuple.indexOf("UNKNOWN")).isEqualTo(-1);
    }

    @Test()
    @DisplayName("test indexOf null")
    void test_indexOf_null() {
        String[] objects = new String[] { OBJ_0, OBJ_1, null, null, OBJ_4, OBJ_5 };
        Tuple6 tuple = Tuple6.from(objects);
        assertThat(tuple.indexOf(null)).isEqualTo(2);
    }

    @Test()
    @DisplayName("test lastIndexOf")
    void test_lastIndexOf() {
        Tuple10 tuple = Tuple10.of(OBJ_0, OBJ_0, OBJ_2, OBJ_2, OBJ_4, OBJ_4, OBJ_6, OBJ_6, OBJ_8, OBJ_8);
        assertThat(tuple.lastIndexOf(OBJ_0)).isEqualTo(1);
        assertThat(tuple.lastIndexOf(OBJ_2)).isEqualTo(3);
        assertThat(tuple.lastIndexOf(OBJ_4)).isEqualTo(5);
        assertThat(tuple.lastIndexOf(OBJ_6)).isEqualTo(7);
        assertThat(tuple.lastIndexOf(OBJ_8)).isEqualTo(9);
        assertThat(tuple.lastIndexOf("UNKOWN")).isEqualTo(-1);
    }

    @Test()
    @DisplayName("test lastIndexOf null")
    void test_lastIndexOf_null() {
        String[] objects = new String[] { OBJ_0, OBJ_1, null, null, OBJ_4, OBJ_5 };
        Tuple6 tuple = Tuple6.from(objects);
        assertThat(tuple.lastIndexOf(null)).isEqualTo(3);
    }

    @Test()
    @DisplayName("test create from index")
    void test_create_from_index() {
        List objects = Arrays.asList(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);
        Tuple5 tuple5 = Tuple5.from(objects,5);
        AssertionsForClassTypes.assertThat(tuple5).isEqualTo(Tuple5.of(OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9));
    }

    @Test()
    @DisplayName("test create from iterable throws exception")
    void test_create_from_iterable_index_too_few_elements() {
        List objects = Arrays.asList(OBJ_0, OBJ_1, OBJ_2, OBJ_3);
        assertThatExceptionOfType(IllegalArgumentException.class)
            .as("check exception thrown if index reached, but too few elements")
            .isThrownBy(() -> {
                Tuple5.from(objects,2);
            });
        assertThatExceptionOfType(IllegalArgumentException.class)
            .as("check exception thrown if index reached, but no elements left")
            .isThrownBy(() -> {
                Tuple5.from(objects,4);
            });
        assertThatExceptionOfType(IllegalArgumentException.class)
            .as("check exception thrown if start index not reached")
            .isThrownBy(() -> {
                Tuple5.from(objects,6);
            });
    }

    @Test()
    @DisplayName("test create from iterable from index throws exception")
    void test_create_from_iterable_too_few_elements() {
        List objects = Arrays.asList(OBJ_0, OBJ_1, OBJ_2);
        assertThatExceptionOfType(IllegalArgumentException.class)
            .as("check exception thrown when not enough elements")
            .isThrownBy(() -> {
                Tuple5.from(objects);
            });
        assertThatExceptionOfType(IllegalArgumentException.class)
            .as("check exception thrown when too many elements")
            .isThrownBy(() -> {
                Tuple2.from(objects);
            });
    }

    @Test()
    @DisplayName("test toList")
    void test_toList() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9 };
        Tuple10 tuple10 = Tuple10.from(objects);
        assertThat(tuple10.toList()).containsExactly(objects);
    }

    @Test()
    @DisplayName("test toArray")
    void test_toArray() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9 };
        Tuple10 tuple10 = Tuple10.from(objects);
        assertThat(tuple10.toArray()).containsExactly(objects);
    }

    @Test()
    @DisplayName("test get")
    void test_get() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4 };
        Tuple5 tuple = Tuple5.from(objects);
        assertThat(tuple.get(3)).isEqualTo(OBJ_3);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            tuple.get(7);
        });
    }

    @Test()
    @DisplayName("test toString")
    void test_toString() {
        String[] objects = new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4 };
        Tuple5 tuple = Tuple5.from(objects);
        assertThat(tuple.toString()).isEqualTo("Tuple5:[0, 1, 2, 3, 4]");
    }

    @Test()
    @DisplayName("test compareTo")
    void test_compareTo() {
        assertThat(Tuple3.of(OBJ_0, OBJ_1, OBJ_2).compareTo(Tuple3.of(OBJ_0, OBJ_1, OBJ_2))).isEqualTo(0);
        assertThat(Tuple3.of(OBJ_0, OBJ_1, OBJ_2).compareTo(Tuple3.of(OBJ_0, OBJ_1, OBJ_3))).isEqualTo(-1);
        assertThat(Tuple3.of(OBJ_0, OBJ_1, OBJ_3).compareTo(Tuple3.of(OBJ_0, OBJ_1, OBJ_2))).isEqualTo(1);
    }


}
