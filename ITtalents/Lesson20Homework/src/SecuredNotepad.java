import java.util.ArrayList;
import java.util.Scanner;
public class SecuredNotepad implements INotepad {
	
	private String name;
	private ArrayList<Page> pages;
	private String password;
	private Scanner sc=new Scanner(System.in);
	//constructor
	
	public SecuredNotepad(String name,int pages,String password){
		while (password.length()<5) {
		    System.out.println("The password must be at least 5 symbols!");
		    System.out.println("Enter new password:");
		    password=sc.nextLine();
		}
		this.password=password;
		
		this.name=name;
		this.pages=new ArrayList<>();
		for (int i = 0; i < pages; i++) {
			this.pages.add(new Page());
			this.pages.get(i).setTitle(i+1);
		}

	}

	@Override
	public void addTextToPage(int titleOfPage,String text) {
		System.out.println("Enter password:");
		String password=sc.nextLine();
		while (!(this.password.equals(password))) {
			System.out.println("Incorrect pasword!Try again:");
			password=sc.nextLine();
		}
		System.out.println("Correct password.");
		
		if (this.pages.get(titleOfPage-1)==null
				||this.pages.get(titleOfPage-1).getText().isEmpty()) {
			this.pages.get(titleOfPage-1).addText(text);
			System.out.println("The text was added.");
		}
		else {
			System.out.println("This page is full, use other method.");
		}
		
	}

	@Override
	public void addNewTextRemoveOldOne(int titleOfPage,String text) {
		System.out.println("Enter password:");
		String password=sc.nextLine();
		while (!(this.password.equals(password))) {
			System.out.println("Incorrect pasword!Try again:");
			password=sc.nextLine();
		}
		System.out.println("Correct password.");
		
		this.pages.get(titleOfPage-1).removeText();
		this.pages.get(titleOfPage-1).addText(text);
		System.out.println("The old text is deleted and the new one is setted.");
	}

	@Override
	public void removeText(int titleOfPage) {
		System.out.println("Enter password:");
		String password=sc.nextLine();
		while (!(this.password.equals(password))) {
			System.out.println("Incorrect pasword!Try again:");
			password=sc.nextLine();
		}
		System.out.println("Correct password.");
		
		this.pages.get(titleOfPage-1).removeText();
	}

	@Override
	public void viewAllPages() {
		System.out.println("Enter password:");
		String password=sc.nextLine();
		while (!(this.password.equals(password))) {
			System.out.println("Incorrect pasword!Try again:");
			password=sc.nextLine();
		}
		System.out.println("Correct password.");
		
		for (int i = 0; i < this.pages.size(); i++) {
			this.pages.get(i).pageView();
		}
		
	}

	@Override
	public void searchWord(String word) {
		System.out.println("Enter password:");
		String password=sc.nextLine();
		while (!(this.password.equals(password))) {
			System.out.println("Incorrect pasword!Try again:");
			password=sc.nextLine();
		}
		System.out.println("Correct password.");
		
		for (int i = 0; i < this.pages.size(); i++) {
			this.pages.get(i).searchWord(word);
		}
		
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("Enter password:");
		String password=sc.nextLine();
		while (!(this.password.equals(password))) {
			System.out.println("Incorrect pasword!Try again:");
			password=sc.nextLine();
		}
		System.out.println("Correct password.");
		
		for (int i = 0; i <this.pages.size(); i++) {
			if (this.pages.get(i).containsDigits()) {
				System.out.println("Page "+this.pages.get(i).getTitle()+" contains digits:");
				System.out.println();
				this.pages.get(i).pageView();
			}
			else {
				System.out.println("Page "+this.pages.get(i).getTitle()+" doesn't contain digits.");
			}
		}
		
	}
	
	//methods
	
}



