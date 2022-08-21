package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tuple3Test extends TupleTestBase {

    @Test
    @DisplayName("test_equality")
    void test_tuple_equality() {
        EqualsVerifier.forClass(Tuple3.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("val0", "val1", "val2", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create with values")
    void test_create_with_values() {
        Tuple3 actual = Tuple3.of(OBJ_0, OBJ_1, OBJ_2);
        check(actual, TUPLE_3);
    }

    @Test
    @DisplayName("Create Tuple3 from an array")
    void test_create_from_array() {
        Tuple3 actual = Tuple3.from(new String[] { OBJ_0, OBJ_1, OBJ_2 });
        check(actual, TUPLE_3);
    }

    @Test
    @DisplayName("Create from an iterable")
    void test_create_from_iterable() {
        Tuple3 actual = Tuple3.from(new ArrayList<>(Arrays.asList(OBJ_0, OBJ_1, OBJ_2)));
        check(actual, TUPLE_3);
    }

    @Test
    @DisplayName("Create Tuple3 from an iterable index")
    void test_Tuple3_iterable_index() {
        List objects = Arrays.asList(SKIP, SKIP, OBJ_0, OBJ_1, OBJ_2);
        check(Tuple3.from(objects,2), TUPLE_3);
    }

    @Test
    @DisplayName("Set items")
    void test_set_items() {
        check(Tuple3.tuple3(OBJ_X, OBJ_1, OBJ_2).set0(OBJ_0), TUPLE_3);
        check(Tuple3.tuple3(OBJ_0, OBJ_X, OBJ_2).set1(OBJ_1), TUPLE_3);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_X).set2(OBJ_2), TUPLE_3);
    }

    @Test
    @DisplayName("Remove items")
    void test_remove_items() {
        check(Tuple3.tuple3(OBJ_X, OBJ_0, OBJ_1).remove0(), TUPLE_2);
        check(Tuple3.tuple3(OBJ_0, OBJ_X, OBJ_1).remove1(), TUPLE_2);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_X).remove2(), TUPLE_2);
    }

    @Test
    @DisplayName("Return Tuple4 after inserting a Tuple1 at positions 0 to 3")
    void test_insert_tuple1_return_tuple4() {
        check(Tuple3.tuple3(OBJ_1, OBJ_2, OBJ_3).insertAt0(Tuple1.tuple1(OBJ_0)), TUPLE_4);
        check(Tuple3.tuple3(OBJ_0, OBJ_2, OBJ_3).insertAt1(Tuple1.tuple1(OBJ_1)), TUPLE_4);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_3).insertAt2(Tuple1.tuple1(OBJ_2)), TUPLE_4);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2).append(Tuple1.tuple1(OBJ_3)), TUPLE_4);
    }

    @Test
    @DisplayName("Return Tuple5 after inserting a Tuple2 at positions 0 to 3")
    void test_insert_tuple2_return_tuple5() {
        check(Tuple3.tuple3(OBJ_2, OBJ_3, OBJ_4).insertAt0(Tuple2.tuple2(OBJ_0, OBJ_1)), TUPLE_5);
        check(Tuple3.tuple3(OBJ_0, OBJ_3, OBJ_4).insertAt1(Tuple2.tuple2(OBJ_1, OBJ_2)), TUPLE_5);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_4).insertAt2(Tuple2.tuple2(OBJ_2, OBJ_3)), TUPLE_5);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2).append(Tuple2.tuple2(OBJ_3, OBJ_4)), TUPLE_5);
    }

    @Test
    @DisplayName("Return Tuple6 after inserting a Tuple3 at positions 0 to 3")
    void test_insert_tuple3_return_tuple6() {
        check(Tuple3.tuple3(OBJ_3, OBJ_4, OBJ_5).insertAt0(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2)), TUPLE_6);
        check(Tuple3.tuple3(OBJ_0, OBJ_4, OBJ_5).insertAt1(Tuple3.tuple3(OBJ_1, OBJ_2, OBJ_3)), TUPLE_6);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_5).insertAt2(Tuple3.tuple3(OBJ_2, OBJ_3, OBJ_4)), TUPLE_6);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2).append(Tuple3.tuple3(OBJ_3, OBJ_4, OBJ_5)), TUPLE_6);
    }

    @Test
    @DisplayName("Return Tuple7 after inserting a Tuple4 at positions 0 to 3")
    void test_insert_tuple4_return_tuple7() {
        check(Tuple3.tuple3(OBJ_4, OBJ_5, OBJ_6).insertAt0(Tuple4.tuple4(OBJ_0, OBJ_1, OBJ_2, OBJ_3)), TUPLE_7);
        check(Tuple3.tuple3(OBJ_0, OBJ_5, OBJ_6).insertAt1(Tuple4.tuple4(OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_7);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_6).insertAt2(Tuple4.tuple4(OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_7);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2).append(Tuple4.tuple4(OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_7);
    }

    @Test
    @DisplayName("Return Tuple8 after inserting a Tuple5 at positions 0 to 2")
    void test_insert_tuple5_return_tuple8() {
        check(Tuple3.tuple3(OBJ_5, OBJ_6, OBJ_7).insertAt0(Tuple5.tuple5(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_8);
        check(Tuple3.tuple3(OBJ_0, OBJ_6, OBJ_7).insertAt1(Tuple5.tuple5(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_8);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_7).insertAt2(Tuple5.tuple5(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_8);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2).append(Tuple5.tuple5(OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_8);
    }

    @Test
    @DisplayName("Return Tuple8 after inserting a Tuple6 at positions 0 to 2")
    void test_insert_tuple6_return_tuple9() {
        check(Tuple3.tuple3(OBJ_6, OBJ_7, OBJ_8).insertAt0(Tuple6.tuple6(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_9);
        check(Tuple3.tuple3(OBJ_0, OBJ_7, OBJ_8).insertAt1(Tuple6.tuple6(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_9);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_8).insertAt2(Tuple6.tuple6(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_9);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2).append(Tuple6.tuple6(OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_9);
    }

    @Test
    @DisplayName("Return Tuple9 after inserting a Tuple7 at positions 0 to 2")
    void test_insert_tuple7_return_tuple9() {
        check(Tuple3.tuple3(OBJ_7, OBJ_8, OBJ_9).insertAt0(Tuple7.tuple7(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_10);
        check(Tuple3.tuple3(OBJ_0, OBJ_8, OBJ_9).insertAt1(Tuple7.tuple7(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_10);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_9).insertAt2(Tuple7.tuple7(OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_10);
        check(Tuple3.tuple3(OBJ_0, OBJ_1, OBJ_2).append(Tuple7.tuple7(OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9)), TUPLE_10);
    }

}
