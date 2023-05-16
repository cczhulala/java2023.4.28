package Control;

public class Exercise3 {
    public static void main(String[] args) {
        outloop:
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    for (int l = 0; l < 20; l++) {
                        if ((i + j) == 8 && (k - l) == 6 && (i + k) == 14 && (j + l) == 10) {
                            System.out.println("i:" + i + "\nj:" + j + "\nk:" + k + "\nl:" + l);
                            break outloop;
                        }
                    }
                }
            }
        }
    }
}
