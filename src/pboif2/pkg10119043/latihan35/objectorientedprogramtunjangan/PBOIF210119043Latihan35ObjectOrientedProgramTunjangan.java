/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan35.objectorientedprogramtunjangan;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program tunjangan karyawan dengan object oriented
 */
public class PBOIF210119043Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai gajiKaryawan = new Pegawai();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("======== Program Tunjangan ========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gajiKaryawan.gajiPokok = scanner.nextInt();
        
        System.out.print("Status Anda? (Menikah/Belum)\t : ");
        gajiKaryawan.status = scanner.next();
        
        gajiKaryawan.hitungGajiTotal();
    }
    
}
