package studentRecordsBackup.driver;

import studentRecordsBackup.bst.BST;
import studentRecordsBackup.extra.BSTI;
import studentRecordsBackup.util.BSTBuilder;

/**
 * @ Java Program to construct a BST and store it in 
 * other two backup trees using observer pattern.
 * @author Vishnu Ravindra
 *
 */

public class Driver {

	
	public static void main(String args[]){
			
		int argsLength = args.length;
		checkArgs(args,argsLength);
		String fileName = args[0];
		int value = Integer.parseInt(args[1]);
		BSTI bst = new BST();
		BSTI backup_1 = new BST();
		BSTI backup_2 = new BST();
		BSTBuilder bstb = new BSTBuilder(bst, backup_1, backup_2);
		bstb.ReadFile(fileName);
		System.out.println("Main Tree:");
		bst.printInorder();
		System.out.println("Backup 1 Tree:");
		backup_1.printInorder();
		System.out.println("Backup 2 Tree:");
		backup_2.printInorder();
		System.out.println("Sum of Main tree: " +bst.sum());
		System.out.println("Sum of Backup 1: " +backup_1.sum());
		System.out.println("Sum of Backup 2: " +backup_2.sum());
		bst.update(value);
		System.out.println("Main Tree:");
		bst.printInorder();
		System.out.println("Backup 1 Tree:");
		backup_1.printInorder();
		System.out.println("Backup 2 Tree:");
		backup_2.printInorder();
		System.out.println("Sum of Main tree: " +bst.sum());
		System.out.println("Sum of Backup 1: " +backup_1.sum());
		System.out.println("Sum of Backup 2: " +backup_2.sum());
	}

	/**
	 * Method to check if the arguments are Integers
	 * @param arg
	 * @return bool
	 */
	public static boolean checkInteger(String arg)
	{
		try{
			Integer.parseInt(arg);
		}
		catch(NumberFormatException e){
			return false;
		}
		return true;
	}

	/**
	 * Method to validate the command line arguments
	 * @param args, argsLength
	 * @return void
	 */
	public static void checkArgs(String[] args,int argsLength){
		if(argsLength != 2){
			System.err.println("Please enter the correct number of arguments!");
			System.exit(0);
		}else if(args[0] == null){
			System.err.println("Please enter the valid input file name!");
			System.exit(0);
		}else if(args[1] == null){
			System.err.println("Please enter the integer update value!");
			System.exit(0);
		}else if(checkInteger(args[1]) != true){
			System.err.println("Please enter a integer as update value!");
			System.exit(0);
		}		
	}
}