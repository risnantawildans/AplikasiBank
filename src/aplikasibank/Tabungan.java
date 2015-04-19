/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasibank;
import java.util.Date;
/**
 *
 * @author RIsnanta Wildan S
 */
public class Tabungan {
    int saldo;
    int penyimpanan;
    int penarikan;
    Date tanggal;
    
    void setSaldo (int saldo)throws Exception{
        if(saldo>0){
        this.saldo = saldo;
    }else{
            throw new Exception("Saldo Tidak Mungkin Minus");
        }
    }
    void setPenyimpanan (int penyimpanan)throws Exception{
        if(penyimpanan>0){
        this.penyimpanan = penyimpanan;
        saldo = saldo + penyimpanan;
    }else{
            throw new Exception("Penambahan Saldo Gagal");
        }
    }
    
    void setPenarikan (int penarikan)throws Exception{
        if(penarikan>0){
        this.penarikan = penarikan;
        saldo = saldo - penarikan;
    }else{
            throw new Exception("Penarikan Uang Gagal");
        }
    }
    
    void setTanggal (Date tanggal){
        
        this.tanggal = tanggal;
    }
    
    int getSaldo(){
        return saldo;
    }
    int getPenyimpanan(){
        return penyimpanan;
    }
    int getPenarikan(){
        return penarikan;
    }
    Date getTanggal(){
        return tanggal;
    }
}
