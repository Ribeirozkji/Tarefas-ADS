<?php
include("conexao.php");


$id = $_POST['id'];
$email= $_POST['email'];
$senha = $_POST['senha'];


$sql = "UPDATE candidato SET email='$email', senha='$senha' WHERE id=$id";


if (mysqli_query($conexao, $sql)) {
    header("Location: dashboard.php");
} else {
    echo "Erro ao atualizar: " . mysqli_error($conexao);
}
?>
