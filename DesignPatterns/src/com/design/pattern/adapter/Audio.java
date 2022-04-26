package com.design.pattern.adapter;

public class Audio implements MediaPlayer {
	
	Media media;
	
	@Override
	public void play(final String audioType, final String filename) {
		if ("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("Playing mp3 file with name: " + filename);
		} else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
			media = new Media(audioType);
			media.play(audioType, filename);
		} else {
			System.out.println("Invalid media format. " + audioType + " not supported.");
		}
	}
}
