package com.example.spring_3_3_3.designPattern.samples.facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
