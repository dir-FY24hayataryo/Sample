package sample;

public class ForSample {

    public static void main(String[] args) {
        for (var i=1;i<=10;i++) {
            System.out.println(i);
        }
        String str;
        str="#";
        System.out.println(str);
        
        
        //for の応用編
        for (int i=2;i<=20;i+=2) {
            System.out.println(i);
        }
        System.out.println(str);
        for (int i=1;i<=10;i++) {
            System.out.println(i*2);
        }
        System.out.println(str);
        
        // continue
        for (int i=1;i<=20;i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println(str);
        
        // break
        for (int i=2;i<=100;i+=2) {
            if (i>20) {
                break;
            }
            System.out.println(i);
        }
        System.out.println(str);
    }

}
