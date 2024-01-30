package dev.castingreferenceandvar;

public class Main {

    public static void main(String[] args) {

        //---------------Compile time ------------------------

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        //Java 10 -> var or LVTI

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();



        //-----------Runtime -------------------
        Object o = Movie.getMovie("S", "Jaws");
        if(o instanceof Adventure){
            ((Adventure)o).watchMovie();
        }

        if(o instanceof ScienceFiction)
        {
            ((ScienceFiction) o).watchMovie();
        }





    }
}
