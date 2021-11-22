import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class Git
{
    public static void Daniel(){
        String token = "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";
        StringSelection selection = new StringSelection(token);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}