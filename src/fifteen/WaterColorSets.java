package fifteen;

import java.util.EnumSet;
import java.util.Set;

import static net.mindview.util.Sets.*;

public class WaterColorSets {
    public static void main(String[] args) {
        Set<WaterColors> set1 = EnumSet.range(WaterColors.BRILLIANT_RED, WaterColors.VIRIDIAN_HUE);
        Set<WaterColors> set2 = EnumSet.range(WaterColors.CERULEAN_BLUE_HUE, WaterColors.BURNT_UMBER);
        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);
        System.out.println("union(set1,set2): " + union(set1, set2));
        Set<WaterColors> subset = intersection(set1, set2);
        System.out.println("intersection(set1,set2): "+subset);
        System.out.println("difference(set1,subset): "+difference(set1,subset));
        System.out.println("difference(set2,subset): "+difference(set2,subset));
        System.out.println("complement(set1,set2): "+complement(set1,set2));
    }
}
