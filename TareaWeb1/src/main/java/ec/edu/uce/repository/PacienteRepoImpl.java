package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.repository.modelo.Paciente;

@Transactional
@Repository
public class PacienteRepoImpl implements IPacienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Paciente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public List<Paciente> buscarTodos() {
		TypedQuery<Paciente> myQuery=this.entityManager.createQuery("select e from Paciente",Paciente.class);
		
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Paciente estu) {
		this.entityManager.merge(estu);
	}

	@Override
	public void Insertar(Paciente estu) {
		this.entityManager.persist(estu);
	}

	@Override
	public void Borrar(Integer id) {
		Paciente estu=this.buscar(id);
		this.entityManager.remove(estu);
		
	}

}
