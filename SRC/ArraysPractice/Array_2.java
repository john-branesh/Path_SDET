package ArraysPractice;

public class Array_2 {
    public static void main (String[] args){
        int[] marks = {45, 33, 75, 84, 65, 68}; // predefined values

        //we can create array with fixed size
        int[] priceList = new int[7]; // here array will have the size of 7 elements
        int studentHeights [] = new int[12]; // here sq-bracket is added after variable which is also valid

        //i have created the outline of string array with its max size as 4
        String[] Names = new String[4];
        //here i am assigning elements to arrays w.r.t it position
        Names[0] = "john";
        Names[1] = "Herin";
        Names[3] = "Ehyini";

        //this will not work we need for loop
        System.out.println(marks);

        for (int i=0; i< marks.length; i++ ){
            System.out.println(marks[i]);
        }

    }
}
