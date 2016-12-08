package clear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileLoader {

	
	public static String[] loadFile(){
		try {
			JFileChooser chooser = new JFileChooser();
			JFrame frame = new JFrame();
			int res = chooser.showOpenDialog(frame);
			if(res == JFileChooser.APPROVE_OPTION){
				FileReader fileReader = new FileReader(chooser.getSelectedFile());
				BufferedReader reader = new BufferedReader(fileReader);
				String line = null;
				ArrayList<String> listOfStrings = new ArrayList<String>();
				while ((line = reader.readLine()) != null) {
					listOfStrings.add(line);
				}
				String[] str = new String[listOfStrings.size()];
				str = listOfStrings.toArray(str);
				reader.close();
				System.out.println("daf "+str.length);
				frame.dispose();
				return str;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
