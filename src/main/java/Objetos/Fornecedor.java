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
public class Fornecedor {
    
    private String RazaoSocial;
    private String cnpj;
    private String NomeRepesentante;
    private String endereco;
    private String telefone;

    /**
     * @return the RazaoSocial
     */
    public String getRazaoSocial() {
        return RazaoSocial;
    }

    /**
     * @param RazaoSocial the RazaoSocial to set
     */
    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the NomeRepesentante
     */
    public String getNomeRepesentante() {
        return NomeRepesentante;
    }

    /**
     * @param NomeRepesentante the NomeRepesentante to set
     */
    public void setNomeRepesentante(String NomeRepesentante) {
        this.NomeRepesentante = NomeRepesentante;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
