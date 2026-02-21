package org.example.model;
import java.time.Duration;



public class AudioBook extends Book implements Downloadable {

    private Duration duration;
    public AudioBook(String title, String author, double price,Duration duration) {
        super(title, author, price);
        this.setDuration(duration);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {

        if (duration.compareTo(Duration.ZERO) <= 0) {
            throw new IllegalArgumentException("Duration cannot be negative");
        }
        this.duration = duration;
    }

    @Override
    public void readBook() {
        System.out.println("Reading AudioBook as SoundCloud");
    }
    @Override
    public void download() {
        System.out.println("Downloading AudioBook "+ this.getTitle());
    }
}
