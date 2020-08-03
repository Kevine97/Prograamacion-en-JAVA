package spotify_examenfinal;

import java.util.ArrayList;

public class ListaMultimedia {

    ArrayList<Pelicula> p = new ArrayList<>();
    ArrayList<Disco> d = new ArrayList<>();

    public void addPelicula(Pelicula p) {

        this.p.add(p);
    }

    public void addDisco(Disco d) {

        this.d.add(d);
    }

    public int sizeDisco() {

        return d.size();
    }

    public int sizePelicula() {
        return p.size();
    }
    
    

}
