package Trie_;


class Node{
    Node links[] = new Node[26];
    boolean flag = false;
    public Node(){

    }
    boolean containsKey(char c){
        return links[c-'a']!=null;
    }
    public Node get(char ch){
        return links[ch-'a'];
    }
    public void put(char ch,Node node){
        links[ch-'a']=node;
    }
    public void setEnd(){
        flag =true;
    }
    public boolean isEnd(){return flag;}
}
class Trie{
//    Initialise your data structure
    private  Node root;

    public Trie(){
        this.root =new Node();
    }
    public void insert(String word){
        Node node =root;
        for (int i = 0; i <word.length() ; i++) {
            if (!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }
    public boolean search(String word){
        Node node =root;
        for (int i = 0; i <word.length() ; i++) {
            if (!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }
    
    public boolean startWith(String prefix){
        Node node=  root;
        for (int i = 0; i < prefix.length() ; i++) {
            if (!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
}
public class startsWith {

}
