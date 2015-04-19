/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasibank;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author RIsnanta Wildan S
 */
public class AplikasiBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cabang cabang1 = new Cabang();
        try{
        cabang1.setNoCabang("001");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
        cabang1.setJumlahPegawai(25);
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        
        Alamat alamatCabang1 = new Alamat();
        try {
                alamatCabang1.setJalan("Jalan Pahlawan No 33");
        }catch(Exception e){
                System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
            alamatCabang1.setKota("Antah Berantah");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
            alamatCabang1.setProvinsi("Jakarta");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        cabang1.setAlamat(alamatCabang1);
        
        
        Pegawai pegawai1 = new Pegawai();
        try{
            pegawai1.setNamaPegawai("Salma");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
            pegawai1.setId("123456");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        
        Alamat alamatPegawai1 = new Alamat();
        try {
            alamatPegawai1.setJalan("Gang Asem no 14");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
            alamatPegawai1.setKota("Semarang");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
        alamatPegawai1.setProvinsi("Jawa Tengah");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        pegawai1.setAlamat(alamatPegawai1);
        
        
        Nasabah nasabah1 = new Nasabah();
        try{
            nasabah1.setNama("Risnanta Wildan Sambodo");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
            nasabah1.setNoRek("1234567890");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        
        Alamat alamatNasabah1 = new Alamat();
        try {
            alamatNasabah1.setJalan("Jalan Pahlawan No 33");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
            alamatNasabah1.setKota("Jakarta Timur");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
        alamatNasabah1.setProvinsi("Jakarta");
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        nasabah1.setAlamat(alamatNasabah1);
        
        Tabungan tabungan1= new Tabungan();
        try{
            tabungan1.setSaldo(10000);
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
        tabungan1.setPenyimpanan(20000);
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        try{
        tabungan1.setPenarikan(5000);
        }catch(Exception e){
            System.out.println("Terjadi Eror "+e.getMessage());
        }
        nasabah1.setTabungan(tabungan1);
        
        Date tanggal;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2015);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DATE, 14);
        tanggal = cal.getTime();
        
        cetakCabang(cabang1);
        cetakAlamatCabang(alamatCabang1);
        cetakPegawai(pegawai1);
        cetakNasabah(nasabah1);
        cetakAlamatNasabah(alamatNasabah1);
        cetakTabungan(tabungan1);
    }

     static void cetakCabang(Cabang cabang) {
        System.out.println("Cabang " +cabang.getNoCabang());
//        System.out.println(cabang.getJumlahPegawai());
     }
     static void cetakAlamatCabang(Alamat alamatCabang){
         System.out.print(alamatCabang.getJalan()+", ");
         System.out.print(alamatCabang.getKota()+", ");
         System.out.println(alamatCabang.getProvinsi());
         System.out.println("");
     }
     static void cetakNasabah (Nasabah nasabah) {
         System.out.println("Nasabah:");
         System.out.println(nasabah.getNama());
         System.out.println(nasabah.getNoRek());
     }
     static void cetakAlamatNasabah(Alamat alamatNasabah){
         System.out.print(alamatNasabah.getJalan()+", ");
         System.out.print(alamatNasabah.getKota()+", ");
         System.out.println(alamatNasabah.getProvinsi());
     }
     static void cetakTabungan(Tabungan tabungan){
         System.out.println("Sisa Saldo: "+tabungan.getSaldo());
     }

    private static void cetakPegawai(Pegawai pegawai) {
        System.out.println("Teller:");
        System.out.println(pegawai.getNamaPegawai());
        System.out.println(pegawai.getId());
        System.out.println("");
    }
}
    

