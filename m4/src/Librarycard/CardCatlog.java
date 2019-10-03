package Librarycard;

public class CardCatlog {
	String title[];
	String author[];
	String subject[];
	static int count=0;
	card cards[];
	CardCatlog(){
		this.title = new String[10];
		this.author = new String[10];
		this.subject = new String[10];
		this.cards = new card[10];
	}
	public void addACard(card card) {
		title[count]=card.title;
		author[count]=card.author;
		subject[count]=card.subject;
		cards[count]=card;
		count++;
		}
	public card getATitle(String title) {
		for(int i=0;i<cards.length;i++) {
			if (cards[i].getTitle().equals(title)) {
				return cards[i];
			}
		}
		return null;
	}
	public String[] getAnAuthor(String author) {
		String books[]=new String[10];
		int k=0;
		for(int i=0;i<cards.length;i++) {
			if(cards[i]!=null) {
				if (cards[i].getAuthor().equals(author)) {
					books[k]=cards[i].getTitle();
					k=k+1;
				}
			}
		}
		return books;
	}
	public String[] getSubject(String subject) {
		String[] books=new String[10];
		int k=0;
		for(int i=0;i<cards.length;i++) {
			if(cards[i]!=null) {
				if(cards[i].getSubject().equals(subject)) {
					books[k]=cards[i].getTitle();
					k=k+1;
				}
			}
		}
		return  books;
	}
	public void removeATitle(String title) {
		for(int i=0;i<cards.length;i++) {
			if(cards[i].getTitle().equals(title)) {
				cards[i]=null;
				break;
				
			}
			System.out.println(cards[i]);
		}
	  
	}
	public void printTheCatalog() {
		for(int i=0;i<count;i++) {
			System.out.println(cards[i]);
		}
	}
	
    

}
