package week3;

public class Book {
	String title; // 책 이름
	int pages; // 페이지 수
	String writer; // 저자
	
	Book(String t, int p, String w){
		this.title = t;
		this.pages = p;
		this.writer = w;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPages() {
		return this.pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getWriter() {
		return this.writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String toString(){
		return "책 이름 : " + this.title + "\n페이지 수 : " + this.pages + "\n저자 : " + this.writer;
	}
}
