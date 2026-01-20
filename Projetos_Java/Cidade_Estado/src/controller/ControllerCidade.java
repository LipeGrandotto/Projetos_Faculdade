/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoCidade;
import java.util.List;

/**
 *
 * @author user
 */
public class ControllerCidade {
    DaoCidade dao = new DaoCidade();
     public List<String> getCidadesByEstados(int estado)
     {
         return dao.getCidadesByEstados(estado);
     }
    
}
