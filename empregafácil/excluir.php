<?php
include("conexao.php");


$id = $_GET['id'];


$sqlExcluirEmpresa = "DELETE FROM empresa WHERE id = $id";

if (mysqli_query($conexao, $sqlExcluirEmpresa)) {
 
    header("Location: dashboard.php?tab=candidato");
    exit();
} else {
    echo "Erro ao excluir a empresa!";
}
?>
