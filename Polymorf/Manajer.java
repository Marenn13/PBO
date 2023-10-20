package polymorf;
public class Manajer extends Pegawai {
    private double tunjanganjabatan,lembur;
    
    Manajer (){  
    }
    public double getTunjanganjabatan() {
        return tunjanganjabatan;
    }

    public void setTunjanganjabatan(double tunjanganjabatan) {
        this.tunjanganjabatan = tunjanganjabatan;
    }
    public double getLembur() {
        return lembur;
    }
    public void setLembur(double lembur) {
        this.lembur = lembur;
    }
    @Override
    String getSatus() {
        return "Manajer";  
    }
    @Override
    double getTunjangan() {
        return tunjanganjabatan + lembur;   
    }
    @Override
    double hitungGatot() {
        return getGapok() + tunjanganjabatan +lembur;
        
      
    }
        
  
    }
    
    
    
    
    
   
    
    
    
    

