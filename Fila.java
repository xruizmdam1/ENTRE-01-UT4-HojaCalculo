
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author - Xabier Ruiz Melero
 *  
 */
public class Fila
{
    // Creación de los atributos id, ingresos, gastos y del objeto fecha de la clase Fecha
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;
    /**
     * Constructor  
     */
    public Fila(String id)    {
        // Inicialización del atributo id con el parámetro id recibido por el método
        // Inicialización de los atributos ingresos, y gastos con valor 0 
        // Inicialización del atributo fecha con valor 1/1/2020
        this.id = id;
        ingresos = 0;
        gastos = 0;
        fecha = new Fecha(1,1,2020);
    }

    /**
     * Constructor  
     */
    public Fila(String id, Fecha fecha, double ingresos, double gastos)    {
        // Inicialización del atributo id con el parámetro id recibido por el método
        // Inicialización de los atributos ingresos, y gastos con los valores recibidos por los
        // parámetros
        // Inicialización del atributo fecha con el valor recibido por el parámetro
        this.id = id;
        this.fecha = fecha;
        this.ingresos = ingresos;
        this.gastos = gastos;
    }

    /**
     * accesor para el id de la fila
     */
    public String getId() {
        // Devolución del valor del atributo nombre
        return this.id;
    }

    /**
     * accesor para la fecha
     */
    public Fecha getFecha() {
        // Devolución del valor del atributo fecha
        return this.fecha;
    }

    /**
     * accesor para los ingresos
     */
    public double getIngresos() {
        // Devolución del valor del atributo ingresos
        return this.ingresos;
    }

    /**
     * accesor para los gastos
     */
    public double getGastos() {
        // Devolución del valor del atributo gastos
        return this.gastos;
    }

    /**
     * calcula y devuelve el beneficio
     */
    public double getBeneficio() {
        // Devolución del valor del atributo beneficio mediante la operación (ingresos - gastos)
        return this.ingresos - this.gastos;
    }

    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     * 
     */
    public Fila duplicar() {
        // Duplicar fila con los mismos parámetros que el objeto actual
        Fila filaDuplicada = new Fila(id, fecha, ingresos, gastos);
        return filaDuplicada;
    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString() { 
        // Representación de una linea de una fila
        String idFormat = String.format("%10s %12s", id, fecha);
        String ingresosFormat = String.format("%15.2f€", ingresos);
        String gastosFormat = String.format("%15.2f€", gastos );
        String beneficioFormat = String.format("%15.2f€", getBeneficio());
        
        if (getBeneficio() < 0){ // Los asteriscos se añaden cuando es negativo
            String ast = " **";
            return (idFormat + ingresosFormat + gastosFormat + beneficioFormat) 
                   + ast;
        }
        
        return idFormat + ingresosFormat + gastosFormat + beneficioFormat;
    }
}