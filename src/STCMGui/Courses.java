package STCMGui;


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
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

class Participant {  //participant object

    Scanner in = new Scanner(System.in);
    String porg, pname, padd, pmobile, pemail;

    @Override
    public String toString() { //overriding the toString function
        StringBuffer s = new StringBuffer();
        s.append("\n-Participant Name:" + this.pname);
        s.append("\n-Participant Organization:" + this.porg);
        s.append("\n-Participant Address:" + this.padd);
        s.append("\n-Participant Mobile No.:" + this.pmobile);
        s.append("\n-Participant Email:" + this.pemail);
        return s.toString();

    }

    Participant createpart() { //Creating a participant object
        Participant p = new Participant();
        System.out.println("Enter the participant name");
        p.pname = in.nextLine();
        System.out.println("Enter the participant address");
        p.padd = in.nextLine();
        do {
            System.out.println("Enter the participant mobile no.");
            p.pmobile = in.nextLine();
            if (Pattern.matches("([0-9]{10})", p.pmobile)) { // Checking for a valid mobile no.
                break;
            }
        } while (true);
        do {
            System.out.println("Enter the  participant email address");
            p.pemail = in.nextLine();
            if (Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}", p.pemail)) { // Checking for a valid email
                break;
            }
        } while (true);
        System.out.println("Enter organization name");
        p.porg = in.nextLine();
        return p;
    }
    // Altering details of the participants in all the courses with the same name
    void alterp(ArrayList<Participant> a) throws ParseException {
        System.out.println("Alter \n1.Participant Name\t2.Participant Organization\t3.Participant Address\t4.Participant Mobile No.\t5.Participant Email");
        System.out.println("Delete \n6.Participant Name\t7.Participant Organization\t8.Participant Address\t9.Participant Mobile No.\t10.Participant Email\nEnter your choice : ");
        int choice = Integer.valueOf(in.nextLine());
        if (choice == 1) {
            System.out.println("Enter new Participant Name");
            String name2 = in.nextLine();
            for (Participant g : a) {
                g.pname = name2;
            }
        } else if (choice == 2) {
            System.out.println("Enter new Participant Organization");
            String name2 = in.nextLine();
            for (Participant g : a) {
                g.porg = name2;
            }
        } else if (choice == 3) {
            System.out.println("Enter new Participant Address");
            String name2 = in.nextLine();
            for (Participant g : a) {
                g.padd = name2;
            }
        } else if (choice == 4) {
            String name2;
            do {
                System.out.println("Enter the new Participant mobile no.");
                name2 = in.nextLine();
                if (Pattern.matches("([0-9]{10})", name2)) {
                    break;
                }
            } while (true);
            for (Participant g : a) {
                g.pmobile = name2;
            }
        } else if (choice == 5) {
            String name2;
            do {
                System.out.println("Enter the  participant email address");
                name2 = in.nextLine();
                if (Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}", name2)) {
                    break;
                }
            } while (true);
            for (Participant g : a) {
                g.pemail = name2;
            }
        } else if (choice == 6) {
            String name2 = "";
            for (Participant g : a) {
                g.pname = name2;
            }
        } else if (choice == 7) {
            String name2 = "";
            for (Participant g : a) {
                g.porg = name2;
            }
        } else if (choice == 8) {
            String name2 = "";
            for (Participant g : a) {
                g.padd = name2;
            }
        } else if (choice == 9) {
            String name2 = "";
            for (Participant g : a) {
                g.pmobile = name2;
            }
        } else if (choice == 10) {
            String name2 = "";
            for (Participant g : a) {
                g.pemail = name2;
            }
        }

    }

}

class Faculty extends Participant {

    Scanner in = new Scanner(System.in);
    String fdep, fname, fadd, fmobile, femail;

