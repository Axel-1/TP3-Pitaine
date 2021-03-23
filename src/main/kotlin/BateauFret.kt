class BateauFret(
    idBat: Int,
    nomBat: String,
    longueurBat: Float,
    largeurBat: Float,
    private val poidsMaxBatFret: Float,
) : Bateau(idBat, nomBat, longueurBat, largeurBat) {
    override fun versChaine(): String {
        return super.versChaine() + "Poids max Fret : $poidsMaxBatFret\n"
    }
}