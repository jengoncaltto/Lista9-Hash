
public class Main
{
	public static void main(String[] args) {
        SeparateChainingHashST<Character, Integer> teste = new SeparateChainingHashST<Character, Integer>(3);

        
        char[] chaves = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};
        for (int i = 0; i < chaves.length; i++) {
            teste.put(chaves[i], i);
        }

        
        for (Character c : teste.keys()) {
            System.out.println(c + " " + teste.get(c));
        }

        teste.mediaComparacoes();
    }
}
