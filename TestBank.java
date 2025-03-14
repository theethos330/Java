import java.util.Scanner;

abstract class Bank {
    abstract void creditAmount(int amount);
    abstract void debitAmount(int amount);
    abstract void getBalance();
}

class SBI extends Bank {
    private String name;
    private int balance;

    SBI(String name, int amount) {
        this.name = name;
        this.balance = amount;
        System.out.println("Account successfully created in SBI Bank");
    }

    void creditAmount(int amount) {
        this.balance += amount;
        System.out.println("Amount " + amount + " credited");
    }

    void debitAmount(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount " + amount + " debited");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void getBalance() {
        System.out.println("Balance amount: " + this.balance);
    }
}

class Federal extends Bank {
    private String name;
    private int balance;

    Federal(String name, int amount) {
        this.name = name;
        this.balance = amount;
        System.out.println("Account successfully created in Federal Bank");
    }

    void creditAmount(int amount) {
        this.balance += amount;
        System.out.println("Amount " + amount + " credited");
    }

    void debitAmount(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount " + amount + " debited");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void getBalance() {
        System.out.println("Balance amount: " + this.balance);
    }
}

class Canara extends Bank {
    private String name;
    private int balance;

    Canara(String name, int amount) {
        this.name = name;
        this.balance = amount;
        System.out.println("Account successfully created in Canara Bank");
    }

    void creditAmount(int amount) {
        this.balance += amount;
        System.out.println("Amount " + amount + " credited");
    }

    void debitAmount(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Amount " + amount + " debited");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void getBalance() {
        System.out.println("Balance amount: " + this.balance);
    }
}

public class TestBank {
    public static void main(String[] args) {
        int ch, b, amount;
        Scanner in = new Scanner(System.in);
        SBI sb = null;
        Federal fd = null;
        Canara cn = null;

        do {
            System.out.println("\n1. Create account");
            System.out.println("2. Credit amount");
            System.out.println("3. Debit amount");
            System.out.println("4. Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();
            in.nextLine();  // Consume newline left-over

            switch(ch) {
                case 1:
                    System.out.println("Enter your name: ");
                    String name = in.nextLine();
                    System.out.println("Enter the initial deposit: ");
                    amount = in.nextInt();
                    System.out.println("Choose bank account to create account");
                    System.out.println("1. SBI");
                    System.out.println("2. Federal");
                    System.out.println("3. Canara");
                    System.out.print("Enter your choice: ");
                    b = in.nextInt();

                    if (b == 1) {
                        sb = new SBI(name, amount);
                    } else if (b == 2) {
                        fd = new Federal(name, amount);
                    } else if (b == 3) {
                        cn = new Canara(name, amount);
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;

                case 2:
                    System.out.println("Enter the amount to credit: ");
                    amount = in.nextInt();
                    System.out.println("Choose bank account to credit amount ");
                    System.out.println("1. SBI");
                    System.out.println("2. Federal");
                    System.out.println("3. Canara");
                    System.out.print("Enter your choice: ");
                    b = in.nextInt();

                    if (b == 1 && sb != null) {
                        sb.creditAmount(amount);
                    } else if (b == 2 && fd != null) {
                        fd.creditAmount(amount);
                    } else if (b == 3 && cn != null) {
                        cn.creditAmount(amount);
                    } else {
                        System.out.println("Invalid choice or account not created");
                    }
                    break;

                case 3:
                    System.out.println("Enter the amount to debit: ");
                    amount = in.nextInt();
                    System.out.println("Choose bank account to debit amount");
                    System.out.println("1. SBI");
                    System.out.println("2. Federal");
                    System.out.println("3. Canara");
                    System.out.print("Enter your choice: ");
                    b = in.nextInt();

                    if (b == 1 && sb != null) {
                        sb.debitAmount(amount);
                    } else if (b == 2 && fd != null) {
                        fd.debitAmount(amount);
                    } else if (b == 3 && cn != null) {
                        cn.debitAmount(amount);
                    } else {
                        System.out.println("Invalid choice or account not created");
                    }
                    break;

                case 4:
                    System.out.println("Choose bank account to check balance");
                    System.out.println("1. SBI");
                    System.out.println("2. Federal");
                    System.out.println("3. Canara");
                    System.out.print("Enter your choice: ");
                    b = in.nextInt();

                    if (b == 1 && sb != null) {
                        sb.getBalance();
                    } else if (b == 2 && fd != null) {
                        fd.getBalance();
                    } else if (b == 3 && cn != null) {
                        cn.getBalance();
                    } else {
                        System.out.println("Invalid choice or account not created");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (ch != 5);

        in.close();
    }
}
