

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de datos: `db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Detalle_Compra`
--

CREATE TABLE `Detalle_Compra` (
  `idDetalle_Compra` int(11) NOT NULL,
  `cantidad` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Compra_idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Detalle_Compra`
--
ALTER TABLE `Detalle_Compra`
  ADD PRIMARY KEY (`idDetalle_Compra`,`Compra_idCompra`,`idProducto`,`idCategoria`),
  ADD KEY `fk_Detalle_Compra_Compra1_idx` (`Compra_idCompra`),
  ADD KEY `fk_Detalle_Compra_Producto1_idx` (`idProducto`,`idCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Detalle_Compra`
--
ALTER TABLE `Detalle_Compra`
  MODIFY `idDetalle_Compra` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Detalle_Compra`
--
ALTER TABLE `Detalle_Compra`
  ADD CONSTRAINT `fk_Detalle_Compra_Compra1` FOREIGN KEY (`Compra_idCompra`) REFERENCES `Compra` (`idCompra`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Detalle_Compra_Producto1` FOREIGN KEY (`idProducto`,`idCategoria`) REFERENCES `Producto` (`idProducto`, `idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;
