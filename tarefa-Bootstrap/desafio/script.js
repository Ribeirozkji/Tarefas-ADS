 
 function validarFormulario(event) {
    
    const nome = document.getElementById("nome");
    const nascimento = document.getElementById("nascimento");
    const email = document.getElementById("email");
    const telefone = document.getElementById("telefone");
    const serie = document.getElementById("serie");

  
    if (nome.value.trim() === "") {
        alert("Por favor, preencha o campo nome.");
        nome.focus();
        event.preventDefault();
        return false;
    }

    if (nascimento.value === "") {
        alert("Por favor, preencha a data de nascimento.");
        nascimento.focus();
        event.preventDefault();
        return false;
    }

    if (email.value.trim() === "") {
        alert("Por favor, preencha o email.");
        email.focus();
        event.preventDefault();
        return false;
    }

    if (telefone.value.trim() === "") {
        alert("Por favor, preencha o telefone.");
        telefone.focus();
        event.preventDefault();
        return false;
    }

    if (serie.value === "") {
        alert("Por favor, selecione a série.");
        serie.focus();
        event.preventDefault();
        return false;
    }

    return true; 
}


function animaFocus(event) {
    event.target.style.borderColor = "#4caf50";
    event.target.style.transition = "0.3s ease";
}

function removeFocus(event) {
    event.target.style.borderColor = "#ccc";
}