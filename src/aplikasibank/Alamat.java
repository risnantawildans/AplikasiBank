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
public class Alamat {
    private String jalan;
    private String kota;
    private String provinsi;


void setJalan (String jalan)throws Exception {
    if (jalan.length()<100){
          this.jalan = jalan;         
        }else{
            throw new Exception("Jalan yang Dimasukkan Salah");
        }
}

void setKota (String kota)throws Exception{
        if (kota.length()<=30){
             for (char i : kota.toCharArray()){
                if (Character.isDigit(i)){
                    throw new Exception("Kota yang Dimasukkan Tidak Boleh Mengandung Angka!");
                }
        }
            this.kota = kota;           
        }else{
            throw new Exception("Kota yang Dimasukkan Salah");
        }
    }

void setProvinsi (String provinsi)throws Exception{
        if (provinsi.length()<=30){
             for (char i : provinsi.toCharArray()){
                if (Character.isDigit(i)){
                    throw new Exception("Provinsi yang Dimasukkan Tidak Boleh Mengandung Angka!");
                }
        }
            this.provinsi = provinsi;           
        }else{
            throw new Exception("Provinsi yang Dimasukkan Salah");
        }
    }
    String getJalan(){
        return jalan;
    }
     String getKota(){
        return kota;
    }
      String getProvinsi(){
        return provinsi;
    }
}
