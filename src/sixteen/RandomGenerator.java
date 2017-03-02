package sixteen;

import fifteen.Generator;

import java.util.Random;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class RandomGenerator {
    private static Random r = new Random(47);

    public static class Boolean implements Generator<java.lang.Boolean> {

        @Override
        public java.lang.Boolean next() {
            return r.nextBoolean();
        }
    }

    public static class Byte implements Generator<java.lang.Byte>{

        @Override
        public java.lang.Byte next() {
            return (byte)r.nextInt();
        }
    }

    public static class Character implements Generator<java.lang.Character>{

        @Override
        public java.lang.Character next() {
            return CountingGenerator.chars[r.nextInt(CountingGenerator.chars.length)];
        }
    }

    public static class String extends CountingGenerator.String{
        {
            cg=new Character();
        }
        public String(){

        }

        public String(int length){
            super(length);
        }
    }

    public static class Short implements Generator<java.lang.Short>{

        @Override
        public java.lang.Short next() {
            return (short)r.nextInt();
        }
    }

    public static class Integer implements Generator<java.lang.Integer>{
        private int mod=10000;
        public Integer(){}
        public Integer(int modulo){
            mod=modulo;
        }
        @Override
        public java.lang.Integer next() {
            return r.nextInt(mod);
        }
    }

}
