import java.util.*;
import java.io.*;
public class Presupuesto
{
    private String nombre = "Expense Control";
    private Usuario persona;
    private int presupuesto = 3500;
    private ArrayList<Categoria> listaCategorias;
    private Archivo archivo;
    private int gastoTotal;
    private static int saldo;
    private String [] values;
    private static int saldoAhorro = 0;
    public Presupuesto(){
        listaCategorias = new ArrayList();
        persona = new Usuario();
        archivo = new Archivo();
    }
    public void addCategoria(){   //para pruebas solamente
        listaCategorias.add(new Categoria("Alimentacion", 1500, 1200));
        listaCategorias.add(new Categoria("Servicios", 300, 250));
        listaCategorias.add(new Categoria("Transporte", 300, 250));
        listaCategorias.add(new Categoria("Entretenimiento", 200, 150));
        listaCategorias.add(new Categoria("Alquiler", 1000, 1000));
        listaCategorias.add(new Categoria("Internet", 200, 190));
        listaCategorias.add(new Categoria("Alquiler", 1000, 1000));
        mostrar();
    }
    public int tamanioLista(){
        return listaCategorias.size();
    }
    public int getCatoriaInd(int n){
        for (int i = 0; i < listaCategorias.size(); i++){
            listaCategorias.get(n);
        }
        return n;
    }
    public void setNuevoIngreso(int indice, int nuevo){
        for(Categoria e: listaCategorias){
        System.out.println(e);
        }
        listaCategorias.get(indice).setIngreso(nuevo);
    }
    public void setNuevoGasto(int indice, int nuevo){
        listaCategorias.get(indice).setGasto(nuevo);
        //mostrar();
    }
    public int getIngreso(int indice){
        int intIngresoCat = listaCategorias.get(indice).getIngreso();
        return intIngresoCat;
    }
    public void borrarElementoArray(int indice){
        listaCategorias.remove(indice);
    }
    public void addCatManual(Categoria categoria){ //primero se crear un objeto categoria y se mete la cajita aqui
        listaCategorias.add(categoria);
    }
    public void crearCategoria(String a, int b, int c){  //llama a la clase categoria y le pasa parametros
        listaCategorias.add(new Categoria(a,b,c));
        System.out.println("Categoria    " + "Presupuesto  " + "gasto" + "\n" + "\t");
        for(Categoria e: listaCategorias){
        System.out.println(e);
        }
    }
    public int calcularSaldo(){
        int saldoPorCategoria = 0;
        for (int i = 0; i < listaCategorias.size(); i++){
            saldoPorCategoria = ((listaCategorias.get(i).getIngreso()) - (listaCategorias.get(i).getGasto()));
            saldo += saldoPorCategoria;
        }
        //calculator.setGastoTotal(aux);
        System.out.println("Saldo: " + saldo);
        return saldo;
    }
    public int getSaldo(){
        return saldo;    
    }
    public int calcularGastoTotal(){
        for (int i = 0; i < listaCategorias.size(); i++){
            int gastoPorCategoria = (listaCategorias.get(i).getGasto());
            gastoTotal += gastoPorCategoria;
            System.out.println(gastoPorCategoria);
        }
        System.out.println("Gasto Total: " + gastoTotal);
        return gastoTotal;
    }
    public void exceso(){
        int exceso = 0;
        if(gastoTotal > presupuesto){
            exceso = gastoTotal - presupuesto;
            if(exceso < saldo){
                saldo = saldo - exceso;
            }else{
                saldoAhorro = saldoAhorro + saldo - exceso;
            }
        }else{}
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
        for (int i = 0; i < listaCategorias.size(); i++){
            //System.out.println(listaCategorias.get(i)+"\t");
            System.out.println((i) + "\t" + listaCategorias.get(i).toString());
        }
    }
    public ArrayList<Categoria> getCategoria() {
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