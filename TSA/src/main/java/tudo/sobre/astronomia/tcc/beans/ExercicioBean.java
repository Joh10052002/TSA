package tudo.sobre.astronomia.tcc.beans;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import tudo.sobre.astronomia.tcc.Exercicio;

@ManagedBean
@ApplicationScoped
public class ExercicioBean {
	
	// atributos 
	
	private ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
	private ArrayList<Exercicio> exerciciosFiltrados = exercicios;
	private String idExer;
	private String nomeExer;
	private Exercicio exercicio = new Exercicio(idExer, nomeExer);
	 
	// Get e Set
	
	public Exercicio getExercicio() {
		return exercicio;
	}
	
	public void setExercicio (Exercicio exercicio) {
		this.exercicio = exercicio;
	}
	
	// Metodos
	
	public void addExercicio() {
		exercicios.add(exercicio);
		exercicio = new Exercicio(idExer, nomeExer);
	}
	
	public void todosExercicios() {
		exerciciosFiltrados = exercicios;
	}
	
	public void buscarExercicio() {
		exerciciosFiltrados = new ArrayList<>();
		for (Exercicio exer: exercicios) {
			if(exer.getNomeExer().contains(exercicio.getNomeExer())) {
				exerciciosFiltrados.add(exer);
			} 
		}
	}
	
	
	public void removeExercicio(String nomeExer) {
		for (Exercicio exercicio : exercicios) {
			if(exercicio.getNomeExer().equals(nomeExer)) {
				exercicios.remove(exercicio);
				return;
			}
		}
	}
	
	
	public ArrayList<Exercicio> getExercicios() {
		return exercicios;
	}
		
	
	public ArrayList<Exercicio> getExercicicosFiltrados() {
		return exerciciosFiltrados;
	}
}

	
	
