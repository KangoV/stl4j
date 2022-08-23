package uk.aspyr.stl4j;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.assertj.core.api.SoftAssertions;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.aspyr.stl4j.Tuple1.of;

public class TupleTestBase {

    static final String OBJ_0 = "0";
    static final String OBJ_1 = "1";
    static final String OBJ_2 = "2";
    static final String OBJ_3 = "3";
    static final String OBJ_4 = "4";
    static final String OBJ_5 = "5";
    static final String OBJ_6 = "6";
    static final String OBJ_7 = "7";
    static final String OBJ_8 = "8";
    static final String OBJ_9 = "9";

    static final String OBJ_X = "X"; // used as an object that will be replaced or removed
    static final String SKIP = "SKIP"; // used testing the loading from an iterable from an index
    static final String IGNORE = "IGNORE"; // used testing the loading from an iterable from an index

    static final Tuple1  TUPLE_1  = of    (OBJ_0);
    static final Tuple2  TUPLE_2  = Tuple2.of(OBJ_0, OBJ_1);
    static final Tuple3  TUPLE_3  = Tuple3.of(OBJ_0, OBJ_1, OBJ_2);
    static final Tuple4  TUPLE_4  = Tuple4.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3);
    static final Tuple5  TUPLE_5  = Tuple5.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4);
    static final Tuple6  TUPLE_6  = Tuple6.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5);
    static final Tuple7  TUPLE_7  = Tuple7.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6);
    static final Tuple8  TUPLE_8  = Tuple8.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7);
    static final Tuple9  TUPLE_9  = Tuple9.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8);
    static final Tuple10 TUPLE_10 = Tuple10.of(OBJ_0, OBJ_1, OBJ_2, OBJ_3, OBJ_4, OBJ_5, OBJ_6, OBJ_7, OBJ_8, OBJ_9);

    <T extends Tuple> void check(T actual, T expected) {
        assertThat(actual.getClass()).isEqualTo(expected.getClass());
        AssertionsForClassTypes.assertThat(actual).isEqualTo(expected);
        SoftAssertions.assertSoftly(softly -> {
            if (actual instanceof Item0)
                softly.assertThat(((Item0)actual).item0()).as("check item0").isEqualTo(((Item0)expected).item0());
            if (actual instanceof Item1)
                softly.assertThat(((Item1)actual).item1()).as("check item1").isEqualTo(((Item1)expected).item1());
            if (actual instanceof Item2)
                softly.assertThat(((Item2)actual).item2()).as("check item2").isEqualTo(((Item2)expected).item2());
            if (actual instanceof Item3)
                softly.assertThat(((Item3)actual).item3()).as("check item3").isEqualTo(((Item3)expected).item3());
            if (actual instanceof Item4)
                softly.assertThat(((Item4)actual).item4()).as("check item4").isEqualTo(((Item4)expected).item4());
            if (actual instanceof Item5)
                softly.assertThat(((Item5)actual).item5()).as("check item5").isEqualTo(((Item5)expected).item5());
            if (actual instanceof Item6)
                softly.assertThat(((Item6)actual).item6()).as("check item6").isEqualTo(((Item6)expected).item6());
            if (actual instanceof Item7)
                softly.assertThat(((Item7)actual).item7()).as("check item7").isEqualTo(((Item7)expected).item7());
            if (actual instanceof Item8)
                softly.assertThat(((Item8)actual).item8()).as("check item8").isEqualTo(((Item8)expected).item8());
            if (actual instanceof Item9)
                softly.assertThat(((Item9)actual).item9()).as("check item0").isEqualTo(((Item9)expected).item9());
            if (actual instanceof ValueKey)
                softly.assertThat(((ValueKey)actual).key()).as("check key").isEqualTo(((ValueKey)expected).key());
            if (actual instanceof ValueLabel)
                softly.assertThat(((ValueLabel)actual).label()).as("check label").isEqualTo(((ValueLabel)expected).label());
            if (actual instanceof ValueValue)
                softly.assertThat(((ValueValue)actual).value()).as("check label").isEqualTo(((ValueValue)expected).value());
        });
    }
}
