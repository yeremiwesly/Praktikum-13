/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author NITRO 5
 */
public class RentalConsoleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Membership m = new Membership();
        m.addMember(new member("M001", "Mr. X", "Silver"));
        m.addMember(new member("M002", "Mr. Y", "Gold"));
        m.addMember(new member("M003", "Mr. Z", "Platinum"));
        
      member member = m.inputMember();
        switch(member.Jenis) {
            case "Silver":
                SMember sm = new SMember();
                sm.inputSilver(member);
                break;
            case "Gold":
                GMember gm = new GMember();
                gm.inputGold(member);
                break;
            case "Platinum":
                PMember pm = new PMember();
                pm.inputPlatinum(member);
                break;
        }
    }
}