package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static uk.aspyr.stl4j.Tuple1.tuple1;
import static uk.aspyr.stl4j.Tuple9.tuple9;

public class Tuple9Test extends TupleTestBase {

    @Test
    @DisplayName("test_equality")
    void test_tuple_equality() {
        EqualsVerifier.forClass(Tuple9.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("val0", "val1", "val2", "val3", "val4", "val5", "val6", "val7", "val8", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create with values")
    void test_create_with_values() {
        Tuple9 actual = Tuple9.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8);
        check(actual, TUPLE_9);
    }

    @Test
    @DisplayName("Create Tuple9 from an array")
    void test_create_from_array() {
        Tuple9 actual = Tuple9.from(new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8 });
        check(actual, TUPLE_9);
    }

    @Test
    @DisplayName("Create from an iterable")
    void test_create_from_iterable() {
        Tuple9 actual = Tuple9.from(new ArrayList<>(Arrays.asList(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8)));
        check(actual, TUPLE_9);
    }

    @Test
    @DisplayName("Create Tuple9 from an iterable index")
    void test_Tuple9_iterable_index() {
        List objects = Arrays.asList(SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8);
        check(Tuple9.from(objects,8), TUPLE_9);
    }

    @Test
    @DisplayName("Set item 0 to 8")
    void test_set_item() {
        check(tuple9(OBJ_X, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).set0(OBJ_0), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_X, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).set1(OBJ_1), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_1, OBJ_X, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).set2(OBJ_2), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_X, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).set3(OBJ_3), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_X, OBJ_5, OBJ_6, OBJ_7, OBJ_8).set4(OBJ_4), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_X, OBJ_6, OBJ_7, OBJ_8).set5(OBJ_5), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_X, OBJ_7, OBJ_8).set6(OBJ_6), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_X, OBJ_8).set7(OBJ_7), TUPLE_9);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_X).set8(OBJ_8), TUPLE_9);
    }

    @Test
    @DisplayName("Remove item 0 to 7")
    void test_remove_item() {
        check(tuple9(OBJ_X, OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7).remove0(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_X, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7).remove1(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_1, OBJ_X, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7).remove2(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_X, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7).remove3(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_X, OBJ_4, OBJ_5, OBJ_6, OBJ_7).remove4(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_X, OBJ_5, OBJ_6, OBJ_7).remove5(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_X, OBJ_6, OBJ_7).remove6(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_X, OBJ_7).remove7(), TUPLE_8);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_X).remove8(), TUPLE_8);
    }

    @Test
    @DisplayName("Return Tuple10 after inserting a Tuple1 at positions 0 to 9")
    void test_insert_tuple1_return_tuple10() {
        check(tuple9(OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).insertAt0(tuple1(OBJ_0)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).insertAt1(tuple1(OBJ_1)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).insertAt2(tuple1(OBJ_2)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).insertAt3(tuple1(OBJ_3)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).insertAt4(tuple1(OBJ_4)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_6, OBJ_7, OBJ_8, OBJ_9).insertAt5(tuple1(OBJ_5)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_7, OBJ_8, OBJ_9).insertAt6(tuple1(OBJ_6)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_8, OBJ_9).insertAt7(tuple1(OBJ_7)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_9).insertAt8(tuple1(OBJ_8)), TUPLE_10);
        check(tuple9(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).append(tuple1(OBJ_9)), TUPLE_10);
    }

}
