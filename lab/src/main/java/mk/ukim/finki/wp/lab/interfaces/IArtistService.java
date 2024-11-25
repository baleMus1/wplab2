package mk.ukim.finki.wp.lab.interfaces;

import java.util.List;

import mk.ukim.finki.wp.lab.model.Artist;

public interface IArtistService {
  List<Artist> listArtists();

  Artist artistFindById(Long id);
}
