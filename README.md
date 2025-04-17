# import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFExtractor {

    public static void main(String[] args) {
        // Path to the PDF file
        String filePath = "sample.pdf";

        try {
            // Load PDF document
            File file = new File(filePath);
            PDDocument document = PDDocument.load(file);

            // Instantiate PDFTextStripper
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Extract text
            String text = pdfStripper.getText(document);

            // Print the extracted text
            System.out.println("Extracted text from PDF:\n");
            System.out.println(text);

            // Close document
            document.close();

        } catch (IOException e) {
            System.err.println("Error while reading PDF: " + e.getMessage());
        }
    }
}
