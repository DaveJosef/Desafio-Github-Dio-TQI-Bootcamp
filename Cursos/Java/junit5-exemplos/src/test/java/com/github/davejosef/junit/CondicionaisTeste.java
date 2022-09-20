package com.github.davejosef.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsuarioDavid() {

        Assertions.assertEquals(10, 5 + 5);
    }
}
