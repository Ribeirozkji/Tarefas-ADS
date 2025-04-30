<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Dashboard Financeiro</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

  <div class="container">
   
    <h1 class="mt-4 mb-4">Dashboard Financeiro</h1>

   
    <h2>Contas a Pagar</h2>
    <table class="table table-bordered">
      <thead>
        <tr>
          <th>ID</th>
          <th>Descrição</th>
          <th>Valor</th>
          <th>Data de Vencimento</th>
          <th>Status</th>
          <th>Editar</th>
          <th>Excluir</th>
        </tr>
      </thead>
      <tbody>
        <?php
        include("conexao.php");  

       
        $sqlContasPagar = "SELECT * FROM financeiro WHERE tipo = 'pagar'";  
        $resultContasPagar = mysqli_query($conexao, $sqlContasPagar);

       
        if (!$resultContasPagar) {
            die("Erro na consulta SQL: " . mysqli_error($conexao));
        }

        
        while($row = mysqli_fetch_assoc($resultContasPagar)) { ?>
          <tr>
            <td><?php echo $row['id']; ?></td>
            <td><?php echo $row['descricao']; ?></td>
            <td>R$ <?php echo number_format($row['valor'], 2, ',', '.'); ?></td>
            <td><?php echo $row['data_vencimento']; ?></td>
            <td><?php echo $row['status_pg']; ?></td>
            <td><a href="editar_conta.php?id=<?php echo $row['id']; ?>" class="btn btn-warning">Editar</a></td>
            <td><a href="excluir_conta.php?id=<?php echo $row['id']; ?>" class="btn btn-danger">Excluir</a></td>
          </tr>
        <?php } ?>
      </tbody>
    </table>

    <h3>Saldo do Mês</h3>
    <?php
    
    $sqlTotalPagar = "SELECT SUM(valor) as total_pagar FROM financeiro WHERE tipo = 'pagar' AND status_pg = 'pago'";
    $resultTotalPagar = mysqli_query($conexao, $sqlTotalPagar);

    
    if (!$resultTotalPagar) {
        die("Erro na consulta SQL: " . mysqli_error($conexao));
    }

    $rowPagar = mysqli_fetch_assoc($resultTotalPagar);
    $totalPagar = $rowPagar['total_pagar'];

    
    if ($totalPagar > 0) {
        echo "<p class='text-danger'>Total de Contas Pagas: R$ " . number_format($totalPagar, 2, ',', '.') . "</p>";
    } else {
        echo "<p class='text-success'>Nenhuma conta paga até o momento.</p>";
    }
    ?>

  </div>

  <script>
    function showSection(sectionId) {
      const sections = document.querySelectorAll('.section');
      sections.forEach(section => {
        section.classList.remove('active');
      });
      document.getElementById(sectionId).classList.add('active');
    }
  </script>

</body>
</html>
