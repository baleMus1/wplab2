package mk.ukim.finki.wp.lab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import mk.ukim.finki.wp.lab.model.Artist;

@Repository
public class ArtistRepository {
  private List<Artist> artists;

  private void initializeSongs() {
    artists.add(new Artist("Artist First Name 1", "Artist Last Name 1", "Bio 1"));
    artists.add(new Artist("Artist First Name 2", "Artist Last Name 2", "Bio 2"));
    artists.add(new Artist("Artist First Name 3", "Artist Last Name 3", "Bio 3"));
    artists.add(new Artist("Artist First Name 4", "Artist Last Name 4", "Bio 4"));
    artists.add(new Artist("Artist First Name 5", "Artist Last Name 5", "Bio 5"));
  }

  public ArtistRepository() {
    this.artists = new ArrayList<>();
    initializeSongs();
  }

  public List<Artist> findAll() {
    return artists;
  };

  public Optional<Artist> findById(long id) {
    return artists.stream()
        .filter(artist -> artist.getId() == id)
        .findFirst();
  }
}
