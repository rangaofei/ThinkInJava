package seven;

/**
 * Created by saka on 2017/2/11.
 */

class Gizmo{
    public void spin(){

    }
}

public class FianlArguments {
    void with(final Gizmo g){

    }

    void without(Gizmo g){
        g=new Gizmo();
        g.spin();
    }

    int g(final int i){
        return i+1;
    }

    public static void main(String[] args) {
        FianlArguments bf=new FianlArguments();
        bf.without(null);
        bf.with(null);
    }
}
