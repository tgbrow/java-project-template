package com.tgbrow.javaproj;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MySupportClassTest {
    @Test
    public void testNumberOne() {
        MySupportClass x = new MySupportClass("This is my string!");
        assertThat(x.myString).isEqualTo("This is my string!");
    }
}