    Faculty createfaculty() { // Creating a faculty object
        Faculty f = new Faculty();
        System.out.println("Enter the faculty name");
        f.fname = in.nextLine();
        System.out.println("Enter the department");
        f.fdep = in.nextLine();
        System.out.println("Enter the faculty address");
        f.fadd = in.nextLine();
        do {
            System.out.println("Enter the mobile no.");
            f.fmobile = in.nextLine();
            if (Pattern.matches("([0-9]{10})", f.fmobile)) {
                break;
            }
        } while (true);
        do {
            System.out.println("Enter the email address");
            f.femail = in.nextLine();
            if (Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}", f.femail)) {
                break;
            }
        } while (true);
        return f;
    }
    // Altering the details of all the faculty with the same name
    void alterf(ArrayList<Faculty> a) throws ParseException {
        System.out.println("Alter \n1.Faculty Name\t2.Faculty Department\t3.Faculty Address\t4.Faculty Mobile No.\t5.Faculty Email");
        System.out.println("Delete \n6.Faculty Name\t7.Faculty Department\t8.Faculty Address\t9.Faculty Mobile No.\t10.Faculty Email\nEnter your choice : ");
        int choice = Integer.valueOf(in.nextLine());
        if (choice == 1) {
            System.out.println("Enter new Faculty Name");
            String name1 = in.nextLine();
            for (Faculty f : a) {
                f.fname = name1;
            }
        } else if (choice == 2) {
            System.out.println("Enter new Faculty Department");
            String name1 = in.nextLine();
            for (Faculty f : a) {
                f.fdep = name1;
            }
        } else if (choice == 3) {
            System.out.println("Enter new Faculty Address");
            String name1 = in.nextLine();
            for (Faculty f : a) {
                f.fadd = name1;

            }
        } else if (choice == 4) {
            String name1;
            do {
                System.out.println("Enter the mobile no.");
                name1 = in.nextLine();
                if (Pattern.matches("([0-9]{10})", name1)) {
                    break;
                }
            } while (true);
            for (Faculty f : a) {
                f.fmobile = name1;

            }
        } else if (choice == 5) {
            String name1;
            do {
                System.out.println("Enter the email address");
                name1 = in.nextLine();
                if (Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}", name1)) {
                    break;
                }
            } while (true);
            for (Faculty f : a) {
                f.femail = name1;

            }
        } else if (choice == 6) {
            String name1 = "";
            for (Faculty f : a) {
                f.fname = name1;

            }
        } else if (choice == 7) {
            String name1 = "";
            for (Faculty f : a) {
                f.fdep = name1;

            }
        } else if (choice == 8) {
            String name1 = "";
            for (Faculty f : a) {
                f.fadd = name1;

            }
        } else if (choice == 9) {
            String name1 = "";
            for (Faculty f : a) {
                f.fmobile = name1;

            }
        } else if (choice == 10) {
            String name1 = "";
            for (Faculty f : a) {
                f.femail = name1;

            }
        }

    }

}
// Course class extends Faculty class 
class Course extends Faculty {

