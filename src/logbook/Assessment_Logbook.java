package logbook;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Assessment_Logbook {

    static String new_string;
    static String code1;
    static String code2;
    static String course_keysubject1;
    static String course_keysubject2;
    static String course_name;
    static String course_name2;
    static String status;
    static String status2;
    static String assign_type;
    static String assign_type2;


    public static void main(String[] args) throws IOException, AWTException,InterruptedException {
        Scanner begin = new Scanner(System.in);
        System.out.println("Are you ready to begin(Yes or No)?");
        String answer = begin.nextLine();

        while (answer.equals("Yes")){
            System.out.println(ANSI_Colors.RED_BOLD_BRIGHT + "Welcome to your assessment logbook!");
            Thread.sleep(2000);
            //Inserting ASCII Art

             System.out.println(" ## ## #### ## ## ###  ### ##  ##  ##   \n" +
                     "##   ##   # ## ##  ##   ##   ##  ##  ##  ##   \n" +
                     "####        ##     ##   ##   ##  ##  ##  ##   \n" +
                     " #####     ##     ##   ##   ##  ##   ## ##   \n" +
                     "    ###    ##     ##   ##   ##  ##    ##     \n" +
                     "##   ##    ##     ##   ##   ##  ##    ##     \n" +
                     " ## ##    ####     ## ##   ### ##     ##     \n" +
                     "                                        ");
            //Inserting gif image

            Scanner object = new Scanner(System.in);
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ImageIcon icon = new ImageIcon("C:\\Users\\m\\Videos\\2019\\Java projects\\Student_Logbook\\src\\logbook\\study.gif");
            Image normalImage = icon.getImage();
            Icon warningIcon = new ImageIcon(normalImage);
            JLabel warningLabel = new JLabel(warningIcon);
            frame.add(warningLabel,"Center");
            frame.setSize(600,600);
            frame.setVisible(true);
            frame.setResizable(false);

            //Generating the random course codes
            for (int x = 0; x < 2; x++){
                String alphabet = "ABCDFGIJKLMNOPQRSTUVWXYZ@#";
                //Create a string builder
                StringBuilder sb = new StringBuilder();
                //Creating an object of the random class
                Random random = new Random();
                int length = 7;

                for (int i = 0; i < length; i++){
                    int index = random.nextInt(alphabet.length());
                    // Getting the character from specified index position of the string
                    char randomChar = alphabet.charAt(index);
                    // Append the character to the string builder
                    sb.append(randomChar);
                    new_string = sb.toString();
                }
                if (x == 0){
                    code1 = new_string;
                }
                else if (x == 1){
                    code2 = new_string;
                }
            }
            System.out.println(ANSI_Colors.BANANA_YELLOW + "Enter the two lettered first course key like: - MA- Mathematics");
            String course_key1 = object.nextLine();

            System.out.println("Enter the two lettered second course key like: - GE- Geography");
            String course_key2 = object.nextLine();

            while (course_key1.length() != 2){
                System.out.println(ANSI_Colors.RESET + "Enter the two lettered course correctly like: -  MA - Mathematics");
                course_key1 = object.nextLine();
            }

            while (course_key2.length() != 2){
                System.out.println("Enter the two lettered course correctly like: -  MA - Mathematics");
                course_key2 = object.nextLine();
            }
            if (course_key1.length() == 2){
                System.out.println("Enter the subject name for the first key");
                course_keysubject1 = object.nextLine();
            }
            if (course_key2.length() == 2){
                System.out.println("Enter the subject name for the second key");
                course_keysubject2 = object.nextLine();
            }

            System.out.println(ANSI_Colors.PURPLE + "Course code " + code1);
            System.out.println("Enter the course key for your first subject");
            course_name = object.nextLine();
            while (course_name.length() != 2){
                System.out.println(ANSI_Colors.RESET + "Enter the two lettered course key like MA - Mathematics");
                course_name = object.nextLine();
            }
            if (course_name.length() == 2){
                System.out.println("Enter the assignment type(Enter t - test or h - homework or p - project)");
                assign_type = object.nextLine();
                System.out.println("Enter the completion status of the assignment(D - done or ND - not done)");
                status = object.nextLine();

            }

            System.out.println(ANSI_Colors.RED_BOLD + "Course code " + code1);
            System.out.println("Enter the course key for your second subject");
            course_name2 = object.nextLine();
            while (course_name2.length() != 2){
                System.out.println(ANSI_Colors.RESET + "Enter the two lettered course key like MA - Mathematics");
                course_name2 = object.nextLine();
            }
            if (course_name2.length() == 2){
                System.out.println(ANSI_Colors.PURPLE_BOLD + "Enter the assignment type(Enter t - test or h - homework or p - project)");
                assign_type2 = object.nextLine();
                System.out.println("Enter the completion status of the assignment(D - done or ND - not done)");
                status2 = object.nextLine();
            }
            System.out.println(ANSI_Colors.RED_BOLD + "Would you like to make a change to the assignment status of any of the two assignments you have included(Yes or No)");
            String user = object.nextLine();
            while (user.equals("Yes")){
                System.out.println("Would you like to replace the subject 1 assignment status(Yes or No)");
                String user_newchoice = object.nextLine();
                if (user_newchoice.equals("Yes")){
                    System.out.println("Enter the new completion status of the assignment(D - done or ND - not done) for subject 1");
                    status = object.nextLine();
                }
                else if (user_newchoice.equals("No")){
                    System.out.println(ANSI_Colors.PURPLE_BOLD + "Would you like to replace the subject 2 assignment status(Yes or No)");
                     user_newchoice = object.nextLine();
                    if (user_newchoice.equals("Yes")){
                        System.out.println("Enter the new completion status of the assignment(D - done or ND - not done) for subject 2");
                        status2 = object.nextLine();
                    }
                    else if (user_newchoice.equals("No")){
                        System.out.println("Okay. Thank you!");
                    }
                }
                System.out.println(ANSI_Colors.RED_BOLD + "Would you like to make a change to the assignment status of any of the two assignments you have included(Yes or No)");
                user = object.nextLine();
            }
            if (user.equals("No")){
                String cmd = "";
                String os = System.getProperty("os.name").toString();
                if (os.startsWith("Mac OS X")){
                    cmd = "TextEdit";
                }
                else if (os.startsWith("Windows")){
                    cmd = "Notepad";
                }
                Runtime runtime = Runtime.getRuntime();
                runtime.exec(cmd);
                Thread.sleep(2000);
                Robot rb = new Robot();
                String title = "\t\t\t\t Assessment Logbook\n ";
                String keys = "Subject Keys\n" + course_key1 + "-" + course_keysubject1 + "\n" +  course_key2 + "-" + course_keysubject2 + "\n";
                String assignment_keys = "Assignment Keys\t" + "t - for test h - for homework p - for project" + "\n";
                StringBuilder str = new StringBuilder("Course code" + "\t" + "Course Name" + "\t" + "Assignment Type" + "\t\t" + "Status" + "\n" + code1 + "\t" + course_name + "\t\t" + assign_type + "\t\t\t" + status + "\n" + code2 + "\t" + course_name2 + "\t\t" + assign_type2 + "\t\t\t" + status2 );
                String s = title + keys + assignment_keys + str.toString();
                StringSelection stringSelection = new StringSelection(s);
                Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
                clip.setContents(stringSelection,stringSelection);
                rb.keyPress(KeyEvent.VK_CONTROL);
                rb.keyPress(KeyEvent.VK_V);
                rb.keyRelease(KeyEvent.VK_V);
                rb.keyRelease(KeyEvent.VK_CONTROL);
            }

            System.out.println(ANSI_Colors.RESET + "Are you ready to begin(Yes or No)?");
             answer = begin.nextLine();
        }
        if (answer.equals("No")){
            System.out.println("Okay have a nice day!");
        }
    }
}
