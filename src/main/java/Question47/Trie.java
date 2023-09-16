package Question47;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

public class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }

    public void delete(String word) {
        delete(root, word, 0);
    }

    private boolean delete(TrieNode node, String word, int index) {
        if (index == word.length()) {
            if (!node.isEndOfWord) {
                return false;
            }
            node.isEndOfWord = false;
            return isNodeEmpty(node);
        }

        char c = word.charAt(index);
        int charIndex = c - 'a';
        if (node.children[charIndex] == null) {
            return false;
        }

        boolean shouldDeleteCurrentNode = delete(node.children[charIndex], word, index + 1);

        if (shouldDeleteCurrentNode) {
            node.children[charIndex] = null;
            return isNodeEmpty(node);
        }

        return false;
    }

    private boolean isNodeEmpty(TrieNode node) {
        for (TrieNode child : node.children) {
            if (child != null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println("Search 'apple': " + trie.search("apple")); // true
        System.out.println("Search 'app': " + trie.search("app")); // false
        System.out.println("StartsWith 'app': " + trie.startsWith("app")); // true
        trie.delete("apple");
        System.out.println("Search 'apple' after deletion: " + trie.search("apple")); // false
    }
}
