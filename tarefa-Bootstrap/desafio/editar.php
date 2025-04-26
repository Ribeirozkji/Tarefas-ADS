<?php
include("conexao.php");

$id = $_GET['id'];
$sql = "SELECT * FROM alunos WHERE id = $id";
$result = mysqli_query($conexao, $sql);
$dados = mysqli_fetch_assoc($result);


$nome = $dados['nome'];
$nascimento = $dados['nascimento'];
$email = $dados['email'];
$telefone = $dados['telefone'];
$serie = $dados['serie'];
?>
<style>
  * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            background-color: #f4f7fc;
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            padding: 20px;
        }

        .form-container {
            background: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }

        .form-container h2 {
            text-align: center;
            margin-bottom: 30px; /* Deixei mais espaçado do formulário */
            color: #333;
        }

        form label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
            color: #555;
        }

        form input[type="text"],
        form input[type="email"],
        form input[type="date"],
        form input[type="hidden"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 6px;
            transition: border-color 0.3s;
        }

        form input[type="text"]:focus,
        form input[type="email"]:focus,
        form input[type="date"]:focus {
            border-color: #4caf50;
        }

        form input[type="submit"] {
            background-color: #4caf50;
            color: white;
            padding: 12px;
            width: 100%;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }

        form input[type="submit"]:hover {
            background-color: #45a049;
        }
        </style>
<h2>Editar Usuário</h2>

<form action="atualizar.php" method="POST">
    <input type="hidden" name="id" value="<?php echo $id; ?>">

    Nome: <input type="text" name="nome" value="<?php echo $nome; ?>"><br>
    Nascimento: <input type="date" name="nascimento" value="<?php echo $nascimento; ?>"><br>
    Email: <input type="email" name="email" value="<?php echo $email; ?>"><br>
    Telefone: <input type="text" name="telefone" value="<?php echo $telefone; ?>"><br>
    Série: <input type="text" name="serie" value="<?php echo $serie; ?>"><br>

    <input type="submit" value="Atualizar">
</form>
