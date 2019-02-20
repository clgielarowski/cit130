/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 public static void main(String[]args){
 addNew();
        
 }
 * and open the template in the editor.
 */
package week2inheritance;

import java.util.Scanner;
//Creat class Student//

class Student {

    String fName;
    String lName;

    String studID;

    String gender;

    String bMonth;
    String bDay;
    String bYear;

}
//Create sub class for elementary student//

class ElmStudent extends Student {

    boolean allergies;

    String[] allergy;

    String emergContactNum;

    String emergContactName;

}
//Create sub class for middle school student//

class MSStudent extends Student {

}
//Create sub class for high school student//

class HSStudent extends Student {

    boolean Extracurriculars;

}
//Create sub class for college student//

class CollStudent extends Student {

    boolean Scholarship;

}

public class ParentalPractice {

    static Scanner dataEntry = new Scanner(System.in);
    static Student[] StudArr = new Student[10];

    static int i = 0;
    static int index = 0;

    public static void printArray() {
        System.out.println("What Level Student would you like to print?");
        System.out.println("0 - All Students");
        System.out.println("1 - Elementary Students");
        System.out.println("2 - High School Students");
        System.out.println("3 - College Students");
        int choice = dataEntry.nextInt();
        int p;
        switch (choice) {
            case 0:
                for (p = 0; p < StudArr.length; p++) {
                    if (StudArr[p] instanceof Student) {
                        System.out.println(StudArr[p].studID);
                    }
                }
                break;
            case 1:
                for (p = 0; p < StudArr.length; p++) {
                    if (StudArr[p] instanceof ElmStudent) {
                        System.out.println(StudArr[p].studID);
                    }
                }
                break;
            case 2:
                for (p = 0; p < StudArr.length; p++) {
                    if (StudArr[p] instanceof HSStudent) {
                        System.out.println(StudArr[p].studID);
                    }
                }
                break;
            case 3:
                for (p = 0; p < StudArr.length; p++) {
                    if (StudArr[p] instanceof CollStudent) {
                        System.out.println(StudArr[p].studID);
                    }
                }
                break;
            default:
                break;
        }

    }

    public static int studentArray(int index) {
        for (;i<StudArr.length;i++) {

            System.out.println("Select Level for New Student");
            System.out.println("0 - Generic Student");
            System.out.println("1 - Elementary School Student");
            System.out.println("2 - High School Student");
            System.out.println("3 - College Student");
            System.out.println("4 - Exit to Main Menu");

            int level = dataEntry.nextInt();
            switch (level) {

                case 0:

                    StudArr[i] = new Student();
                    studentInput();
                    
                    break;

                case 1:

                    StudArr[i] = new ElmStudent();
                    studentInput();
                    break;
                case 2:
                    StudArr[i] = new HSStudent();
                    studentInput();
                    break;

                case 3:
                    StudArr[i] = new CollStudent();
                    studentInput();
                    
                    break;

                default:
                    return i;
            }

        }
        
    return i;
    }

    public static void studentInput() {
        System.out.println("Enter Student's Fist Name: ");

        StudArr[i].fName = dataEntry.next();
        System.out.println("Enter Student's Last Name: ");
        StudArr[i].lName = dataEntry.next();

        System.out.println("Enter Student's Gender: ");

        StudArr[i].gender = dataEntry.next();
        System.out.println("Enter Student's Birth Month using two digits: ");
        StudArr[i].bMonth = dataEntry.next();
        System.out.println("Enter Student's Birth Day using two digits: ");
        StudArr[i].bDay = dataEntry.next();
        System.out.println("Enter Student's Birth Year using four digits: ");
        StudArr[i].bYear = dataEntry.next();
        StudArr[i].studID = StudArr[i].fName.length() + StudArr[i].lName.substring(0, 1) + StudArr[i].bDay + StudArr[i].bMonth.charAt(0) + StudArr[i].bYear.substring(2);
        System.out.println("Student ID Number: " + StudArr[i].studID);
        if (StudArr[i] instanceof ElmStudent) {
            ElmStudent es = (ElmStudent) StudArr[i];
            System.out.println("Does Student have Allergies: ");
            System.out.println("Enter True or False");
            es.allergies = dataEntry.nextBoolean();
            if (es.allergies == true) {
                System.out.println("How many allergies are listed? ");
                int x = dataEntry.nextInt();
                String[] alg = new String[x];
                System.out.println("Please List allergies: ");
                for (int n = 0; n < alg.length; n++) {
                    alg[n] = dataEntry.next();
                }
                es.allergy = alg;
            }

            System.out.println("Enter Emergency Contact Name: ");
            es.emergContactName = dataEntry.next();
            System.out.println("Enter Emergency Contact Phone Number: ");
            es.emergContactNum = dataEntry.next();

        }
        
        if (StudArr[i] instanceof HSStudent) {
            HSStudent hs = (HSStudent) StudArr[i];

            System.out.println("If Student is Involved in Extracurriculars Enter "
                    + "True, Otherwise Enter False: ");
            hs.Extracurriculars = dataEntry.nextBoolean();
        }
        if (StudArr[i] instanceof CollStudent) {
            CollStudent cs = (CollStudent) StudArr[i];
            System.out.println("Does Student have a Scholarship? ");
            System.out.println("Enter True or False: ");
            cs.Scholarship = dataEntry.nextBoolean();
        }
    }

    public static void main(String[] args) {
        studentArray(index);
        int m = 0;
        while(m<5){
        System.out.println("Please Choose an action: ");
        System.out.println("1 - Add New Students");
        System.out.println("2 - View List of Students");
        int choice = dataEntry.nextInt();
        if (choice == 1) {
            index = i;
            studentArray(index);
        } else {
            printArray();

        }
        m++;
    }
}
}
      // if (pstud instanceof ElmStudent){
//   System.out.println("pstud is a ElmStudent");
// }
