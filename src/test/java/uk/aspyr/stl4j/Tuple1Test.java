package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Tuple1Test extends TupleTestBase {

    @Test
    @DisplayName("test_equality")
    void test_tuple_equality() {
        EqualsVerifier.forClass(Tuple1.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("val0", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create Tuple1 with a single value")
    void testTuple1_values() {
        Tuple1 actual = Tuple1.tuple1(OBJ_0);
        check(actual, TUPLE_1);
    }

    @Test
    @DisplayName("Create Tuple1 from an array")
    void test_create_from_array() {
        Tuple1 actual = Tuple1.from(new String[] { OBJ_0 });
        check(actual, TUPLE_1);
    }

    @Test
    @DisplayName("Create Tuple1 from an iterable")
    void test_Tuple1_iterable() {
        Tuple1 actual = Tuple1.from(new ArrayList<>(Arrays.asList(OBJ_0)));
        check(actual, TUPLE_1);
    }

    @Test
    @DisplayName("Create Tuple1 from an iterable index")
    void test_Tuple1_iterable_index() {
        List objects = Arrays.asList(OBJ_0);
        check(Tuple1.from(objects,0), TUPLE_1);
    }

    @Test
    @DisplayName("Set items")
    void test_set_items() {
        check(Tuple1.tuple1(OBJ_0).set(OBJ_1), Tuple1.tuple1(OBJ_1));
    }

    @Test
    @DisplayName("Return Tuple2 after inserting a Tuple1 at positions 0 to 1")
    void test_insert_tuple1_return_tuple2() {
        check(Tuple1.tuple1(OBJ_1).insertAt0(Tuple1.tuple1(OBJ_0)), TUPLE_2);
        check(Tuple1.tuple1(OBJ_0).append(Tuple1.tuple1(OBJ_1)), TUPLE_2);
    }

    @Test
    @DisplayName("Return Tuple3 after inserting a Tuple2 at positions 0 to 1")
    void test_insert_tuple2_return_tuple3() {
        check(Tuple1.of(OBJ_2).insertAt0(Tuple2.of(OBJ_0, OBJ_1)), TUPLE_3);
        check(Tuple1.of(OBJ_0).append(Tuple2.of(OBJ_1, OBJ_2)), TUPLE_3);
    }

    @Test
    @DisplayName("Return Tuple4 after inserting a Tuple3 at positions 0 to 1")
    void test_insert_tuple3_return_tuple4() {
        check(Tuple1.of(OBJ_3).insertAt0(Tuple3.of(OBJ_0, OBJ_1, OBJ_2)), TUPLE_4);
        check(Tuple1.of(OBJ_0).append(Tuple3.of(OBJ_1, OBJ_2, OBJ_3)), TUPLE_4);
    }

    @Test
    @DisplayName("Return Tuple5 after inserting a Tuple4 at positions 0 to 1")
    void test_insert_tuple4_return_tuple5() {
        check(Tuple1.of(OBJ_4).insertAt0(Tuple4.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3)), TUPLE_5);
        check(Tuple1.of(OBJ_0).append(Tuple4.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_5);
    }

    @Test
    @DisplayName("Return Tuple6 after inserting a Tuple5 at positions 0 to 1")
    void test_insert_tuple5_return_tuple6() {
        check(Tuple1.of(OBJ_5).insertAt0(Tuple5.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4)), TUPLE_6);
        check(Tuple1.of(OBJ_0).append(Tuple5.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_6);
    }

    @Test
    @DisplayName("Return Tuple7 after inserting a Tuple6 at positions 0 to 1")
    void test_insert_tuple6_return_tuple7() {
        check(Tuple1.of(OBJ_6).insertAt0(Tuple6.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5)), TUPLE_7);
        check(Tuple1.of(OBJ_0).append(Tuple6.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_7);
    }

    @Test
    @DisplayName("Return Tuple8 after inserting a Tuple7 at positions 0 to 1")
    void test_insert_tuple7_return_tuple8() {
        check(Tuple1.of(OBJ_7).insertAt0(Tuple7.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6)), TUPLE_8);
        check(Tuple1.of(OBJ_0).append(Tuple7.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_8);
    }

    @Test
    @DisplayName("Return Tuple9 after inserting a Tuple8 at positions 0 to 1")
    void test_insert_tuple8_return_tuple9() {
        check(Tuple1.of(OBJ_8).insertAt0(Tuple8.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7)), TUPLE_9);
        check(Tuple1.of(OBJ_0).append(Tuple8.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_9);
    }

    @Test
    @DisplayName("Return Tuple10 after inserting a Tuple9 at positions 0 to 1")
    void test_insert_tuple9_return_tuple10() {
        check(Tuple1.of(OBJ_9).insertAt0(Tuple9.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)), TUPLE_10);
        check(Tuple1.of(OBJ_0).append(Tuple9.of(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9)), TUPLE_10);
    }

}
