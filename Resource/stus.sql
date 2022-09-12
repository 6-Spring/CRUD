-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- 主机： localhost
-- 生成日期： 2022-09-12 21:59:48
-- 服务器版本： 8.0.24
-- PHP 版本： 8.0.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 数据库： `test`
--

-- --------------------------------------------------------

--
-- 表的结构 `stus`
--

CREATE TABLE `stus` (
  `id` int NOT NULL,
  `name` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` char(1) COLLATE utf8mb4_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- 转存表中的数据 `stus`
--

INSERT INTO `stus` (`id`, `name`, `age`, `sex`) VALUES
(1, '小郑', 22, '男'),
(2, '郑天赐', 21, '女'),
(3, '测试2', 21, '女'),
(4, '测试3', 20, '女'),
(5, '测试4', 14, '女'),
(6, '测试5', 17, '女'),
(7, '郑元龙', 22, '男'),
(8, '郑钱', 18, '男'),
(9, '小王八', 22, '女'),
(16, '你妹', 111, '女'),
(17, '已完成', 18, '男');

--
-- 转储表的索引
--

--
-- 表的索引 `stus`
--
ALTER TABLE `stus`
  ADD PRIMARY KEY (`id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `stus`
--
ALTER TABLE `stus`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
