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
public class Cabang {
    private String noCabang;
    private Alamat alamat;
    private int jumlahPegawai;
    
    void setNoCabang (String noCabang) throws Exception{
        if (noCabang.length()== 3){
        for (int i=0; i<3; i++){
             if(!Character.isDigit(noCabang.charAt(i))){
                return;
                }
             else if ("000".equals(noCabang)){
                throw new Exception("Nomor Cabang Tidak Berlaku");
                }
            }
        this.noCabang = noCabang;
        }else{
            throw new Exception ("Nomor Cabang yang Dimasukkan Salah");
            }
    }
    
    void setJumlahPegawai(int jumlahPegawai) throws Exception{
        if (jumlahPegawai<=50 && jumlahPegawai>=10){
            this.jumlahPegawai = jumlahPegawai; 
        }else if(jumlahPegawai>50){
            throw new Exception("Jumlah Pegawai Berlebihan");
        }else{
            throw new Exception ("Jumlah Pegawai Salah");
        }
        }
    
    void setAlamat(Alamat alamat){
        this.alamat = alamat;
    }
    
    String getNoCabang(){
        return noCabang;
    }
     int getJumlahPegawai(){
        return jumlahPegawai;
    }
      Alamat getAlamat(){
        return alamat;
    }
}
