package ArraysPractice;

public class SecondLargestinArray {
    public static void main(String[] args) {
        int[] marks = {34, 54, 56, 44, 47, 76, 76, 45};

        // Step 1: Assume the first element is the largest and second largest
        int largest = marks[0];
        int Secondlargest = -1;
        // Step 2: Loop through the array starting from the second element
        for (int i =0; i< marks.length; i++){
            // Step 3: Check if current element is greater than largest
            if(marks[0] > largest){
                Secondlargest = largest;
                largest = marks[i];
            }
            // Step 4: Check if current element is not the largest but greater than second largest
            else if (marks[i] > Secondlargest && marks[i]!=largest){
                Secondlargest = marks[i];
            }
        }
        // Step 5: Check if a valid second largest number was found
        if (Secondlargest==-1){
            System.out.println("No second largest number found.");
        }else {
            System.out.println("The second largest number is: " + Secondlargest);
        }


    }
}

