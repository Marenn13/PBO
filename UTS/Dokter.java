

package utspbo;


public class Dokter {
    
    private String Nama;
    private String Spesialis;
    private String jadwal;
    
    public Dokter (){
        
    }
    public Dokter (String Nama, String Spesialis, String jadwal){
        this.Nama=Nama;
        this.Spesialis=Spesialis;
        this.jadwal=jadwal;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getSpesialis() {
        return Spesialis;
    }

    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
    
    
    
}
