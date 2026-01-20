/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoEstado;
import java.util.List;

/**
 *
 * @author user
 */
public class ControllerEstado {
    
    DaoEstado dao = new DaoEstado();
    public List<String> getSiglaEstados()
    {
        return dao.getSiglaEstados();
    }
     public int getIdBySigla(String sigla)
    {
        return dao.getIdBySigla(sigla);
    }
}
