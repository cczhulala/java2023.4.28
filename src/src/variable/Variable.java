package variable;

public class Variable {
    public static void main(String[] args){
        int year = 1949;
        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;
//         超出范围
//        报错byte b2 = 200;
        char c = '中';
//        char只能存放一个字符
//        报错char c2 = '中国';
//        报错char c3 = ‘ab’
        double d = 123.45;
//        报错原因：因为54.321是double型的
//      float f = 54.321;
//        使用f强制声明成float类型
        float f2 = 54.321f;
        boolean b1 = true;
        boolean b2 = false;
//        报错原因虽然布尔存放的是01，但是不能直接用01进行赋值，这与python不同
//        boolean b3 = 1;
        String str = "Hello Java";

    }
}
