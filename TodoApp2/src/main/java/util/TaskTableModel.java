
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author S�sthenes Lima-NUT
 */
public class TaskTableModel extends AbstractTableModel{
    
    String[] columns = {"Nome", "Descri��o", "Prazo", "Tarefa Concluida", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();


    @Override
    public int getRowCount() {
       // retorna o n�mero de tarefas que tenho
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        //retorna o n�mero de Colunas da nossa Tabela
        return columns.length;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return columnIndex == 3;
        
//if(columnIndex == 3 )
            //return true;
        //else
            //return false;
    }
    
    @Override
    public Class<?> getColumnClass(int columunIndex){
        
        if(tasks.isEmpty()){
            return Object.class;
            
        }
        return this.getValueAt(0, columunIndex).getClass();
    }  
    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                return tasks.get(rowIndex).getName();                
            case 1:
                return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isCompleted();
            
            case 4:
                return "";
            case 5:
                return "";
            
            default:
                return "Dados n�o encontrados";
     
                
        }
         
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        tasks.get(rowIndex).setCompleted((boolean) aValue);
        
    }
    
    
    
    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
 
    
}
