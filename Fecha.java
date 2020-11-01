
/**
 *  Modela una fecha
 *  
 *  @author - Xabier Ruiz Melero
 */
public class Fecha
{
    // Creación de los atributos día, mes y año
    private int dia;
    private int mes;
    private int año;
    /**
     * constructor  
     */
    public Fecha(int dia, int mes, int año)
    {
        // Inicialización de los atributos día, mes y año con los parámetros recibidos
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }   

    /**
     * accesor para  el día   
     */
    public int getDia()
    {
        // Devolución del valor del atributo día
        return dia;
    }

    /**
     * accesor para  el mes 
     */
    public int getMes()
    {
        // Devolución del valor del atributo mes
        return mes;
    }

    /**
     * accesor para  el año  
     */
    public int getAño()
    {
        // Devolución del valor del atributo año
        return año;
    }

    /**
     * mutador para el dia
     */
    public void setDia(int dia)
    {
        // Mutador para el atributo día
        this.dia = dia;
    }

    /**
     * mutador para el mes
     */
    public void setMes(int mes)
    {
        // Mutador para el atributo mes
        this.mes = mes;
    }

    /**
     * mutador para el año
     */
    public void setAño(int año)
    {
        // Mutador para el atributo año
        this.año = año;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Fecha obtenerCopia() {
        // Duplicar fecha con los mismos parámetros que el objeto actual
        Fecha fecha = new Fecha(this.dia, this.mes, this.año);
        return fecha;
    }

    /**
     * 
     */
    public String toString() {
        // Devuelve el valor de Fecha
        return this.dia + "/"  + this.mes+ "/" + this.año;
    }
}