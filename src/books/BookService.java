package books;

public class BookService {

	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		
		if (author == null || books == null) {
			return new Book[0];
		}
		
		int filteredBooksArraySize = 0;
		
		for (Book book: books) {
			if (book.hasAuthor(author)) {
				filteredBooksArraySize++;
			}
		}
		
		Book[] filteredBooks = new Book[filteredBooksArraySize];
		
		int i = 0;
		for (Book book: books) {
			if (book.hasAuthor(author)) {
				filteredBooks[i++] = book;
			}
			
		}
		
		return filteredBooks;
		
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
	
		if (publisher == null || books == null) {
			return new Book[0];
		}
		
		int filteredByPublsherArrySize = 0;
		
		for (Book book: books) {
			if (book.getPublisher().equals(publisher)) {
				filteredByPublsherArrySize++;
			}
		}
		
		Book[] filteredByPublisher = new Book[filteredByPublsherArrySize];
		
		int i = 0;
		for (Book book: books) {
			if (book.getPublisher().equals(publisher)) {
				filteredByPublisher[i++] = book;
			}
		}
		return filteredByPublisher;
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		
		if (books == null) {
			return new Book[0];
		}
		int filteredByYearArraySize = 0;
		
		for (Book book: books) {
			if (book.getPublishingYear() >= yearFromInclusively) {
				filteredByYearArraySize++;
			}
		}
		
		Book[] filteredByYear = new Book[filteredByYearArraySize];
		int i = 0;
		for (Book book: books) {
			if (book.getPublishingYear() >= yearFromInclusively) {
				filteredByYear[i++] = book;
			}
		}
		return filteredByYear;

	}
}
