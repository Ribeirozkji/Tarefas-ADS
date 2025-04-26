<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Dashboard</title>
</head>
<body>
<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }


  body {
    font-family: Arial, sans-serif;
    background-color: #f4f7fc;
    color: #333;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    padding: 20px;
  }


  .container {
    background-color: #fff;
    padding: 30px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    width: 100%;
    max-width: 900px;
  }


  .tabs {
    display: flex;
    justify-content: space-between;
    margin-bottom: 20px;
  }


  .tabs button {
    padding: 10px 20px;
    background-color: #4caf50;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 1em;
  }


  .tabs button:hover {
    background-color: #45a049;
  }


  .section {
    display: none;
  }


  .section.active {
    display: block;
  }


  table {
    width: 100%;
    border-collapse: collapse;
    margin-top: 20px;
  }


  table, th, td {
    border: 1px solid #ddd;
  }


  th, td {
    padding: 10px;
    text-align: center;
  }


  th {
    background-color: #f8f8f8;
    color: #333;
  }


  tr:nth-child(even) {
    background-color: #f9f9f9;
  }


  tr:hover {
    background-color: #e9f1ff;
  }




    </style>
   
    <div id="formulario" class="section active">
      <h2>Lista de Alunos</h2>
      <table>
        <tr>
        <th>id</th>
          <th>Nome</th>
          <th>Data de nascimento</th>
          <th>Email</th>
          <th>Telefone</th>
          <th>Série</th>
        </tr>
        <?php

        include("conexao.php");
        
        $sqlalunos = "SELECT * FROM alunos";
        $resultalunos = mysqli_query($conexao, $sqlalunos);
        while($row = mysqli_fetch_assoc($resultalunos)) { ?>
          <tr>
            <td><?php echo $row['id']; ?></td>
            <td><?php echo $row['nome']; ?></td>
            <td><?php echo $row['nascimento']; ?></td>
            <td><?php echo $row['email']; ?></td>
            <td><?php echo $row['telefone']; ?></td>
            <td><?php echo $row['serie']; ?></td>
            <td><a href="editar.php?id=<?php echo $row['id']; ?>">Editar</a></td>
            <td><a href="excluir.php?id=<?php echo $row['id']; ?>">Excluir</a></td>
          </tr>
        <?php } ?>
      </table>
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
