import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        List<Double> list = new ArrayList();
        
        for (int i = 0; i < 2 ;i++) {
            list.add(Math.random() * 10000);
        }


        Double d = list.stream().reduce((a, b) ->  a * b ).orElse(0.00); 
        list  = list.stream().sorted((a, b) -> a.compareTo(b)).limit(1).collect(Collectors.toList());
        list = list.stream().map(x -> x  * 20).collect(Collectors.toList());
        Double du = list.stream().max((a, b) -> a.compareTo(b)).orElse(0.00);
    
           System.out.println("Double: "+ du);
        list.forEach(x -> System.out.println(x.doubleValue()));
    }

}