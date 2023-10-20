

package pbo6;


public class Peminjam {
    private String id;
    private String Nama;
    private String Alamat;
    
    
    public Peminjam (String Nama, String id, String Alamat){
        this.Nama=Nama;
        this.id=id;
        this.Alamat=Alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
   
    }
    

