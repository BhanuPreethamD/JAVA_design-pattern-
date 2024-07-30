package Creational.Factory;

public class DocumentFactory {
    public static Document createDocument(String type) {
        switch (type.toLowerCase()) {
            case "word": return new WordDocument();
            case "pdf": return new PdfDocument();
            default: throw new IllegalArgumentException("Unknown document type");
        }
    }
}
