package Training.Aula9;

public class Book implements Publication {

  // Atributes set(6)
  private String title;
  private String author;
  private int totalPages;
  private int currentPage;
  private boolean open;
  private String reader;



  // Constructor Method
  public Book(String title, 
              String author, 
              int totalPages, 
              int currentPage, 
              boolean open, 
              String reader) {
    this.title = title;
    this.author = author;
    this.totalPages = totalPages;
    this.currentPage = currentPage;
    this.open = open;
    this.reader = reader;
  }



  // Special Methods (Getter && Setter)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(int totalPages) {
    this.totalPages = totalPages;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public boolean isOpen() {
    return open;
  }

  public void setOpen(boolean open) {
    this.open = open;
  }

  public String getReader() {
    return reader;
  }

  public void setReader(String reader) {
    this.reader = reader;
  }



  // Abstract Methods
  public void details() {

  }



  // Implementation Methods
  @Override
  public void open() {

  }

  @Override
  public void close() {

  }

  @Override
  public void skim() {

  }

  @Override
  public void nextPage() {

  }

  @Override
  public void previousPage() {

  }
}
