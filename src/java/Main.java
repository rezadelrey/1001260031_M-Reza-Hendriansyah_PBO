public class Main {
    public static void main(String[] args) {
        Pasien0031 pasien1 =
            new Pasien0031("Reza", 22, "RM001", 12000);
        Pasien0031 pasien2 =
            new Pasien0031("Ghaizka", 23, "RM002", 12000);
        Klinik klinik = new Klinik(pasien1, pasien2);

        System.out.println("KASUS KLINIK - NIM 1001260031\n");
        klinik.getFirstPatient().displayInfo();
        klinik.getSecondPatient().displayInfo();
        System.out.println("Total biaya konsultasi: Rp"
                           + klinik.calculateTotalFee());

        System.out.println("\nUji validasi umur:");
        try {
            pasien2.setAge(24);
            pasien2.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Ditolak: " + e.getMessage());
        }
        System.out.println("Umur pasien kedua setelah uji: " + pasien2.getAge());
        System.out.println("Umur pasien pertama: " + pasien1.getAge());
    }
}