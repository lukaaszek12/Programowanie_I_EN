import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.*;

public class Streams_main {
    public static void main(String[] args) {
        //Stream<Integer> stream1 = new LinkedList<Integer>().stream();

        IntStream intstream = IntStream.range(0,10);
        System.out.println("INTS:");
        intstream.forEach(System.out::println);

        DoubleStream doubles= DoubleStream.of(1,2,3);
        System.out.println("Doubles:");
        doubles.forEach(System.out::println);

        LongStream longs = LongStream.generate(()->1L);
        System.out.println("LONGS:");
        longs.limit(5).forEach(System.out::println);

        DoubleStream randomDoubles = new Random().doubles();
        System.out.println("RandomDoubles:");
        randomDoubles.limit(5).forEach(System.out::println);

        IntStream randomInts = new Random().ints(100);
        System.out.println("RandomInts:");
        randomInts.limit(50).forEach(System.out::println);

        LongStream randomLongs = new Random().longs();
        System.out.println("RandomDoubles:");
        randomLongs.limit(3).forEach(System.out::println);

        Stream.empty().forEach(System.out::println);

        //Cwiczenie 1
        List<Integer> num= Arrays.asList(1, 3, 4, 8, 9, 13, 14);

        Stream<Integer> stream2 = num.stream();

        Stream<Integer> filStream=stream2
                .filter(x -> x%2==1)  //zostawia liczby nieparzyste
                .map(x -> x*10);    //przemnozenie pozostalych liczb razy 10
        //Long numberOfElements=stream2.count(); //zliczenie liczby elementów

        System.out.println("List of Integers from task 1 from stream:");

        //filStream.forEach(System.out::println);
        //stream2.forEach(System.out::println);

        List<Integer> num2=filStream
                .parallel() //wykonywanie rownolegle
                .peek(System.out::println)  //wywolanie metody na kazdym z elementow strumienia
                .collect(Collectors.toList()); //zamiana strumienia na liste, zakonczenie strumienia

        System.out.println("List of Integers from task 1 from list:");

        for (Integer n : num2){
            System.out.println(n);
        }
        //stream2.forEach(System.out::println);

        //stream2.forEach(System.out::println);
        //System.out.println(cnt);
        //stream_got.forEach(System.out::println);

        //Cwiczenie 2
        List<String> txt = Arrays.asList("ala","samochod","kot","aleksandra","pies","azor");

        System.out.println("List of words from task 2:");

        txt
                .stream()
                .filter(s -> s.startsWith("a"))
                //.map(s -> s.substring(0,1).toUpperCase()+s.substring(1))
                .map(s -> s.replaceFirst(s.substring(0,1),
                        s.substring(0,1).toUpperCase()))
                .forEach(System.out::println);

        //Cwiczenie 3
        DoubleStream randomNumbers = new Random().doubles();

        List<Double> listOfRandoms= randomDoubles
                .limit(10)
                .map(x->x*2.0-1.0) //zamiana zakresu od 0 do 1 na zakres od -1 do 1
                .filter(x->x<0.0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("RandomDoubles with map:");

        for(Double x : listOfRandoms) {
            System.out.println(x);
        }

//        String sciezka = "C:\\Users\\Sławomir\\Desktop\\SDA\\JVM\\pan-tadeusz.txt";
//        try (Stream<String> lines = new BufferedReader(
//                new FileReader(sciezka)).lines()){
//
//            List<String> linie=lines.collect(Collectors.toList());
//
//            System.out.println(
//                    linie.stream()
//                            .peek(System.out::println)
//                            .filter(s -> s.startsWith("I"))
//                            .count());
//
//            //System.out.println(String.join(" ",linie));
//            Stream<String> ksiazkaWyrazy = Pattern.compile("[ !?,;:-]").splitAsStream(String.join(" ", linie));
//
//            System.out.println(
//                    ksiazkaWyrazy
//                            .filter(s -> s.equals("nad"))
//                            .count());
//
//            Stream<String> ksiazkaWyrazy2 = Pattern.compile("[ !?,;:-]").splitAsStream(String.join(" ", linie));
//            System.out.println(
//                    ksiazkaWyrazy2
//                            .filter(s -> s.endsWith("ów"))
//                            .count());
//
//        }
//        catch(IOException e) {
//            e.printStackTrace();
//        }
//
//        Stream<String> streamstr = Pattern.compile(" ").splitAsStream("abc def ghi");
//        //streamstr.forEach(System.out::println);
//
//        Stream<Integer>stream5=Arrays.stream(new Integer[]{});
    }
}
