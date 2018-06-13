package p01_DefineBankAccountClass;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        HashMap<Integer, BankAccount> accounts = new HashMap<>();

        while (!"End".equals(command)) {
            String[] cmdArgs = command.split("\\s+");
            String cmdType = cmdArgs[0];
            switch (cmdType) {
                case "Create":
                    execCreate(cmdArgs, accounts);
                    break;
                case "Deposit":
                    execDeposit(cmdArgs, accounts);
                    break;
                case "Withdraw":
                    execWithdraw(cmdArgs, accounts);
                    break;
                case "Print":
                    execPrint(cmdArgs, accounts);
                    break;
            }

            command = scanner.nextLine();
        }
    }

    private static void execPrint(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(cmdArgs[1]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            System.out.println(accounts.get(id).toString());
        }
    }

    private static void execWithdraw(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(cmdArgs[1]);
        double withdrawAmount = Double.parseDouble(cmdArgs[2]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            if (accounts.get(id).getBalance() < withdrawAmount) {
                System.out.println("Insufficient balance");
            } else {
                accounts.get(id).withdraw(withdrawAmount);
            }
        }
    }

    private static void execDeposit(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(cmdArgs[1]);
        double depositAmount = Double.parseDouble(cmdArgs[2]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
        } else {
            accounts.get(id).deposit(depositAmount);
        }
    }

    private static void execCreate(String[] cmdArgs, HashMap<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(cmdArgs[1]);

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
        }
    }
}
