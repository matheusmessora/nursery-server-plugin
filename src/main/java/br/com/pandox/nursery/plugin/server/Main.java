package br.com.pandox.nursery.plugin.server;

import java.io.File;

public class Main {
    public static void main(String[] args) {
    /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " +
                Runtime.getRuntime().availableProcessors());

    /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (bytes): " +
                Runtime.getRuntime().freeMemory() / 1000000);

    /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
    /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " +
                (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory / 1000000));

    /* Total memory currently available to the JVM */
        System.out.println("Total memory available to JVM (bytes): " +
                Runtime.getRuntime().totalMemory() / 1000000);

    /* Get a list of all filesystem roots on this system */
        File[] roots = File.listRoots();

    /* For each filesystem root, print some info */
        for (File root : roots) {
            System.out.println("File system root: " + root.getAbsolutePath());
            System.out.println("Total space (mb): " + root.getTotalSpace() / 1000000);
            System.out.println("Free space (mb): " + root.getFreeSpace() / 1000000);
            System.out.println("Usable space (bytes): " + root.getUsableSpace() / 1000000);
        }
    }
}