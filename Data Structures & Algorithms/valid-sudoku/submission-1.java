class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> rowFields = new HashSet();
        Set<Character> colFields = new HashSet();
        Set<Character> seqFields = new HashSet();

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
            }
        }

        for(int i=0;i<6;i+=3){
            for(int j=0;j<6;j+=3){
                seqFields= new HashSet();
                for(int m=0;m<3;m++){
                    for(int n=0;n<3;n++){
                        if(board[i+m][j+n] != '.'){
                            if(!this.checkField(board[i+m][j+n], seqFields)){
                                return false;
                            }
                        }
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
