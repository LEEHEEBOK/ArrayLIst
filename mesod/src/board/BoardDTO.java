package board;

public class BoardDTO {
	private int Number;
	private String Title;
	private String Password;
	private String Writer;
	
	BoardDTO(){}
	
	BoardDTO(int Number, String Title, String Password, String Writer){
		this.Number =Number;
		this.Title =Title;
		this.Password =Password;
		this.Writer =Writer;
		
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	@Override
	public String toString() {
		return "BoardDTO [Number=" + Number 
				+ ", Title=" + Title 
				+ ", Password=" + Password 
				+ ", Writer=" + Writer
				+ "]";
	}
	
}
