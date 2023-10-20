

package latihanpbo;


public class Mahasiswa {
    private int NIM;
    private String Nama;

public  Mahasiswa() {
    
}
 public Mahasiswa (String Nama){
    this.Nama=Nama;
    
}
  public Mahasiswa (String Nama, int NIM){
     this.NIM=NIM;
 }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void tampil() {
        System.out.println("Nama :"+getNama());
        System.out.println("NIM  :"+getNIM());
        
    }
 
 
 

}

   