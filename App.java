
import java.util.*;
import java.io.*;
//import java.text.SimpleDateFormat;
public class App
{
    private String nombre = "Expense Control";
    private Usuario persona;
    private int presupuesto = 3500;
    private ArrayList<Categoria> listaCat;// = new ArrayList();
    private Calculadora calculadora;
    private escritor escritor1;
    private int gastoTotal;
    private int saldo;
    private String [] values;
    //private Fecha mes;
    public App(){
        listaCat = new ArrayList<Categoria>();
        calculadora = new Calculadora();
        persona = new Usuario();
        escritor1 = new escritor();
    }
    public void addCategoria(){
        listaCat.add(new Categoria("Alimentacion", 1500, 1200));
        listaCat.add(new Categoria("Servicios", 300, 250));
        listaCat.add(new Categoria("Transporte", 300, 250));
        listaCat.add(new Categoria("Entretenimiento", 200, 150));
        listaCat.add(new Categoria("Alquiler", 1000, 1000));
        listaCat.add(new Categoria("Internet", 200, 190));
        for (int i = 0; i < listaCat.size(); i++){
            listaCat.get(i);
        }
        mostrar();
    }
    public void setNuevosDatos(int indice, int nuevo){
        listaCat.get(indice).setIngreso(nuevo);
        mostrar();
    }
    public void borrarElementoArray(int indice){
        listaCat.remove(indice);
        mostrar();
    }
    public void crearCategoria(String a, int b, int c){  //llama a la clase categoria y le pasa parametros
        listaCat.add(new Categoria(a,b,c));
        System.out.println("Categoria    " + "Presupuesto  " + "gasto" + "\n" + "\t");
        for(Categoria e: listaCat){
        System.out.println(e);
        }
    }
    public void calcularSaldo(){
        int saldoPorCategoria = 0;
        for (int i = 0; i < listaCat.size(); i++){
            saldoPorCategoria = ((listaCat.get(i).getIngreso()) - (listaCat.get(i).getGasto()));
            saldo += saldoPorCategoria;
            System.out.println(saldoPorCategoria);
        }
        //calculator.setGastoTotal(aux);
        System.out.println("Saldo: " + saldo);
    }
    public int getSaldo(){
        return saldo;    
    }
    public void calcularGastoTotal(){
        for (int i = 0; i < listaCat.size(); i++){
            int gastoPorCategoria = (listaCat.get(i).getGasto());
            gastoTotal += gastoPorCategoria;
            System.out.println(gastoPorCategoria);
        }
        System.out.println("Gasto Total: " + gastoTotal);
    }
    public int ahorro(){
        calcularSaldo();
        int saldoAhorro = 0;
        if(saldo>0){
            saldoAhorro += saldo;
        }else{
            
        }
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
    
    public void generarReporte(){
        this.values = new String[listaCat.size()];
        for (int i = 0; i < listaCat.size(); i++) {
            values[i] = listaCat.get(i).toString();
            //System.out.println(categoria.get(i).toString());
        }   
    }
    
    public String[] getReporte(){
        return Arrays.copyOf(values, values.length);
    }
    
    public void generarReporte2() throws IOException{
        escritor1.Crear();
        FileWriter fichero = new FileWriter(escritor1.ruta());
        for(int i = 0; i < values.length; i++){
            fichero.write(  values[i] + "\n" + "\t" );
            

        }
        fichero.close();
        String contenido;
        FileReader file = new FileReader(escritor1.ruta());
        BufferedReader buffer = new BufferedReader(file);
        while((contenido = buffer.readLine())!= null){
            System.out.println(contenido);
        }
        file.close();
        buffer.close();
    
    }
}