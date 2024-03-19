public class Trie{
    public static Node root;
    Trie(){
        root=new Node();
    }
    void insert(String word){
        Node node=root;
        for (int i = 0; i < word.length(); i++) {
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i), new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }
    public static void main(String[] args) {
        
    }
}
class Node {
    Node links[]=new Node[26];
    boolean flag=false;
    public Node(){

    }
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    void put(char ch , Node node){
        links[ch-'a']=node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag==true;
    }
}