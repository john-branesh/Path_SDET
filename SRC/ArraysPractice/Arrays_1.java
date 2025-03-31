package ArraysPractice;

public class Arrays_1 {
    public static void main (String[] args){
        int[] Marks = {32, 56, 64, 43, 77, 55}; //predefined elements
        System.out.println(Marks.length);
        System.out.println(Marks[3]);
        System.out.println(Marks[9]); //throws exception Index 9 out of bounds for length 6
    }
}
