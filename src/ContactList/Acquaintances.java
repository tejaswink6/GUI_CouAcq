
// Importing various Packages

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

// Acquaintance class which would be extended by Relatives, Personal Friends, Professional Friends and Casual Friends

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

class ProFriend extends Acquaintance {

    String pfci;

    void createPro() {
        this.createAcq();  // Calling parent class method
        System.out.println("Enter the specific common professional interests (Max. 100 char, if exceeded will be curtailed to 100) ");
        String s = in.nextLine();                                           // Checking if it is more than 100 characters and curtailing it to 100 if more
        this.pfci = (s.length() > 100) ? s.substring(0, 100) : s;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("-Name:" + this.name);
        s.append("\n-Mobile No.:" + this.mobile);
        s.append("\n-Email:" + this.email);
        s.append("\n-Common Professional interests:" + this.pfci);
        return s.toString();
    }
}

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

class CasFriend extends Acquaintance {

    DateFormat d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    String cfwher, cfc, cfod, cfms;
    Date cfm;

    void createCas() throws ParseException {
        this.createAcq();
        System.out.println("Enter the where you met (Max. 100 char, if exceeded will be curtailed to 100)");
        String s = in.nextLine();
        this.cfwher = (s.length() > 100) ? s.substring(0, 100) : s;
        System.out.println("Enter the contex in which you met (Max. 100 char, if exceeded will be curtailed to 100)");
        s = in.nextLine();
        this.cfc = (s.length() > 100) ? s.substring(0, 100) : s;
        System.out.println("Enter the date you met (in format yyyy-MM-dd)");
        this.cfms = in.nextLine();
        this.cfm = d.parse(this.cfms);
        System.out.println("Enter other specific details if any (Max. 100 char, if exceeded will be curtailed to 100)");
        s = in.nextLine();
        this.cfod = (s.length() > 100) ? s.substring(0, 100) : s;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("-Name:" + this.name);
        s.append("\n-Mobile No.:" + this.mobile);
        s.append("\n-Email:" + this.email);
        s.append("\n-Context of meeting:" + this.cfc);
        s.append("\n-Place of last meeting:" + this.cfwher);
        s.append("\n-Date of last meeting:" + this.cfms);
        s.append("\n-Other specific details:" + this.cfod);
        return s.toString();
    }
}

public class Acquaintances {

