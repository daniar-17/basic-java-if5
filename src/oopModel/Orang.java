/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopModel;

/**
 *
 * @author dania
 */
public class Orang {
    //atribut
    private String nama;
    private int umur;
    private String alamat;
    private char jenisKelamin;
    private int tinggiBadan;
    
    
    public Orang(){
        System.out.println("ini adalah konstrustor default");
    }
    
    public Orang(String status){
        System.out.println("ini konstructor dengan 1 param status = "+status);
    }

    public Orang(String nama, int umur, String alamat, char jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    // method object  getter dan setter (encapsulasi)
    public String getNama() {   
        return nama;
    }

    public void setNama(String nama) {     
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }
    
    // method lainnya.
    public void sayHello(){
        System.out.println("Haloo nama saya "+ nama);
    }
}
