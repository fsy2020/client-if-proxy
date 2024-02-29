package com.nsynus.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum PmMode {
    NORMAL(0),
    PM_MODE(1),
    PM_CHANGING(2);

    @EnumValue
    private final int value;

    PmMode(int value) {
        this.value = value;
    }
}
