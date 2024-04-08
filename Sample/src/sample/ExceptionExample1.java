package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            System.out.println("割り算開始");
            int a=10/0;//例外が発生する（可能性のある）コード
            //tryのブロック内のコード実行中に例外が発生すれば、プログラムの成魚は直ちにcatchブロックへ
            System.out.println(a);
        } catch(ArithmeticException e) {
            /*例外が発生した場合に行う処理を記述
            e は発生した例外に関する情報を持っている
            e.getMessage()メソッドを使用して、例外に関する詳細なメッセージを取得している*/
            System.out.println("ArithmeticExceptionが発生："+e.getMessage());
        } finally {
            //例外の有無にかかわらず実行されるコード
            System.out.println("割り算終了");
        }
        System.out.println("処理終了");
    }

}
