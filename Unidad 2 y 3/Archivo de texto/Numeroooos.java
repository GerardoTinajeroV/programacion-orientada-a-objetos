    package numeroooos;
    import java.io.File;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

public class Numeroooos {
    private static final String lamadas = "C:\\Users\\Gerar\\OneDrive\\Escritorio\\numeroooos\\lamadas.txt";

    public static void main(String[] args) {
        ArrayList<Llamada> llamadas = new ArrayList<Llamada>();
        Map<String, Integer> llamadasPorExtension = new HashMap<>();

       
        actualizarTabla(llamadasPorExtension, llamadas);

        
        Thread observadorDeCambios = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000); // Intervalo de observación en milisegundos
                    actualizarTabla(llamadasPorExtension, llamadas);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        observadorDeCambios.setDaemon(true);
        observadorDeCambios.start();

       
    }

    public static void actualizarTabla(Map<String, Integer> llamadasPorExtension, ArrayList<Llamada> llamadas) {
        llamadas.clear();
        llamadasPorExtension.clear();

        File archivo = new File(lamadas);
        Scanner s = null;

        try {
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] CortarString = linea.split(" ");

                if (CortarString.length >= 2) {
                    Llamada llamada = new Llamada(CortarString[1]);
                    llamadas.add(llamada);

                    String extension = llamada.getExtension();
                    llamadasPorExtension.put(extension, llamadasPorExtension.getOrDefault(extension, 0) + 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (s != null) {
                s.close();
            }
        }

            System.out.println("Número de Extensión | Número Total de Llamadas");
            System.out.println("-------------------------------------------");

            for (Map.Entry<String, Integer> entry : llamadasPorExtension.entrySet()) {
                System.out.printf("%-20s | %d\n", entry.getKey(), entry.getValue());
            }
        }
    }