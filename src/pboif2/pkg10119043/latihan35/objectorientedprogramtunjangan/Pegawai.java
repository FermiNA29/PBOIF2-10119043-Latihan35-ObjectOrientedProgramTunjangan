/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan35.objectorientedprogramtunjangan;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program tunjangan karyawan dengan object oriented
 */
public class Pegawai {
    public int gajiPokok;
    public String status;
    private boolean statusPegawai;
    private double tunjangan;
    
    private boolean cekStatus() {
        statusPegawai = status.toLowerCase().equals("menikah");
        return statusPegawai;
    }
    
    private double hitungTunjangan () {
            tunjangan =(cekStatus())?gajiPokok * 0.35:0;
        return tunjangan;
    }
    
    public void hitungGajiTotal() {
        System.out.println("===== Hasil Perhitungan Gaji Anda =====");
        System.out.println("Gaji Pokok\t : " + gajiPokok);
        System.out.println("Tunjangan\t : " + hitungTunjangan());
        System.out.println("Total gaji\t : " + (gajiPokok + hitungTunjangan()));
    }
}
