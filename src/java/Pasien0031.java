public class Pasien0031 {
    private String nama;
    private int umur;
    private String nomorRekamMedis;
    private double biayaKonsultasi;

    public Pasien0031(String nama, int umur,
                      String nomorRekamMedis, double biayaKonsultasi) {
        setName(nama);
        setAge(umur);
        setMedicalRecordNumber(nomorRekamMedis);
        setConsultationFee(biayaKonsultasi);
    }

    public String getName() { return nama; }
    public int getAge() { return umur; }
    public String getMedicalRecordNumber() { return nomorRekamMedis; }
    public double getConsultationFee() { return biayaKonsultasi; }

    public void setName(String nama) {
        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong.");
        }
        this.nama = nama;
    }

    public void setAge(int umur) {
        if (umur < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif.");
        }
        this.umur = umur;
    }

    public void setMedicalRecordNumber(String nomorRekamMedis) {
        if (nomorRekamMedis == null || nomorRekamMedis.isBlank()) {
            throw new IllegalArgumentException("Nomor rekam medis wajib diisi.");
        }
        this.nomorRekamMedis = nomorRekamMedis;
    }

    public void setConsultationFee(double biayaKonsultasi) {
        if (!Double.isFinite(biayaKonsultasi) || biayaKonsultasi < 0) {
            throw new IllegalArgumentException("Biaya harus angka valid >= 0.");
        }
        this.biayaKonsultasi = biayaKonsultasi;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Nomor rekam medis: " + nomorRekamMedis);
        System.out.println("Biaya konsultasi: Rp" + biayaKonsultasi + "\n");
    }
}