package Control;

public class Break {
    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            if(i%2==0)
                break;
            System.out.println(i);
        }

        int j =1;
        double F = 12000;
        while(true){
            j++;
            F = F * 1.2 +12000;
        if(F>1000000){
            System.out.println(j);
            break;
        }
        }
    }
}
