package test.mypac;

public class BookListDto {
	private int num;
	private String wirter;
	private String title;
	
	public BookListDto () {	}

	public BookListDto(int num, String wirter, String title) {
		super();
		this.num = num;
		this.wirter = wirter;
		this.title = title;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWirter() {
		return wirter;
	}

	public void setWirter(String wirter) {
		this.wirter = wirter;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
