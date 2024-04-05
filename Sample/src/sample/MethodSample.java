package sample;

public class MethodSample {

    public static void main(String[] args) {
        var n1=100;
        var n2=10;
        
        sumMethod1(n1,n2);// 自由に付けられるメソッド名
        
    }
    public static void sumMethod1(int n1,int n2) {
        var result=n1+n2;// ここでメソッドを定義している
        System.out.println("sumMethodの結果は"+result);
        System.out.println("##############");
        
    
    }
}
