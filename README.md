# 🎓 Mini Project OOP - Program Data Mahasiswa

Program Java berbasis konsol untuk menginput dan menampilkan data 3 mahasiswa, sekaligus menentukan status kelulusan berdasarkan nilai. Dibuat untuk mempraktikkan konsep dasar Pemrograman Berorientasi Objek (OOP) di Java. ✨

## 📋 Identitas

| | Keterangan | Isi |
|---|---|---|
| 👩‍💻 | **Nama** | Siti Salwa Shafina |
| 🪪 | **NPM** | 250810701100055 |
| 📚 | **Mata Kuliah** | Pemrograman Berorientasi Objek (PBO) |
| 👨‍🏫 | **Dosen Pengampu** | Maulyanda, S.Tr.Kom., M.Kom. |
| 🎓 | **Program Studi** | S1 Informatika, Fakultas MIPA |
| 🏛️ | **Universitas** | Universitas Syiah Kuala |

## 🌟 Fitur

- 📝 Input data 3 mahasiswa: nama, NIM, dan nilai
- 🛡️ Validasi nilai agar berada pada rentang 0-100 (input diulang jika di luar rentang)
- 📄 Menampilkan data setiap mahasiswa
- ✅ Cek status kelulusan: nilai 60 ke atas Lulus, di bawah 60 Tidak Lulus

## 📁 Struktur Proyek

```
Mini-Project-OOP/
├── Mahasiswa.java
├── ProgramDataMahasiswa.java
└── .gitignore
```

| File | Isi |
|---|---|
| 🧱 `Mahasiswa.java` | Class `Mahasiswa` dengan atribut `nama` (String), `NIM` (Long), dan `nilai` (double). Punya method `tampilkanData()` untuk mencetak data dan `cekKelulusan()` untuk menentukan status Lulus atau Tidak Lulus. |
| 🚀 `ProgramDataMahasiswa.java` | Class utama berisi method `main()`. Membuat array 3 objek `Mahasiswa`, membaca input dari pengguna dengan `Scanner`, memvalidasi nilai, lalu menampilkan semua data beserta status kelulusan. |
| 🙈 `.gitignore` | Daftar file yang tidak ikut diunggah ke repository (misalnya hasil kompilasi `.class`). |

## 💡 Konsep Java yang Digunakan

- 🏗️ **Class dan Object**: `Mahasiswa` sebagai cetak biru, lalu dibuat menjadi 3 objek dengan `new Mahasiswa()`
- 🏷️ **Atribut**: `nama`, `NIM`, dan `nilai` sebagai data milik setiap objek
- ⚙️ **Method**: `tampilkanData()` dan `cekKelulusan()` sebagai perilaku objek
- 📦 **Array of Object**: `Mahasiswa[] mahasiswa = new Mahasiswa[3]` untuk menyimpan beberapa objek sekaligus
- ⌨️ **Scanner**: membaca input dari keyboard
- 🔁 **Perulangan**: `for` untuk mengulang input dan output, `while` untuk validasi nilai
- 🔀 **Percabangan**: `if-else` untuk menentukan Lulus atau Tidak Lulus
- 🔢 **Tipe Data**: `String`, `Long`, dan `double`
- 🔄 **Konversi Tipe**: `Long.parseLong()` dan `Double.parseDouble()` untuk mengubah input teks menjadi angka

## ▶️ Cara Menjalankan

1. Clone repository:

```
git clone https://github.com/ssalwashafina/Mini-Project-OOP.git
cd Mini-Project-OOP
```

2. Kompilasi:

```
javac Mahasiswa.java ProgramDataMahasiswa.java
```

3. Jalankan:

```
java ProgramDataMahasiswa
```

Prasyarat: JDK 8 atau lebih baru ☕

## 🖥️ Contoh Input dan Output

```
Data Mahasiswa ke-1
Masukkan Nama Mahasiswa: Salwa
Masukkan NIM Mahasiswa: 250810701100001
Masukkan Nilai Mahasiswa (0-100): 85

Data Mahasiswa ke-2
Masukkan Nama Mahasiswa: Shafina
Masukkan NIM Mahasiswa: 250810701100002
Masukkan Nilai Mahasiswa (0-100): 150
Nilai harus rentang 0-100!
Masukkan Nilai Mahasiswa (0-100): 55

Data Mahasiswa ke-3
Masukkan Nama Mahasiswa: Salwa Shafina
Masukkan NIM Mahasiswa: 250810701100003
Masukkan Nilai Mahasiswa (0-100): 60

DATA MAHASISWA

Mahasiswa ke-1
Nama: Salwa
NIM: 250810701100001
Nilai: 85.0
Status Kelulusan: Lulus

Mahasiswa ke-2
Nama: Shafina
NIM: 250810701100002
Nilai: 55.0
Status Kelulusan: Tidak Lulus

Mahasiswa ke-3
Nama: Salwa Shafina
NIM: 250810701100003
Nilai: 60.0
Status Kelulusan: Lulus
```

## 📝 Catatan

- ⚠️ NIM dan nilai harus berupa angka. Input non-angka akan membuat program berhenti dengan error.
- 🔢 Jumlah mahasiswa ditetapkan 3 di dalam kode.

## 👩‍💻 Pengembang

Siti Salwa Shafina - [@ssalwashafina](https://github.com/ssalwashafina)
