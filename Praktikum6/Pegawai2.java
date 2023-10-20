

package pbo6;


public class Pegawai2 {
  private String Nama;
  private String NIP;
  private String Alamat;
  private int Umur;
  private double GajiPokok;
  
  public Pegawai2(){
        

  }
  public Pegawai2(String Nama, String NIP, String Alamat, int Umur, double GajiPokok){
      this.Nama=Nama;
      this.NIP=NIP;
      this.Alamat=Alamat;
      this.Umur=Umur;
      this.GajiPokok=GajiPokok;
  }
  
  

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public double getGajiPokok() {
        return GajiPokok;
    }

    public void setGajiPokok(double GajiPokok) {
        this.GajiPokok = GajiPokok;
    }
  
  
  
  
  
  
  
    
}
