package NumberAndString;

public class StringChange {
    public static void main(String[] args) {
        int i = 5;
        //Method1
        String str = String.valueOf(i);
        //Method2
        Integer it = i;
        String str2 = it.toString();

        String str3 = "999";
        int i2 = Integer.parseInt(str);
        System.out.println(i2);

        float f=3.14f;
        String str4 = String.valueOf(f);

        Float f1 = new Float(f);
        String str5 = f1.toString();

        String str6 = "3.14";
        float f2 = Float.parseFloat(str6);

        String str7 = "3.1a4";
        //float f3 = Float.parseFloat(str7);
        //System.out.println(f3);
    }
}
