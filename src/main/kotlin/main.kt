fun main(args: Array<String>) {
    val arrayBatVoy: ArrayList<BateauVoyageur> = Passerelle.chargerLesBatVoy()
    val DocPdf: PDF = PDF("output/Brochure.pdf")

    for (item: BateauVoyageur in arrayBatVoy) {
        DocPdf.chargerImage(item.getImageBatVoy())
        DocPdf.ecrireTexte(item.versChaine())
    }

    DocPdf.fermer()
}