open class Bateau(
    protected val idBat: Int,
    protected val nomBat: String,
    protected val longueurBat: Float,
    protected val largeurBat: Float
) {
    open fun versChaine(): String {
        return ("Nom du bateau : $nomBat\nLongueur : $longueurBat\nLargeur : $largeurBat\n")
    }
}