/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Produtos;

import bean.VmanProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerProdutos extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
    }
    
    public VmanProdutos getBean(int rowIndex) {
        return (VmanProdutos) lstProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VmanProdutos produtos = (VmanProdutos) lstProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return produtos.getVmanIdProdutos();
        } else if (columnIndex ==1) {
            return produtos.getVmanProduto();        
        } else if (columnIndex ==2) {
            return produtos.getVmanPreco();
        } else if (columnIndex ==3) {
            return produtos.getVmanQuantidade();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Produto";         
        } else if ( columnIndex == 2) {
            return "Preço";
        } else if ( columnIndex == 3) {
            return "Quantidade no Estoque";
        } 
        return "";
    }
    
}
