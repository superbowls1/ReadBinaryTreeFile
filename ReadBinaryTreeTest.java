import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Joseph Slepski lab 8
 */
public class ReadBinaryTreeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        BinaryTree<String> binaryTree1 = new BinaryTree<>();

        try {


            Scanner inputs = new Scanner(new File("WordBT_Data.txt"));
            binaryTree1 = BinaryTree.readBinaryTree(inputs);
            inputs.close();

            System.out.println("Preorder  " + binaryTree1.preOrderTraverse());
            System.out.println("InOrder " + binaryTree1.inOrderTraverse());
            System.out.println("Post " + binaryTree1.postOrderTraverse());
            System.out.println("Size " + binaryTree1.size());
            System.out.println("Height" + binaryTree1.height());
        } catch(FileNotFoundException f){
            f.printStackTrace();
            System.exit(1);



            Scanner input = new Scanner(new File("Fig_6_12.txt"));
            //call the static method readBinaryTree1 to read data in Fig_6_12.txt
            //   and construct the corresponding binary tree
            //   and assign the reference to this tree to binaryTree1.
            binaryTree1 = BinaryTree.readBinaryTree(input);
            //close the scanner object.
            input.close();
            //print the string, which is the preorder traversal sequence of data stored in binaryTree1.
            System.out.println(binaryTree1.toString());
        }
    }

}


/*----Your output for the BT read from WordBT_Data.txt:
house
  dog
    cat
      null
      null
    null
  kiss
    null
    man
      null
      null

Preorder traversal:   house  dog  cat  kiss  man
Inorder traversal:   cat  dog  house  kiss  man
postorder traversal:   cat  dog  man  kiss  house
size: 5
height: 3

