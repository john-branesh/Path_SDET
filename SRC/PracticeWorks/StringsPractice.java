package PracticeWorks;

public class StringsPractice {
    public static void main (String[] args){
        String Name = "John";
        //concat function
        String FullName = Name.concat(" Branesh");
        System.out.println(FullName);
        String UpperFullName = FullName.toUpperCase();
        System.out.println(UpperFullName);

        // == checks for reference
        // = checks for assignment value

        String ObjectAssign = new String("its java object");
        String ObjectAssign1 = new String ("its java object");

        System.out.println(ObjectAssign==ObjectAssign1);
        // Even the content is same the object area assigned is different so it returns false

        System.out.println(ObjectAssign.equals(ObjectAssign1));
        //Here equals compares the content not the object.

        //contains function
        System.out.println(ObjectAssign1.contains("va"));

        String email = "   boomgoonstud@gmail.com   ";
        System.out.println(email.trim());

        //substring - extracts portion of string


    }
}
