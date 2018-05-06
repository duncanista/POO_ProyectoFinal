<?php require_once 'config/Conexion.php';
Class Usuario{
  function __construct(){
  }
  function selectAll(){
    $sql = "SELECT * FROM Usuario";
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
    $sql = "SELECT * FROM Usuario WHERE idUsuario = $id";
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
  function insert($nombre, $puesto, $sueldo){
    $sql = "INSERT INTO Usuario(nombre, puesto, sueldo) VALUES('$nombre', '$puesto', '$sueldo')";
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
  function update($id, $nombre, $puesto, $sueldo){
    $sql = "UPDATE Usuario SET nombre='$nombre', puesto='$puesto', sueldo='$sueldo' WHERE idUsuario=$id";
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
    $sql = "DELETE FROM Usuario WHERE idUsuario=$id";
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
