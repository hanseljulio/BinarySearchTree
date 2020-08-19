public class Main {
    public static void main(String[] args) {
        Tree<Integer> testTree = new Tree();

        testTree.root = new Node<>(14);
        testTree.insert(4);
        testTree.insert(15);
        testTree.insert(3);
        testTree.insert(9);
        testTree.insert(7);
        testTree.insert(18);
        testTree.insert(16);
        testTree.insert(20);

        System.out.println(testTree.search(14) != null);
        System.out.println(testTree.search(4) != null);
        System.out.println(testTree.search(15) != null);
        System.out.println(testTree.search(3) != null);
        System.out.println(testTree.search(9) != null);
        System.out.println(testTree.search(7) != null);
        System.out.println(testTree.search(18) != null);
        System.out.println(testTree.search(16) != null);
        System.out.println(testTree.search(20) != null);

        System.out.println("Now false");
        System.out.println(testTree.search(10) != null);
        System.out.println(testTree.search(21) != null);
        System.out.println(testTree.search(0) != null);

        System.out.println("\n" + "Deleting 18, a node with two children and has children");
        testTree.deleteValue(18);
        System.out.println(testTree.search(18) == null);

        System.out.println("\n" + "Deleting leaf 20");
        testTree.deleteValue(20);
        System.out.println(testTree.search(20) == null);

        System.out.println("\n" + "Deleting 3, left child with no right child");
        testTree.deleteValue(3);
        System.out.println(testTree.search(3) == null);

        System.out.println("\n" + "Deleting 16, right child with no left child");
        testTree.deleteValue(16);
        System.out.println(testTree.search(16) == null);

        System.out.println("\n" + "Deleting 14, the root with two children and grandchildren");
        testTree.deleteValue(14);
        System.out.println(testTree.search(14) == null);
    }

}