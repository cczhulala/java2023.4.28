package NumberAndString.MathMethod;

public class TestNumber {
    public static void main(String[] args) {
        float f1 = 5.4f;
        float f2 = 5.5f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));

        System.out.println(Math.random());

        System.out.println((int)(Math.random()*10));

        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2,4));

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double n = 1000000000;
        double d = Math.pow(1+1.0/n,n);
        System.out.println(d-Math.E);

        int max = 10000000;
        int count = 2;

        for (int i = 2; i <= max; i++) {
            boolean b = true;
            for (int j = 2; j <=Math.sqrt(i)+1 ; j++) {
                    if (i%j==0){
                        b = false;
                        break;
                    }
            }
            if (b)
                count++;
        }
        System.out.println(count);
    }
}
