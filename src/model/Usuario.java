/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author fabricio
 */
public class Usuario {

    private String nome;
    
    private List<Mensagem> listaMensagens = new ArrayList<Mensagem>();
    private Hashtable<Usuario, Integer> seguindo = new Hashtable<Usuario, Integer>();
    private Hashtable<Usuario, Integer> seguidores = new Hashtable<Usuario, Integer>();
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if ((nome.length()>=3) && (nome.length()<=20)){
            this.nome = nome;
        }


    }

    public ArrayList<Mensagem> getListaMensagens(){
        return (ArrayList<Mensagem>) listaMensagens;
    }

   public Hashtable<Usuario, Integer> getSeguindo(){
       return seguindo;
   }

   public Hashtable<Usuario, Integer> getSeguidores(){
       return seguidores;
   }

}


