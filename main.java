import java.util.Scanner;
public class main{


    public static void menu(){
        System.out.println("Please a number for a command:");
        System.out.println("0. Add a student and score");
        System.out.println("1. Display highscore");
        System.out.println("2. End program");
    }

    public static void main(String[] args){
        /* So with high score you are given a prompt.
         * You need to enter the number os students and each students name and score. 
         * Finally display the name of the student with the highest score
         * I will be using a linkedlist
         */
        
        //intialize tools needed 
        String tempString;
        int tempScore, choice;
        boolean isDone=false;

        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        //start the loop
        do{
            menu();
            choice=scanner.nextInt();

            switch(choice){
                //add a student and a score
                case 0:

                System.out.println("What is the name of the student?");
                tempString=scanner.nextLine();
                System.out.println("What is the score of the student?");
                tempScore=scanner.nextInt();

                list.append(tempString, tempScore);

                //display the highscore
                case 1:

                list.sort();
                list.display();

                //end program
                case 2:
                    isDone=true;

                //loops :/
                default: 
            }





        }while (isDone=false);




        scanner.close();
    }
}


