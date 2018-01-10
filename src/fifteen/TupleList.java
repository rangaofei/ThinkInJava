package fifteen;

import eight.Amphibian;

import java.util.ArrayList;

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>>{
    public static void main(String[] args) {
        TupleList<String, Amphibian,String,Integer> tl=new TupleList<>();
    }

}
