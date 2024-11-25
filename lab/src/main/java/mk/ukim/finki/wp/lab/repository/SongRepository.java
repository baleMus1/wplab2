package mk.ukim.finki.wp.lab.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

@Repository
public class SongRepository {
  private List<Song> songs;

  private void initializeSongs() {
    songs.add(new Song("1", "Song Title 1", "Artist Name 1", 200, new ArrayList<Artist>()));
    songs.add(new Song("2", "Song Title 2", "Artist Name 2", 240, new ArrayList<Artist>()));
    songs.add(new Song("3", "Song Title 3", "Artist Name 3", 180, new ArrayList<Artist>()));
    songs.add(new Song("4", "Song Title 4", "Artist Name 4", 220, new ArrayList<Artist>()));
    songs.add(new Song("5", "Song Title 5", "Artist Name 5", 210, new ArrayList<Artist>()));
  }

  public SongRepository() {
    this.songs = new ArrayList<>();
    initializeSongs();
  }

  public List<Song> findAll() {
    return songs;
  };

  public Song findByTrackId(String id) {
    return songs.stream()
        .filter(song -> song.getId().equals(id))
        .findFirst().orElse(null);
  }

  public Artist addArtistToSong(Artist artist, Song song) {
    List<Artist> artists = song.getPerformers();
    artists.add(artist);
    return artist;
  }

}
