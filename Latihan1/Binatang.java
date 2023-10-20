/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Binatang;

/**
 *
 * @author L E N O V O
 */
public class Binatang {
    private  String namaHewan = "";
 private String tempatHidup = "";
 private int jumlahkaki =0;
  
 public Binatang ( String nama, String tempat, int kaki){
     namaHewan=nama;
     tempatHidup=tempat;
     jumlahkaki=kaki;
  
    }
 public void setnamaHewan (String nama){
     namaHewan=nama;
     
 }
 public void settempatHidup (String tempat){
     tempatHidup=tempat;
 }
 public void setjumlahkaki (int kaki){
     jumlahkaki=kaki;
 }
    public String getnamaHewan (){
        return namaHewan;
    }
    public String gettempatHidup (){
        return tempatHidup;
    }
    public int jumlahkaki (){
        return jumlahkaki;
    }
}


