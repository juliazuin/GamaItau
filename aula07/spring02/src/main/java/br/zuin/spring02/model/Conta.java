package br.zuin.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {
    @Id // indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numConta")
    private int numConta;

    @Column(name = "saldo")
    private double saldo;

    @OneToOne
    @JoinColumn(columnDefinition = "id_user")
    public User usuario;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
