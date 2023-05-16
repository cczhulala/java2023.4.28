package variable;

public class Final4 {
    public static void main(String[] args){
        final int i = 5;
//        i = 10;已经被赋值过一次就不能继续赋值了
        Final4 aj = new Final4();
        aj.method1(5);

    }
    public void method1(final int j) {
//        j = 5;调用参数时候总会进行赋值
    }
}
