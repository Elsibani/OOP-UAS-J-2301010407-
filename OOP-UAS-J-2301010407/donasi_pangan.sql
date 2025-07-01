-- Buat database
CREATE DATABASE donasi_pangan;
USE donasi_pangan;

-- Tabel pengguna
CREATE TABLE pengguna (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100),
    email VARCHAR(100)
);

-- Tabel donasi
CREATE TABLE donasi (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pengguna INT,
    jenis ENUM('makanan', 'pakaian'),
    nama_barang VARCHAR(100),
    jumlah INT,
    satuan VARCHAR(50), -- untuk makanan
    kadaluwarsa DATE,   -- untuk makanan
    kondisi VARCHAR(100), -- untuk pakaian
    FOREIGN KEY (id_pengguna) REFERENCES pengguna(id)
);