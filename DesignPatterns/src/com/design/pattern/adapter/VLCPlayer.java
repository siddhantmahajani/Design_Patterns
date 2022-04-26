package com.design.pattern.adapter;

public class VLCPlayer implements AdvancedMediaPlayer {
	
	@Override
	public void playVlc(final String filename) {
		System.out.println("Playing VLC media file with name: " + filename);
	}
	
	@Override
	public void playMp4(final String filename) {
		// do nothing
	}
}
