package BasicjavaWithGit;

public class Bamboo {
    public static void main(String[] args) {

        Jungle bt = new BambooTree();
        bt.showTree();
    }
}

class BambooTree extends Tree {

    public BambooTree() {
        System.out.println("This is bamboo Tree");
    }

    @Override
    public void showTree() {
        System.out.println("Bamboo is special tree.");
    }
}

class Tree implements Jungle {

    @Override
    public void showTree() {
        System.out.println("This trees are from jungle");

    }

}

interface Jungle {
    void showTree();
}
