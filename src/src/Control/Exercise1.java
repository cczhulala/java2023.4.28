package Control;

public class Exercise1 {
    public static void main(String[] args) {
        double remeber1 = 1;
        double remeber2 = 1;
        double qian = 100;
        for (int i = 1; i < 21; i++) {
            for (int j = i + 1; j < 21; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    continue;

                double hou = (double)i / j - 0.618;
                if (hou <= 0)
                    hou = -hou;
                if (qian > hou) {
                    qian = hou;
                    remeber1 = i;
                    remeber2 = j;
                }

            }
        }
        System.out.println("最近的两个数是：" + remeber1 + "/" + remeber2 + "=" + remeber1/remeber2);
    }
}
