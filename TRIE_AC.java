public class TRIE_AC {
    public static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];
            for (int i = 0; i < children.length; i++) {
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();
    static void insert(String word){
            Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();// add new node
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    static boolean search(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            if(i==word.length()-1){
                return curr.children[idx].eow==true;
            }
            curr=curr.children[idx];
        }
    
        return true;
    }
    static boolean starts_with(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
    
        return true;
    }
    static boolean word_break(String key){
        if(key.length()==0)return true;
        for(int i=1;i<=key.length();i++){
            if(search(key.substring(0,i)) && word_break(key.substring(i))){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // String word[]={"the","a","there","their","any"};
        String word[]={"i","like","sam","samsung","mobile","ice"};
        for(String str:word){
            insert(str);
        }
        // System.out.println(word_break("ilikesamsung"));
        // System.out.println(starts_with("moon"));
        // System.out.println(search("there"));
        // System.out.println(search("their"));
        // System.out.println(search("any"));
        // System.out.println(search("an"));

        String string="ababa";int count=1;
        for(int i=0;i<string.length();i++){
            count+=insertandcount(string.substring(i));
        }
        System.out.println(count);
    }
    static int insertandcount(String word){
            Node curr=root;int count=0;
        for (int i = 0; i < word.length(); i++) {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();// add new node
                count++;
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
        return count;
    }
}
