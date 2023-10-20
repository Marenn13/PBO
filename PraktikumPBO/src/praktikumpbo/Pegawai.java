

package praktikumpbo;


public class Pegawai {

    
    private int NIP;
    private String nama;
    private double gaji_pokok;
    private int jamLembur;
    private int jumlah_anak;
    private final int konstanta = 20000;
    
    
    
    
      public double gajiLembur() {
        double gL = jamLembur * konstanta;
        return gL;
    }

    public double tunKel() {
        double tunK = 0.1 * jumlah_anak * gaji_pokok;
        return tunK;
    }

    public double gajiTotal() {
        double gT = gaji_pokok + gajiLembur() + tunKel();
        return gT;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    public void setJamLembur(int jamLembur) {
        this.jamLembur = jamLembur;
    }

    public int getJumlah_anak() {
        return jumlah_anak;
    }

    public void setJumlah_anak(int jumlah_anak) {
        this.jumlah_anak = jumlah_anak;
    }

  
   
}
    


       
    
    

