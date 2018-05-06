<?php require_once 'config/Conexion.php';

Class Categoria{

  function __construct(){
  }
  function selectAll(){
    $sql = "SELECT * FROM Categoria";
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
    $sql = "SELECT * FROM Categoria WHERE idCategoria = $id";
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
  function insert($nombre, $desc){
    $sql = "INSERT INTO Categoria(nombre, descripcion) VALUES('$nombre', '$desc')";
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
  function update($id, $nombre, $desc){
    $sql = "UPDATE Categoria SET nombre='$nombre', descripcion='$desc' WHERE idCategoria=$id";
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
    $sql = "DELETE FROM Categoria WHERE idCategoria=$id";
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
