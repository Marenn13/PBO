
package latihanpbo;
public class dosen {
      private String nama;
  private static int nip;
  
  
  public dosen() {
      
  }
  
  public dosen(String nama, int nip) {
      this.nama = nama;
      this.nip = nip;
  }
  
  public dosen(int nip, String nama) {
      this.nama = nama;
      this.nip = nip;
  }
  
  public void Setnama(String nama) {
      this.nama = nama;
  }
  
  public void Setnip(int nip) {
      this.nip = nip;
  }
  
  public String Getnama() {
      return nama;
  }
  
  public static int Getnip() {
      return nip;
  }
  
  public void tampil() {
      System.out.println("Nama = "+this.Getnama());
      System.out.println("NIP = "+this.Getnip());
  }
  
  public static void tampil2 () {
//      System.out.println("Nama static = "+Getnama());
      System.out.println("NIP static = "+Getnip());
  }
}

    

