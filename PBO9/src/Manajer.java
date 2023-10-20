
public class Manajer extends Pegawai {
    private double tunjJabatan;
    private double gajiLembur;

    public Manajer (){
        
    }
    public Manajer(int npp) {
        super(npp);
    }

    public double getTunjJabatan() {
        return tunjJabatan;
    }
    public void setTunjJabatan(double tunjJabatan) {
        this.tunjJabatan = tunjJabatan;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    
    public double Totalgaji(){
        double totalGaji= super.gaPok + tunjJabatan + gajiLembur;
        return totalGaji;
    }
        
    }
    

