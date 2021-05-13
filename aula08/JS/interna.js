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

function listarUsuarios() {
    fetch("http://localhost:8080/user/all")
        .then(res => tratarRetorno(res))
}

function tratarRetorno(resposta) {
    resposta.status == 200 ? resposta.json().then(res => getListaUser(res)) : document.getElementById("msgErro").innerHTML = "Falha ao carregar"
}

function getListaUser(res) {
    let tableHeader = "<thead> <tr> <th>Nome</th> <th>Email</th> <th>CPF</th> </tr> </thead>"

    let tableMap = res.map(function (item) {
        tabela = `<tr>
            <td> ${item.nome} </td>
            <td> ${item.email} </td>
            <td> ${item.cpf} </td>
        </tr>`
        return tabela
    })
    document.getElementById("headTable").innerHTML = tableHeader;
    document.getElementById("bodyTabela").innerHTML = tableMap;

    montarSelect(res);
}

function montarSelect(listarUsuarios) {
    let selecao = "<select>"
    let selectMap = listarUsuarios.map(function (item) {
        tabela = `<option> ${item.nome} </option>`
        return tabela
    })


    document.getElementById("selecao").innerHTML = selecao + selectMap + "</select>";

}