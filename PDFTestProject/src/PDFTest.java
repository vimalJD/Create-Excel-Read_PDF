import java.io.IOException;

public class PDFTest {

	public static void main(String[] args) throws IOException {

		PDFManager pdfManager = new PDFManager();
	       pdfManager.setFilePath("H:/java_tutorial.pdf");
	       System.out.println(pdfManager.toText());       
	}

}
