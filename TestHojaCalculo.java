
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Xabier Ruiz Melero
 *  
 */
public class TestHojaCalculo
{

    /**
     * Constructor  
     */
    public TestHojaCalculo()    {

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el primer constructor  
     * de fila  
     */
    public void test1() {
        // Crear la Hoja con sus filas y realiza un println
        HojaCalculo hoja1 = new HojaCalculo("HOJA1");
        Fecha fecha1 = new Fecha(4,10,2020);
        Fila fila1 = new Fila("Fila 1", fecha1, 25.50, 132);
        Fecha fecha2 = new Fecha(5,10,2020);
        Fila fila2 = new Fila("Fila 2", fecha2, 300, 350);
        Fecha fecha3 = new Fecha(1,1,2020);
        Fila fila3 = new Fila("Fila 3", fecha3, 0, 0);
        hoja1.addFila(fila1);
        hoja1.addFila(fila2);
        hoja1.addFila(fila3);
        System.out.println(hoja1.toString() + "\n");
        System.out.println(hoja1.duplicarHoja());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
        
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
        
    }
}