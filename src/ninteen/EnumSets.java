package ninteen;

import java.util.EnumSet;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points=EnumSet.noneOf(AlarmPoints.class);
        points.add(AlarmPoints.BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(AlarmPoints.STAIR1,AlarmPoints.STAIR2,AlarmPoints.KITCHEN));
        System.out.println(points);
        points=EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(AlarmPoints.STAIR1,AlarmPoints.STAIR2,AlarmPoints.KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.range(AlarmPoints.OFFICE1,AlarmPoints.OFFICE4));
        System.out.println(points);
        points=EnumSet.complementOf(points);
        System.out.println(points);
    }

}
