/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Clientes;

import view.Clientes.*;
import bean.VmanClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerClientes extends AbstractTableModel {

    private List lstClientes;

    public void setList(List lstClientes) {
        this.lstClientes = lstClientes;
    }
    
    public VmanClientes getBean(int rowIndex) {
        return (VmanClientes) lstClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VmanClientes clientes = (VmanClientes) lstClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return clientes.getVmanIdClientes();
        } else if (columnIndex ==1) {
            return clientes.getVmanNome();        
        } else if (columnIndex ==2) {
            return clientes.getVmanDivida();
        } else if (columnIndex ==3) {
            return clientes.getVmanCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Divida";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
