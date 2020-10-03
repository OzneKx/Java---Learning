package Training.Aula9;

public class Book implements Publication {
  // Atributes set(6)
  private String title;
  private String author;
  private int totalPages;
  private int currentPage;
  private boolean open;
  private Person reader;



   // Abstract Methods
   public String details() {
     return "Book [\nauthor= " + author + "\n, currentPage=" 
            + currentPage + "\n, open= " + open + "\n, reader= " 
            + reader.getName() + ", idade= " + reader.getAge() + 
            ", sexo= " + reader.getGender() + "\n, title= " 
            + title + "\n, totalPages= " + totalPages + "\n]";
   }



  // Constructor Method
  public Book(String title, 
              String author, 
              int totalPages,
              Person reader) {
    this.title = title;
    this.author = author;
    this.totalPages = totalPages;
    this.open = false;
    this.currentPage = 0;
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

  public Person getReader() {
    return reader;
  }

  public void setReader(Person reader) {
    this.reader = reader;
  }



  // Implementation Methods
  @Override
  public void open() {
    this.open = true;
  }

  @Override
  public void close() {
    this.open = false;
  }

  @Override
  public void skim(int p) {
    if (p > this.totalPages) {
      this.currentPage = 0;
    } else {
      this.currentPage = p;
    }
  }

  @Override
  public void nextPage() {
    this.currentPage++;
  }

  @Override
  public void previousPage() {
    this.currentPage--;
  }
}
