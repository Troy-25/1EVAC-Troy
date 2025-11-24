package org.ejemplo;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        repositorio_archivo Repo = new repositorio_archivo();
        Scanner Sc = new Scanner(System.in);
        boolean Salir = false;

        while (!Salir) {
            System.out.println("\n=== AGENDA ===");
            System.out.println("1. Listar");
            System.out.println("2. Buscar por día");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Añadir");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");

            String Opcion = Sc.nextLine();

            switch (Opcion) {
                case "1":
                    for (cumple_agenda c : Repo.get_lista()) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "2":
                    System.out.print("Día: ");
                    for (cumple_agenda c : Repo.buscar_dia(Integer.parseInt(Sc.nextLine()))) {
                        System.out.println(c.get_nombre());
                    }
                    break;

                case "3":
                    System.out.print("Nombre: ");
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
