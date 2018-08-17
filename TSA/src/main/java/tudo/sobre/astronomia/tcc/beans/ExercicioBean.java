package tudo.sobre.astronomia.tcc.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import TSA.Services.ExerService;
import tudo.sobre.astronomia.tcc.Exercicio;

@ViewScoped
@Named
public class ExercicioBean implements Serializable {
	

	@Inject
	private ExerService service;

	protected Exercicio exercicio;

	protected Collection<Exercicio> exercicios;

	public ExercicioBean() {
	}
	
	
	 
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

	
	
