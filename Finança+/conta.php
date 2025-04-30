<?php
include("conexao.php");


$tipo = $_POST['tipo'];
$descricao = $_POST['descricao'];
$valor = $_POST['valor'];
$data = $_POST['data_vencimento'];
$status = $_POST['status_pg'];


$sql = "INSERT INTO financeiro (tipo, descricao, valor, data_vencimento, status_pg)
        VALUES ('$tipo', '$descricao', '$valor', '$data', '$status')";







if (mysqli_query($conexao, $sql)) {
   
    header("Location: dashboard.php");
    exit;
} else {
    echo "Erro: " . mysqli_error($conexao);
}


mysqli_close($conexao);
?>



?>