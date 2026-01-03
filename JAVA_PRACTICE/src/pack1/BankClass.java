package pack1;
import java.util.Scanner;
public class BankClass {

    static String[] name;
    static int[] accNo;
    static double[] balance;
    static String[] email;
    static int userCount=0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n List menus :");
            System.out.println("1) Create account");
            System.out.println("2) Withdraw money");
            System.out.println("3) Deposit money");
            System.out.println("4) Display by user");
            System.out.println("0) Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter the number of user: ");
                    userCount =sc.nextInt();

                    name= new String[userCount];
                    accNo= new int[userCount];
                    balance= new double[userCount];
                    email = new String[userCount];

                    for (int i=0; i<userCount; i++) {
                        System.out.println("\nEnter details of user " + (i + 1));
                        sc.nextLine();

                        System.out.print("Name: ");
                        name[i] = sc.nextLine();

                        System.out.print("Account Number: ");
                        accNo[i]= sc.nextInt();

                        System.out.print("Initial Amount: ");
                        balance[i] =sc.nextDouble();

                        System.out.print("Email: ");
                        email[i]= sc.next();
                    }
                    break;

                case 2:
                    System.out.println("Enter user id (1 to " +userCount + "): ");
                    int wid = sc.nextInt() -1;

                    if(wid >=0 && wid < userCount){
                        System.out.println("Enter withdraw aamount : ");
                        double wamt = sc.nextDouble();

                        if (wamt <=0 ){
                            System.out.println("Invalid Amount!!!");
                        }else if(wamt > balance[wid]){
                            System.out.println("InSufficient Balance!");
                        }else{
                            balance[wid] -=wamt;
                            System.out.println("Withdraw Successful. Balance: " + balance[wid]);
                        }

                    } else{
                        System.out.println("invalid User Id");
                    }

                    break;

                case 3:
                    System.out.print("Enter user id (1 to " + userCount + "): ");
                    int did = sc.nextInt() - 1;

                    if (did >= 0 && did < userCount) {
                        System.out.print("Enter deposit amount: ");
                        double damt = sc.nextDouble();

                        if (damt <= 0) {
                            System.out.println("Invalid amount!");
                        } else {
                            balance[did] += damt;
                            System.out.println("Deposit successful.");
                            System.out.println("Final Balance: " + balance[did]);
                        }
                    } else {
                        System.out.println("Invalid user id!");
                    }
                    break;

                case 4:
                    System.out.print("Enter user id (1 to " + userCount + "): ");
                    int uid = sc.nextInt() - 1;

                    if (uid >= 0 && uid < userCount) {
                        System.out.println("\nUser Details:");
                        System.out.println("Name: " + name[uid]);
                        System.out.println("Account Number: " + accNo[uid]);
                        System.out.println("Email: " + email[uid]);
                        System.out.println("Balance Amount: " + balance[uid]);
                    } else {
                        System.out.println("Invalid user id!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");

            }

        }while (choice != 0);
    }

}
