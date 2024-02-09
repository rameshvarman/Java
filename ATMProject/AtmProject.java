package ATMProject;
import java.util.*;

public class AtmProject {
    public static void main(String args[]){
        int pin =1234;
        int balance = 10000;

        int addamount = 0;
        int takeamount =0;

        String name;

        Scanner scanner = new Scanner(System.in);

        // We have to take input

        System.out.println("Enter you pin: ");

        int password = scanner.nextInt();

        // code arrangement shift + alt + f

        if(password == pin){
            System.out.println("Enter you name: ");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while(true){
                System.out.println("Press 1 to check balance");
                System.out.println("Press 2 to Deposit Money");
                System.out.println("Enter 3 to Withdraw Money");
                System.out.println("Enter 4 to Take receipt");
                System.out.println("Enter 5 to EXIT!");

                int opt = scanner.nextInt();
                switch(opt) {
                    case 1:
                        System.out.println("Your current Balance: " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount do you want to deposti: ");
                        addamount = scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = addamount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount do you want to withdraw: ");
                        takeamount = scanner.nextInt();
                        if (takeamount > balance) {
                            System.out.println("Insufficient Balance");
                            System.out.println("Try less amount");
                        } else {
                            System.out.println("Successfully Taken");
                            balance = balance - takeamount;
                        }
                        break;

                    case 4:
                        System.out.println("Welcome to our mini ATM");
                        System.out.println("Your name:  " + name);
                        System.out.println("Your add amount: " + addamount);
                        System.out.println("Your Withdraw amount: " + takeamount);
                        System.out.println("Your Balance: " + balance);
                        System.out.println("Thanks for visiting us");
                        break;
                }

                    if(opt == 5) {
                        System.out.println("Thank you");
                        break;
                    }

                }

            }
        else
        {
            System.out.println("Wrong Pin Number");
        }

        }

    }

