package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static uk.aspyr.stl4j.Tuple10.tuple10;

public class Tuple10Test extends TupleTestBase {

    @Test
    @DisplayName("test_equality")
    void test_tuple_equality() {
        EqualsVerifier.forClass(Tuple10.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("val0", "val1", "val2", "val3", "val4", "val5", "val6", "val7", "val8", "val9", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create with values")
    void test_create_with_values() {
        Tuple10 actual = Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);
        check(actual, TUPLE_10);
    }

    @Test
    @DisplayName("Create Tuple10 from an array")
    void test_create_from_array() {
        Tuple10 actual = Tuple10.from(new String[] { OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9 });
        check(actual, TUPLE_10);
    }

    @Test
    @DisplayName("Create from an iterable")
    void test_create_from_iterable() {
        Tuple10 actual = Tuple10.from(new ArrayList<>(Arrays.asList(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9)));
        check(actual, TUPLE_10);
    }

    @Test
    @DisplayName("Create Tuple10 from an iterable index")
    void test_Tuple10_iterable_index() {
        List objects = Arrays.asList(SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, SKIP, OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);
        check(Tuple10.from(objects,9), TUPLE_10);
    }

    @Test
    @DisplayName("Set item 0 to 8")
    void test_set_item() {
        check(tuple10(OBJ_X, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).set0(OBJ_0), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_X, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).set1(OBJ_1), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_X, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).set2(OBJ_2), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_X, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).set3(OBJ_3), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_X, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9).set4(OBJ_4), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_X, OBJ_6, OBJ_7, OBJ_8, OBJ_9).set5(OBJ_5), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_X, OBJ_7, OBJ_8, OBJ_9).set6(OBJ_6), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_X, OBJ_8, OBJ_9).set7(OBJ_7), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_X, OBJ_9).set8(OBJ_8), TUPLE_10);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_X).set9(OBJ_9), TUPLE_10);
    }

    @Test
    @DisplayName("Remove item 0 to 7")
    void test_remove_item() {
        check(tuple10(OBJ_X, OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).remove0(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_X, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).remove1(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_X, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).remove2(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_X, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).remove3(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_X, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8).remove4(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_X, OBJ_5, OBJ_6, OBJ_7, OBJ_8).remove5(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_X, OBJ_6, OBJ_7, OBJ_8).remove6(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_X, OBJ_7, OBJ_8).remove7(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_X, OBJ_8).remove8(), TUPLE_9);
        check(tuple10(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_X).remove9(), TUPLE_9);
    }

}
