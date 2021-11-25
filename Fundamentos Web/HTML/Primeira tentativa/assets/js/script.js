/*Var é uma variavel global
Let é uma variavel local
Const é uma variavel global, porém, constante, não altera seu valor*/
/*Personalização da pagina contato*/
/*******Personaliação do campo de dados*******/
/*
case sensitive
acessar o dom por:
por Tag: getElementByTagName()
por Id: getElementById()
por Nome: getElementsByName()
por Classe: getElementsByClassName()
por Seletor: quarySelector()
*/
/*******Validando Os campos *******/
let nome = window.document.getElementById("nome");
let email = document.querySelector("#email");
let assunto = document.querySelector("#assunto");
let nomeOk = false;
let emailOk = false;
let assuntoOk = false;
let mapa = document.querySelector("#mapa")


/*******Aumentando tamanho do campo nome e email*******/
nome.style.width = "100%";
email.style.width = "100%";
assunto.style.width = "100%"

function validaNome() {
    let txtNome = document.querySelector("#txtNome")
    if (nome.value.length < 3) {
        txtNome.innerHTML = "Nome Inválido";
        txtNome.style.color = "red";
    }
    else {
        txtNome.innerHTML = "Nome Válido";
        txtNome.style.color = "green";
        nomeOk = true;
    }

}

function validaEmail() {
    let txtEmail = document.querySelector("#txtEmail")
    if (email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1) {
        txtEmail.innerHTML = "E-mail inválido";
        txtEmail.style.color = "red";
    }
    else {
        txtEmail.innerHTML = "E-mail válido";
        txtEmail.style.color = "green";
        emailOk = true;
    }
}

function validaAssunto() {
    let txtAssunto = document.querySelector("#txtAssunto")
    if (assunto.value.length >= 100) {
        txtAssunto.innerHTML = "Texto é muito grande, digite no máximo 100 caracteres";
        txtAssunto.style.color = "red";
        txtAssunto.style.display = "block";
    }
    else {
        txtAssunto.style.display = "none";
        assuntoOk = true;
    }
}

/*******Enviar formulário*******/
function enviar(){
    if (nomeOk && emailOk && assuntoOk == true) {
        alert ("Formulário enviado com sucesso!")
    }
    else {
        alert ("Preencha o formulário corretamente antes de enviar...")
    }
}

/*******Zoom no Mapa*******/
function mapaZoom(){
    mapa.style.width = "800px"
    mapa.style.height = "600px"
}

function mapaNormal(){
    mapa.style.width = "400px"
    mapa.style.height = "250px"
}