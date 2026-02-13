import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1 MENÚ DE TAREAS ");
            System.out.println("1. Añadir una tarea al final");
            System.out.println("2. Insertar una tarea en una posición concreta");
            System.out.println("3. Eliminar una tarea por posición");
            System.out.println("4. Mostrar todas las tareas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la tarea: ");
                    String tarea = sc.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea añadida.");
                    break;

                case 2:
                    System.out.print("Introduce la tarea: ");
                    String nuevaTarea = sc.nextLine();
                    System.out.print("Introduce la posición (empieza en 1): ");
                    int posicion = sc.nextInt();

                    if (posicion < 1 || posicion > tareas.size() + 1) {
                        System.out.println("Error: posición fuera de rango.");
                    } else {
                        tareas.add(posicion - 1, nuevaTarea);
                        System.out.println("Tarea insertada.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce la posición de la tarea a eliminar: ");
                    int eliminar = sc.nextInt();

                    if (eliminar < 1 || eliminar > tareas.size()) {
                        System.out.println("Error: posición fuera de rango.");
                    } else {
                        tareas.remove(eliminar - 1);
                        System.out.println("Tarea eliminada.");
                    }
                    break;

                case 4:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas.");
                    } else {
                        System.out.println("\nLista de tareas:");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
