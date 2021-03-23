class Equipement(
    private val idEquip: Int,
    private val libEquip: String
) {
    fun versChaine(): String {
        return this.libEquip
    }
}