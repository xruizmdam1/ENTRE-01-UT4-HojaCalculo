
/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author - Xabier Ruiz Melero
 *  
 */
public class HojaCalculo
{
    // Creación del atributo nombre y de los objetos fila(x) de la clase Fila
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;
    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        // Inicialización del atributo nombre con el parámetro nombre recibido por el método
        // e inicialización de los atributos fila con valor "null"
        this.nombre = nombre;
        this.fila1 = null;
        this.fila2 = null;
        this.fila3 = null;
    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        // Devolución del valor del atributo nombre
        return this.nombre;
    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        // Devolución del valor del atributo fila1
        return fila1;
    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        // Devolución del valor del atributo fila2
        return fila2;
    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        // Devolución del valor del atributo fila3
        return fila3;
    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() {
        // Este método devuelve cuantas filas existen en la hoja (Teniendo en
        // cuenta las que estan en valor "null"

        // ** La primera condición dice que si las 3 filas tienen valor "null", 
        // devolverá 0 ya que no tienen ningún valor asignado. 

        // ** La segunda condición dice que si la primera fila tiene un valor
        // (ya sea con parámetros recibidos por el usuario o por el propio objeto de la clase Fila)
        // y las restantes tienen valor "null", devolverá 1

        // ** La tercera condición dice que si la primera fila y la segunda fila tienen un valor
        // (ya sea con parámetros recibidos por el usuario o por el propio objeto de la clase Fila)
        // y la tercera tiene valor "null", devolverá 2

        // El "else" devolverá 3 en el caso de que ninguna de las filas tengan valor "null"
        if (this.fila1 == null && this.fila2 == null && this.fila3 == null){
            return 0;
        }
        else if (this.fila1 != null && this.fila2 == null && this.fila3 == null){
            return 1;
        }
        else if (this.fila1 != null && this.fila2 != null && this.fila3 == null){
            return 2;
        }
        else{
            return 3;
        }
    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
        // El método devolverá "true" en el caso de que las tres filas tengan un valor asignado
        // La condición dice que si los valores de las tres filas no son "null", devolverá "true"
        // En caso de que una sola fila de "null", este método devolverá "false"
        if (fila1 != null && fila2 != null && fila3 != null){
            return true;
        }
        return false;
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
        // Introduce las filas en sus huecos (Con los parámetros de un objeto de la clase Fila)
        // Este método está así construido así porque sigue un patrón:
        // - Si se añade una nueva fila (teniendo en cuenta que las filas de la 
        // hoja estan en valor "null", esta se añadirá al primer atributo de la lista,
        // esto es, "fila1".
        // - Si "fila1" está lleno, el nuevo objeto de la clase Fila pasará al segundo atributo,
        // esto es, "fila2"
        // - Si "fila2" está lleno, el nuevo objeto de la clase Fila pasará al segundo atributo,
        // esto es, "fila3"
        if (this.fila1 == null){
            fila1 = fila;
        }
        else if (this.fila1 != null && this.fila2 == null){
            fila2 = fila;
        }
        else if (this.fila1 != null && this.fila2 != null && this.fila3 == null){
            fila3 = fila;
        }

        // Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
        if (getNumeroFilas() >= 4){
            System.out.println(fila.getId() + " no se puede añadir en " + this.nombre + "\n");
        }
    }

    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
        // Introduce las filas en sus huecos (Con los parámetros recibidos por el usuario)
        // Este método está así construido porque sigue un patrón:
        // - Si se añade una nueva fila (teniendo en cuenta que las filas de la 
        // hoja estan en valor "null", esta se añadirá al primer atributo de la lista,
        // esto es, "fila1".
        // - Si "fila1" está lleno, el nuevo objeto de la clase Fila pasará al segundo atributo,
        // esto es, "fila2"
        // - Si "fila2" está lleno, el nuevo objeto de la clase Fila pasará al segundo atributo,
        // esto es, "fila3"
        if (this.fila1 == null){
            fila1 = new Fila(id, fecha, ingresos, gastos);
        }
        else if (this.fila2 == null){
            fila2 = new Fila(id, fecha, ingresos, gastos);
        }
        else if (this.fila3 == null){
            fila3 = new Fila(id, fecha, ingresos, gastos);
        }
    }

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {
        return fila1.getIngresos() + fila2.getIngresos() + fila3.getIngresos();
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        return fila1.getGastos() + fila2.getGastos() + fila3.getGastos();
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        return fila1.getBeneficio() + fila2.getBeneficio() + fila3.getBeneficio();
    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {
        // Para el return
        String str1 = (nombre) + "\n";

        // Representación de cada bloque
        String nombre1 = "FECHA";
        String nombre2 = "INGRESOS";
        String nombre3 = "GASTOS";
        String nombre4 = "BENEFICIO";

        // Representación del contenido
        String str2 = String.format("%23s %15s %15s %15s\n", nombre1, nombre2, nombre3, nombre4);
        String str3 = fila1.toString() + "\n" + fila2.toString() + "\n" + fila3.toString();
        String str4 = String.format("%38.2f€ %14.2f€ %14.2f€", getTotalIngresos(), getTotalGastos(), getBeneficio());

        // Espaciado 
        String lineas = "\n-----------------------------------------------------------------------------\n";

        // Representación textual mediante println
        System.out.println(str1 + str2 + str3 + lineas + str4);
        // Devuelve "Resultado" en return pero en println devuelve la representación textual
        return "";
    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {
        HojaCalculo hojaDuplicada =  new HojaCalculo ("Duplicada " + nombre);
        hojaDuplicada.fila1 = fila1;
        hojaDuplicada.fila2 = fila2;
        hojaDuplicada.fila3 = fila3;
        return hojaDuplicada;
    }
}