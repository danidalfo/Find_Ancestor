// This class defines a node of the binary tree

class Node 
{ 
    string data; 
    Node left, right; 
  
    public Node(string item) 
    { 
        data = item; 
        left = right = null; 
    } 
}


public class MusicGenealogyMicroservice 
{ 
    //Root of the Binary Tree
    
    Node root; 
  
  
    string findAncestor(string genreA, string genreB) 
    { 
        return findAn(root, genreA, genreB); 
    } 
  
   
    string findAn(Node node, string genreA, string genreB) 
    { 
       
        if (node == null) 
            return null; 
  
    
        // If genreA or genreB are the root, report 
        // the presence by returning root
        
        if (node.data == genreA || node.data == genreB) 
            return node; 
  
        // Look for keys in left and right subtrees 
        Node left_An = finAn(node.left, genreA, genreB); 
        Node right_An = findAn(node.right, genreA, genreB); 
  
        // If both of the above calls return Non-NULL, then one key 
        // is present in once subtree and other is present in other, 
        // So this node is the ancestor 
        if (left_An!=null && right_An!=null) 
            return node; 
  
        // Otherwise check if left subtree or right subtree is the ancestor 
        return (left_An != null) ? left_An : right_An; 
    } 
  
