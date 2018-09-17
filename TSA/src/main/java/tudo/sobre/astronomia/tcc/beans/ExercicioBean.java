package tudo.sobre.astronomia.tcc.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
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

	@PostConstruct
	public void init() {
		exercicio = newExercicio();
		exercicios = getService().getAll();
	}

	public void remove(Exercicio exercicio) {
		getService().remove(exercicio);
		limpar();
	}

	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	public Collection<Exercicio> getExercicios() {
		return exercicios;
	}

	public void setExercicios(Collection<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}

	public void save() {
		getService().save(exercicio);
		limpar();
	}

	public void editar(Long id) {
		this.getExercicio().setId(id);
		save();
	}

	public void limpar() {
		exercicios = getService().getAll();
		exercicio = newExercicio();
	}

	protected Exercicio newExercicio() {
		return new Exercicio();
	}

	public ExerService getService() {
		return service;
	}

}