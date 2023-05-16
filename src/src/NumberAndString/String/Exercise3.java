package NumberAndString.String;

public class Exercise3 {
    public static void main(String[] args) {
        String str = Exercise1_2.randomString(3);
        String pool = "";
        for (char i = '0'; i <= '9'; i++) {
            pool += i;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            pool += i;
        }
        for (char i = 'A'; i <= 'Z'; i++){
            pool += i;
        }
        outloop:
        for (int i = 0; i <pool.length() ; i++) {
            for (int j = 0; j <pool.length() ; j++) {
                for (int k = 0; k <pool.length() ; k++) {
                    String code = "";
                    code = code +pool.charAt(i)+pool.charAt(j)+pool.charAt(k);
                    if ((code.charAt(0)==str.charAt(0)) && (code.charAt(1)==str.charAt(1)) && (code.charAt(2)==str.charAt(2))){
                        System.out.println("密码为"+str);
                        System.out.println(code);
                        break outloop;
                    }
                }
            }
        }
    }
}
