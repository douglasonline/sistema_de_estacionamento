-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 27-Jun-2022 às 10:29
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `tabelas_do_sistema_de_estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_movimentacao`
--

CREATE TABLE `tbl_movimentacao` (
  `id` int(11) NOT NULL,
  `placa` varchar(200) NOT NULL,
  `modelo` varchar(200) NOT NULL,
  `data_entrada` varchar(200) NOT NULL,
  `data_saida` varchar(200) NOT NULL,
  `tempo` varchar(200) NOT NULL,
  `valor_pago` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_movimentacao`
--

INSERT INTO `tbl_movimentacao` (`id`, `placa`, `modelo`, `data_entrada`, `data_saida`, `tempo`, `valor_pago`) VALUES
(15, 'ff4g7d7', 'Volkswagen', '1656291541679', '0000000000001', '21', 6.00),
(16, 'vbb', 'Sedan', '1656295943883', '1656310873798', '0 dias 4 horas 8 minutos 49 segundos', 18.00),
(17, 'c7b4df4', 'SUV', '1656316548093', '1656316559468', '1 hora', 6.00),
(18, 'fd54df', 'Crossover', '1656317430540', '0000000000001', '1 hora', 6.00),
(19, 'skv7d4', 'Minivan', '1656317467214', '0000000000001', '1 hora', 6.00),
(20, 'hc7f5d', 'Picape', '1656317494976', '0000000000001', '1 hora', 6.00),
(21, 'db3d6d7', 'Wagon', '1656317543920', '0000000000001', '1 hora', 6.00);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `usuario` varchar(200) NOT NULL,
  `senha` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`id`, `nome`, `usuario`, `senha`) VALUES
(1, 'admin', 'admin', '123456');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbl_valor`
--

CREATE TABLE `tbl_valor` (
  `id` int(11) NOT NULL,
  `valor_primeira_hora` double(10,2) NOT NULL,
  `valor_demais_horas` double(10,2) NOT NULL,
  `data_fim` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbl_valor`
--

INSERT INTO `tbl_valor` (`id`, `valor_primeira_hora`, `valor_demais_horas`, `data_fim`) VALUES
(1, 6.00, 4.00, '0000-00-00');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbl_movimentacao`
--
ALTER TABLE `tbl_movimentacao`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tbl_valor`
--
ALTER TABLE `tbl_valor`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbl_movimentacao`
--
ALTER TABLE `tbl_movimentacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de tabela `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tbl_valor`
--
ALTER TABLE `tbl_valor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
