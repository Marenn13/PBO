
package utspbo;


public class Pasien {
    private String Nama;
    private String Jk;
    private int umur;
    private String alamat;
    private String Diagnosa;
    private double biayaPengobatan;
    private int hargaObat;
   
    
    
    public Pasien (){
        
    }
    public Pasien (String Nama, String Jk, int umur,String alamat, String Diagnosa, double biayaPengobatan, int hargaObat){
         this.Nama=Nama;
         this.Jk=Jk;
         this.umur=umur;
         this.alamat=alamat;
         this.Diagnosa=Diagnosa;
         this.biayaPengobatan = biayaPengobatan;
         this.hargaObat=hargaObat;
      
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJk() {
        return Jk;
    }

    public void setJk(String Jk) {
        this.Jk = Jk;
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

    public String getDiagnosa() {
        return Diagnosa;
    }

    public void setDiagnosa(String Diagnosa) {
        this.Diagnosa = Diagnosa;
    }
      public double getBiayaPengobatan() {
        return biayaPengobatan;
    }

    public void setBiayaPengobatan(double biayaPengobatan) {
        this.biayaPengobatan = biayaPengobatan;
    }
       public int gethargaObat() {
        return hargaObat;
    }

    public void sethargaObat(String Dosis) {
        this.hargaObat = hargaObat;
    }
   public double getBiayaPengobatanPasien() {
        return biayaPengobatan + hargaObat;
    }
   
    

 
    
    
    

}