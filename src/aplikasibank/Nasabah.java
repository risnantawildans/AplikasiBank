/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasibank;

/**
 *
 * @author RIsnanta Wildan S
 */
public class Nasabah {
    private String noRek;
    private String nama;
    private Alamat alamat;
    private Tabungan tabungan;
    
    void setNoRek(String noRek)throws Exception{
        if (noRek.length()==10){
            try{
            Integer.parseInt(noRek);
            } catch (Exception e){
            throw new Exception("Nomor Rekening Harus Berupa Angka");
            }
            this.noRek = noRek;
        }else if (noRek == "0000000000"){
            throw new Exception ("Nomor Rekening yang Dimasukkan Tidak Berlaku");
        }else{
            throw new Exception ("Nomor Rekening yang Dimasukkan Salah");
        }
    }
    
    void setNama(String nama)throws Exception{
        if (nama.length()<=30){
             for (char i : nama.toCharArray()){
                if (Character.isDigit(i)){
                    throw new Exception("Nama yang Dimasukkan Tidak Boleh Mengandung Angka!");
                }
        }
            this.nama = nama;           
        }else{
            throw new Exception("Nama yang Dimasukkan Salah");
        }
    }
    
    void setAlamat (Alamat alamat){
        
        this.alamat = alamat;
    }
    
    void setTabungan(Tabungan tabungan){
        
        this.tabungan = tabungan;
    }
    
    String getNama(){
        return nama;
    }
    String getNoRek(){
        return noRek;
    }
    Alamat getAlamat(){
        return alamat;
    }
    Tabungan getTabungan(){
        return tabungan;
    }
}
