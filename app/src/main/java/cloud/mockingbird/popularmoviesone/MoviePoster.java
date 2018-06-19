package cloud.mockingbird.popularmoviesone;

public class MoviePoster {

  private int moviePosterImage;
  private String movieTitle;
  private String movieRating;
  private String movieDescription;

  public MoviePoster(int moviePosterImage, String movieTitle, String movieRating,
      String movieDescription) {
    this.moviePosterImage = moviePosterImage;
    this.movieTitle = movieTitle;
    this.movieRating = movieRating;
    this.movieDescription = movieDescription;
  }

  public int getMoviePosterImage() {
    return moviePosterImage;
  }

  public String getMovieTitle() {
    return movieTitle;
  }

  public String getMovieRating() {
    return movieRating;
  }

  public String getMovieDescription() {
    return movieDescription;
  }

  public void setMoviePosterImage(int moviePosterImage) {
    this.moviePosterImage = moviePosterImage;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public void setMovieRating(String movieRating) {
    this.movieRating = movieRating;
  }

  public void setMovieDescription(String movieDescription) {
    this.movieDescription = movieDescription;
  }

  @Override
  public String toString() {
    return super.toString();
  }


}
