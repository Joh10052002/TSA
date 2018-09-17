package tudo.sobre.astronomia.tcc.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import TSA.Services.VidService;
import tudo.sobre.astronomia.tcc.Video;

@ViewScoped
@Named
public class VideoBean implements Serializable {

	@Inject
	private VidService service;

	protected Video video;

	protected Collection<Video> videos;

	public VideoBean() {
	}

	@PostConstruct
	public void init() {
		video = newVideo();
		videos = getService().getAll();
	}

	public void remove(Video video) {
		getService().remove(video);
		limpar();
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Collection<Video> getVideos() {
		return videos;
	}

	public void setVideos(Collection<Video> videos) {
		this.videos = videos;
	}

	public void save() {
		getService().save(video);
		limpar();
	}

	public void editar(Long id) {
		this.getVideo().setId(id);
		save();
	}

	public void limpar() {
		videos = getService().getAll();
		video = newVideo();
	}

	protected Video newVideo() {
		return new Video();
	}

	public VidService getService() {
		return service;
	}

}
