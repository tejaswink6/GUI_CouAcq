/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactList;

/**
 *
 * @author tejas
 */
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
