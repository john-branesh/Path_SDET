package PracticeWorks;

public class BasicCalculation {
    public static void main (String[] args){
        //Calculate a mathematical expression
        //Assigned values
        int x= 10;
        int y= 10;
        int z= 10;

        //first part of the expression
        int firstcut = ((x*x)+(y*y)-Math.abs(z));
        //System.out.println(firstcut);

        //second part of the expression i.e, finding cube root
        double FinalValue = Math.cbrt(firstcut);
        System.out.println("Cube root is: "+ FinalValue);

    }
}
