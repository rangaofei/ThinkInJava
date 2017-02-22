package sixteen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
public class ArrayOfGenerics {

    public static void main(String[] args) {
        List<String>[] ls;
        List[] la=new List[10];
        ls=(List<String>[])la;
        ls[0]=new ArrayList<String>();
        Object[] objects=ls;
        objects[1]=new ArrayList<Integer>();

        List<BerylliumSphere>[] spheres=new List[10];
        for(int i=0;i<spheres.length;i++){
            spheres[i]=new ArrayList<>();
        }
    }

}