    public static void main(String args[]) throws ParseException, IOException {
        String infile, outfile = null;   // infile - file reading data from   outfile - file writing data to
        ArrayList<Relative> ar = new ArrayList<Relative>();   // creating four generic arraylists
        ArrayList<PerFriend> apef = new ArrayList<PerFriend>();
        ArrayList<ProFriend> aprf = new ArrayList<ProFriend>();
        ArrayList<CasFriend> acf = new ArrayList<CasFriend>();
        Scanner in = new Scanner(System.in);
        System.out.println("1.Take input from a file\n2.Start off fresh from the console\nEnter your Choice :");  // Start from a file or Enter data from the console
        int choice = Integer.valueOf(in.nextLine());
        if (choice == 1) {
            System.out.println("\nEnter the file to import data from : (Without .txt)");
            infile = in.nextLine();
            FileReader b1 = new FileReader(new File(infile + ".txt"));
            BufferedReader i1 = new BufferedReader(b1);
            String x;
            x = i1.readLine();
            //Reading data from the file
            while (true) {
                x = i1.readLine();
                if (x == null || x.isEmpty()) {
                    break;
                }
                if (x.split(":")[0].equalsIgnoreCase("RELATIVES")) {
                    do {
                        x = i1.readLine();
                        if (x == null || x.isEmpty()) {
                            break;
                        }
                        if (x.split(":")[0].split(" ")[0].equalsIgnoreCase("Relative")) {
                            Relative r = new Relative();
                            String[] s = (i1.readLine()).split(":");
                            r.name = s[1];
                            s = (i1.readLine()).split(":");
                            r.mobile = s[1];
                            s = (i1.readLine()).split(":");
                            r.email = s[1];
                            s = (i1.readLine()).split(":");
                            r.rbds = s[1];
                            s = (i1.readLine()).split(":");
                            r.rlms = s[1];
                            ar.add(r);
                        }
                    } while (true);
                } else if (x.split(":")[0].equalsIgnoreCase("PERSONAL FRIENDS")) {
                    do {
                        x = i1.readLine();
                        if (x == null || x.isEmpty()) {
                            break;
                        }
                        if (x.split(":")[0].split(" ")[0].equalsIgnoreCase("Personal")) {
                            PerFriend r = new PerFriend();
                            String[] s = i1.readLine().split(":");
                            r.name = s[1];
                            s = i1.readLine().split(":");
                            r.mobile = s[1];
                            s = i1.readLine().split(":");
                            r.email = s[1];
                            s = i1.readLine().split(":");
                            r.fc = s[1];
                            s = i1.readLine().split(":");
                            r.fms = s[1];
                            s = i1.readLine().split(":");
                            r.fde = s[1];
                            apef.add(r);
                        }
                    } while (true);
                } else if (x.split(":")[0].equalsIgnoreCase("PROFESSIONAL FRIENDS")) {
                    do {
                        x = i1.readLine();
                        if (x == null || x.isEmpty()) {
                            break;
                        }
                        if (x.split(":")[0].split(" ")[0].equalsIgnoreCase("Professional")) {
                            ProFriend r = new ProFriend();
                            String[] s = i1.readLine().split(":");
                            r.name = s[1];
                            s = i1.readLine().split(":");
                            r.mobile = s[1];
                            s = i1.readLine().split(":");
                            r.email = s[1];
                            s = i1.readLine().split(":");
                            r.pfci = s[1];
                            aprf.add(r);
                        }
                    } while (true);
                } else if (x.split(":")[0].equalsIgnoreCase("CASUAL FRIENDS")) {
                    do {
                        x = i1.readLine();
                        if (x == null || x.isEmpty()) {
                            break;
                        }
                        if (x.split(":")[0].split(" ")[0].equalsIgnoreCase("Casual")) {
                            CasFriend r = new CasFriend();
                            String[] s = i1.readLine().split(":");
                            r.name = s[1];
                            s = i1.readLine().split(":");
                            r.mobile = s[1];
                            s = i1.readLine().split(":");
                            r.email = s[1];
                            s = i1.readLine().split(":");
                            r.cfc = s[1];
                            s = i1.readLine().split(":");
                            r.cfwher = s[1];
                            s = i1.readLine().split(":");
                            r.cfms = s[1];
                            s = i1.readLine().split(":");
                            r.cfod = s[1];
                            acf.add(r);
                        }
                    } while (true);
                }
            }
            System.out.println("Data read successfully...");
            while (true) {
                System.out.println("Do you want to write the data after modification to the same file\n1.Yes\n2.No");
                int chwr = Integer.valueOf(in.nextLine());
                if (chwr == 1) {
                    outfile = infile;
                    break;
                } else if (chwr == 2) {
                    System.out.println("Enter the name of the file to write to...(Without .txt)");
                    outfile = in.nextLine();
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            }

        }
        //options for the user to do various tasks
        do {
            System.out.println("\n1.Create a particular type of Acquaintance\n2.Delete a particular type of Acquaintance\n3.Display all Acquaintances\n4.Display a particular type of Acquaintances\n5.Search for a Acquaintance by name\n6.Exit\n Enter the choice");
            int ch = Integer.valueOf(in.nextLine());
            if (ch == 1) {
                //Creating an Acquaintance
                System.out.println("Create a \n1.Relative\n2.Personal Friend\n3.Professional Friend\n4.Casual Friend\nEnter your choice");
                int ch1 = Integer.valueOf(in.nextLine());
                if (ch1 == 1) {
                    Relative r = new Relative();
                    r.createRel();
                    ar.add(r);
                } else if (ch1 == 2) {
                    PerFriend p = new PerFriend();
                    p.createPer();
                    apef.add(p);
                } else if (ch1 == 3) {
                    ProFriend p = new ProFriend();
                    p.createPro();
                    aprf.add(p);
                } else if (ch1 == 4) {
                    CasFriend c = new CasFriend();
                    c.createCas();
                    acf.add(c);
                } else {
                    System.out.println("Invalid input");
                }
            } else if (ch == 2) {  //Deleting an acquaintance
                System.out.println("Delete a \n1.Relative\n2.Personal Friend\n3.Professional Friend\n4.Casual Friend\nEnter your choice");
                int ch1 = Integer.valueOf(in.nextLine());
                if (ch1 == 1) {
                    System.out.println("Enter the name of the Relative to remove");
                    String sname = in.nextLine();
                    for (int i = 0; i < ar.size(); i++) { // Looping through the array list to find the object
                        Relative a = ar.get(i);
                        if ((a.name).equalsIgnoreCase(sname)) {
                            ar.remove(a);              // removing the object
                        }
                    }
                } else if (ch1 == 2) {
                    System.out.println("Enter the name of the Personal Friend to remove");
                    String sname = in.nextLine();
                    for (int i = 0; i < apef.size(); i++) {
                        PerFriend a = apef.get(i);
                        if ((a.name).equalsIgnoreCase(sname)) {
                            ar.remove(a);
                        }
                    }
                } else if (ch1 == 3) {
                    System.out.println("Enter the name of the Professional Friend to remove");
                    String sname = in.nextLine();
                    for (int i = 0; i < aprf.size(); i++) {
                        ProFriend a = aprf.get(i);
                        if ((a.name).equalsIgnoreCase(sname)) {
                            ar.remove(a);
                        }
                    }
                } else if (ch1 == 4) {
                    System.out.println("Enter the name of the Casual Friend to remove");
                    String sname = in.nextLine();
                    for (int i = 0; i < acf.size(); i++) {
                        CasFriend a = acf.get(i);
                        if ((a.name).equalsIgnoreCase(sname)) {
                            ar.remove(a);
                        }
                    }
                } else {
                    System.out.println("Invalid Input");
                }
            } else if (ch == 3 || ch == 4) {
                int ch1 = 0, flag = 0;
                if (ch == 4) {
                    System.out.println("Display \n1.Relatives\n2.Personal Friends\n3.Professional Friends\n4.Casual Friends\nEnter your choice");
                    ch1 = Integer.valueOf(in.nextLine());
                }
                if ((ch1 == 0 || ch1 == 1) && ar.size() != 0) {
                    int i = 1;
                    System.out.println("\nRELATIVES:");
                    for (Relative a : ar) {
                        System.out.println("Relative " + i + ":\n" + a);
                        i++;
                    }
                    flag = 1;
                }
                if ((ch1 == 0 || ch1 == 2) && apef.size() != 0) {
                    int i = 1;
                    System.out.println("\nPERSONAL FRIENDS:");
                    for (PerFriend a : apef) {
                        System.out.println("Personal Friend " + i + ":\n" + a);
                        i++;
                    }
                    flag = 1;
                }
                if ((ch1 == 0 || ch1 == 3) && aprf.size() != 0) {
                    int i = 1;
                    System.out.println("\nPROFESSIONAL FRIENDS:");
                    for (ProFriend a : aprf) {
                        System.out.println("Professional Friend " + i + ":\n" + a);
                        i++;
                    }
                    flag = 1;
                }
                if ((ch1 == 0 || ch1 == 4) && acf.size() != 0) {
                    int i = 1;
                    System.out.println("\nCASUAL FRIENDS:");
                    for (CasFriend a : acf) {
                        System.out.println("Casual Friend " + i + ":\n" + a);
                        i++;
                    }
                    flag = 1;
                }
                if (flag == 0) {
                    System.out.println("Invalid input...");
                }
            } else if (ch == 5) {
                int flag = 0;
                //Searching for an Acquaintance
                System.out.println("Enter the name of the Acquaintance to search");
                String sname = in.nextLine();
                for (Relative a : ar) {
                    if (a.name.equalsIgnoreCase(sname)) {
                        flag = 1;
                        System.out.println("Name found in Relatives..\n" + a);
                    }
                }
                for (PerFriend a : apef) {
                    if (a.name.equalsIgnoreCase(sname)) {
                        flag = 1;
                        System.out.println("Name found in Personal Friends..\n" + a);
                    }
                }
                for (ProFriend a : aprf) {
                    if (a.name.equalsIgnoreCase(sname)) {
                        flag = 1;
                        System.out.println("Name found in Professional Friends..\n" + a);
                    }
                }
                for (CasFriend a : acf) {
                    if (a.name.equalsIgnoreCase(sname)) {
                        flag = 1;
                        System.out.println("Name found in Casual Friends..\n" + a);
                    }
                }
                if (flag == 0) {
                    System.out.println("Name not found..");
                }
            } else if (ch == 6) {
                break;
            } else {
                System.out.println("Invalid Input");
            }
            if (outfile == null) {
                System.out.println("\nEnter the name of the file to write Data (Without .txt)");
                outfile = in.nextLine();

            }
            if (ch == 1 || ch == 2) { // If the data is updated, it is written to the file

                FileWriter b = new FileWriter(new File(outfile + ".txt"));
                BufferedWriter i = new BufferedWriter(b);
                int k = 1;
                if (!ar.isEmpty()) {
                    i.append(System.lineSeparator() + "RELATIVES:");
                }
                i.newLine();
                for (Relative c : ar) {
                    i.append("Relative " + k + ":" + System.lineSeparator());
                    i.append((c.toString()).replaceAll("\n", System.lineSeparator()));
                    i.newLine();
                    k++;
                }
                k = 1;
                if (!apef.isEmpty()) {
                    i.append(System.lineSeparator() + "PERSONAL FRIENDS:");
                }
                i.newLine();
                for (PerFriend c : apef) {

                    i.append("Personal Friend " + k + ":" + System.lineSeparator());
                    i.append((c.toString()).replaceAll("\n", System.lineSeparator()));
                    i.newLine();
                    k++;
                }
                k = 1;
                if (!aprf.isEmpty()) {
                    i.append(System.lineSeparator() + "PROFESSIONAL FRIENDS:");
                }
                i.newLine();
                for (ProFriend c : aprf) {

                    i.append("Professional Friend " + k + ":" + System.lineSeparator());
                    i.append((c.toString()).replaceAll("\n", System.lineSeparator()));
                    i.newLine();
                    k++;
                }
                k = 1;
                if (!acf.isEmpty()) {
                    i.append(System.lineSeparator() + "CASUAL FRIENDS:");
                }
                i.newLine();
                for (CasFriend c : acf) {
                    i.append("Casual Friend " + k + ":" + System.lineSeparator());
                    i.append((c.toString()).replaceAll("\n", System.lineSeparator()));
                    i.newLine();
                    k++;
                }
                // Closing both the streams
                i.close();
                b.close();
            }

        } while (true);

    }

}
