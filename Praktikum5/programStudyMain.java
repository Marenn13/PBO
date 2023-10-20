/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikumpbo;


public class programStudyMain {

   
    public static void main(String[] args) {
        Pegawai pgw=new Pegawai ();
        pgw.setNama("Maren");
        pgw.setNIP(182);
        pgw.setGaji_pokok (4000000);
        pgw.setJamLembur(2);
        pgw.setJumlah_anak(2);
        
        programStudy psd=new programStudy();
        psd.setKetuaProdi(pgw);
        psd.setNamaProdi("Informatika");
        psd.setKodeProdi("G");
        
        System.out.println("Kode Prodi    : "+psd.getKodeProdi());
        System.out.println("Program Study : "+psd.getNamaProdi());
        System.out.println("Ketua Prody   : "+psd.getKetuaProdi().getNama());
    }
    
}
