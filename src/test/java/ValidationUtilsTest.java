import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {

    @ParameterizedTest
    @CsvSource({"test,true", "razer,true", "badcar,false", "racingcar, false"})
    public void stringValid(String carName, boolean expected){
        assertThat(ValidationUtils.validCarName(carName)).isEqualTo(expected);
    }

    @Test
    void Valid_1_to_9() {
        assertThat(ValidationUtils.validNo(1)).isEqualTo(true);
        assertThat(ValidationUtils.validNo(9)).isEqualTo(true);
        assertThat(ValidationUtils.validNo(0)).isEqualTo(false);
        assertThat(ValidationUtils.validNo(10)).isEqualTo(false);
    }
}
