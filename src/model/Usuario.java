/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author fabricio
 */
public class Usuario {

    private String nome;
    private List<String> listaMensagem = new ArrayList<String>();
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if ((nome.length()>=3) && (nome.length()<=20)){
            this.nome = nome;
        }
        
    }
}