    DateFormat d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH); // Defining the date format yyyy-MM-dd
    Scanner in = new Scanner(System.in);
    String cn, cf, dur, sds;
    int flagfc = 1;
    Date sd = new Date();
    Faculty fc;
    Faculty[] ins;
    Participant[] par = new Participant[5];
    int insno, parno = 0,insno1;

    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("\nCourse Details:");
        s.append("\n-Course Name:" + this.cn);
        s.append("\n-Course Fees:" + this.cf);
        s.append("\n-Course Start Date:" + this.sds);
        s.append("\n-Course Duration:" + this.dur);
        s.append("\n-No. of Instructors:" + this.insno);
        s.append("\n-No. of Participants:" + this.parno);
        if (this.flagfc == 1) { // Checking if there is a course coordinator
            s.append("\nCourse Coordinator Details:");
            s.append("\n-Name:" + this.fc.fname);
            s.append("\n-Department:" + this.fc.fdep);
            s.append("\n-Address:" + this.fc.fadd);
            s.append("\n-Mobile No.:" + this.fc.fmobile);
            s.append("\n-Email:" + this.fc.femail);

        }

        for (int i = 0; i < this.insno; i++) {
            s.append("\nInstructor " + (i + 1) + " details:");
            s.append("\n-Name:" + this.ins[i].fname);
            s.append("\n-Department:" + this.ins[i].fdep);
            s.append("\n-Address:" + this.ins[i].fadd);
            s.append("\n-Mobile No.:" + this.ins[i].fmobile);
            s.append("\n-Email:" + this.ins[i].femail);
        }
        for (int i = 0; i < this.parno; i++) {
            s.append("\nParticipant " + (i + 1) + " details:");
            s.append("\n-Name:" + this.par[i].pname);
            s.append("\n-Organization:" + this.par[i].porg);
            s.append("\n-Address:" + this.par[i].padd);
            s.append("\n-Mobile No.:" + this.par[i].pmobile);
            s.append("\n-Email:" + this.par[i].pemail);
        }
        return s.toString();
    }
    // Creating the course object
    Course createcourse() throws ParseException {
        Course c = new Course();
        System.out.println("Adding Course details : ");
        System.out.println("Enter course name");
        c.cn = in.nextLine();
        do {
            System.out.println("Enter course fee (in numeric)");
            c.cf = in.nextLine();
            if (Pattern.matches("[0-9]+", c.cf)) {
                break;
            }
        } while (true);

        System.out.println("Enter start date (in yyyy-MM-dd formt)");
        c.sds = in.nextLine();
        c.sd = d.parse(c.sds);
        do {
            System.out.println("Enter course duration (in days) (Max. 2 weeks)");
            c.dur = in.nextLine();
            if (Integer.valueOf(c.dur) <= 14) { // Checking duration of course
                break;
            }

        } while (true);

        System.out.println("Adding Faculty Coordinator");
        c.fc = createfaculty();

        do {

            System.out.println("Enter no. of instructors(Max. 5) : ");
            String inst = in.nextLine();
            c.insno = Integer.valueOf(inst);
            if (c.insno <= 5) {
                break;
            }

        } while (true);
        c.ins = new Faculty[5];
        for (int i = 0; i < c.insno; i++) {
            System.out.println("Adding instructor " + (i + 1) + " : ");
            c.ins[i] = createfaculty();
        }
        return c;

    }

    void addpart() {
        int part;
        do {
            System.out.println("Enter no. of participants to be added: (Max. 5) ");
            part = Integer.valueOf(in.nextLine());
            this.parno = this.parno + part;
            if (this.parno <= 5) {
                break;
            }
            this.parno = this.parno - part;

        } while (true);
        for (int i = (this.parno - part); i < this.parno; i++) {
            System.out.println("Adding participant " + (i + 1) + " : ");
            this.par[i] = createpart();
        }
    }

    void alter() throws ParseException {
        System.out.println("Alter \n1.Course Name\t2.Course Fees\t3.Course StartDate\t4.Course Duration\t5.Course Coordinator");
        System.out.println("Delete \n6.Course Name\t7.Course Fees\t8.Course StartDate\t9.Course Duration\t10.Course Coordinator\t11.Instructors\t12.Participants\nEnter your choice : ");
        int choice = Integer.valueOf(in.nextLine());
        if (choice == 1) {
            System.out.println("Enter new Course name");
            this.cn = in.nextLine();
        } else if (choice == 2) {
            do {
                System.out.println("Enter course fee (in numeric)");
                this.cf = in.nextLine();
                if (Pattern.matches("[0-9]+", this.cf)) {
                    break;
                }

            } while (true);
        } else if (choice == 3) {
            System.out.println("Enter new Course Start Date");
            this.sd = d.parse(in.nextLine());
        } else if (choice == 4) {
            do {
                System.out.println("Enter course duration (in days) (Max. 2 weeks)");
                this.dur = in.nextLine();
                if (Integer.valueOf(this.dur) <= 14) {
                    break;
                }
            } while (true);
        } else if (choice == 5) {
            System.out.println("Enter details of new Course Coordinator :");
            this.fc = this.createfaculty();
        } else if (choice == 6) {
            this.cn = "";
        } else if (choice == 7) {
            this.cf = "";
        } else if (choice == 8) {
            this.sd = null;
        } else if (choice == 9) {
            this.dur = "";
        } else if (choice == 10) {
            this.fc = new Faculty();
            this.flagfc = 0;
        } else if (choice == 11) {
            System.out.println("Enter the name of the Instructor to delete"); // Deleting instructor 
            String nameins = in.nextLine();
            for (int i = 0; i < this.insno; i++) {
                if (this.ins[i].fname.equalsIgnoreCase(nameins)) {
                    this.ins[i] = this.ins[this.insno - 1];
                    this.insno--;

                }

            }

        } else if (choice == 12) {
            System.out.println("Enter the name of the participant to delete"); // Deleting participant
            String namepar = in.nextLine();
            for (int i = 0; i < this.parno; i++) {
                if (this.par[i].pname.equalsIgnoreCase(namepar)) {
                    this.par[i] = this.par[this.parno - 1];
                    this.parno--;

                }

            }

        }

    }
}

