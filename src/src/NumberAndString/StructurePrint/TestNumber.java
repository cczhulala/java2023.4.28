package NumberAndString.StructurePrint;

import java.util.Locale;

public class TestNumber {
    public static void main(String[] args){
        String name = "盖伦";
        int kill = 8;
        String title="超神";

        String sentenceFormat = "%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);
        System.out.format(sentenceFormat,name,kill,title);
        System.out.printf("这是换行符%n");
        System.out.printf("这是换行符%n");

        int year = 2000;
        System.out.format("%d%n",year);
        System.out.format("%8d%n",year);
        System.out.format("%-8d%n",year);
        System.out.format("%08d%n",year);
        System.out.format("%,8d%n",year*10000);
        System.out.format("%.2f%n",Math.PI);
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);

    }
}
