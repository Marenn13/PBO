 
public class Marketing extends Pegawai{
    private double bonus;

    public Marketing (){
        
    }
    public Marketing(int npp) {
        super(npp);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double TotalGaji (){
        double total= super.gaPok + bonus;
        return total;
    }
    
    
}
