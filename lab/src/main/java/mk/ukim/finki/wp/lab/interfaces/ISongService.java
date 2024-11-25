package mk.ukim.finki.wp.lab.interfaces;

import java.util.List;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;

public interface ISongService {
  List<Song> listSongs();

  Artist addArtistToSong(Artist artist, Song song);

  Song songFindByTrackId(String trackId);
}
