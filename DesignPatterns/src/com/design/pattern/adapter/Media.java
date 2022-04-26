package com.design.pattern.adapter;

public class Media implements MediaPlayer {
	
	AdvancedMediaPlayer advMediaPlayer;
	
	public Media(final String audioType) {
		switch (audioType) {
			case "vlc":
				advMediaPlayer = new VLCPlayer();
				break;
			case "mp4":
				advMediaPlayer = new MP4Player();
				break;
		}
	}
	
	@Override
	public void play(final String audioType, final String filename) {
		switch (audioType) {
			case "vlc":
				advMediaPlayer.playVlc(filename);
				break;
			case "mp4":
				advMediaPlayer.playMp4(filename);
				break;
		}
	}
}
