public class TRIE_data_structure
{
    class TrieNode
    {
        TrieNode [] child;
        boolean isEndOFWord;
        public TrieNode()
        {
            child = new  TrieNode[26];  //26 letters
            isEndOFWord = false;
        }
    }


}
