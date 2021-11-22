import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class Git
{
    public static void Daniel(){
        String token = "ghp_b647OugZi2rxxa"+"G73bBUH7ASpxN95e1BJROV";
        StringSelection selection = new StringSelection(token);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}