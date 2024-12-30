public abstract class Entity {
    public abstract String getUniqueIdentifier();

    public String toString() {
        return getUniqueIdentifier();
    }
}
