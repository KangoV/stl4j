package uk.aspyr.stl4j;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static uk.aspyr.stl4j.KeyValue.keyValue;

public class KeyValueTest extends TupleTestBase {

    private static final String KEY = "K";
    private static final String VALUE = "V";
    private static final KeyValue<String,String> KEY_VALUE = KeyValue.of(KEY, VALUE);


    @Test
    @DisplayName("test_equality")
    void test_equality() {
        EqualsVerifier.forClass(KeyValue.class)
            .withRedefinedSuperclass()
            .withIgnoredFields("key", "value", "valueArray")
            .verify();
    }

    @Test
    @DisplayName("Create with 2 values")
    void test_create_with_values() {
        check(KeyValue.of(KEY, VALUE), KEY_VALUE);
    }

    @Test
    @DisplayName("Create from an array")
    void test_create_from_array() {
        check(KeyValue.from(new String[] { KEY, VALUE }), KEY_VALUE);
    }

    @Test
    @DisplayName("Create from an Iterable")
    void test_create_from_iterable() {
        check(KeyValue.from(new ArrayList<>(Arrays.asList(KEY, VALUE))), KEY_VALUE);
    }

    @Test
    @DisplayName("Create from an iterable index")
    void test_iterable_index() {
        check(KeyValue.from(Arrays.asList(SKIP, KEY, VALUE),1), KEY_VALUE);
    }

    @Test
    @DisplayName("Set key and value")
    void test_set_key_and_value() {
        check(keyValue("KEY", VALUE).setKey(KEY), KEY_VALUE);
        check(keyValue(KEY, "VALUE").setValue(VALUE), KEY_VALUE);
    }

}
