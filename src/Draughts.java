import java.util.ArrayList;

public class Draughts {
	DraughtsTree tree;
	
	public DraughtsEngine enemy;

	public Draughts() {
		this.tree = new DraughtsTree();
		
//		DraughtsNode root = new DraughtsNode(tree);
		DraughtsNode root = new DraughtsNode(tree,
				 0b000000000000111111,
				 0b111111000000000000,
				 0b000000000000000000);

		this.tree.setRoot(root);
	}

	public void play() {
		tree.populate();
	}

	public DraughtsTree getTree() {
		return this.tree;
	}
}