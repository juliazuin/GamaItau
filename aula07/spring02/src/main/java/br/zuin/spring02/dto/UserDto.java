package br.zuin.spring02.dto;

import br.zuin.spring02.model.User;

public class UserDto {
    private String nome;
    private String email;
    private String cpf;

    public UserDto(User user){
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.cpf = user.getCpf();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
