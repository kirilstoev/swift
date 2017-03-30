
package CredentialsManager;

import java.util.Scanner;

public class Task2_CredentialsManager {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int objectCount = 0;
        int userPassCount = 0;
        Credentials[] newCredential = new Credentials[4];
        String[] oldUserPass = new String[20000];
        for (int i = 0; i < 200; i++) {
            String readRow = sc.nextLine();
            if (readRow.equals("END")||readRow.equals("end")) {
                return;
            }
            String[] newRow = readRow.split("\\s* \\s*");
            switch (newRow[0]) {
                case "ENROLL":
                    newCredential[objectCount] = new Credentials(newRow[1], newRow[2]);
                    objectCount++;
                    oldUserPass[userPassCount] = newRow[1] + newRow[2];
                    userPassCount++;
                    System.out.println("ENROLL success");
                    break;
                case "CHPASS":
                    String check = "CHPASS success";
                    for (int j = objectCount-1; j >= 0; j--) {
                        if (newCredential[j].getUsername().equals(newRow[1]) && newCredential[j].getPassword().equals(newRow[2])) {
                            for (int l = userPassCount - 1; l >= 0; l--) {
                                if (oldUserPass[l].equals(newRow[1] + newRow[3])) {
                                    check = "CHPASS fail";
                                }
                            }
                            if (check.equals("CHPASS success")) {
                                newCredential[j].setPassword(newRow[3]);
                                oldUserPass[userPassCount] = newRow[1] + newRow[3];
                                userPassCount++;
                                check = "CHPASS success";
                            }
                        }
                    }
                    System.out.println(check);
                    break;
                case "AUTH":
                    String check1 = "AUTH fail";
                    for (int k = objectCount-1; k >= 0; k--) {
                        if (newCredential[k].getUsername().equals(newRow[1]) && newCredential[k].getPassword().equals(newRow[2])) {
                            check1 = "AUTH success";
                        }
                    }
                    System.out.println(check1);
                    break;
                default:
                    break;
            }
        }
    }
}
