-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 26 Mei 2017 pada 06.20
-- Versi Server: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_comics`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_admin`
--

CREATE TABLE `tb_admin` (
  `kode_admin` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_admin`
--

INSERT INTO `tb_admin` (`kode_admin`, `username`, `password`) VALUES
(1, 'Admin', 'Admin'),
(2, 'Rafid', 'Rafid');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_comic`
--

CREATE TABLE `tb_comic` (
  `kode` varchar(50) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `pengarang` varchar(30) NOT NULL,
  `penerbit` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_comic`
--

INSERT INTO `tb_comic` (`kode`, `judul`, `pengarang`, `penerbit`) VALUES
('A455LL', 'kochikame', 'Katshusika', 'weekly Jump'),
('AAA547', 'Death Note', 'Tsugumi Ohba', 'Mangaku'),
('ABCDE1', 'One Piece', 'Monkey', 'Radar Kediri'),
('BAE54R', 'Detective Conan', 'Kogoro Mouri', 'Mangaku'),
('BYZ8HI', 'Golgo 13', 'Takao Saito', 'Forbes'),
('N768IL', 'Naruto', 'Masashi Kishimoto', 'weekly Jump'),
('YIOU81', 'Dragon Ball', 'Dyuku Togo', 'Jawa Post'),
('ZXYZ09', 'Blackjack', 'Osamu Tezuka', 'New York Times');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_transaksi`
--

CREATE TABLE `tb_transaksi` (
  `kd_transaksi` int(50) NOT NULL,
  `peminjam` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `buku` varchar(50) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `tgl_sewa` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`kd_transaksi`, `peminjam`, `alamat`, `tgl_lahir`, `buku`, `pengarang`, `penerbit`, `tgl_sewa`) VALUES
(2, 'Rafi', 'Kediri', '2017-05-03', 'Blackjack', 'Osamu Tezuka', 'New York Times', '2017-05-26'),
(3, 'Aqil', 'Malang', '2017-05-24', 'Golgo 13', 'Takao Saito', 'Forbes', '2017-05-31'),
(4, 'Ramadhan', 'Lumajang', '2017-05-24', 'Dragon Ball', 'Dyuku Togo', 'Jawa Post', '2017-05-31');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`kode_admin`);

--
-- Indexes for table `tb_comic`
--
ALTER TABLE `tb_comic`
  ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  ADD PRIMARY KEY (`kd_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_admin`
--
ALTER TABLE `tb_admin`
  MODIFY `kode_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tb_transaksi`
--
ALTER TABLE `tb_transaksi`
  MODIFY `kd_transaksi` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
