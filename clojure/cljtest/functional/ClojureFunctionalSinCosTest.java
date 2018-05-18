package cljtest.functional;

import cljtest.multi.MultiSinCosTests;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class ClojureFunctionalSinCosTest extends ClojureFunctionalExpressionTest {
    protected ClojureFunctionalSinCosTest(final boolean testMulti) {
        super(new MultiSinCosTests(testMulti));
    }

    public static void main(final String... args) {
        new ClojureFunctionalSinCosTest(mode(args, ClojureFunctionalSinCosTest.class)).run();
    }
}
