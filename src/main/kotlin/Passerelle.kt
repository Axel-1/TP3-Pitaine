class Passerelle {
    companion object {
        private fun chargerLesEquipements(idBat: Int): ArrayList<Equipement> {
            val jeu =
                JeuEnregistrement("SELECT id, lib FROM equipement JOIN posseder ON equipement.id = posseder.idEquip WHERE idBat = $idBat")
            val collecEquipement: ArrayList<Equipement> = ArrayList()
            do {
                jeu.suivant()
                collecEquipement.add(
                    Equipement(
                        jeu.getValeur("id").toInt(),
                        jeu.getValeur("lib")
                    )
                )
            } while (!jeu.fin())
            return collecEquipement
        }

        fun chargerLesBatVoy(): ArrayList<BateauVoyageur> {
            val jeu =
                JeuEnregistrement("SELECT id, nom, longueur, largeur, vitesse, image FROM bateau WHERE type = 'v'")
            val collecBatVoy: ArrayList<BateauVoyageur> = ArrayList()
            do {
                jeu.suivant()
                collecBatVoy.add(
                    BateauVoyageur(
                        jeu.getValeur("id").toInt(),
                        jeu.getValeur("nom"),
                        jeu.getValeur("longueur").toFloat(),
                        jeu.getValeur("largeur").toFloat(),
                        jeu.getValeur("vitesse").toFloat(),
                        jeu.getValeur("image"),
                        chargerLesEquipements(jeu.getValeur("id").toInt())
                    )
                )
            } while (!jeu.fin())
            return collecBatVoy
        }
    }
}