package Creational.Factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.createDocument("word");
        wordDoc.open(); // Opening Word document.

        Document pdfDoc = DocumentFactory.createDocument("pdf");
        pdfDoc.open(); // Opening PDF document.
    }
}

