class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowFields = new HashSet();
        Set<Character> colFields = new HashSet();
        Set<Character> seqFields = new HashSet();
        Map<Integer, Set<Character>> subSeq = new HashMap();

        for(int i=0;i< 9;i++){
            rowFields = new HashSet();
            colFields = new HashSet();
            for(int j =0; j< 9;j++){
                if(board[i][j] != '.'){
                    if(!this.checkField(board[i][j], rowFields)){
                        return false;
                    }
                }
                if(board[j][i] != '.'){
                    if(!this.checkField(board[j][i], colFields)){
                        return false;
                    }
                }
                int subSeqIndex = ((i/3) * 3) + (j / 3);
                subSeq.putIfAbsent(subSeqIndex, new HashSet());
                if(board[j][i] != '.'){
                    if(!this.checkField(board[j][i], subSeq.get(subSeqIndex))){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }

    private boolean checkField(Character field,Set<Character> fields){
            if(fields.contains(field))
                return false;
            else{
                fields.add(field);
            }
            return true;
    }
}
