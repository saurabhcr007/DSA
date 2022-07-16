class Solution {
  long ans;
  long[][] table;
  
    
  public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
    int shift = (startRow + startColumn) & 1;
    ans = 0;
    table = new long[m+2][n+2];
    table[startRow+1][startColumn+1] = 1;
    
    for(; maxMove-- != 0; shift ^= 1){
      calculateAns();
      transformTable(shift);
    }
    
    return (int)(ans%1000000007);
  }
  
  private void transformTable(int shift){
    for(int i = 1; i != table.length - 1; i++, shift ^= 1)
      for(int j = 1 + shift; j < table[0].length - 1; j+=2){
        table[i][j] %= 1000000007;
        table[i-1][j] += table[i][j];
        table[i+1][j] += table[i][j];
        table[i][j-1] += table[i][j];
        table[i][j+1] += table[i][j];
        table[i][j] = 0;
      }
  }
  
  private void calculateAns(){
    for(int i = 1; i < table.length - 1; i++)
      ans += table[i][1] + table[i][table[0].length - 2];
    
    for(int j = 1; j < table[0].length - 1; j++)
      ans += table[1][j] + table[table.length - 2][j];
  }
}