import com.itextpdf.io.image.ImageData
import com.itextpdf.io.image.ImageDataFactory
import com.itextpdf.kernel.pdf.PdfDocument
import com.itextpdf.kernel.pdf.PdfWriter
import com.itextpdf.layout.Document
import com.itextpdf.layout.element.Image
import com.itextpdf.layout.element.Paragraph

class PDF(val nomDocument: String) {
    private val pdf: PdfDocument = PdfDocument(PdfWriter(nomDocument))
    private val document: Document = Document(pdf)

    fun ecrireTexte(leTexte: String) {
        document.add(Paragraph(leTexte))
        document.add(Paragraph("\n"))
    }

    fun chargerImage(chemin: String) {
        val imageData: ImageData = ImageDataFactory.create(chemin)
        document.add(Image(imageData))
    }

    fun fermer() {
        document.close()
    }
}