package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeanTest {



    @Test
    void myNextTest() {
        String[] expectedOutput = {"Dean", "Jepson", "Bourne"};
        String[] methodOutput = {"Dean", "Jepson", "Bourne"};
        assertArrayEquals(expectedOutput, methodOutput);
    }

}