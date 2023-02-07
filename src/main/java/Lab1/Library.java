package Lab1;

public class Library {
	
	/* Add this function */
	public static void main(String arg[]) {
		Library lib = new Library();
		if (lib.someLibraryMethod())
			System.out.println("Hello, World!");
	}
		
	public boolean someLibraryMethod() {
        return true;
    }
}
