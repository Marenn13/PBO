

package utspbo;


public class RumahSakit {
    private String Nama;
    private int jmlKamar;
    private int  jmlDokter;
    private int jumObat;
    private Pasien[]daftarPasien;
    private Dokter[]daftarDokter;
    private Obat[]daftarObat;
    

    
    public RumahSakit(String Nama, int jmlKamar, int jmlDokter, int jumObat){
        this.Nama=Nama;
        this.jmlKamar=jmlKamar;
        this.jmlDokter=jmlDokter;
        this.jumObat=jumObat;
    
    }

    public int getJmlKamar() {
        return jmlKamar;
    }

    public void setJmlKamar(int jmlKamar) {
        this.jmlKamar = jmlKamar;
    }

    public int getJmlDokter() {
        return jmlDokter;
    }

    public void setJmlDokter(int jmlDokter) {
        this.jmlDokter = jmlDokter;
    }

    public int getJumObat() {
        return jumObat;
    }

    public void setJumObat(int jumObat) {
        this.jumObat = jumObat;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Pasien[] getdaftarPasien() {
        return daftarPasien;
    }

    public void setdaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    public Dokter[] getdaftarDokter() {
        return daftarDokter;
    }

    public void setdaftarDokter(Dokter[] daftarDokter) {
        this.daftarDokter = daftarDokter;
    }

    public Obat[] getdaftarObat() {
        return daftarObat;
    }

    public void setdaftarObat(Obat[] daftarObat) {
        this.daftarObat = daftarObat;
    }
    
  
    }

  
    
    


   