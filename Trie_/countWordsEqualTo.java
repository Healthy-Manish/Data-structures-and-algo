package Trie_;

class Node_{
    Node_ links[]=new Node_[26];
    int cp =0;
    int ew =0;
    Node_(){ }
    boolean containsKey(char c){
        return links[c-'a']!=null;
    }
    public Node_ get(char ch){
        return links[ch-'a'];
    }
    public void put(char ch,Node_ node){
        links[ch-'a']=node;

    }
    public void increasePrefix(){cp++;}
    public void increaseEnd(){
        ew++;
    }
    public void reducePrefix(){cp--;}
    public void deleteEnd(){ ew--;}
    public int getPrefix(){return cp;}
    public int getEndWith(){return ew;}
}

public class countWordsEqualTo {
    private Node_ root;
    public countWordsEqualTo(){
        root = new Node_();
    }
    public void insert(String word){
        Node_ node = root;
        for (int i = 0; i <word.length() ; i++) {
            if (!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node_());
            }

            node= node.get(word.charAt(i));
            node.increasePrefix();
        }
        node.increaseEnd();
    }
    public int countWords(String words){
        Node_ node= root;
        for (int i = 0; i <words.length() ; i++) {
            if (node.containsKey(words.charAt(i))){
                node = node.get(words.charAt(i));
            }
            else {
                return 0;
            }
        }
        return node.getEndWith();
    }
    public int countStartingWith(String words){
        Node_ node= root;
        for (int i = 0; i < words.length(); i++) {
            if (!node.containsKey(words.charAt(i))){
                return 0;
            }
            node =node.get(words.charAt(i));
        }
        return node.getPrefix();
    }
    public void erase(String word){
        Node_ node =root;
        for (int i = 0; i <word.length() ; i++) {
            if (node.containsKey(word.charAt(i))){
                node =node.get(word.charAt(i));
                node.reducePrefix();
            }
            else return;
        }
         node.deleteEnd();
    }
}

