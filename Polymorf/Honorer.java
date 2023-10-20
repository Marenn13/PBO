package polymorf;
public class Honorer extends Pegawai {
    private double lemburan ;
    
    Honorer (){
        
    }
    public double getLemburan() {
        return lemburan;
    }
    public void setLemburan(double lemburan) {
        this.lemburan = lemburan;
    }
    @Override
    String getSatus() {
        return "Honorer"; 
    }
    @Override
    double getTunjangan() {
        return lemburan; 
    }
    @Override
    double hitungGatot() {
        return getGapok()+lemburan;
       
    }
      
}
