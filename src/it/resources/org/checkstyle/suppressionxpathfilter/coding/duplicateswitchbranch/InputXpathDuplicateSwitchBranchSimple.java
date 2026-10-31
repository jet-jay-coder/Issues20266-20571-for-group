package org.checkstyle.suppressionxpathfilter.coding.duplicateswitchbranch;

public class InputXpathDuplicateSwitchBranchSimple {
    public int test(int id) {
        switch (id) {
            case 0:
                return 1;
            case 1: //warn
                return 1;
            default:
                return 0;
        }
    }
}
