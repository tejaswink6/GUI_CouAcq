/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactList;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author tejas
 */
class Acquaintance {

    String name, email, mobile;
    Scanner in = new Scanner(System.in);
    
    // Creates an Acquaintance
    void createAcq() {
        System.out.println("Enter the name");
        this.name = in.nextLine();
        do {
            System.out.println("Enter the mobile no.(10 digit numeric)");
            this.mobile = in.nextLine();
            if (Pattern.matches("([0-9]{10})", this.mobile)) {   //Checking for a valid Mobile No. 
                break;
            }
        } while (true);
        do {
            System.out.println("Enter the email address");
            this.email = in.nextLine();
            if (Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}", this.email)) { // Checking for a valid Email
                break;
            }
        } while (true);
    }
}
