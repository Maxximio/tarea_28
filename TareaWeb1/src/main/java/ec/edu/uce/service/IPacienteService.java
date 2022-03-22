package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteService {

	public Paciente buscarService(Integer id);
	
	public List<Paciente> buscarTodosService();
	
	public void actualizarService(Paciente estu);
	
	public void InsertarService(Paciente estu);
	
	public void BorrarService(Integer id);
	
}
