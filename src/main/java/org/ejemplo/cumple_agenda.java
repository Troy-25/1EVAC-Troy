package org.ejemplo;

public class cumple_agenda {

    private String Nombre;
    private int Dia;
    private int Mes;

    public cumple_agenda(String Nombre, int Dia, int Mes) {
        this.Nombre = Nombre;
        this.Dia = Dia;
        this.Mes = Mes;
    }

    public String get_nombre() {
        return Nombre;
    }

    public int get_dia() {
        return Dia;
    }

    public int get_mes() {
        return Mes;
    }
}
