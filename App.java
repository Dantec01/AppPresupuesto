import java.util.ArrayList;
//import java.text.SimpleDateFormat;
public class App
{
    private String nombre = "Survivor";
    private Usuario persona;
    private int presupuesto = 3500;
    private ArrayList<Categoria> listaCat;// = new ArrayList();
    private Calculadora calculadora;
    private int gastoTotal;
    private int saldo;
    private String [] values;
    //private Fecha mes;
    public App(){
        listaCat = new ArrayList<Categoria>();
        calculadora = new Calculadora();
        persona = new Usuario();
    }
    public void addCategoria(){
        listaCat.add(new Categoria("Alimentacion", 1000, 700));
        listaCat.add(new Categoria("Servicios", 300, 150));
        listaCat.add(new Categoria("Transporte", 300, 250));
        listaCat.add(new Categoria("Entretenimiento", 300, 200));
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
    public void calcularGastoCategoria(){
        //int num1 = listaCat.get(1).getIngreso();
        //int num2 = listaCat.get(1).getGasto();
        for (int i = 0; i < listaCat.size(); i++){
            int resta = calculadora.gastoPorCategoria((listaCat.get(i).getIngreso()), (listaCat.get(i).getGasto()));
            gastoTotal += resta;
            System.out.println(listaCat.get(i)+" - "+resta);
        }
        //calculator.setGastoTotal(aux);
        System.out.println("Gasto total: " + gastoTotal + " Saldo: " + saldo);
    }
    public int getSaldo(){
        return saldo;    
    }
    public void calcularSaldo(){
        saldo = calculadora.calcularSaldo(presupuesto, gastoTotal);
        System.out.println(saldo);
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
    /*public String getMes(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        String getMes = sdf.format(mes);
        return getMes;
    }*/
    
    public void generarReporte(){
        this.values = new String[listaCat.size()];
        for (int i = 0; i < listaCat.size(); i++) {
            values[i] = listaCat.get(i).toString();
            //System.out.println(categoria.get(i).toString());
        }
    }
    
    public String[] getReporte(){
        return values;
    }
}