package factoryMethod

// класс пьяный водитель
class SoberTransCom(name: String) : TransportCompany(name) {
    override fun create(n: String, t: Int): TransportService {
        return Moving(name, t);
    }
}