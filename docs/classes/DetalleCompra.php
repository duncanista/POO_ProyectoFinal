<?php require_once 'config/Conexion.php';

Class DetalleCompra{

  function __construct(){
  }
  function selectAll(){
    $sql = "SELECT * FROM Detalle_Compra";
    $response = array();
    if($result = simpleQuery($sql)){
      $response["status"] = 200;
      $response["message"] = "";
      $response["datos"] = array();
      while($row = $result->fetch_assoc()){
          array_push($response["datos"], $row);
      }
      echo json_encode($response);
    }
  }
  function select($id){
    $sql = "SELECT * FROM Detalle_Compra WHERE idDetalle_Compra = $id";
    $response = array();

    if($result = simpleQuery($sql)){
      if($result->num_rows <= 0){
        http_response_code(400);
        $response["status"] = 400;
        $response["message"] = "Error: no entries found!";
        echo json_encode($response);
        exit();
      }
      $response["status"] = 200;
      $response["message"] = "Successful";
      $response["datos"] = $result->fetch_assoc();
      echo json_encode($response);

    }
  else {
    http_response_code(400);
    $response["status"] = 400;
    $response["message"] = "Error: " . showError();
    echo json_encode($response);
  }
}
  function insert($cantidad, $idCompra, $idProducto){
    $sql = "INSERT INTO Detalle_Compra(cantidad, idCompra, idProducto) VALUES('$cantidad', $idCompra, $idProducto)";
    if(simpleQuery($sql)){
      $response["status"] = 201;
      $response["message"] = "Successful, entries added!";
      echo json_encode($response);
    }
    else {
      http_response_code(400);
      $response["status"] = 400;
      $response["message"] = "Error: " . showError();
      echo json_encode($response);
    }
  }
  function update($id, $cantidad, $idCompra, $idProducto){
    $sql = "UPDATE Detalle_Compra SET cantidad='$cantidad', idCompra=$idCompra, idProducto=$idProducto WHERE idDetalle_Compra=$id";
    if(simpleQuery($sql)){
      $response["status"] = 201;
      $response["message"] = "Successful, entries updated!";
      echo json_encode($response);
    }
    else {
      http_response_code(400);
      $response["status"] = 400;
      $response["message"] = "Error: " . showError();
      echo json_encode($response);
    }
  }
  function delete($id){
    $sql = "DELETE FROM Detalle_Compra WHERE idDetalle_Compra=$id";
    if(simpleQuery($sql)){
      $response["status"] = 201;
      $response["message"] = "Successful, entry removed!";
      echo json_encode($response);
    }
    else {
      http_response_code(400);
      $response["status"] = 400;
      $response["message"] = "Error: " . showError();
      echo json_encode($response);
    }
  }
  function error($message){
    http_response_code(400);
    $response["status"] = 400;
    $response["message"] = $message;
    echo json_encode($response);
  }
}
?>
