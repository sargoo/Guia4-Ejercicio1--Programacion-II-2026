//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Libreria libreria = new Libreria();
    Scanner sc = new Scanner(System.in);
    System.out.println("=====LIBRERIA===== ");
    System.out.println("Ingrese titulo del libro: ");
    String titulo = sc.nextLine();
    System.out.println("Ingrese autor del libro: ");
    String autor = sc.nextLine();
    System.out.println("Ingrese precio del libro: ");
    double precio = sc.nextDouble();
    System.out.println("Ingrese anio del libro: ");
    sc.nextLine();
    int anio = sc.nextInt();

    System.out.println(libreria.agregarLibro(titulo,autor, precio, anio));
    libreria.mostrarLibros();
    System.out.println(libreria.buscarLibro("rayuela"));
}
