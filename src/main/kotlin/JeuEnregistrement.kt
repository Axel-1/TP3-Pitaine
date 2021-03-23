import java.sql.*

class JeuEnregistrement(val SQLquery: String) {
    private val url = ""
    private val username = ""
    private val password = ""
    private lateinit var con: Connection
    private lateinit var stmt: Statement
    private lateinit var rs: ResultSet

    init {
        try {
            con = DriverManager.getConnection(url, username, password)
            stmt = con.createStatement()
            rs = stmt.executeQuery(this.SQLquery)
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }

    fun suivant() {
        rs.next()
    }

    fun fin(): Boolean = rs.isLast

    fun getValeur(nomChamp: String): String {
        return rs.getString(nomChamp)
    }
}