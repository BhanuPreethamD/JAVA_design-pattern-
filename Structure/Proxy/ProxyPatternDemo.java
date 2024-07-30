package Structure.Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");
        image.display(); // Loading photo.jpg, Displaying photo.jpg
        image.display(); // Displaying photo.jpg
    }
}
