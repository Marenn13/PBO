
package pbo12;
public class Marketing extends Pegawai implements Email {
     private double bonus;
    
    Marketing (){    
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    String getSatus() {
        return "Marketing";
    }
    @Override
    double getTunjangan() {
        return bonus;
    }
    @Override
    double hitungGatot() {
        return getGapok ()+bonus;  
    }
    @Override
    public String getEmail() {
       return getNpp() + "npp@mareting.usd.ac.id";
    }
    
}
