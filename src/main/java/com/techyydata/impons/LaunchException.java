package com.techyydata.impons;

public class LaunchException extends Exception {

    @Override
    public String getMessage() {
        return "The developer version of Imp-Ons has been detected and can be only ran in a forge development environment, If you are not a developer, Download the original Imp-Ons here: https://minecraft.curseforge.com/projects/imp-ons";
    }
}
