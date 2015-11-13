package studentRecordsBackup.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import studentRecordsBackup.bst.Node;
import studentRecordsBackup.extra.BSTI;

public class BSTBuilder {

	private String line;
	BSTI bst;
	BSTI backup_1;
	BSTI backup_2;
	
	public BSTBuilder(BSTI main, BSTI b1, BSTI b2) {
		bst = main;
		backup_1 = b1;
		backup_2 = b2;
	}
	
	/** Method to read a line from input file
	 * @param filename
	 * @return void
     */
	public void ReadFile(String fileName){
		BufferedReader br = null;
		InputStream is;
		InputStreamReader isr;
		try{
			is = new FileInputStream(fileName);
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		}catch(FileNotFoundException e){
			System.err.println("Invalid input file!");
			System.exit(0);
		}
		try{
			while((line = br.readLine()) != null){
				int key = Integer.parseInt(line);
				Node node = new Node(key);
				Node nodeB1 = new Node(key, node);
				Node nodeB2 = new Node(key, node);
				bst.insert(bst.getRoot(), node);
				backup_1.insert(backup_1.getRoot(), nodeB1);
				backup_2.insert(backup_2.getRoot(), nodeB2);
			}
		}catch(IOException e){
			System.err.println("IO exception!");
			System.exit(0);
		}
	}
}