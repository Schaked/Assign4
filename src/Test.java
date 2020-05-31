public class Test {
    public static void main(String[] args) {
        BTree generatedTree = new BTree<Integer>(2);
        generatedTree.insert(39);
        generatedTree.insert(36);
        generatedTree.insert(30);
        generatedTree.insert(94);
        generatedTree.insert(61);
        generatedTree.insert(69);
        generatedTree.insert(72);
        generatedTree.insert(68);
        generatedTree.insert(42);
        generatedTree.insert(51);
        generatedTree.insert(25);
        generatedTree.insert(41);
        System.out.printf("OG:\n");
        System.out.printf(generatedTree.toString());
        generatedTree.delete(41);
        System.out.println(generatedTree.toString());
        generatedTree.delete(68);
        System.out.printf("Fixed:\n");
        System.out.printf(generatedTree.toString());
    }
}