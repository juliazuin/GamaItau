function validaLogin() {
    let user = localStorage.getItem("userLogged")

    if (!user) {
        window.location = "index.html"
    }

    const userOBj = JSON.parse(user)

    //document.getElementById("user").innerHTML = "Nome: " + userOBj.nome + " CPF: " + userOBj.cpf                         
    document.getElementById("user").innerHTML = `Nome: ${userOBj.nome} CPF: ${userOBj.cpf}`
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html"
}