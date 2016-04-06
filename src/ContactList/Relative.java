/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactList;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author tejas
 */
class Relative extends Acquaintance { // Extending from Acquaintance

    DateFormat d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    Date rbd, rlm;
    String rbds, rlms;

    void createRel() throws ParseException {
        this.createAcq();
        System.out.println("Enter BirthDay (in format yyyy-MM-dd)");
        this.rbd = d.parse(rbds = in.nextLine());
        do {
            System.out.println("Enter date of last meeting  (in format yyyy-MM-dd)"); // Checking if date of meeting is after Date of birth
            this.rlm = d.parse(rlms = in.nextLine());
            if (this.rbd.before(this.rlm)) {
                break;

            }
            System.out.println("Date of last meeting should be after date of Birth");
        } while (true);

    }

    @Override
    public String toString() {  //overriding the toString fuction
        StringBuffer s = new StringBuffer();
        s.append("-Name:" + this.name);
        s.append("\n-Mobile No.:" + this.mobile);
        s.append("\n-Email:" + this.email);
        s.append("\n-Date of Birth:" + this.rbds);
        s.append("\n-Date of last meeting:" + this.rlms);
        return s.toString();
    }
}

