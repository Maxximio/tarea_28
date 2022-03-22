package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteRepo {

	public Paciente buscar(Integer id);
	
	public List<Paciente> buscarTodos();
	
	public void actualizar(Paciente estu);
	
	public void Insertar(Paciente estu);
	
	public void Borrar(Integer id);
	
}
