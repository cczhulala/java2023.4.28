package Control;

public class BreakFor {
    public static void main(String[] args) {
        boolean breakout = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+":"+j);
                if (j%2==0){
                    breakout = true;
                    break;
            }}
            if (breakout)
                break;
        }

        outloop:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if (j%2==0)
                    break outloop;
            }
        }

    }
}
