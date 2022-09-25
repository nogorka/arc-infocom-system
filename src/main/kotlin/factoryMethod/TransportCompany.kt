package factoryMethod

abstract class TransportCompany(val name: String) {
    override fun toString(): String {
        return name;
    }

    // фабричный метод
    abstract fun create(n: String, k: Int): TransportService
}