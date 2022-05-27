package bishi;

import java.util.ArrayList;
import java.util.List;

public class Dict {


    static List<String> list = new ArrayList<>();

    public static List<String> sentence(String s, String[] wordDict) {
        Trie root = new Trie();
        for (String word : wordDict) {
            root.insert(word);
        }

        dfs(s, 0, new StringBuffer(), root);
        return list;
    }

    private static void dfs(String s, int beginIndex, StringBuffer sb, Trie root) {
        if (beginIndex == s.length()) {
            list.add(sb.toString());
            return;
        }
        for (int i = beginIndex + 1; i <= s.length(); i++) {
            if (root.search(s.substring(beginIndex, i))) {
                String word = s.substring(beginIndex, i);
                StringBuffer sb1 = new StringBuffer(sb);
                if (sb1.length() == 0) sb1.append(word);
                else sb1.append(" ").append(word);
                dfs(s, i, sb1, root);
            }
        }

    }
}

class Trie {
    Trie[] arr;
    boolean isEnd;

    Trie() {
        arr = new Trie[26];
        isEnd = false;
    }

    void insert(String word) {
        Trie trie = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (trie.arr[c - 'a'] == null) {
                trie.arr[c - 'a'] = new Trie();
            }
            trie = trie.arr[c - 'a'];
        }
        trie.isEnd = true;
    }

    private Trie searchWord(String word) {
        Trie trie = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (trie.arr[c - 'a'] == null) return null;
            trie = trie.arr[c - 'a'];
        }
        return trie;
    }

    boolean search(String word) {
        Trie t = searchWord(word);
        return t != null && t.isEnd;
    }
}
