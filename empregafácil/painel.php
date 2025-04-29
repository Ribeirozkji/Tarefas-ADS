<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>Bem-vindo(a)!</title>
  <link rel="stylesheet" href="style1.css">
</head>
<body>


  <div class="container">
    <h1>Bem-vindo(a)!</h1>
    <p id="user">Vamos trabalhar, pois ninguém nasceu rico! 💼</p>
    <button class="btn-dashboard" onclick="Dashboard()">Ir para o Dashboard</button>
  </div>


  <script>
    function Dashboard() {
      window.location.href = "dashboard.php";
    }
  </script>


</body>
</html>


