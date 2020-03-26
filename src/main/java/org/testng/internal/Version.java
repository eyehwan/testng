package org.testng.internal;

public class Version {

    public static final String VERSION = "DEV-SNAPSHOT-42c0d2037678cb862-6.14.13";

    public static String getVersionString() {
        return VERSION;
    }

    public static void displayBanner() {
        System.out.println("...\n... TestNG " + getVersionString() + " by Cédric Beust (cedric@beust.com)\n...\n");
    }
}
