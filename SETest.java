public class SETest {

    public static void main(String[] args) {
        String[] forTest = {"1","20000101","1234567a","20010101"};
        //String[] forTest = new String[0];
        MathTest(forTest);
    }

    public static void MathTest(String[] input){
        if(input.length == 0){
            System.out.println("入力した文字列の配列のサイズが0です。");
            return;
        }

        for(int i = 0;i < input.length;i++){
            int j = i + 1;
            if(input[i].length() != 8){
                System.out.println(j + "番目の文字列「" + input[i] +"」が8桁の数値ではありません。");
            }
            for(int x = 0;x < input[i].length();x++){
                if(!Character.isDigit(input[i].charAt(x))){
                    System.out.println(j + "番目の文字列「" + input[i] +"」が8桁の数値ではありません。");
                }
            }
        }
    }
}
