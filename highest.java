import java.util.*;
class highest
{
public static void main(String args[])
{
HashMap<String,Integer> map=new HashMap<>();
map.put("gaurav",10);
map.put("ankit",20);
map.put("aman",30);
map.put("suraj",50);
map.put("sujit",40);
System.out.println(map);
Map.Entry<String,Integer> max=null;
for(Map.Entry<String,Integer> m:map.entrySet())
{
if(max==null || m.getKey().compareTo(max.getKey())>0)
{
max=m;
}
}
System.out.println(max);
}

}