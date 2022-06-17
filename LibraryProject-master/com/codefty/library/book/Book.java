package com.codefty.library.book;

/**
 * Book DTO(Data Transfer Object)
 * 
 * @author YONGGYO
 */
public class Book {
	private long serialNum; // ���� �Ϸù�ȣ
	private String title; // ������
	private String publisher; // ���ǻ�
	private String author; // ����
	private int rentalDays; // ������ ���� ���� �ϼ� 
	
	public Book(long serialNum, String title, String publisher, String author, int rentalDays) {
		this.serialNum = serialNum;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.rentalDays = rentalDays;
	}

	public long getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRentalDays() {
		return rentalDays;
	}

	public void setRentalDays(int rentalDays) {
		this.rentalDays = rentalDays;
	}

	@Override
	public String toString() {
		return "Book [serialNum=" + serialNum + ", title=" + title + ", publisher=" + publisher + ", author=" + author
				+ ", rentalDays=" + rentalDays + "]";
	}
}