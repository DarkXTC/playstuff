/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.darkxtc.test.runner;

import de.darkxtc.test.runnerlib.RunClass;
import java.util.logging.Logger;


public class App {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        RunClass runForest = new RunClass("Forest");
        System.out.println(runForest.getRunText());
        System.out.println(runForest.getKeepRunning());
        System.out.println(runForest.getStopRunning());
    }
    private static final Logger LOG = Logger.getLogger(App.class.getName());
}
