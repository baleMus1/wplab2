package mk.ukim.finki.wp.lab.model;
import lombok.Data;
import lombok.Getter;
import java.util.List;
@Getter
@Data
public class Song {
  private Long id;
  private String title;
  private String genre;
  private int releaseYear;
  private List<Artist> performers;
  private Album album;

  public Song(String id, String title, String genre, int releaseYear, Album album) {
    this.id = (long) (Math.random() * 1000);
    this.title = title;
    this.genre = genre;
    this.releaseYear = releaseYear;
    this.performers = performers;
    this.album = album;
  }

  public Long getId() {
    return id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public List<Artist> getPerformers() {
    return performers;
  }

  public void setPerformers(List<Artist> performers) {
    this.performers = performers;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }
}
