<?php require_once 'config/Conexion.php';

Class Compra{

  function __construct(){
  }
  function selectAll(){
    $sql = "SELECT * FROM Compra";
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
    $sql = "SELECT * FROM Compra WHERE idCompra = $id";
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
  function insert($fecha, $total, $pago, $cambio, $idProveedor){
    $sql = "INSERT INTO Compra(fecha, total, pago, cambio, idProveedor) VALUES('$fecha', '$total', '$pago', '$cambio', idProveedor)";
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
  function update($id, $fecha, $total, $pago, $cambio, $idProveedor){
    $sql = "UPDATE Compra SET fecha='$fecha', total='$total', pago='$pago', cambio='$cambio', idProveedor=$idProveedor WHERE idCompra=$id";
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
    $sql = "DELETE FROM Compra WHERE idCompra=$id";
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
