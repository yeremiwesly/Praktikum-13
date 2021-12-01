/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NITRO 5
 */
public class Membership {
    ArrayList<member> Member = new ArrayList<>();
    public member member;
    protected LocalDate pinjam;
    protected LocalDate kembali;
    protected int lama;
    protected int diskon;
    protected int sewa;
    protected int poin;
    protected int totalSewa;
    protected int cashback;
    protected int pulsa;
    
    public void addMember(member data) {
        this.Member.add(data);
    }
    
    void cariID(String ID){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<this.Member.size(); i++){
            if (this.Member.get(i).ID.equals(ID)){
                index = i;
                ditemukan = true;
            }
        }
         
        if (ditemukan == true){
            this.member = this.Member.get(index);
        } else {
            System.out.println("Data tidak ditemukan");
            System.exit(0);
        }
    }
    
    public member inputMember() {
        Scanner input = new Scanner(System.in);
        System.out.println("PROJECT RENTAL CONSOLE GAME");
        System.out.println("================================================");
        System.out.print("Masukkan ID Member                : ");
        this.cariID(input.nextLine());
        
        return this.member;
    }
    
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)    : ");
        int tgl1 = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam   (1-12)    : ");
        int bln1 = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam             : ");
        int thn1 = input.nextInt();
        System.out.print("\nMasukkan Tanggal Kembali (1-31)   : ");
        int tgl2 = input.nextInt();
        System.out.print("Masukkan Bulan Kembali   (1-12)   : ");
        int bln2 = input.nextInt();
        System.out.print("Masukkan Tahun Kembali            : ");
        int thn2 = input.nextInt();   
        
        this.pinjam = LocalDate.of(thn1, bln1, tgl1);
        this.kembali = LocalDate.of(thn2, bln2, tgl2);
        this.lama = (int) ChronoUnit.DAYS.between(this.pinjam, this.kembali);
        System.out.println();
        
        this.member.output();
        System.out.println("Tanggal Pinjam                    : "+tgl1+"-"+bln1+"-"+thn1);
        System.out.println("Tanggal Kembali                   : "+tgl2+"-"+bln2+"-"+thn2);
        System.out.println("Lama Sewa                         : "+this.lama+" hari");
        System.out.println();
    }
}

