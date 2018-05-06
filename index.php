<?php
require_once 'config/Conexion.php';
require_once 'classes/Categoria.php';
require_once 'classes/Proveedor.php';
require_once 'classes/Usuario.php';
require_once 'classes/Producto.php';
require_once 'classes/Venta.php';
require_once 'classes/Compra.php';
require_once 'classes/DetalleVenta.php';
require_once 'classes/DetalleCompra.php';

header("Content-Type:application/json");

$type = $_SERVER["REQUEST_METHOD"];

if (isset($_GET['PATH_INFO'])){
  $request = explode('/', $_GET['PATH_INFO']);
  $resource = array_shift($request);
  if(isset($request[0])){
    $id = array_shift($request);
  }
}
else {
  http_response_code(400);
  $response["status"] = 400;
  $response["message"] = $message;
  echo json_encode($response);
}

switch ($type) {
  case 'GET':
  switch ($resource) {
    case 'categoria':
      $cat = new Categoria;
      if(!isset($id)){
        $cat->selectAll();
      }
      else {
        $cat->select($id);
      }
      break;
    case 'proveedor':
      $proveedor = new Proveedor;
      if(!isset($id)){
        $proveedor->selectAll();
      }
      else {
        $proveedor->select($id);
      }
      break;
    case 'usuario':
      $usuario = new Usuario;
      if(!isset($id)){
        $usuario->selectAll();
      }
      else {
        $usuario->select($id);
      }
      break;
    case 'producto':
      $producto = new Producto;
      if(!isset($id)){
        $producto->selectAll();
      }
      else {
        $producto->select($id);
      }
      break;
    case 'venta':
      $venta = new Venta;
      if(!isset($id)){
        $venta->selectAll();
      }
      else {
        $venta->select($id);
      }
      break;
    case 'compra':
      $compra = new Compra;
      if(!isset($id)){
        $compra->selectAll();
      }
      else {
        $compra->select($id);
      }
      break;
    case 'detalleCompra':
      $detalleCompra = new DetalleCompra;
      if(!isset($id)){
        $detalleCompra->selectAll();
      }
      else {
        $detalleCompra->select($id);
      }
      break;
    case 'detalleVenta':
      $detalleVenta = new DetalleVenta;
      if(!isset($id)){
        $detalleVenta->selectAll();
      }
      else {
        $detalleVenta->select($id);
      }
      break;
    default:

      break;
  }
    break;
  case 'POST':
    if ($body = file_get_contents('php://input')) {
      if($JSONObject = json_decode($body)){
        switch ($resource) {
          case 'categoria':
            $cat = new Categoria;
            $cat->insert($JSONObject->nombre, $JSONObject->descripcion);
            break;
          case 'proveedor':
            $proveedor = new Proveedor;
            $proveedor->insert($JSONObject->nombre, $JSONObject->direccion);
            break;
          case 'usuario':
            $usuario = new Usuario;
            $usuario->insert($JSONObject->nombre, $JSONObject->puesto, $JSONObject->sueldo);
            break;
          case 'producto':
            echo $JSONObject->idCategoria;
            $producto = new Producto;
            $producto->insert($JSONObject->nombre, $JSONObject->descripcion, $JSONObject->precio, $JSONObject->idCategoria);
            break;
          case 'venta':
            $venta = new Venta;
            $venta->insert($JSONObject->fecha, $JSONObject->total, $JSONObject->pago, $JSONObject->cambio, $JSONObject->idUsuario);
            break;
          case 'compra':
            $compra = new Compra;
            $compra->insert($JSONObject->fecha, $JSONObject->total, $JSONObject->pago, $JSONObject->cambio, $JSONObject->idProveedor);
            break;
          case 'detalleCompra':
            $detalleCompra = new DetalleCompra;
            $detalleCompra->insert($JSONObject->cantidad, $JSONObject->idCompra, $JSONObject->idProducto);
            break;
          case 'detalleVenta':
            $detalleVenta = new DetalleVenta;
            $detalleVenta->insert($JSONObject->cantidad, $JSONObject->idVenta, $JSONObject->idProducto);
            break;

          default:
            # code...
            break;
        }
      }
    }
    else {
      $cat = new Categoria;
      $cat->error("Error: no data to insert!");
    }
    break;
  case 'PUT':
    if ($body = file_get_contents('php://input')) {
      if ($JSONObject = json_decode($body)) {
        if (isset($id)) {
          switch ($resource) {
              case 'categoria':
                $cat = new Categoria;
                $cat->update($id,$JSONObject->nombre, $JSONObject->descripcion);
                break;
              case 'proveedor':
                $proveedor = new Proveedor;
                $proveedor->update($id, $JSONObject->nombre, $JSONObject->direccion);
                break;
              case 'usuario':
                $usuario = new Usuario;
                $usuario->update($id, $JSONObject->nombre, $JSONObject->contrasena, $JSONObject->tipo);
                break;
              case 'producto':
                $producto = new Producto;
                $producto->update($id, $JSONObject->nombre, $JSONObject->descripcion, $JSONObject->precio, $JSONObject->idCategoria);
                break;
              case 'venta':
                $venta = new Venta;
                $venta->update($id, $JSONObject->fecha, $JSONObject->total, $JSONObject->pago, $JSONObject->cambio, $JSONObject->idUsuario);
                break;
              case 'compra':
                $compra = new Compra;
                $compra->update($id, $JSONObject->fecha, $JSONObject->total, $JSONObject->pago, $JSONObject->cambio, $JSONObject->idProveedor);
                break;
              case 'detalleCompra':
                $detalleCompra = new DetalleCompra;
                $detalleCompra->update($id,$JSONObject->cantidad, $JSONObject->idCompra, $JSONObject->idProducto);
                break;
              case 'detalleVenta':
                $detalleVenta = new DetalleVenta;
                $detalleVenta->update($id,$JSONObject->cantidad, $JSONObject->idVenta, $JSONObject->idProducto);
                break;
              default:
                // code...
                break;
          }
        }
        else {
          $cat = new Categoria;
          $cat->error("No id!");
        }
      }
    }
    else {
      $cat = new Categoria;
      $cat->error("Error: no data to update!");
    }
    break;
  case 'DELETE':
    if (isset($id)) {
      switch ($resource) {
        case 'categoria':
          $cat = new Categoria;
          $cat->delete($id);
          break;
        case 'proveedor':
          $proveedor = new Proveedor;
          $proveedor->delete($id);
          break;
        case 'usuario':
          $usuario = new Usuario;
          $usuario->delete($id);
          break;
        case 'producto':
          $producto = new Producto;
          $producto->delete($id);
          break;
        case 'venta':
          $venta = new Venta;
          $venta->delete($id);
          break;
        case 'compra':
          $compra = new Compra;
          $compra->delete($id);
          break;
        case 'detalleCompra':
          $detalleCompra = new DetalleCompra;
          $detalleCompra->delete($id);
          break;
        case 'detalleVenta':
          $detalleVenta = new DetalleVenta;
          $detalleVenta->delete($id);
          break;
        default:
          // code...
          break;
      }
    }
    else {
      $cat = new Proveedor;
      $cat->error("Error: no id!");
    }

    break;
  default:
    # code...
    break;
}

?>
