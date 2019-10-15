package latihan.film;

public class Main {

	public static void main(String[] args) {
		Film film = new Film();
	       
	       
        System.out.println("=====Daftar Film Sedang Tayang=====\n");
        
        Film film1 = new Film();
        film.filmName = "Venom";
        film.filmGenre = "Action, Horor, SciFi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();
        
        Film film2 = new Film();
        film.filmName = "Smallfoot";
        film.filmGenre = "Animation";
        film.filmRating = 9.0;
        film.filmDuration = 96;
        film.nowPlaying();
        
        Film film3 = new Film();       
        film.filmName = "Crazy Rich Asian";
        film.filmGenre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();
        
        Film film4 = new Film();
        film.filmName = "Asih";
        film.filmGenre = "Horor";
        film.filmRating = 6.0;
        film.filmDuration = 100;
        film.nowPlaying();
        
	        
	        


	}

}
