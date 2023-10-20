package pbo6;

public class Mahasiswa {

    private String Nama;
    private String NIM;
    private String umur;
    private double Us1, Us2, Uas;

    public Mahasiswa() {

    }

    public Mahasiswa(String Nama, String NIM, String umur, double Us1, double Us2, double Uas) {
        this.Nama=Nama;
        this.NIM=NIM;
        this.umur=umur;
        this.Us1=Us1;
        this.Us2=Us2;
        this.Uas=Uas;

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public double getUs1() {
        return Us1;
    }

    public void setUs1(double Us1) {
        this.Us1 = Us1;
    }

    public double getUs2() {
        return Us2;
    }

    public void setUs2(double Us2) {
        this.Us2 = Us2;
    }

    public double getUas() {
        return Uas;
    }

    public void setUas(double Uas) {
        this.Uas = Uas;
    }

    public double HitFinal() {
        // hitung nilai akhir dengan bobot 30% Us1, 30% Us2, dan 40% Uas
        double nilaiAkhir = 0.3 * Us1 + 0.3 * Us2 + 0.4 * Uas;
        return nilaiAkhir;
    }

    public String Convert() {
        // koversi nilai huruf berdasarkan nilai akhir
        if (HitFinal() >= 80) {
            return "A";
        } else if (HitFinal() >= 70) {
            return "B";

        } else if (HitFinal() >= 60) {
            return "C";

        } else if (HitFinal() >= 50) {
            return "D";
        } else {
            return "E";
        }

    }

}
