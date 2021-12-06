
import java.util.*;
import java.io.*;
//import java.text.SimpleDateFormat;
public class Presupuesto
{
    private String nombre = "Expense Control";
    private Usuario persona;
    private int presupuesto = 3500;
    private ArrayList<Categoria> listaCat;
    private Archivo archivo;
    private int gastoTotal;
    private static int saldo;
    private String [] values;
    private static int saldoAhorro = 0;
    //private Fecha mes;
    public Presupuesto(){
        listaCat = new ArrayList();//ArrayList<Categoria>();
        persona = new Usuario();
        archivo = new Archivo();
    }
    public void addCategoria(){   //para pruebas solamente
        listaCat.add(new Categoria("Alimentacion", 1500, 1200));
        listaCat.add(new Categoria("Servicios", 300, 250));
        listaCat.add(new Categoria("Transporte", 300, 250));
        listaCat.add(new Categoria("Entretenimiento", 200, 150));
        listaCat.add(new Categoria("Alquiler", 1000, 1000));
        listaCat.add(new Categoria("Internet", 200, 190));
        for (int i = 0; i < listaCat.size(); i++){
            listaCat.get(i);
        }
        //mostrar();
    }
    public int getCatoriaInd(int n){
        for (int i = 0; i < listaCat.size(); i++){
            listaCat.get(n);
        }
        return n;
    }
    public void setNuevoIngreso(int indice, int nuevo){
        listaCat.get(indice).setIngreso(nuevo);
        //mostrar();
    }
    public void setNuevoGasto(int indice, int nuevo){
        listaCat.get(indice).setGasto(nuevo);
        //mostrar();
    }
    public void borrarElementoArray(int indice){
        listaCat.remove(indice);
        mostrar();
    }
    public void addCatManual(Categoria categoria){ //primero se crear un objeto categoria y se mete la cajita aqui
        listaCat.add(categoria);
    }
    public void crearCategoria(String a, int b, int c){  //llama a la clase categoria y le pasa parametros
        listaCat.add(new Categoria(a,b,c));
        System.out.println("Categoria    " + "Presupuesto  " + "gasto" + "\n" + "\t");
        for(Categoria e: listaCat){
        System.out.println(e);
        }
    }
    public int calcularSaldo(){
        int saldoPorCategoria = 0;
        for (int i = 0; i < listaCat.size(); i++){
            saldoPorCategoria = ((listaCat.get(i).getIngreso()) - (listaCat.get(i).getGasto()));
            saldo += saldoPorCategoria;
            System.out.println(saldoPorCategoria);
        }
        //calculator.setGastoTotal(aux);
        System.out.println("Saldo: " + saldo);
        return saldo;
    }
    public int getSaldo(){
        return saldo;    
    }
    public int calcularGastoTotal(){
        for (int i = 0; i < listaCat.size(); i++){
            int gastoPorCategoria = (listaCat.get(i).getGasto());
            gastoTotal += gastoPorCategoria;
            System.out.println(gastoPorCategoria);
        }
        System.out.println("Gasto Total: " + gastoTotal);
        return gastoTotal;
    }
    public void iterator(){
        for (int i = 0; i < listaCat.size(); i++){
            int gastoPorCategoria = (listaCat.get(i).getGasto());
            listaCat.get(i);
        }
    }
    public int gastoTotal(){
        return gastoTotal;
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
        System.out.println("Ind" + "\t" + "Categoria   " + "Presupuesto  " + "gasto" + "\n" + "\t");
        for (int i = 0; i < listaCat.size(); i++){
            //System.out.println(listaCat.get(i)+"\t");
            System.out.println((i) + "\t" + listaCat.get(i).toString());
        }
    }
    public ArrayList<Categoria> getCategoria() {
        return listaCat;
    }

    public String[] getReporte(){
        return Arrays.copyOf(values, values.length);
    }
    
    public void generarReporte2() throws IOException{
        archivo.archivoCrear();
        this.values = new String[listaCat.size()];
        for (int i = 0; i < listaCat.size(); i++) {
            values[i] = listaCat.get(i).toString();
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