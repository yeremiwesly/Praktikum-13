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
public class member {
    String ID;
    String Nama;
    String Jenis;
    
    public member(String x, String y, String z) {
        this.ID = x;
        this.Nama = y;
        this.Jenis = z;
    }
    
    void output() {
        System.out.println("ID Member                         : " + this.ID);
        System.out.println("Nama Member                       : " + this.Nama);
        System.out.println("Jenis Member                      : " + this.Jenis);
        System.out.println();
    }
}
