package com.mutant.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Muksia
 * Date: 14/09/16
 * Time: 00:35
 */
public class WriteServiceTest {

    @Test
    public void shouldReturnTrueOnValidInput() {
        assertEquals(true, WriteService.writeToDisk("correct"));
    }

    @Test
    public void shouldReturnFalseOnEmptyInput() {
        assertEquals(false, WriteService.writeToDisk(""));
    }

}
