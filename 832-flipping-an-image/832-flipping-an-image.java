class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       
        for(int i=0; i< image[0].length; i++){
             int start = 0 , end =image.length-1;
            while(start<=end){
                if(image[i][start] == image[i][end]){
                  image[i][start] = 1-image[i][start];
                  image[i][end] = image[i][start];
                }
                start++;
                end--;
            }
         
        }
        return image;
    }
}