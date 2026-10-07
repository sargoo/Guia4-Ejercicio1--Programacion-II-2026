import java.util.HashSet;
import java.util.Iterator;

public class Libreria {
    private  HashSet<Libro> libros;

    public Libreria() {
        this.libros =  new HashSet<>();
    }
    //Agregar un nuevo libro al inventario.
    public boolean agregarLibro(String titulo, String autor, double precio, int anio){
        Libro l = new Libro(titulo, autor, precio, anio);
        return this.libros.add(l);
    }
    //Quitar libro al inventario.
    public String quitarLibro(Libro l){
        if (this.libros.contains(l.getTitulo())){
            this.libros.remove(l);
        }
        return "El libro se borro exitosamente";
    }

    //Mostrar todos los libros en el inventario.
    public String mostrarLibros(){
        Iterator <Libro> it = this.libros.iterator();
        while (it.hasNext()){
            Libro elemento = it.next();
           return elemento.toString();
        }
        return "no hay libros para mostrar";
    }

    //Buscar un libro por su título.
    public String buscarLibro(String busqueda){
        if (this.libros.contains(busqueda)){
           return  "El libro " + busqueda + "Esta en la libreria";
        }
        return  "El libro " + busqueda + "no esta en la libreria";
    }

    //Actualizar el precio de un libro
    public String actualizarPrecio(double precio, String nombre){
      for (Libro l : this.libros){
          if (l.getTitulo().equals(nombre)){
              l.setPrecio(precio);
              return "precio modificado con exito";
          }
      }
      return "No se encontro el libro";
    }

    //Calcular el precio total de todos los libros en el inventario
    public String calcularPrecioTotal(){
        double precioTotal = 0;
        for (Libro l : this.libros){
            precioTotal += l.getPrecio();
        }
        return "Precio total de todos los libros: " + precioTotal;
    }

    //Contar el número total de libros en el inventario.
    public String contadorLibros(){
        int cont = 0;
        for (Libro l : this.libros){
            cont ++;
        }
        return "cantidad total de libros: " + cont;
    }

    //Encontrar el libro más caro y el más barato en el inventario.
    public String encontrarBarato(){
        Libro masBarato = null;
        Libro masCaro = null;
        for (Libro l : this.libros){
            if (masBarato == null && masCaro == null){
                masBarato = l;
                masCaro = l;
            }
            else{
                if (masBarato.getPrecio() > l.getPrecio()){
                    masBarato = l;
                }
                if (masCaro.getPrecio() < l.getPrecio()){
                    masCaro = l;
                }
            }
        }
        return "el libro mas barato es " +
                masBarato.getTitulo() +
                "y el libro mas caro es " +
                masCaro.getTitulo();
    }
}
