package quiz02;

public class NotebookMain {
	public static void main(String[] args) {
		
		Notebook notebook = new Notebook();
		notebook.color = "white";
		notebook.company = "LG";
		notebook.model = "gram";
		notebook.price = 1300000;
		
		notebook.info();
		System.out.println(notebook.grade());
		
		Notebook notebook2 = new Notebook("samsung","ultra","gray",900000);
		notebook2.info();
		System.out.println(notebook2.grade());
		
	}
}
