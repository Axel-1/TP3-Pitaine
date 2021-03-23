class BateauVoyageur(
    idBat: Int,
    nomBat: String,
    longueurBat: Float,
    largeurBat: Float,
    private val vitesseBatVoy: Float,
    private val imageBatVoy: String,
    private val lesEquipements: Collection<Equipement>
) : Bateau(idBat, nomBat, longueurBat, largeurBat) {
    override fun versChaine(): String {
        var concat: String = super.versChaine() + "Vitesse : $vitesseBatVoy\nListe des équipements : \n"
        for (item: Equipement in this.lesEquipements) {
            concat += "- ${item.versChaine()}\n"
        }
        return concat
    }

    fun getImageBatVoy(): String = imageBatVoy
}