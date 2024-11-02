package lotto.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BonusNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -1 ,46})
    @DisplayName("보너스 번호가 범위를 벗어나면 예외가 발생한다.")
    void 보너스_번호가_범위를_벗어나면_예외가_발생한다(final Integer bonusNumber) {
        assertThatThrownBy(() -> new BonusNumber(bonusNumber))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 보너스 숫자는 1부터 45사이의 숫자여야 합니다.");
    }

    @DisplayName("보너스 번호를 알려준다.")
    @Test
    void 보너스_번호_알려준다() {
        BonusNumber bonusNumber = new BonusNumber(45);

        assertThat(bonusNumber.getBonusNumber()).isEqualTo(45);
    }

}