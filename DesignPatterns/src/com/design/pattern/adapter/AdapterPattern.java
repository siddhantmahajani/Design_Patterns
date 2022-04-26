package com.design.pattern.adapter;

public class AdapterPattern {
	public static void main(String[] args) {
		final Audio audio = new Audio();
		audio.play("mp3", "beyond the horizon.mp3");
		audio.play("mp4", "alone.mp4");
		audio.play("vlc", "far far away.vlc");
		audio.play("avi", "mind me.avi");
	}
}
