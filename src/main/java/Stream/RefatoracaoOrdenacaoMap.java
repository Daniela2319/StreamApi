package Stream;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoMap {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer,Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Dani",700-0000));
            put(2, new Contato("Frank",700-0001));
            put(3, new Contato("Tuca",700-0002));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer,Contato> entry : agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());
        }

        // Classe anonima
        System.out.println("--\tOrdem número de telefone\t--");
       /* Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(),cont2.getValue().getNumero());
            }
        });*/

        //Classe Function
       /* Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }
        ));*/
        //Lambda
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry: set){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        Set<Map.Entry<Integer,Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer,Contato> entry : set1){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + ": " + entry.getValue().getNumero());
        }
    }
}
