package pegawai;

public class Pegawai {

    int jabatan;
    String nama, alamat, noPokok;
    double gaji, bonus;

    public double extra() {
        if (jabatan == 1) {
            bonus = 0.7 * gaji;
            return bonus;
        } else if (jabatan == 2) {
            bonus = 0.5 * gaji;

            return bonus;
        } else {
            bonus = 0.25 * gaji;
            return bonus;
        }
    }

    public double totalGaji() {
        double gT = gaji + extra();
        return gT;
    }

}
