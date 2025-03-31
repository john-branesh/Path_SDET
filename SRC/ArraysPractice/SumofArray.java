package ArraysPractice;

public class SumofArray {
    public static void main(String[] args) {
        int[] Marks = {32, 56, 64, 43, 77, 55};

        int sum =0;
        for (int i=0; i< Marks.length; i++){
            sum  = sum+Marks[i];
        }
        System.out.println(sum);
    }
}
