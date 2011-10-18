/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;



/**
 *
 * @author fabricio
 */
public class Usuario {

    private String nome;
    

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if ((nome.length()>=3) && (nome.length()<=20)){
            this.nome = nome;
        }
        
    }
}


