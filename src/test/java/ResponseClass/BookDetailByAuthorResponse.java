package ResponseClass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookDetailByAuthorResponse {
    public int length;
    @JsonProperty("book_name")
        private String bookname;
        private String isbn;
        private String aisle;

        public String getAisle() {
            return aisle;
        }

        public void setAisle(String aisle) {
            this.aisle = aisle;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getBook_name() {
            return bookname;
        }

        public void setBook_name(String bookname) {
            this.bookname = bookname;
        }

    }

