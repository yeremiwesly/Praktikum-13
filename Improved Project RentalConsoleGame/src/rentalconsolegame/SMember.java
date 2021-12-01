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
public class SMember extends Membership{
    void inputSilver(member x){
        this.Silver(x);
    }
    
    private void Silver(member x) {
        super.member = x;
        this.sewa = 25000;
        this.diskon = 1;
        this.poin = 1;
        super.input();
        this.hitungTotal();
        this.output();
    }
    
    public void hitungTotal() {
        this.poin *= lama;
        this.totalSewa = this.sewa * this.lama;
        int disc = this.totalSewa * this.diskon/100;
        this.totalSewa -= disc;
    }
    
    public void output() {
        System.out.println("Total Sewa		          : Rp " + this.totalSewa);
        System.out.println("Jumlah Poin		          : " + this.poin + " poin");
    }
}
