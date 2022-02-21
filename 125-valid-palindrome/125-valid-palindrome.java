class Solution {
 public boolean isPalindrome(String s) {
    StringBuilder builder = new StringBuilder();

     
     s.chars().filter(c->Character.isLetterOrDigit(c))
         .mapToObj(c->Character.toLowerCase((char)c))
         .forEach(builder::append);

    return builder.toString().equals(builder.reverse().toString());
  }
}
