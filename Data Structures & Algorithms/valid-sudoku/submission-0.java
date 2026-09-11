class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> fields = new HashSet();

        for(int i=0;i< 9;i++){
            fields = new HashSet();
            for(int j =0; j< 9;j++){
                if(board[i][j] != '.'){
                    if(fields.contains(board[i][j]))
                        return false;
                    else{
                        fields.add(board[i][j]);
                    }
                }
            }
        }

        for(int i=0;i< 9;i++){
            fields = new HashSet();
            for(int j =0; j< 9;j++){
                if(board[j][i] != '.'){
                    if(fields.contains(board[j][i]))
                        return false;
                    else{
                        fields.add(board[j][i]);
                    }
                }
            }
        }

        for(int i=0;i<6;i+=3){
            for(int j=0;j<6;j+=3){
                fields= new HashSet();
                for(int m=0;m<3;m++){
                    for(int n=0;n<3;n++){
                        if(board[i+m][j+n] != '.'){
                            if(fields.contains(board[i+m][j+n]))
                                return false;
                            else{
                                fields.add(board[i+m][j+n]);
                            }
                        }
                    }
                }
            }
        }


        return true;
        
    }
}
