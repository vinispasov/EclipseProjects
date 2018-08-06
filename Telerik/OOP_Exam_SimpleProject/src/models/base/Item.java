package models.base;

public class Item {
	//fields
    private String title;
    private String description;
   
    //constructor
	public Item(String title, String description) {
		super();
		setTitle(title);
		setDescription(description);
	}

	//getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.isEmpty()||title==null) {
			System.out.println("Incorrect title.Try again.");
		}
		else {
		this.title = title;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description.isEmpty()||description==null) {
			System.out.println("Incorrect description.Try again.");
		}
		else {
			this.description = description;
		}
	}
	
    
	
}
