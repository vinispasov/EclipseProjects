
public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;
	public ElectronicSecuredNotepad(String name, int pages, String password) {
		super(name, pages, password);
		this.isStarted=false;
		
	}
	

	@Override
	public void addTextToPage(int titleOfPage, String text) {
		if (isStarted) {
			super.addTextToPage(titleOfPage, text);
		}
		else {
			System.out.println("The device is not started.");
		}
		
	}


	@Override
	public void addNewTextRemoveOldOne(int titleOfPage, String text) {
		if (isStarted) {
		super.addNewTextRemoveOldOne(titleOfPage, text);
		}
		else {
			System.out.println("The device is not started!");
		}
	}


	@Override
	public void removeText(int titleOfPage) {
		if (isStarted) {
		super.removeText(titleOfPage);
		}
		else {
			System.out.println("The device is not started!");
		}
	}


	@Override
	public void viewAllPages() {
		if (isStarted) {
		super.viewAllPages();
		}
		else {
			System.out.println("The device is not started!");
		}
	}


	@Override
	public void searchWord(String word) {
		if (isStarted) {
		super.searchWord(word);
		}
		else {
			System.out.println("The device is not started!");
		}
	}


	@Override
	public void printAllPagesWithDigits() {
		if (isStarted) {
		super.printAllPagesWithDigits();
		}
		else {
			System.out.println("The device is not started!");
		}
	}


	@Override
	public void start() {
		this.isStarted=true;
		System.out.println("The device is started.");
	}

	@Override
	public void stop() {
		this.isStarted=false;
		System.out.println("The device is stopped.");
	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}
	
}
