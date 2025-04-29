<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Dashboard</title>
  <link rel="stylesheet" href="style2.css">
 
</head>
<body>


  <div class="container">
    <div class="tabs">
      <button onclick="showSection('candidatos')">Candidatos</button>
      <button onclick="showSection('empresas')">Empresas</button>
    </div>


   
    <div id="candidatos" class="section active">
      <h2>Lista de Candidatos</h2>
      <table>
        <tr>
          <th>ID</th>
          <th>Email</th>
          <th>Senha</th>
          <th>Editar</th>
          <th>Excluir</th>
        </tr>
        <?php
        include("conexao.php");
        $sqlCandidatos = "SELECT * FROM candidato";
        $resultCandidatos = mysqli_query($conexao, $sqlCandidatos);
        while($row = mysqli_fetch_assoc($resultCandidatos)) { ?>
          <tr>
            <td><?php echo $row['id']; ?></td>
            <td><?php echo $row['email']; ?></td>
            <td><?php echo $row['senha']; ?></td>
            <td><a href="editar.php?id=<?php echo $row['id']; ?>">Editar</a></td>
            <td><a href="excluir.php?id=<?php echo $row['id']; ?>">Excluir</a></td>
          </tr>
        <?php } ?>
      </table>
    </div>


   
    <div id="empresas" class="section">
      <h2>Lista de Empresas</h2>
      <table>
        <tr>
          <th>ID</th>
          <th>Email</th>
          <th>Senha</th>
          <th>Editar</th>
          <th>Excluir</th>
        </tr>
        <?php
        $sqlEmpresas = "SELECT * FROM empresa";
        $resultEmpresas = mysqli_query($conexao, $sqlEmpresas);
        while($row = mysqli_fetch_assoc($resultEmpresas)) { ?>
          <tr>
            <td><?php echo $row['id']; ?></td>
            <td><?php echo $row['email']; ?></td>
            <td><?php echo $row['senha']; ?></td>
            <td><a href="editar_empresa.php?id=<?php echo $row['id']; ?>">Editar</a></td>
             <td><a href="excluir_empresa.php?id=<?php echo $row['id']; ?>">Excluir</a></td>
          </tr>
        <?php } ?>
      </table>
    </div>
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
