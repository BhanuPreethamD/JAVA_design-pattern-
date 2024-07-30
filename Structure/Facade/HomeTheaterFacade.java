package Structure.Facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        amp.on();
        dvd.on();
        projector.on();
        dvd.play(movie);
    }

    public void endMovie() {
        dvd.off();
        projector.off();
        amp.off();
    }
}
