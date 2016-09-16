package com.mutant.service;

import com.mutant.dummy.DummyService;

/**
 * User: Yuriy
 * Date: 14/09/16
 * Time: 00:35
 */
public class WriteService {

    public static boolean writeToDisk(final String correct) {
        if (correct.isEmpty())
            return false;
        someSuperMethodToProceedWithInput(correct);
        DummyService.dummyCall();
        return true;
    }

    private static void someSuperMethodToProceedWithInput(final String input) {
        System.out.println(input);
    }
}
