/**
 * grading
 */

 import java.util.Scanner;
public class grading {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       char grade=' ';
        System.out.println("WElcome to Our Grading sYstem");
        System.out.println("Enter MArks");
        Integer Marks = Integer.parseInt(scanner.nextLine());


        switch (Marks/10){
            case 9:
            grade ='A';
            break;
             case 8:
             grade = 'B';
             break;
             case 7:
             grade = 'C';
             break;
             case 6:
             grade = 'D';
             break;
             case 5:
             grade = 'E';
             break;
             case 2:
             grade = 'F';
             break;
            default:
            System.out.println("not a number");
            break;
        }
        System.out.println(grade);
        scanner.close();
    }
}