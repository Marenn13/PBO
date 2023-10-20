package polymorf;
public class Marketing extends Pegawai {
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
    
    
    
    
    
}