public class Courses extends Course {

    public static void main(String args[]) throws ParseException, IOException {
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String infile, outfile = null;
        Scanner in = new Scanner(System.in);
        System.out.println("1.Take input from a file\n2.Start off fresh\nEnter your Choice :");
        int choice = Integer.valueOf(in.nextLine());
        Courses course = new Courses();
        ArrayList<Course> a = new ArrayList<Course>(); // Creating array list of courses
        int size = 0;
        if (choice == 1) {
            System.out.println("\nEnter the file to import data from : (Without .txt)");
            infile = in.nextLine();
            FileReader b1 = new FileReader(new File(infile + ".txt"));
            BufferedReader i1 = new BufferedReader(b1);
            while (true) {
                i1.readLine();
                i1.readLine();
                String x = i1.readLine();
                if (x == null) {
                    break;
                }
                String s[] = x.split(":"); // Splitting into array with delimiter :
                if (s[0].equalsIgnoreCase("Course Details")) {

                    Course c = new Course();
                    s = i1.readLine().split(":");
                    c.cn = s[1];
                    s = i1.readLine().split(":");
                    c.cf = s[1];
                    s = i1.readLine().split(":");
                    c.sds = s[1];
                    s = i1.readLine().split(":");
                    c.dur = s[1];
                    s = i1.readLine().split(":");
                    c.insno = Integer.valueOf(s[1]);
                    s = i1.readLine().split(":");
                    c.parno = Integer.valueOf(s[1]);
                    i1.readLine();
                    s = i1.readLine().split(":");
                    c.fc = new Faculty();
                    c.fc.fname = s[1];
                    s = i1.readLine().split(":");
                    c.fc.fdep = s[1];
                    s = i1.readLine().split(":");
                    c.fc.fadd = s[1];
                    s = i1.readLine().split(":");
                    c.fc.fmobile = s[1];
                    s = i1.readLine().split(":");
                    c.fc.femail = s[1];
                    c.ins = new Faculty[c.insno];
                    for (int i = 0; i < c.insno; i++) {
                        c.ins[i] = new Faculty();

                        i1.readLine();
                        s = i1.readLine().split(":");
                        c.ins[i].fname = s[1];
                        s = i1.readLine().split(":");
                        c.ins[i].fdep = s[1];
                        s = i1.readLine().split(":");
                        c.ins[i].fadd = s[1];
                        s = i1.readLine().split(":");
                        c.ins[i].fmobile = s[1];
                        s = i1.readLine().split(":");
                        c.ins[i].femail = s[1];
                    }
                    c.par = new Participant[5];
                    for (int i = 0; i < c.parno; i++) {
                        c.par[i] = new Participant();
                        i1.readLine();
                        s = i1.readLine().split(":");
                        c.par[i].pname = s[1];
                        s = i1.readLine().split(":");
                        c.par[i].porg = s[1];
                        s = i1.readLine().split(":");
                        c.par[i].padd = s[1];
                        s = i1.readLine().split(":");
                        c.par[i].pmobile = s[1];
                        s = i1.readLine().split(":");
                        c.par[i].pemail = s[1];
                    }
                    a.add(c);
                } else {
                    continue;
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
        size = a.size();
        //updating no. of courses
        do {
            System.out.println("\n1.Add a course\n2.Display all courses(In the last Year)\n3.Add Participants\n4.View participants\n5.Alter details of a Course\n6.Alter details of a Faculty\n7.Alter deatils of a Participnt\n8.Exit\n Enter the choice");
            int ch = Integer.valueOf(in.nextLine());
            if (ch == 1) {
                if (size < 10) {
                    Course c = course.createcourse();
                    a.add(c);
                    System.out.println("Course Added...!");
                    Period p = Period.between(LocalDate.parse(c.sds), LocalDate.now());
                    if (p.getYears() == 0) {
                        size++;
                    }
                } else {
                    System.out.println("Cannot create more courses...Maximum Limit of 10 reached");
                }
            } else if (ch == 2) {
                Period p;
                int i = 1;
                Iterator<Course> it = a.iterator();
                while (it.hasNext()) {
                    Course curr = (Course) it.next();
                    p = Period.between(LocalDate.parse(curr.sds), LocalDate.now());
                    if (p.getYears() == 0) {
                        System.out.println("\nCourse " + i + curr);
                        i++;
                    }
                }
            } else if (ch == 3) {
                System.out.println("Enter the name of the Course to add participants");
                String namecour = in.nextLine();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Course c1 = ((Course) it.next());
                    String namec = c1.cn;
                    if (namec.equalsIgnoreCase(namecour)) {
                        c1.addpart();
                        break;
                    }
                }
            } else if (ch == 4) {
                System.out.println("Enter the name of the Course to view participants");
                String namecour = in.nextLine();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Course c1 = ((Course) it.next());
                    String namec = c1.cn;
                    if (namec.equalsIgnoreCase(namecour)) {
                        for (int i = 1; i <= c1.parno; i++) {
                            System.out.println("\n\tParticipant " + i + " :");
                            System.out.println(c1.par[i - 1]);
                        }
                    }
                }
            } else if (ch == 5) {
                System.out.println("Enter the name of the Course to alter details");
                String namecour = in.nextLine();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Course c1 = ((Course) it.next());
                    String namec = c1.cn;
                    if (namec.equalsIgnoreCase(namecour)) {
                        c1.alter();
                        break;
                    }
                }
            } else if (ch == 6) {
                Faculty facu = new Faculty();
                ArrayList fsat = new ArrayList();
                System.out.println("Enter the name of the Faculty to alter details");
                String fac = in.nextLine();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    Course c1 = ((Course) it.next());
                    Faculty fc = c1.fc;
                    Faculty[] f = c1.ins;
                    String namefc = fc.fname;
                    for (int i = 0; i < c1.insno; i++) {

                        String namef = f[i].fname;
                        if (namef.equalsIgnoreCase(fac)) {
                            fsat.add(f[i]);
                        }
                    }
                    if (!(namefc == null)) {
                        if (namefc.equalsIgnoreCase(fac)) {
                            fsat.add(fc);
                        }
                    }
                }
                facu.alterf(fsat);
            } else if (ch == 7) {
                Participant parti = new Participant();
                ArrayList psat = new ArrayList();
                System.out.println("Enter the name of the Participant to alter details");
                String pa = in.nextLine();
                Iterator<Course> it = a.iterator();
                while (it.hasNext()) {
                    Course c1 = ((Course) it.next());
                    Participant[] p = c1.par;
                    for (int i = 0; i < c1.parno; i++) {
                        String namep = p[i].pname;
                        if (namep.equalsIgnoreCase(pa)) {
                            psat.add(p[i]);
                        }
                    }
                }
                parti.alterp(psat);
            } else if (ch == 8) {
                break;
            } else {
                System.out.println("Invalid input... ");
            }
            if (outfile==null) {
                System.out.println("\nEnter the name of the file to write Data (Without .txt)");
                outfile = in.nextLine();

            }
            //updating file if data is updated
            if (ch == 1 || ch == 3 || ch == 5 || ch == 6 || ch == 7) {
                FileWriter b = new FileWriter(new File(outfile + ".txt"));
                BufferedWriter i = new BufferedWriter(b);
                int k = 1;
                for (Course c : a) {
                    i.append(System.lineSeparator() + "COURSE " + k);
                    i.append((c.toString()).replaceAll("\n", System.lineSeparator()));
                    i.newLine();
                    k++;
                }
                //Closing the streams
                i.close();
                b.close();
            }

        } while (true);

    }
}
