package org.testng.internal;

public class Version {

    public static final String VERSION = "DEV-SNAPSHOT-f9ce6ddc148f8088dff-6.14.10";

    public static String getVersionString() {
        return VERSION;
    }

    public static void displayBanner() {
        System.out.println("...\n... TestNG " + getVersionString() + " by Cédric Beust (cedric@beust.com)\n...\n");
    }
}
