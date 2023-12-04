package CustomRenderers;
import javax.swing.*;

import DTOS.ListadoDTO;

import java.awt.*;

public class ListadoDTORenderer extends DefaultListCellRenderer {

	@Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof ListadoDTO) {
            value = ((ListadoDTO) value).getNombre();
        }
        return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
    }
}