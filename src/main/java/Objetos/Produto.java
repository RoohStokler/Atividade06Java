/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Stokler
 */
public class Produto {
    
    private String nome;
    private String descricao;
    private String fornecedor;
    private double quantidade;
    private double ValorUni;
    private double ValorTotal;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the quantidade
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the ValorUni
     */
    public double getValorUni() {
        return ValorUni;
    }

    /**
     * @param ValorUni the ValorUni to set
     */
    public void setValorUni(double ValorUni) {
        this.ValorUni = ValorUni;
    }

    /**
     * @return the ValorTotal
     */
    public double getValorTotal() {
        return ValorTotal;
    }

    /**
     * @param ValorTotal the ValorTotal to set
     */
    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public Object getVUni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getVTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
