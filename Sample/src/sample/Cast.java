package sample;

public class Cast {

    public static void main(String[] args) {
        var n1=3;
        var n2=2;
        
        System.out.println(n1/n2);
        System.out.println((double)n1/n2);
        /*double(n1)で3.0になるため、2で割ったときに1.5と、
         少数まで含めることができる。*/
        System.out.println((double)(n1/n2));
        
             

    }

}
