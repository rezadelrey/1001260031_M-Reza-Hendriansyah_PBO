public class Klinik {
    private Pasien0031 pasien1;
    private Pasien0031 pasien2;

    public Klinik(Pasien0031 pasien1, Pasien0031 pasien2) {
        setFirstPatient(pasien1);
        setSecondPatient(pasien2);
    }

    public Pasien0031 getFirstPatient() { return pasien1; }
    public Pasien0031 getSecondPatient() { return pasien2; }

    public void setFirstPatient(Pasien0031 pasien) {
        if (pasien == null) {
            throw new IllegalArgumentException("Pasien pertama wajib diisi.");
        }
        this.pasien1 = pasien;
    }

    public void setSecondPatient(Pasien0031 pasien) {
        if (pasien == null) {
            throw new IllegalArgumentException("Pasien kedua wajib diisi.");
        }
        this.pasien2 = pasien;
    }

    public double calculateTotalFee() {
        return pasien1.getConsultationFee() + pasien2.getConsultationFee();
    }
}