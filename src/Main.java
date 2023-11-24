import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       List<Producto> listaProductos =new ArrayList<>();

       Producto producto=new Producto("Producto generico 1",2.3);
       Alimento alimento =new Alimento("Leche",  5,"30/12/2023","30/11/2024");

       Producto producto1=(Producto)alimento;

       String numero="0.2";
       Double numero2 =Double.parseDouble(numero);

       

       listaProductos.add(producto);
       listaProductos.add(alimento);


        }
    }
