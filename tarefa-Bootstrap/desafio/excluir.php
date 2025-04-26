<?php
include("conexao.php");


$id = $_GET['id'];

    $sql = "DELETE FROM alunos WHERE id=$id";

    if (mysqli_query($conexao, $sql)) {
        
        header("Location: dashboard.php");
        exit();
    } else {
        echo "Erro ao excluir aluno: " . mysqli_error($conexao);
    }


mysqli_close($conexao);
?>
