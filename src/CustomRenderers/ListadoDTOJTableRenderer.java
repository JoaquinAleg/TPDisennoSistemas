package CustomRenderers;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import DTOS.ListadoDTO;


public class ListadoDTOJTableRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Si el valor es una instancia de ListadoDTO, mostrar el nombre
        if (value instanceof ListadoDTO) {
            value = ((ListadoDTO) value).getNombre();
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
