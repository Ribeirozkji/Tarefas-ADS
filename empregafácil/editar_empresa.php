<?php
include("conexao.php");


$id = $_GET['id'];
$sql = "SELECT * FROM empresa
 WHERE id = $id";
$result = mysqli_query($conexao, $sql);
$dados = mysqli_fetch_assoc($result);
?>


<h2>Editar Empresas</h2>
<form action="atualizar.php" method="POST">


  <input type="hidden" name="id" value="<?php echo $dados['id']; ?>">
  E-mail: <input type="text" name="email" value="<?php echo $dados['email']; ?>"><br>
  Senha: <input type="text" name="senha" value="<?php echo $dados['senha']; ?>"><br>
  <button type="submit">Atualizar</button>
</form>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: #f7f9fc;
    color: #333;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
    padding: 0;
  }


  h2 {
    text-align: center;
    font-size: 2em;
    margin-bottom: 20px;
    color: #4a4a4a;
  }


  form {
    background-color: #fff;
    padding: 20px 30px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    max-width: 400px;
    width: 100%;
  }


  input[type="text"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ddd;
    border-radius: 4px;
  }


  button {
    background-color: #4caf50;
    color: #fff;
    border: none;
    padding: 10px 20px;
    border-radius: 4px;
    cursor: pointer;
    font-size: 1em;
  }


  button:hover {
    background-color: #45a049;
  }


  input[type="hidden"] {
    display: none;
  }
</style>


