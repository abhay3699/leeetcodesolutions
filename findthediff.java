class Solution {
public char findTheDifference(String s, String t) {
String k="abcdefghijklmnopqrstuvwxyz";
if(s.length()==0){
return t.charAt(0);
}
int a[]=new int[26];
int b[]=new int[26];
for(int i=0;i<s.length();i++){
a[s.charAt(i)-'a']++;
}
for(int i=0;i<t.length();i++){
b[t.charAt(i)-'a']++;
}
for(int i=0;i<26;i++){
if(b[i]-a[i]>0){
return k.charAt(i);
}
if(b[i]-a[i]==1){
return k.charAt(i);
}
}
return ' ';
}
}