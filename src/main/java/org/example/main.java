package org.example;

import java.util.Scanner;

public class main {

    public static final String AGENDA = "\n=== AGENDA ===";
    public static final String LISTAR = "1. Listar";
    public static final String BUSCAR_POR_DÍA = "2. Buscar por día";
    public static final String BUSCAR_POR_NOMBRE = "3. Buscar por nombre";
    public static final String AÑADIR = "4. Añadir";
    public static final String ELIMINAR = "5. Eliminar";
    public static final String SALIR = "6. Salir";
    public static final String DÍA = "Día: ";
    public static final String NOMBRE = "Nombre: ";

    public static void main(String[] args) {

        repo_file Repo = new repo_file();
        Scanner Sc = new Scanner(System.in);
        boolean Salir = false;

        while (!Salir) {
            System.out.println(AGENDA);
            System.out.println(LISTAR);
            System.out.println(BUSCAR_POR_DÍA);
            System.out.println(BUSCAR_POR_NOMBRE);
            System.out.println(AÑADIR);
            System.out.println(ELIMINAR);
            System.out.println(SALIR);

            String Opcion = Sc.nextLine();

            switch (Opcion) {
                case "1":
                    for (cumple_agenda c : Repo.get_lista()) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "2":
                    System.out.print(DÍA);
                    for (cumple_agenda c : Repo.buscar_dia(Integer.parseInt(Sc.nextLine()))) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "3":
                    System.out.print(NOMBRE);
                    cumple_agenda c = Repo.buscar_nombre(Sc.nextLine());
                    if (c != null) System.out.println(c.get_nombre());
                    break;

                case "4":
                    System.out.print("Nombre: ");
                    String N = Sc.nextLine();
                    System.out.print("Día: ");
                    int D = Integer.parseInt(Sc.nextLine());
                    System.out.print("Mes: ");
                    int M = Integer.parseInt(Sc.nextLine());
                    Repo.add_cumple(new cumple_agenda(N, D, M));
                    break;

                case "5":
                    System.out.print("Eliminar nombre: ");
                    Repo.eliminar_nombre(Sc.nextLine());
                    break;

                case "6":
                    Salir = true;
                    break;
            }
        }
    }
}
