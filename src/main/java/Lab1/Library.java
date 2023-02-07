package Lab1;

public class Library {
	
	/* Add this function */
	//	init commit already contain the final version of Library.java
	//	this line is used as a file change for committing to git
	public static void main(String arg[]) {
		Library lib = new Library();
		if (lib.someLibraryMethod())
			System.out.println("Hello, World!");
	}
		
	public boolean someLibraryMethod() {
        return true;
    }
}
