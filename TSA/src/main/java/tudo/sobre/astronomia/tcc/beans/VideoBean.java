package tudo.sobre.astronomia.tcc.beans;

import java.util.ArrayList;

import tudo.sobre.astronomia.tcc.Video;

public class VideoBean {

	// atributos

	private ArrayList<Video> videos = new ArrayList<Video>();
	private ArrayList<Video> videosFiltrados = videos;
	private String idVid;
	private String nomeVid;
	private Video video = new Video(idVid, nomeVid);

	// Get e Set

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	// Metodos

	public void addExercicio() {
		videos.add(video);
		video = new Video(idVid, nomeVid);
	}

	public void todosVideos() {
		videosFiltrados = videos;
	}

	public void buscarVideo() {
		videosFiltrados = new ArrayList<>();
		for (Video vid : videos) {
			if (vid.getNomeVid().contains(video.getNomeVid())) {
				videosFiltrados.add(vid);
			}
		}
	}

	public void removeVideo(String nomeVid) {
		for (Video video : videos) {
			if (video.getNomeVid().equals(nomeVid)) {
				videos.remove(video);
				return;
			}
		}
	}

	public ArrayList<Video> getVideos() {
		return videos;
	}

	public ArrayList<Video> getVideosFiltrados() {
		return videosFiltrados;
	}
}
