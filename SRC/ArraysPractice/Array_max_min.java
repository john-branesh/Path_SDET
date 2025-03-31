package ArraysPractice;

public class Array_max_min {
    public static void main (String[] args){
        int [] array = {33, 44, 34, 23, 67, 65, 77, 54};

        int max_value = highest_number(array);
        System.out.println(max_value);
        int min_value = Lowest_number(array);
        System.out.println(min_value);
    }

    private static int Lowest_number(int[] array) {
        int min = array[0];
        for (int i =0; i< array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    private static int highest_number(int[] array){
        int max = array[0];
        for (int i=0; i < array.length ; i++ ){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;

    }
}

