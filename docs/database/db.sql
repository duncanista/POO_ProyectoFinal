-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:8889
-- Tiempo de generación: 06-05-2018 a las 03:00:25
-- Versión del servidor: 5.6.35
-- Versión de PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de datos: `poo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Categoria`
--

CREATE TABLE `Categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `descripcion` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Compra`
--

CREATE TABLE `Compra` (
  `idCompra` int(11) NOT NULL,
  `fecha` datetime DEFAULT NULL,
  `total` decimal(20,0) DEFAULT NULL,
  `pago` decimal(20,0) DEFAULT NULL,
  `cambio` decimal(20,0) DEFAULT NULL,
  `idProveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Compra`
--

INSERT INTO `Compra` (`idCompra`, `fecha`, `total`, `pago`, `cambio`, `idProveedor`) VALUES
(1, '2018-05-05 00:00:00', '2000', '2000', '0', 1);

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Detalle_Venta`
--

CREATE TABLE `Detalle_Venta` (
  `idDetalle_Venta` int(11) NOT NULL,
  `cantidad` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Venta_idVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Producto`
--

CREATE TABLE `Producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `descripcion` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `precio` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idCategoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Proveedor`
--

CREATE TABLE `Proveedor` (
  `idProveedor` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `direccion` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Proveedor`
--

INSERT INTO `Proveedor` (`idProveedor`, `nombre`, `direccion`) VALUES
(1, 'Afonso', 'Afonso No Se Cama');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuario`
--

CREATE TABLE `Usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `puesto` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sueldo` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Usuario`
--

INSERT INTO `Usuario` (`idUsuario`, `nombre`, `puesto`, `sueldo`) VALUES
(1, 'Jordan', 'administrador', '10000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Venta`
--

CREATE TABLE `Venta` (
  `idVenta` int(11) NOT NULL,
  `fecha` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `total` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pago` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cambio` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Categoria`
--
ALTER TABLE `Categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `Compra`
--
ALTER TABLE `Compra`
  ADD PRIMARY KEY (`idCompra`,`idProveedor`),
  ADD KEY `fk_Compra_Proveedor1_idx` (`idProveedor`);

--
-- Indices de la tabla `Detalle_Compra`
--
ALTER TABLE `Detalle_Compra`
  ADD PRIMARY KEY (`idDetalle_Compra`,`Compra_idCompra`,`idProducto`,`idCategoria`),
  ADD KEY `fk_Detalle_Compra_Compra1_idx` (`Compra_idCompra`),
  ADD KEY `fk_Detalle_Compra_Producto1_idx` (`idProducto`,`idCategoria`);

--
-- Indices de la tabla `Detalle_Venta`
--
ALTER TABLE `Detalle_Venta`
  ADD PRIMARY KEY (`idDetalle_Venta`,`Venta_idVenta`,`idProducto`,`idCategoria`),
  ADD KEY `fk_Detalle_Venta_Venta1_idx` (`Venta_idVenta`),
  ADD KEY `fk_Detalle_Venta_Producto1_idx` (`idProducto`,`idCategoria`);

--
-- Indices de la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD PRIMARY KEY (`idProducto`,`idCategoria`),
  ADD KEY `fk_Producto_Categoria_idx` (`idCategoria`);

--
-- Indices de la tabla `Proveedor`
--
ALTER TABLE `Proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Indices de la tabla `Venta`
--
ALTER TABLE `Venta`
  ADD PRIMARY KEY (`idVenta`,`idUsuario`),
  ADD KEY `fk_Venta_Usuario1_idx` (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Categoria`
--
ALTER TABLE `Categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Compra`
--
ALTER TABLE `Compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `Detalle_Compra`
--
ALTER TABLE `Detalle_Compra`
  MODIFY `idDetalle_Compra` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Detalle_Venta`
--
ALTER TABLE `Detalle_Venta`
  MODIFY `idDetalle_Venta` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Producto`
--
ALTER TABLE `Producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `Proveedor`
--
ALTER TABLE `Proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `Venta`
--
ALTER TABLE `Venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Compra`
--
ALTER TABLE `Compra`
  ADD CONSTRAINT `fk_Compra_Proveedor1` FOREIGN KEY (`idProveedor`) REFERENCES `Proveedor` (`idProveedor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Detalle_Compra`
--
ALTER TABLE `Detalle_Compra`
  ADD CONSTRAINT `fk_Detalle_Compra_Compra1` FOREIGN KEY (`Compra_idCompra`) REFERENCES `Compra` (`idCompra`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Detalle_Compra_Producto1` FOREIGN KEY (`idProducto`,`idCategoria`) REFERENCES `Producto` (`idProducto`, `idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Detalle_Venta`
--
ALTER TABLE `Detalle_Venta`
  ADD CONSTRAINT `fk_Detalle_Venta_Producto1` FOREIGN KEY (`idProducto`,`idCategoria`) REFERENCES `Producto` (`idProducto`, `idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Detalle_Venta_Venta1` FOREIGN KEY (`Venta_idVenta`) REFERENCES `Venta` (`idVenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD CONSTRAINT `fk_Producto_Categoria` FOREIGN KEY (`idCategoria`) REFERENCES `Categoria` (`idCategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `Venta`
--
ALTER TABLE `Venta`
  ADD CONSTRAINT `fk_Venta_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `Usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;
