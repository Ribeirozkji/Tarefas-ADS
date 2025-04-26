<?php

include("conexao.php");

$nome = $_POST['nome'];
$nascimento = $_POST['nascimento'];  
$email = $_POST['email'];
$telefone = $_POST['telefone'];
$serie = $_POST['serie'];

$sql = "INSERT into alunos (nome, nascimento, email, telefone, serie)
values ('$nome', '$nascimento', '$email', '$telefone', '$serie')";  


if(mysqli_query($conexao, $sql)){

    header("location: painel.php");
    exit;
} else {
    echo "Erro: " . mysqli_error($conexao);
}

mysqli_close($conexao);


?>


