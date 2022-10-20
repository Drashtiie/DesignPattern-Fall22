abstract class NodeVisitor {
    abstract Reminder visitProduct(ProductList product);

    abstract void visitTrading(Trading trading);

    abstract void visitFacade(Facade facade);
}
