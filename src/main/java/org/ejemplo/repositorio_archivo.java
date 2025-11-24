package org.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class repositorio_archivo {

    private List<cumple_agenda> Lista = new ArrayList<>();

    public List<cumple_agenda> get_lista() {
        return Lista;
    }

    public void add_cumple(cumple_agenda c) {
        Lista.add(c);
    }

    public cumple_agenda buscar_nombre(String nombre) {
        for (cumple_agenda c : Lista) {
            if (c.get_nombre().equalsIgnoreCase(nombre)) return c;
        }
        return null;
    }

    public List<cumple_agenda> buscar_dia(int dia) {
        List<cumple_agenda> resultado = new ArrayList<>();
        for (cumple_agenda c : Lista) {
            if (c.get_dia() == dia) resultado.add(c);
        }
        return resultado;
    }

    public boolean eliminar_nombre(String nombre) {
        cumple_agenda encontrado = buscar_nombre(nombre);
        if (encontrado != null) {
            Lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
