package variable;

public class Transform {
    public static void main(String[] args) {
        char c = 'A';
        short s = 80;

        c = (char) s;

        long l = 50;
        int i = 50;
        l = i;
        byte b = 5;
        int i1 = 10;
        int i2 = 300;

        b = (byte) i1;
        //因为i1的值是在byte范围之内，所以即便进行强制转换
        //最后得到的值，也是10
        System.out.println(b);

        //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
        //i2的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
        b = (byte) i2;
        System.out.println(b);

        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(i2));
        short a = 1;
        short g = 2;
//        short u = a + g;
        short u = (short) (a + g);
//        Java中进行二元与运算类型的提升规则
//        整数运算：
//        如果两个操作数有一个为long，则结果也为long；
//        没有long时，结果为int。即使操作数全为short、byte，结果也是int。
//        浮点运算：
//        如果两个操作数有一个为double，则结果为double；
//        只有两个操作数都是float，则结果才为float。
//        注意：int 与 float 运算，结果为 float。
    }
}
