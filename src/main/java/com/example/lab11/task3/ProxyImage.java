package com.example.lab11.task3;

public class ProxyImage implements MyImage {
    private String fname;
    private RealImage img;

    public ProxyImage(String filename) {
        this.fname = filename;
    }
    
    public void display() {
        if (img == null) {
            img = new RealImage(fname);
        }
        img.display();
    }
}
