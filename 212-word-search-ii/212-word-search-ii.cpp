class TrieNode{
public:
    char val;
    vector<TrieNode*> children;
    bool isEnd;
    string word;
    
    TrieNode(char ch){
        val = ch;
        children = vector<TrieNode*>(26, NULL);
        word = "";
        isEnd= false;
    }
};
class Solution {
public:
    void insert(TrieNode* &root, string s){
        TrieNode* temp = root;
        for(int i=0; i<s.length(); i++){
            if(temp->children[s[i]-'a']==NULL){
                temp->children[s[i]-'a'] = new TrieNode(s[i]);
            }
            temp = temp->children[s[i]-'a'];
        }
        temp->isEnd = true;
        temp->word = s;
    }
    void dfs(vector<vector<char>> &board, int r, int c, int m, int n, TrieNode* &root, vector<string> &ans){
        
        if(root->isEnd){
            ans.push_back(root->word);
            root->isEnd = false;
        }
        
        char ch = board[r][c];
        board[r][c] = '!';
        if(r+1 < m && board[r+1][c]!='!' && root->children[board[r+1][c]-'a']!=NULL)
            dfs(board, r+1, c, m, n, root->children[board[r+1][c]-'a'], ans);
        
        if(r-1 >=0 && board[r-1][c]!='!' && root->children[board[r-1][c]-'a']!=NULL)
            dfs(board, r-1, c, m, n, root->children[board[r-1][c]-'a'], ans);
        
        if(c+1 < n && board[r][c+1]!='!' && root->children[board[r][c+1]-'a']!=NULL)
            dfs(board, r, c+1, m, n, root->children[board[r][c+1]-'a'], ans);
        
        if(c-1 >= 0 && board[r][c-1]!='!' && root->children[board[r][c-1]-'a']!=NULL)
            dfs(board, r, c-1, m, n, root->children[board[r][c-1]-'a'], ans);
        
        board[r][c] = ch;
    }
    
    vector<string> findWords(vector<vector<char>>& board, vector<string>& words) {
        TrieNode* root = new TrieNode('*');
        for(string s: words){
            insert(root, s);
        }
        vector<string> ans;
        int m = board.size(),n = board[0].size();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(root->children[board[i][j]-'a']!=NULL){
                    dfs(board, i, j, m, n, root->children[board[i][j]-'a'], ans);
                }
            }
        }
        return ans;
    }
};