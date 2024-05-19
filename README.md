# Web Automation Testing Menggunakan Cucumber dan Selenium
## Deskripsi
Program ini bertujuan untuk mengotomatisasi pengujian fitur login dan logout pada website Swag Labs (https://www.saucedemo.com/) menggunakan Cucumber dan Selenium. Dengan menggunakan pendekatan Behaviour Driven Development (BDD).

## Tentang Project Web Automation Testing

### Fitur
- **Login:** Pengguna dapat mengakses akun mereka dengan memasukkan kredensial yang valid (username dan password). 
- **Logout:** Pengguna dapat melakukan logout dari akun mereka dan kembali ke halaman login.

### Build With
Web automation testing pada project ini menggunakan:
- Cucumber
- Selenium
- WebDriverManager
- JUnit
- Cucumber Reporting
- Maven

## Test Cases
1. Login Menggunakan Username yang Terdaftar pada Sistem
2. Login dengan Keadaan Username dan Password Tidak Diisi
3. Login dengan Keadaan Username Tidak Diisi
4. Login dengan Keadaan Password Tidak Diisi
5. Login dengan Keadaan Username Tidak Terdaftar pada Sistem
6. Login dengan Keadaan Username Terdaftar Pada Sistem namun Password Tidak Sesuai
7. Logout dengan Menekan Tombol "Logout"

## Directory Tree Project

### Penjelasan Directory Root Project
1. **src:** Ini adalah direktori sumber (source) utama yang berisi kode sumber aplikasi.
2. **main/java/com/testswaglabs/pages:** Ini adalah direktori untuk menyimpan kode yang menerapkan pola Page Object Model serta Page Factory yang berisi elemen-elemen halaman yang digunakan pada kode pengujian
3. **main/java/com/testswaglabs/utils:** Ini adalah direktori untuk menyimpan kode untuk mengelola web driver
4. **test/java/com/testswaglabs/stepdefinition:** Ini adalah direktori untuk menyimpan kode pengujian yang berisi untuk mengotomatiskan skenario pengujian
5. **test/java/com/testswaglabs/TestRunner:** Ini adalah direktori untuk menyimpan kode yang digunakan untuk menjalankan skenario pengujian
6. **test/resources:** Ini adalah direktori untuk menyimpan list feature (cucumber)
7. **target:** Ini adalah direktori yang berisi hasil dari proses kompilasi dan pembuatan (build) lainnya.
12. **classes/com/testswaglabs:** Direktori tempat hasil kompilasi dari kode sumber utama ditempatkan.
13. **generated-sources:** Direktori untuk sumber yang dihasilkan, mungkin oleh proses generasi kode.
14. **generated-test-sources:** Direktori untuk sumber pengujian yang dihasilkan.
15. **maven-status/maven-compiler-plugin:** Direktori yang berisi informasi status proyek yang dihasilkan oleh Maven.
17. **surefire-reports:** Direktori yang berisi laporan hasil pengujian yang dihasilkan oleh Surefire plugin.
18. **pom.xml:** Ini adalah berkas POM (Project Object Model) Maven yang berisi konfigurasi proyek, dependensi, dan informasi lainnya yang diperlukan oleh Maven untuk membangun proyek.
19. **cucumber-report-html:** Ini adalah hasil generate report test yang sudah dijalankan

## Prerequisites

- **Java Development Kit (JDK)** versi 8
- **Apache Maven** versi 3.6.0+
- **IDE Visual Studio Code** dengan ekstensi Java atau Maven terbaru
- **Browser** 

## Menjalankan Aplikasi

Clone project ini

```bash
  git clone https://github.com/suciawalia/Web-Automation-Testing.git
```

## Menjalankan Tests

Jalankan command ini untuk menjalankan semua test

```bash
  mvn test
```
Jalankan command ini untuk menjalankan salah satu test

```bash
  mvn test -Dcucumber.filter.name="nama-scenario"
```
```bash
  mvn test -Dcucumber.filter.tags="nama-tags"
```
## Generate Report by tools

Cara menjalankan generate report

```bash
  mvn verify
```
```bash
  mvn verify -DskipTests
```

## Hasil Tests
### Root file test report
```
..\cucumber-report-html
```
### Hasil Test Report
**1. Overview berdasarkan features**
Terdapat 2 features yaitu User Login dan User Logout

![image](https://github.com/suciawalia/Web-Automation-Testing/assets/99374578/9b968c2a-a9d1-4b39-8f3a-275c5193724f)

- Terdapat grafik yang menunjukkan statistik status scenario
- Jumlah feature yang dieksekusi adalah 2 yaitu User Login dan User Logout
- Scenario pada feature user login yang dieksekusi menghasilkan pass (passed) berjumlah 1 dan fail (failed) berjumlah 5 dengan total 6 scenario, skipped (terlewati) 0, pending (tertunda) 0, undefined (tidak terdefinisi) 0
- Scenario pada feature user logout yang dieksekusi menghasilkan pass (passed) berjumlah 1 dengan total 1 scenario
- Steps pada feature user login yang dieksekusi menghasilkan status pass (passed) berjumlah 28, status fail (failed) berjumlah 5, dan status skipped (terlewati) 0, pending (tertunda) 0, undefined (tidak terdefinisi) 0
- Total steps pada feature login berjumlah 33
- Steps pada feature user logout yang dieksekusi menghasilkan status pass (passed) berjumlah 4
- Total steps pada feature logout berjumlah 4
- Waktu untuk eksekusi feature user login (Duration) adalah 22s 852ms	
- Waktu untuk eksekusi feature user logout (Duration) adalah 4s 041ms
- Total duration untuk fetaure login dan logout adalah 26s 893ms

**2. Overview berdasarkan tags**
Tags ini mewakili setiap scenario atau test case pada suatu features 

![image](https://github.com/suciawalia/Web-Automation-Testing/assets/99374578/fdf47287-a783-4558-b185-646c73125f12)

- Terdapat 7 tags yang artinya terdapat 7 scenario dengan hasil pengujian atau status scenario yang bisa dilihat pada gambar di atas
  
**3. Test Result Fitur Login**

![image](https://github.com/suciawalia/Web-Automation-Testing/assets/99374578/5785e7ed-328b-4ee9-8280-cc4f048d785a)

-  Scenario dengan tags '@TC0.0.1' menghasilkan status scenario pass (passed) untuk setiap step yang ditandai dengan warna hijau
-  Scenario dengan tags '@TC0.0.2' menghasilkan status scenario fail (fail) karena terdapat step yang gagal pada step "Then" yang ditandai dengan warna merah. Dapat dilihat detail error messagenya
-  Terdapat waktu eksekusi untuk setiap step
-  Begitu pun yang lainnya dibaca seperti yang sudah saya jelaskan
  
**4. Test Result Fitur Logout**

![image](https://github.com/suciawalia/Web-Automation-Testing/assets/99374578/59d04d79-3c66-4354-bd0e-4b98711c4e9f)

- Terdapat hooks yang berisi kondisi sebelum pengujian atau eksekusi (before) dan setelah pengujian atau eksekusi (after)
- Scenario dengan tags 'TC0.1.1' menghasilkan status scenario pass (passed) untuk setiap step ynag ditandai dengan warna hijau
- Terdapat waktu eksekusi untuk setiap step

## Kelompok 7
- 211524001 | Adinda Faayza Malika [@adindafaayza](https://github.com/adindafaayza)
- 211524003 | Annisa Dinda Gantini [@annisaadg](https://github.com/annisaadg)
- 211524027 | Suci Awalia Gardara [@suciawalia](https://github.com/suciawalia)
