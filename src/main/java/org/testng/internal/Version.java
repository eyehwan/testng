package org.testng.internal;

public class Version {

    public static final String VERSION = "DEV-SNAPSHOT-129b01200e12289d-6.14.11";

    public static String getVersionString() {
        return VERSION;
    }

    public static void displayBanner() {
        System.out.println("...\n... TestNG " + getVersionString() + " by Cédric Beust (cedric@beust.com)\n...\n");
    }
}
