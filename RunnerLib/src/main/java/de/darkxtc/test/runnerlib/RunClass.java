/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.darkxtc.test.runnerlib;

import java.util.logging.Logger;


public class RunClass {
    private final String name;

    /**
     *
     * @param name
     */
    public RunClass(String name) {
        this.name = name;
    }

    /**
     *
     */
    public void run() {
        System.out.println(name + " runs like shit!");
    }

    /**
     *
     * @return
     */
    public String getRunText() {
        return name + " runs like shit!";
    }

    /**
     *
     * @return
     */
    public String getKeepRunning() {
        return "Keep on running " + name;
    }
    
    /**
     *
     * @return
     */
    public String getStopRunning() {
        return name + " stopped running";
    }
    private static final Logger LOG = Logger.getLogger(RunClass.class.getName());
}
