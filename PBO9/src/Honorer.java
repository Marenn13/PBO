
public class Honorer extends Pegawai {
    private double GajiLembur;

    public Honorer (){
        
    }
    public Honorer(int npp) {
        super(npp);
    }

    public double getGajiLembur() {
        return GajiLembur;
    }

    public void setGajiLembur(double GajiLembur) {
        this.GajiLembur = GajiLembur;
    }
    public double TotalGaji (){
        double Total = super.gaPok + GajiLembur;
        return Total;
    }
    
    
    
    
}
