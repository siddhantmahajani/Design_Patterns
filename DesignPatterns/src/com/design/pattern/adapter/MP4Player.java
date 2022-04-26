package com.design.pattern.adapter;

public class MP4Player implements AdvancedMediaPlayer {
	
	@Override
	public void playVlc(final String filename) {
		// do nothing
	}
	
	@Override
	public void playMp4(final String filename) {
		System.out.println("Playing MP4 file with name: " + filename);
	}
}
