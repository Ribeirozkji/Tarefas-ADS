<?php
include("conexao.php");


$id = $_POST['id'];
$nome = $_POST['nome'];
$nascimento = $_POST['nascimento'];  
$email = $_POST['email'];
$telefone = $_POST['telefone'];
$serie = $_POST['serie'];


$sql = "UPDATE alunos 
        SET nome='$nome', nascimento='$nascimento', email='$email', telefone='$telefone', serie='$serie' 
        WHERE id=$id";

if (mysqli_query($conexao, $sql)) {
    header("Location: dashboard.php");
    exit(); 
} else {
    echo "Erro ao atualizar: " . mysqli_error($conexao);
}

mysqli_close($conexao);
?>
