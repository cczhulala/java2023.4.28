package NumberAndString;

public class TestNumber {
    public static void main(String[] args){
        int i = 5;
        //基本类型和封装类型互相转换
        Integer it = new Integer(i);
        int i2 = it.intValue();
        System.out.println(it instanceof Number);
        //装箱
        Integer i3 = i;
        //拆箱
        int i4 = i3;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        //Exercise
        byte b = 2;
        Byte b2 = b;
        byte b3 = b2;

        short s = 4;
        Short s2 = s;
        short s3 = s2;

        float f = 4;
        Float f2 = f;
        float f3 = f2;

        double d = 4;
        Double d2 = d;
        double d3 = d2;

        //不同类型转换需要手动拆箱和转箱
        Byte u = (byte)i;
        byte u2 = i3.byteValue();
        System.out.println(u2);

    }
}
