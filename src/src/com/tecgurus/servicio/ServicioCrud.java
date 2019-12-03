package src.com.tecgurus.servicio;

import java.util.List;

public interface ServicioCrud {

	Object crear(Object objetoNuevo);
	Object actualizar(Object objetoActualizar);
	Object obtenerPorId(Object objetoActualizar);
	Object obtenerTodos();
}
