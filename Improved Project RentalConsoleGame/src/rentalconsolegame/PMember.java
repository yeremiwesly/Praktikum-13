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
public class PMember extends GMember {
    void inputPlatinum(member x){
        this.Platinum(x);
    }
    
    private void Platinum(member x) {
        super.member = x;
        this.sewa = 45000;
        this.diskon = 3;
        this.poin = 10;
        this.cashback = 10000;
        this.pulsa = 5000;
        super.input();
        this.hitungTotal();
        this.output();
        this.output2();
        this.output3();
    }
    
    public void output3(){
        System.out.println("Bonus Pulsa                       : Rp "+this.cashback);
    }
}
