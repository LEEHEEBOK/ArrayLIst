package boardclass;

public class BoardClass {
	int bNumber;
	String bTitle;
	String bWriter;
	String bContents;

	BoardClass() {

	}
//글번호, 글제목, 작성자, 내용을 매개변수로 하며 전달받은 매개변수값을 필드에 저장
	void boardWrite(int bNumber, String bTitle, String bWriter, String bContents) {
		this.bNumber =bNumber;
		this.bTitle = bTitle;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}
//모든 필드값을 출력
	void boardview() {
		System.out.println("----Construtor----");
		System.out.println(bNumber);
		System.out.println(bTitle);
		System.out.println(bWriter);
		System.out.println(bContents);
	}
// 글 제목, 내용을 매개변수로 하여 필드값수정 
	void boardUpdate(String bTitle, String bContents) {
		this.bContents = bContents;
		this.bTitle = bTitle;
	}

}
