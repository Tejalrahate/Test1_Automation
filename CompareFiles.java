import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

public class DocFileComparator {

    public static void main(String[] args) {
        String file1Path = "file1.doc";
        String file2Path = "file2.doc";

        try {
            String text1 = extractTextFromDoc(file1Path);
            String text2 = extractTextFromDoc(file2Path);

            if (text1.equals(text2)) {
                System.out.println("The DOC files are identical.");
            } else {
                System.out.println("The DOC files are different.");
            }

        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }

    public static String extractTextFromDoc(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        HWPFDocument doc = new HWPFDocument(fis);
        WordExtractor extractor = new WordExtractor(doc);
        String text = extractor.getText();
        extractor.close();
        return text.trim();
    }
}
