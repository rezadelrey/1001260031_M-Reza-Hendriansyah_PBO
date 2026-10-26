# Tugas Praktik 1 - Perancangan Kelas dan Objek

Nama: Muhammad Reza Hendriansyah
NIM: 1001260031
Mata kuliah: IF104 Pemrograman Berorientasi Objek
Dosen: Irwan Siswanto, S.Kom., M.Kom.

## Bahasa yang dipilih

Java JDK 17+ dipilih sesuai klarifikasi dosen bahwa tugas menggunakan
salah satu bahasa. Klarifikasi disampaikan pada 26 Oktober 2026.

## Penentuan kasus

- Digit terakhir NIM = 1, sehingga domain adalah Klinik.
- Digit ke-4 dan ke-5 dari kiri = 1 dan 2, dibaca 12.
- Biaya konsultasi awal = 12 x 1.000 = Rp12.000.
- Empat digit terakhir = 0031, sehingga model bernama Pasien0031.
- Dua object pasien memiliki nama, umur, dan nomor rekam medis berbeda.
  Keduanya memakai biaya awal 12000.

## Rancangan

| File | Tanggung jawab |
| --- | --- |
| src/java/Pasien0031.java | Model pasien; 4 attribute private, constructor, getter/setter tervalidasi, displayInfo. |
| src/java/Klinik.java | Mengelola referensi dua pasien; constructor, getter/setter tervalidasi, calculateTotalFee. |
| src/java/Main.java | Titik masuk Java; membuat object dan mendemonstrasikan program. |

Attribute pasien: nama, umur, nomorRekamMedis, biayaKonsultasi.
Attribute Klinik: pasien1 dan pasien2.
Semua attribute private; setiap attribute memiliki getter dan setter.
Constructor setiap class domain menggunakan setter agar data awal divalidasi.

Klinik dirancang untuk dua pasien dalam skenario tugas ini.
Klinik menyimpan referensi ke dua object pasien yang dibuat oleh Main.
Ketiga file Java membentuk satu program dan dikompilasi bersama.

## Kebutuhan

- Java JDK 17 atau lebih baru (laptop latihan menggunakan JDK 21).
- PowerShell pada Windows; VS Code dapat digunakan sebagai editor.

Perintah di bawah dijalankan satu per satu. Mulai dari folder utama proyek
Tugas1_PBO_1001260031 yang memuat src dan README.md.
Pastikan kompilasi berhasil sebelum menjalankan program.

## Persiapan folder hasil

```powershell
New-Item -ItemType Directory -Force -Path build\java
New-Item -ItemType Directory -Force -Path output
```

## Kompilasi dan eksekusi Java

```powershell
cd .\src\java
javac --release 17 -d ../../build/java Pasien0031.java Klinik.java Main.java
java -cp ../../build/java Main
```

Simpan log hasil eksekusi dari laptop sendiri, lalu kembali ke folder utama:

```powershell
java -cp ../../build/java Main | Tee-Object -FilePath ..\..\output\output_java.txt
cd ..\..
```

## Perilaku yang diharapkan

- Pasien 1: Reza, 22 tahun, RM001, biaya 12000.
- Pasien 2: Ghaizka, 23 tahun, RM002, biaya 12000.
- Total biaya konsultasi: Rp24000.0.
- setAge(24) mengubah umur pasien kedua menjadi 24.
- setAge(-5) melempar exception yang ditangkap di main.
- Pesan: Ditolak: Umur tidak boleh negatif.
- Umur pasien kedua tetap 24; pasien pertama tetap 22.

Nama/nomor rekam medis kosong, umur negatif, biaya negatif/non-finite,
serta referensi pasien kosong di Klinik ditolak.
Pengujian data salah memakai try/catch sehingga program tetap selesai.

## Catatan pengujian paket contoh

Source Java tidak berubah dari versi yang telah diuji memakai compiler Java
17.0.20 pada Linux. Pemeriksaan pengembangan mencakup 22 kasus: total, setter,
constructor, penolakan input, dan keterpisahan data object.

Perintah operasional README ditulis untuk PowerShell Windows. Jalankan ulang
di laptop yang digunakan untuk rekaman. Folder Contoh_Output pada paket luar
berisi referensi hasil uji, bukan bukti eksekusi dari laptop mahasiswa.

## Pengumpulan

Sertakan source, README, dan output dari laptop sendiri dalam ZIP. Siapkan
tautan GitHub dan video sesuai kolom LMS. Video 5-8 menit, satu take, layar,
webcam, dan suara bersamaan, serta dua pertanyaan wajib. Panduan belajar dan
lembar pengingat tidak harus ikut dikumpulkan.
