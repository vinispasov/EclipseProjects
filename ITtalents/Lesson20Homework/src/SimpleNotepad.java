import java.util.ArrayList;
public class SimpleNotepad implements INotepad {
	private String name;
	private ArrayList<Page> pages;
	
	//constructor
	
	public SimpleNotepad(String name,int pages){
		this.name=name;
		this.pages=new ArrayList<>();
		for (int i = 0; i < pages; i++) {
			this.pages.add(new Page());
			this.pages.get(i).setTitle(i+1);
		}
	}
	
	//methods
	@Override
	public void addTextToPage(int titleOfPage,String text) {
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
		this.pages.get(titleOfPage-1).removeText();
		this.pages.get(titleOfPage-1).addText(text);
		System.out.println("The old text is deleted and the new one is setted.");
	}

	@Override
	public void removeText(int titleOfPage) {
		this.pages.get(titleOfPage-1).removeText();
	}

	@Override
	public void viewAllPages() {
		for (int i = 0; i < this.pages.size(); i++) {
			this.pages.get(i).pageView();
		}
		
	}

	@Override
	public void searchWord(String word) {
		for (int i = 0; i < this.pages.size(); i++) {
			this.pages.get(i).searchWord(word);
		}
		
	}

	@Override
	public void printAllPagesWithDigits() {
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
	
}
