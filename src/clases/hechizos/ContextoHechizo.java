package clases.hechizos;

import clases.personajes.Personaje;
import interfaces.Hechizo;

public class ContextoHechizo {
	private Hechizo hechizo;
	
	public void asignarHechizo(Hechizo hechizo) {
        this.hechizo = hechizo;
    }

    public void ejecutarHechizo(Personaje lanzador, Personaje objetivo) {
        if (hechizo == null) {
            throw new Error("No se ha asignado ningún hechizo.");
        }
        hechizo.ejecutar(lanzador, objetivo);
    }
}
