package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static uk.aspyr.stl4j.Tuple1.tuple1;
import static uk.aspyr.stl4j.Tuple2.tuple2;
import static uk.aspyr.stl4j.Tuple3.tuple3;
import static uk.aspyr.stl4j.Tuple4.tuple4;
import static uk.aspyr.stl4j.Tuple5.tuple5;
import static uk.aspyr.stl4j.Tuple6.tuple6;

public class Tuple4Test extends TupleTestBase {

    @Test
    @DisplayName("test_equality")
    void test_tuple_equality() {
        EqualsVerifier.forClass(Tuple4.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("val0", "val1", "val2", "val3", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create with values")
    void test_create_with_values() {
        Tuple4 actual = Tuple4.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3);
        check(actual, TUPLE_4);
    }

    @Test
    @DisplayName("Create Tuple4 from an array")
    void test_create_from_array() {
        Tuple4 actual = Tuple4.from(new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3 });
        check(actual, TUPLE_4);
    }

    @Test
    @DisplayName("Create from an iterable")
    void test_create_from_iterable() {
        Tuple4 actual = Tuple4.from(new ArrayList<>(Arrays.asList(OBJ_0, OBJ_1, OBJ_2, OBJ_3)));
        check(actual, TUPLE_4);
    }

    @Test
    @DisplayName("Create Tuple4 from an iterable index")
    void test_Tuple1_iterable_index() {
        List objects = Arrays.asList(SKIP, SKIP, SKIP, OBJ_0, OBJ_1, OBJ_2, OBJ_3);
        check(Tuple4.from(objects,3), TUPLE_4);
    }

    @Test
    @DisplayName("Set items")
    void test_set_items() {
        check(tuple4(OBJ_X, OBJ_1, OBJ_2, OBJ_3).set0(OBJ_0), TUPLE_4);
        check(tuple4(OBJ_0, OBJ_X, OBJ_2, OBJ_3).set1(OBJ_1), TUPLE_4);
        check(tuple4(OBJ_0, OBJ_1, OBJ_X, OBJ_3).set2(OBJ_2), TUPLE_4);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_X).set3(OBJ_3), TUPLE_4);
    }

    @Test
    @DisplayName("Remove items")
    void test_remove_items() {
        check(tuple4(OBJ_X, OBJ_0, OBJ_1, OBJ_2).remove0(), TUPLE_3);
        check(tuple4(OBJ_0, OBJ_X, OBJ_1, OBJ_2).remove1(), TUPLE_3);
        check(tuple4(OBJ_0, OBJ_1, OBJ_X, OBJ_2).remove2(), TUPLE_3);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_X).remove3(), TUPLE_3);
    }

    @Test
    @DisplayName("Return Tuple5 after inserting a Tuple1 at positions 0 to 4")
    void test_insert_tuple1_return_tuple5() {
        check(tuple4(OBJ_1, OBJ_2, OBJ_3, OBJ_4).insertAt0(tuple1(OBJ_0)), TUPLE_5);
        check(tuple4(OBJ_0, OBJ_2, OBJ_3, OBJ_4).insertAt1(tuple1(OBJ_1)), TUPLE_5);
        check(tuple4(OBJ_0, OBJ_1, OBJ_3, OBJ_4).insertAt2(tuple1(OBJ_2)), TUPLE_5);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_4).insertAt3(tuple1(OBJ_3)), TUPLE_5);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3).append(tuple1(OBJ_4)), TUPLE_5);
    }

    @Test
    @DisplayName("Return Tuple5 after inserting a Tuple2 at positions 0 to 4")
    void test_insert_tuple2_return_tuple6() {
        check(tuple4(OBJ_2, OBJ_3, OBJ_4, OBJ_5).insertAt0(tuple2(OBJ_0, OBJ_1)), TUPLE_6);
        check(tuple4(OBJ_0, OBJ_3, OBJ_4, OBJ_5).insertAt1(tuple2(OBJ_1, OBJ_2)), TUPLE_6);
        check(tuple4(OBJ_0, OBJ_1, OBJ_4, OBJ_5).insertAt2(tuple2(OBJ_2, OBJ_3)), TUPLE_6);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_5).insertAt3(tuple2(OBJ_3, OBJ_4)), TUPLE_6);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3).append(tuple2(OBJ_4, OBJ_5)), TUPLE_6);
    }

    @Test
    @DisplayName("Return Tuple7 after inserting a Tuple3 at positions 0 to 4")
    void test_insert_tuple3_return_tuple7() {
        check(tuple4(OBJ_3, OBJ_4, OBJ_5, OBJ_6).insertAt0(tuple3(OBJ_0, OBJ_1, OBJ_2)), TUPLE_7);
        check(tuple4(OBJ_0, OBJ_4, OBJ_5, OBJ_6).insertAt1(tuple3(OBJ_1, OBJ_2, OBJ_3)), TUPLE_7);
        check(tuple4(OBJ_0, OBJ_1, OBJ_5, OBJ_6).insertAt2(tuple3(OBJ_2, OBJ_3, OBJ_4)), TUPLE_7);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_6).insertAt3(tuple3(OBJ_3, OBJ_4, OBJ_5)), TUPLE_7);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3).append(tuple3(OBJ_4, OBJ_5, OBJ_6)), TUPLE_7);
    }

    @Test
    @DisplayName("Return Tuple8 after inserting a Tuple4 at positions 0 to 4")
    void test_insert_tuple4_return_tuple8() {
        check(tuple4(OBJ_4, OBJ_5, OBJ_6, OBJ_7).insertAt0(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3)), TUPLE_8);
        check(tuple4(OBJ_0, OBJ_5, OBJ_6, OBJ_7).insertAt1(tuple4(OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_8);
        check(tuple4(OBJ_0, OBJ_1, OBJ_6, OBJ_7).insertAt2(tuple4(OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_8);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_7).insertAt3(tuple4(OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_8);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3).append(tuple4(OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_8);
    }

    @Test
    @DisplayName("Return Tuple9 after inserting a Tuple5 at positions 0 to 4")
    void test_insert_tuple5_return_tuple9() {
        check(tuple4(OBJ_5, OBJ_6, OBJ_7, OBJ_8).insertAt0(tuple5(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_9);
        check(tuple4(OBJ_0, OBJ_6, OBJ_7, OBJ_8).insertAt1(tuple5(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_9);
        check(tuple4(OBJ_0, OBJ_1, OBJ_7, OBJ_8).insertAt2(tuple5(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_9);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_8).insertAt3(tuple5(OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_9);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3).append(tuple5(OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_9);
    }

    @Test
    @DisplayName("Return Tuple10 after inserting a Tuple6 at positions 0 to 4")
    void test_insert_tuple6_return_tuple10() {
        check(tuple4(OBJ_6, OBJ_7, OBJ_8, OBJ_9).insertAt0(tuple6(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_10);
        check(tuple4(OBJ_0, OBJ_7, OBJ_8, OBJ_9).insertAt1(tuple6(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_10);
        check(tuple4(OBJ_0, OBJ_1, OBJ_8, OBJ_9).insertAt2(tuple6(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_10);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_9).insertAt3(tuple6(OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_10);
        check(tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3).append(tuple6(OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9)), TUPLE_10);
    }

}
