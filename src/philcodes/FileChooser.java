package philcodes;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class FileChooser extends JFileChooser{

	public FileChooser() {
		          setDialogType(JFileChooser.DIRECTORIES_ONLY);
		setDialogTitle("TVAULT");
		setApproveButtonText("Choose");
		setDragEnabled(true);
		setDialogType(SAVE_DIALOG);
		setFocusable(false);
		setOpaque(false);
		setFileSystemView(getFileSystemView());
		
	}

}
