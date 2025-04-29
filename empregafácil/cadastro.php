<?php
include("conexao.php");




$email = $_POST['email'];
$senha = $_POST['senha'];




$sql = "INSERT into candidato (email, senha)
        VALUES ('$email', '$senha')";




if (mysqli_query($conexao, $sql)) {
   
    header("Location: painel.php");
    exit;
} else {
    echo "Erro: " . mysqli_error($conexao);
}


mysqli_close($conexao);
?>
