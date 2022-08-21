package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static uk.aspyr.stl4j.LabelValue.keyValue;

public class LabelValueTest extends TupleTestBase {

    private static final String LABEL = "L";
    private static final String VALUE = "V";
    private static final LabelValue<String,String> LABEL_VALUE = LabelValue.of(LABEL, VALUE);


    @Test
    @DisplayName("test_equality")
    void test_equality() {
        EqualsVerifier.forClass(LabelValue.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("label", "value", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create with 2 values")
    void test_create_with_values() {
        check(LabelValue.of(LABEL, VALUE), LABEL_VALUE);
    }

    @Test
    @DisplayName("Create from an array")
    void test_create_from_array() {
        check(LabelValue.from(new String[] {LABEL, VALUE }), LABEL_VALUE);
    }

    @Test
    @DisplayName("Create from an Iterable")
    void test_create_from_iterable() {
        check(LabelValue.from(new ArrayList<>(Arrays.asList(LABEL, VALUE))), LABEL_VALUE);
    }

    @Test
    @DisplayName("Create from an iterable index")
    void test_iterable_index() {
        check(LabelValue.from(Arrays.asList(SKIP, LABEL, VALUE),1), LABEL_VALUE);
    }

    @Test
    @DisplayName("Set key and value")
    void test_set_key_and_value() {
        check(keyValue("KEY", VALUE).setLabel(LABEL), LABEL_VALUE);
        check(keyValue(LABEL, "VALUE").setValue(VALUE), LABEL_VALUE);
    }

}
