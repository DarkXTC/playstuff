/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.darkxtc.test.runnerlib;

import java.util.logging.Logger;
import junit.framework.TestCase;
import junit.textui.TestRunner;


public class RunClassTest extends TestCase {
    private final String name = "Forest";

    /**
     *
     */
    public void testGetRunText() {
        assertEquals(name + " runs like shit!", new RunClass(name).getRunText());
    }
    
    /**
     *
     */
    public void testKeepRunning() {
        assertEquals("Keep on running " + name, new RunClass(name).getKeepRunning());
    }
    
    /**
     *
     */
    public void testStoppRunning() {
        assertEquals(name + " stopped running", new RunClass(name).getStopRunning());
    }

    /**
     *
     */
    public RunClassTest() {
        super();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        TestRunner.run(RunClassTest.class);
    }
    private static final Logger LOG = Logger.getLogger(RunClassTest.class.getName());
}
