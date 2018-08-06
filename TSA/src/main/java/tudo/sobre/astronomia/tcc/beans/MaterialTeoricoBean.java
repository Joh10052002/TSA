package tudo.sobre.astronomia.tcc.beans;

import java.util.ArrayList;

import tudo.sobre.astronomia.tcc.MaterialTeorico;

public class MaterialTeoricoBean {

	// atributos

	private ArrayList<MaterialTeorico> materiaisTeoricos = new ArrayList<MaterialTeorico>();
	private ArrayList<MaterialTeorico> mtFiltrados = materiaisTeoricos;
	private String idMt;
	private String nomeMt;
	private MaterialTeorico materialTeorico = new MaterialTeorico(idMt, nomeMt);

	// Get e Set

	public MaterialTeorico getVideo() {
		return materialTeorico;
	}

	public void setMaterialTeorico(MaterialTeorico materialTeorico) {
		this.materialTeorico = materialTeorico;
	}

	// Metodos

	public void addMaterialTeorico() {
		materiaisTeoricos.add(materialTeorico);
		materialTeorico = new MaterialTeorico(idMt, nomeMt);
	}

	public void todosMaterialTeorico() {
		mtFiltrados = materiaisTeoricos;
	}

	public void buscarMaterialTeorico() {
		mtFiltrados = new ArrayList<>();
		for (MaterialTeorico mt : materiaisTeoricos) {
			if (mt.getNomeMT().contains(materialTeorico.getNomeMT())) {
				mtFiltrados.add(mt);
			}
		}
	}

	public void removeMaterialTeorico(String nomeMt) {
		for (MaterialTeorico materialTeorico : materiaisTeoricos) {
			if (materialTeorico.getNomeMT().equals(nomeMt)) {
				materiaisTeoricos.remove(materialTeorico);
				return;
			}
		}
	}

	public ArrayList<MaterialTeorico> getVideos() {
		return materiaisTeoricos;
	}

	public ArrayList<MaterialTeorico> getMtFiltrados() {
		return mtFiltrados;
	}
}
