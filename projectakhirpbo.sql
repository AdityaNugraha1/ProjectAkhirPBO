-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 17 Bulan Mei 2023 pada 18.17
-- Versi server: 10.4.25-MariaDB
-- Versi PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectakhirpbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `telepon` int(20) NOT NULL,
  `paket` varchar(30) NOT NULL,
  `berat` int(20) NOT NULL,
  `total` int(20) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`nama`, `alamat`, `telepon`, `paket`, `berat`, `total`, `status`) VALUES
('Ihsan', 'kembang', 893456, 'Cuci+Setrika Full Express', 4, 0, ''),
('Ihsan', 'kembang', 893456, 'Cuci+Setrika Full Express', 4, 0, ''),
('yee', 'korea', 91234, 'Cuci+Setrika Full Express', 7, 0, ''),
('jsu', 'jahen', 8975, 'Cuci+Setrika Reguler', 6, 0, ''),
('kaidi', 'kiyu', 987654, 'Cuci+Setrika Reguler', 6, 45000, ''),
('ihsan', 'kiti', 99876, 'Cuci+Setrika Reguler', 6, 45000, ''),
('ihsan', 'kembang', 98765432, 'Cuci+Setrika Express', 4, 56000, ''),
('Aditya', 'KulonProgo', 987654, 'Cuci+Setrika Full Express', 8, 160000, 'Sedang_Proses_Pengerjaan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `roles` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `nama`, `username`, `password`, `roles`) VALUES
(1, 'Adit', 'Adit', 'Adit', 'admin'),
(3, '1', '1', '1', 'Pelanggan');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
