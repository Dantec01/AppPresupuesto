import java.util.*;
import java.io.*;
public class Presupuesto
{
    private Usuario persona;
    private int presupuesto = 0;
    private int gastoTotal;
    private int saldo;
    private int saldoAhorro = 0;
    private ArrayList<Categoria> listaCategorias;
    private Archivo archivo;
    private String [] values;
    public Presupuesto(int presupuesto){
        listaCategorias = new ArrayList();
        persona = new Usuario();
        archivo = new Archivo();
        this.presupuesto = presupuesto;
    }
    public void setPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }
    public String addCatManual(Categoria categoria){                         //primero se crear un objeto categoria y se mete la cajita aqui
        listaCategorias.add(categoria);
        mostrar();
        calcularGastoTotal();
        return gastoExcedido();
    }
    public void addCategoria2(){   //para pruebas solamente
        listaCategorias.add(new Categoria("Alimentacion", 1500, 1200));
        listaCategorias.add(new Categoria("Servicios", 300, 250));
        listaCategorias.add(new Categoria("Transporte", 300, 250));
        listaCategorias.add(new Categoria("Entretenimiento", 200, 150));
        listaCategorias.add(new Categoria("Alquiler", 1000, 1000));
        listaCategorias.add(new Categoria("Internet", 200, 190));
        //listaCategorias.add(new Categoria("Estudios", 400, 500));
        mostrar();
    }
    public String crearCategoria(String a, int b, int c){  //llama a la clase categoria y le pasa parametros
        listaCategorias.add(new Categoria(a,b,c));
        mostrar();
        calcularGastoTotal();
        return gastoExcedido();
    }
    public int calcularGastoTotal(){
        gastoTotal = 0;
        for (int i = 0; i < listaCategorias.size(); i++){
            int gastoPorCategoria = (listaCategorias.get(i).getGasto());
            gastoTotal += gastoPorCategoria;
            //System.out.println(gastoPorCategoria);
        }
        //System.out.println("Gasto Total: " + gastoTotal);
        return gastoTotal;
    }
    public int calcularSaldo(){
        saldo = 0;
        int saldoPorCategoria = 0;
        if(gastoTotal < presupuesto){
            for (int i = 0; i < listaCategorias.size(); i++){
                saldoPorCategoria = ((listaCategorias.get(i).getIngreso()) - (listaCategorias.get(i).getGasto()));
                saldo += saldoPorCategoria;
                System.out.println(listaCategorias.get(i) + "\t" + saldoPorCategoria);
            }
            System.out.println("Saldo: " + saldo);
        }
        return saldo;
    }
    public String gastoExcedido(){
        int gastoExcedido = 0;
        String respuesta;
        if(gastoTotal > presupuesto){
            gastoExcedido = gastoTotal - presupuesto;
            respuesta = "Presupuesto Excedido con: " + gastoExcedido + " bs.";
        }else{
            respuesta = "Correcto";
        }
        return respuesta;
    }
    public int getCatoriaInd(int n){
        for (int i = 0; i < listaCategorias.size(); i++){
            listaCategorias.get(n);
        }
        return n;
    }
    public void setNuevoIngreso(int indice, int nuevo){
        listaCategorias.get(indice).setIngreso(nuevo);
        mostrar();
    }
    public void setNuevoGasto(int indice, int nuevo){
        listaCategorias.get(indice).setGasto(nuevo);
        mostrar();
    }
    public int getIngreso(int indice){
        int intIngresoCat = listaCategorias.get(indice).getIngreso();
        return intIngresoCat;
    }
    public void borrarElementoArray(int indice){
        listaCategorias.remove(indice);
    }
    
    public int getSaldo(){
        return saldo;    
    }
    
    public int gastoTotal(){
        return gastoTotal;
    }
    public void setGastoTotal(int gastoTotal){
        this.gastoTotal = gastoTotal;
    }
    public int ahorro(){
        if(saldo > 0){
            saldoAhorro =+ saldo;
        }else{
            System.out.println("Saldo para ahorrar insuficiente");
        }
        saldo = 0;
        return saldoAhorro;
    }
    public void mostrar(){
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("---------------------------------------------------");
        System.out.println("Ind" + "\t" + "Categoria   " + "Presupuesto  " + "gasto" + "\n" + "\t");
        for (int i = 0; i < listaCategorias.size(); i++){
            //System.out.println(listaCategorias.get(i)+"\t");
            System.out.println((i) + "\t" + listaCategorias.get(i).toString());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Gasto total: " + gastoTotal + "\t"  + "Saldo: " + saldo + "\t"  + "Ahorro: " + saldoAhorro);
    }
    private ArrayList<Categoria> getCategoria() {
        return listaCategorias;
    }
    public String[] getReporte(){
        return Arrays.copyOf(values, values.length);
    }
    public void generarReporte2() throws IOException{
        archivo.crearArchivo("prueba");
        this.values = new String[listaCategorias.size()];
        for (int i = 0; i < listaCategorias.size(); i++) {
            values[i] = listaCategorias.get(i).toString();
            //System.out.println(categoria.get(i).toString());
        }  
        FileWriter fichero = new FileWriter(archivo.ruta());
        for(int i = 0; i < values.length; i++){
            fichero.write(  values[i] + "\n" + "\t" );
        }
        fichero.close();
        String contenido;
        FileReader file = new FileReader(archivo.ruta());
        BufferedReader buffer = new BufferedReader(file);
        while((contenido = buffer.readLine())!= null){
            System.out.println(contenido);
        }
        file.close();
        buffer.close();
    }
}