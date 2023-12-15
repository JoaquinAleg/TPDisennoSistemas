package CustomRenderers;

import javax.print.attribute.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class DocumentLengthFilter extends DocumentFilter {
	private int maxLength;

    public DocumentLengthFilter(int maxLength) {
        this.maxLength = maxLength;
    }

    public void insertString(FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attr)
            throws BadLocationException {
        // Verifica si el texto resultante no excede la longitud máxima
        if ((fb.getDocument().getLength() + string.length()) <= maxLength) {
            super.insertString(fb, offset, string, attr);
        }
    }

    public void replace(FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs)
            throws BadLocationException {
        // Verifica si el texto resultante no excede la longitud máxima
        if ((fb.getDocument().getLength() + text.length() - length) <= maxLength) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
}
