package org.ie.practice11;

public class CustomBinaryTree {
    private Node root;




    public void traverseInOrder(Node node){
        if (node==null)
            return;

        traverseInOrder(node.getLeft());
        System.out.print(node.getData()+"\t");
        traverseInOrder(node.getRigt());
    }





    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void add(int value) {
        Node node = new Node(value);

        //first node insertion
        if (root == null) {
            root = node;
            root.setLeft(null);
            root.setRigt(null);
        }
        //if a node is already is present in the tree

        else{
            Node currentNode = this.root;
            while (true) {

                if (node.getData() > currentNode.getData()) {
                    if (currentNode.getRigt() == null) {
                        currentNode.setRigt(node);
                        break;
                    } else {
                        currentNode = currentNode.getRigt();
                    }
                } else if (node.getData() < currentNode.getData()) {
                    if (currentNode.getLeft() == null) {
                       // System.out.println(node.getData());
                        currentNode.setLeft(node);
                        break;
                    } else {
                       // System.out.println(node.getData());
                        currentNode = currentNode.getLeft();
                    }
                } else {
                    break;
                }

            }
         }
        }
     public Object lookUp(int value){
        if(root==null){
            return null;
        }
        else {
            Node currentNode= this.root;
            while (currentNode!=null) {
                if(currentNode.getData()>value) currentNode=currentNode.getRigt();
                else if(currentNode.getData()<value) currentNode=currentNode.getLeft();
                else if(currentNode.getData()==value) return currentNode;
                    }
                }
        return null;
        }


public String printTheELements(){
        if(root==null){
            return "Empty";
        }
        return null;
    }

    public Node remove(int value){
        if(root==null){
            return  null;
        }
        Node currentNode = this.root;
        Node  parentNode=null;
        while(currentNode!=null) {
            if (currentNode.getData() < value) {
                parentNode = currentNode;
                currentNode = currentNode.getRigt();
            } else if (currentNode.getData() > value) {
                parentNode = currentNode;
                currentNode = currentNode.getLeft();
            } else if (currentNode.getData() == value) {
                if (currentNode.getLeft() != null) {
                    if (currentNode.getLeft().getData() < value) {
                        parentNode = currentNode;
                        Node n = new Node(value);
                        n.setLeft(currentNode.getLeft());
                        n.setRigt(currentNode.getRigt());
                        currentNode = n;
                        return parentNode;
                    }
                }
            }
        }
        return null;
    }
}
