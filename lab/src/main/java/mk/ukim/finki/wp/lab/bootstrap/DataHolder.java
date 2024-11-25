package mk.ukim.finki.wp.lab.bootstrap;
import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.lab.model.Album;
import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Artist> artists = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();
    public static List<Album> albums=new ArrayList<>();

    @PostConstruct
    public void init(){
        artists = new ArrayList<>();
        songs = new ArrayList<>();
        albums = new ArrayList<>();

        artists.add(new Artist("peacime1", "peacprezime1", "tuse"));
        artists.add(new Artist("peacime2", "peacprezime2", "cakikismi"));
        artists.add(new Artist("peacime3", "peacprezime3", "pero"));
        artists.add(new Artist("peacime4", "peacprezime4", "pero"));
        artists.add(new Artist("peacime5", "peacprezime5", "toni"));

        Album album1=new Album("pesna1", "folk", "2020");
        Album album2=new Album("pesna2", "pop", "1980");
        Album album3=new Album("pesna3", "Rock", "2010");
        Album album4=new Album("pesna4", "pop", "2004");
        Album album5=new Album("pesna5", "Rock", "1999");

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        albums.add(album4);
        albums.add(album5);


        songs.add(new Song("001", "naslov1", "metal", 1999,album1));
        songs.add(new Song("002", "naslov2", "folk", 1992,album2));
        songs.add(new Song("003", "naslov3", "Rock", 2005,album3));
        songs.add(new Song("004", "naslov4", "Pop", 2015,album4));
        songs.add(new Song("005", "naslov5", "folk", 2022,album5));

        album1.addSong(songs.get(0));
        album2.addSong(new Song("002", "naslov2", "folk", 1992,album2));
        album3.addSong(new Song("003", "naslov3", "Rock", 2005,album3));
        album4.addSong(new Song("004", "naslov4", "Pop", 2015,album4));
        album5.addSong(new Song("005", "naslov5", "folk", 2022,album5));



    }

}