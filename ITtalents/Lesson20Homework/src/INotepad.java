
public interface INotepad {
	
	//methods
	void addTextToPage(int titleOfPage,String text);
	void addNewTextRemoveOldOne(int titleOfPage,String text);
	void removeText(int titleOfPage);
	void viewAllPages();
	void searchWord(String word);
	void printAllPagesWithDigits();
	
		
	
		

}
