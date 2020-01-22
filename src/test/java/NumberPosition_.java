import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberPosition_ {

    private NumberPosition numberPosition;
    private Object[][] case_0, case_1, case_10, case_11, case_803, case_833;

    @Before
    public void setUp() {
        numberPosition = new NumberPosition();
        case_0 = new Object[][]{};
        case_1 = new Object[][]{{1,0}};
        case_10 = new Object[][]{{1,1}};
        case_11 = new Object[][]{{1,1},{1,0}};
        case_803 = new Object[][]{{8,2},{3,0}};
        case_833 = new Object[][]{{8,2},{3,1},{3,0}};
    }

    @Test
    public void given_0_should_return_case_0() {
        assertThat(numberPosition.of(0)).isEqualTo(case_0);
    }

    @Test
    public void given_1_should_return_case_1() {
        assertThat(numberPosition.of(1)).isEqualTo(case_1);
    }

    @Test
    public void given_10_should_return_case_10() {
        assertThat(numberPosition.of(10)).isEqualTo(case_10);
    }

    @Test
    public void given_11_should_return_case_11() {
        assertThat(numberPosition.of(11)).isEqualTo(case_11);
    }

    @Test
    public void given_803_should_return_case_803() {
        assertThat(numberPosition.of(803)).isEqualTo(case_803);
    }

    @Test
    public void given_833_should_return_case_833() {
        assertThat(numberPosition.of(833)).isEqualTo(case_833);
    }

}
