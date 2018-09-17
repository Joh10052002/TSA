package tudo.sobre.astronomia.tcc.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import TSA.Services.MTService;
import tudo.sobre.astronomia.tcc.MaterialTeorico;

@ViewScoped
@Named
public class MaterialTeoricoBean implements Serializable {

	@Inject
	private MTService service;

	protected MaterialTeorico materialTeorico;

	protected Collection<MaterialTeorico> materiaisTeoricos;

	public MaterialTeoricoBean() {
	}

	@PostConstruct
	public void init() {
		materialTeorico = newMaterialTeorico();
		materiaisTeoricos = getService().getAll();
	}

	public void remove(MaterialTeorico materialTeorico) {
		getService().remove(materialTeorico);
		limpar();
	}

	public MaterialTeorico getMaterialTeorico() {
		return materialTeorico;
	}

	public void setMaterialTeorico(MaterialTeorico materialTeorico) {
		this.materialTeorico = materialTeorico;
	}

	public Collection<MaterialTeorico> getMateriaisTeoricos() {
		return materiaisTeoricos;
	}

	public void setMateriaisTeoricos(Collection<MaterialTeorico> materiaisTeoricos) {
		this.materiaisTeoricos = materiaisTeoricos;
	}

	public void save() {
		getService().save(materialTeorico);
		limpar();
	}

	public void editar(Long id) {
		this.getMaterialTeorico().setId(id);
		save();
	}

	public void limpar() {
		materiaisTeoricos = getService().getAll();
		materialTeorico = newMaterialTeorico();
	}

	protected MaterialTeorico newMaterialTeorico() {
		return new MaterialTeorico();
	}

	public MTService getService() {
		return service;
	}

}
