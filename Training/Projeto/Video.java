package Training.Projeto;

public class Video implements VideoAction {
  // Atributes set (5)
  private String title;
  private int rating;
  private int views;
  private int likes;
  private boolean replying;

  

  // Constructor Methods
  public Video(String title) {
    this.title = title;
    this.rating = 1;
    this.views = 0;
    this.likes = 0;
    this.replying = false;
  }



  // Override Methods (3)
  @Override
  public void play() {
    this.replying = true;
  }

  @Override
  public void pause() {
    this.replying = false;
  }

  @Override
  public void like() {
    this.likes++;
  }


  
  // Special Methods (Getter && Setter)
  public String getTitle() {
    return title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public boolean isReplying() {
    return replying;
  }

  public void setReplying(boolean replying) {
    this.replying = replying;
  }
}
