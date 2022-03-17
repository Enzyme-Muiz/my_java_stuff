import java.util.*; 

public class Bowling {
   HashMap<String, Integer> players;
   Bowling() {
       players = new HashMap<String, Integer>();
   }
   public void addPlayer(String name, int p) {
       players.put(name, p);
   }
   //your code goes here
   public void getWinner() {
   List<Integer> values = new ArrayList<>(players.values());
   int maximum = Collections.max(values);

   List< String > keyss = new ArrayList< String >();
   List<String> keys = new ArrayList<>(players.keySet());
   
    for (int i = 0; i < keys.size(); i++)
        {
            if ( players.get( keys.get(i) ).equals( maximum ) )
            {
                keyss.add( keys.get(i) );
            }
        }
   String s=Integer.toString(keys.size());
   System.out.println(keyss.get(0));

   }

public void getWinner1() {
    System.out.println("ok");
   }








}

