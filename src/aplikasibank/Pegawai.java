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
public class Pegawai {
    private String id;
    private String namaPegawai;
    private Alamat alamat;
    private Cabang cabang;
    
    void setId(String id)throws Exception{
        if(id.length()==6){
            try{
                Integer.parseInt(id);
            }catch (Exception e){
                throw new Exception("ID Pegawai Harus Berupa Angka");
            }
            this.id = id;
        }else{
            throw new Exception("ID Pegawai Salah");
        }
    }
    
    void setNamaPegawai(String namaPegawai) throws Exception{
        if (namaPegawai.length()<=30){
             for (char i : namaPegawai.toCharArray()){
                if (Character.isDigit(i)){
                    throw new Exception("Nama yang Dimasukkan Tidak Boleh Mengandung Angka!");
                }
        }
            this.namaPegawai = namaPegawai;           
        }else{
            throw new Exception("Nama yang Dimasukkan Salah");
        }
    }
    
    void setAlamat(Alamat alamat){
        
        this.alamat = alamat;
    }
    
    void setCabang(Cabang cabang){
        
        this.cabang = cabang;
    }
    String getId(){
        return id;
    }
    String getNamaPegawai(){
        return namaPegawai;
    }
    Alamat getAlamat(){
        return alamat;
    }
    Cabang getCabang(){
        return cabang;
    }
}
