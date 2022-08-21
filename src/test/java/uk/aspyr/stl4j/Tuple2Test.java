package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static uk.aspyr.stl4j.Tuple1.tuple1;
import static uk.aspyr.stl4j.Tuple2.tuple2;

public class Tuple2Test extends TupleTestBase {

    @Test
    @DisplayName("test_equality")
    void test_tuple_equality() {
        EqualsVerifier.forClass(Tuple2.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("val0", "val1", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create with 2 values")
    void test_create_with_values() {
        Tuple2 actual = Tuple2.of(OBJ_0, OBJ_1);
        check(actual, TUPLE_2);
    }

    @Test
    @DisplayName("Create Tuple2 from an array")
    void test_create_from_array() {
        Tuple2 actual = Tuple2.from(new String[] { OBJ_0, OBJ_1 });
        check(actual, TUPLE_2);
    }

    @Test
    @DisplayName("Create from an Iterable")
    void test_create_from_iterable() {
        Tuple2 actual = Tuple2.from(new ArrayList<>(Arrays.asList(OBJ_0, OBJ_1)));
        check(actual, TUPLE_2);
    }

    @Test
    @DisplayName("Create Tuple2 from an iterable index")
    void test_Tuple1_iterable_index() {
        List objects = Arrays.asList(SKIP, OBJ_0, OBJ_1);
        check(Tuple2.from(objects,1), TUPLE_2);
    }

    @Test
    @DisplayName("Set items")
    void test_set_items() {
        check(tuple2(OBJ_2, OBJ_1).set0(OBJ_0), TUPLE_2);
        check(tuple2(OBJ_0, OBJ_2).set1(OBJ_1), TUPLE_2);
    }

    @Test
    @DisplayName("Remove items")
    void test_remove_items() {
        check(tuple2(OBJ_1, OBJ_0).remove0(), TUPLE_1);
        check(tuple2(OBJ_0, OBJ_1).remove1(), TUPLE_1);
    }

    @Test
    @DisplayName("Return Tuple3 after inserting a Tuple1 at positions 0 to 2")
    void test_insert_tuple1_return_tuple3() {
        check(tuple2(OBJ_1, OBJ_2).insertAt0(tuple1(OBJ_0)), TUPLE_3);
        check(tuple2(OBJ_0, OBJ_2).insertAt1(tuple1(OBJ_1)), TUPLE_3);
        check(tuple2(OBJ_0, OBJ_1).append(tuple1(OBJ_2)), TUPLE_3);
    }

    @Test
    @DisplayName("Return Tuple4 after inserting a Tuple2 at positions 0 to 2")
    void test_insert_tuple2_return_tuple4() {
        check(tuple2(OBJ_2, OBJ_3).insertAt0(tuple2(OBJ_0, OBJ_1)), TUPLE_4);
        check(tuple2(OBJ_0, OBJ_3).insertAt1(tuple2(OBJ_1, OBJ_2)), TUPLE_4);
        check(tuple2(OBJ_0, OBJ_1).append(tuple2(OBJ_2, OBJ_3)), TUPLE_4);
    }

    @Test
    @DisplayName("Return Tuple5 after inserting a Tuple3 at positions 0 to 2")
    void test_insert_tuple3_return_tuple5() {
        check(tuple2(OBJ_3, OBJ_4).insertAt0(Tuple3.of(OBJ_0, OBJ_1, OBJ_2)), TUPLE_5);
        check(tuple2(OBJ_0, OBJ_4).insertAt1(Tuple3.of(OBJ_1, OBJ_2, OBJ_3)), TUPLE_5);
        check(tuple2(OBJ_0, OBJ_1).append(Tuple3.of(OBJ_2, OBJ_3, OBJ_4)), TUPLE_5);
    }

    @Test
    @DisplayName("Return Tuple6 after inserting a Tuple4 at positions 0 to 2")
    void test_insert_tuple4_return_tuple6() {
        check(tuple2(OBJ_4, OBJ_5).insertAt0(Tuple4.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3)), TUPLE_6);
        check(tuple2(OBJ_0, OBJ_5).insertAt1(Tuple4.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_6);
        check(tuple2(OBJ_0, OBJ_1).append(Tuple4.of(OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_6);
    }

    @Test
    @DisplayName("Return Tuple7 after inserting a Tuple5 at positions 0 to 2")
    void test_insert_tuple5_return_tuple7() {
        check(tuple2(OBJ_5, OBJ_6).insertAt0(Tuple5.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_7);
        check(tuple2(OBJ_0, OBJ_6).insertAt1(Tuple5.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_7);
        check(tuple2(OBJ_0, OBJ_1).append(Tuple5.of(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_7);
    }

    @Test
    @DisplayName("Return Tuple8 after inserting a Tuple6 at positions 0 to 2")
    void test_insert_tuple6_return_tuple8() {
        check(tuple2(OBJ_6, OBJ_7).insertAt0(Tuple6.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_8);
        check(tuple2(OBJ_0, OBJ_7).insertAt1(Tuple6.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_8);
        check(tuple2(OBJ_0, OBJ_1).append(Tuple6.of(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_8);
    }

    @Test
    @DisplayName("Return Tuple9 after inserting a Tuple7 at positions 0 to 2")
    void test_insert_tuple7_return_tuple9() {
        check(tuple2(OBJ_7, OBJ_8).insertAt0(Tuple7.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_9);
        check(tuple2(OBJ_0, OBJ_8).insertAt1(Tuple7.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_9);
        check(tuple2(OBJ_0, OBJ_1).append(Tuple7.of(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_9);
    }

    @Test
    @DisplayName("Return Tuple10 after inserting a Tuple8 at positions 0 to 2")
    void test_insert_tuple8_return_tuple10() {
        check(tuple2(OBJ_8, OBJ_9).insertAt0(Tuple8.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_10);
        check(tuple2(OBJ_0, OBJ_9).insertAt1(Tuple8.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_10);
        check(tuple2(OBJ_0, OBJ_1).append(Tuple8.of(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9)), TUPLE_10);
    }

}
