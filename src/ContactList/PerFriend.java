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
class PerFriend extends Acquaintance {

    DateFormat d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    String fc, fde, fms;
    Date fm;

    void createPer() throws ParseException {
        this.createAcq();
        System.out.println("Enter the contex in which you met (Max. 100 char, if exceeded will be curtailed to 100)");
        String s = in.nextLine();
        this.fc = (s.length() > 100) ? s.substring(0, 100) : s;
        System.out.println("Enter the date you met (in format yyyy-MM-dd)");
        this.fms = in.nextLine();
        this.fm = d.parse(this.fms);
        System.out.println("Enter other specific details if any (Max. 100 char, if exceeded will be curtailed to 100)");
        s = in.nextLine();
        this.fde = (s.length() > 100) ? s.substring(0, 100) : s;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("-Name:" + this.name);
        s.append("\n-Mobile No.:" + this.mobile);
        s.append("\n-Email:" + this.email);
        s.append("\n-Context of meeting:" + this.fc);
        s.append("\n-Date of last meeting:" + this.fms);
        s.append("\n-Other specific details:" + this.fde);
        return s.toString();
    }
}