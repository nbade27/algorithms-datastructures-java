package com.naga.codewars;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//we have taken best practices from other codewar mates
//testing specific file commit 1
   import java.util.*;

public class PrimeFactors {
    public static void main(String[] args)
    {
        System.out.println("hi"+sumOfDivided(new int[]{299, 300, 137, 111, 131, 185, 225, 363, 104, -25, 171, 282, -97, 386, 394, 407, 158, 45, 208, 379, -1, 419, -66}));
    }

  //this is my code
  public static String sumOfDivided(int[] l) {
    // your code
    String finalString = "";
    Set<Integer> primesSet = new HashSet();
    boolean isNegativeNumbers = false;
    for(int i = 0;i<l.length;i++)
    {
      int number = l[i];

      if(number < 0)
      {
          number = Math.abs(number);
      }
       // System.out.println("number "+number);
      for(int j = 2;j < number;j++)
      {

          while(number % j == 0 )
          {
                primesSet.add(j);
                number = number/j;
          }
      }
        if(number >2) {
            primesSet.add(number);
        }
    }
    
    List<Integer> list = new ArrayList<Integer>(primesSet);
    Collections.sort(list);
     //System.out.println(list);
     for(Integer prime : list)
      {
       //System.out.println("prime"+prime);
       int tempNumber = 0;
         for(int k = 0; k < l.length ;k++)
            {
               // System.out.println(l[k]);
              if(l[k] % prime == 0)
              {
                tempNumber += l[k];
              }

            }


         finalString += "("+prime+" "+tempNumber+")";
         tempNumber = 0;

      }

      return finalString;
  }


  //some best practices in code wars

    /*

    public static String sumOfDivided(int[] l) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number:l) {
            int i = number < 0 ? -number:number;
            for(int j = 2; j <= i; j++) {
                if (i%j == 0) map.put(j, map.get(j) == null ? number : map.get(j)+number);
                while(i%j == 0) i /= j;
            }
        }
        return map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .map(e -> String.format("(%d %d)",e.getKey(),e.getValue()))
                .reduce((x,y) -> x+y)
                .get();
    }


    public static String sumOfDivided(int[] l) {
    return generatePrimeNumbersClosed(stream(l).max().orElse(0))
          .mapToObj(it -> new Object(){ int primeNumber = it, sum = stream(l).filter(n -> n % it == 0).sum(); })
          .filter(it -> it.sum > 0)
          .map(it -> String.format("(%d %d)", it.primeNumber, it.sum))
          .collect(joining(""));
  }

  private static IntStream generatePrimeNumbersClosed(int n) {
    BitSet composited = new BitSet();
    for(int i = (int) Math.sqrt(n); i >= 2; i--) for(int m = i * i; m <= n; m += i) {
      composited.set(m);
    }
    return IntStream.rangeClosed(2, n).filter(it -> !composited.get(it));
  }

  import java.util.*;
import static org.apache.commons.math3.primes.Primes.primeFactors;

public class SumOfDivided {
    public static String sumOfDivided(int[] l) {
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int x : l) {
            int ax = Math.abs(x);
            if (ax == 1) continue;
            new HashSet<>(primeFactors(ax)).forEach(f -> treeMap.merge(f, x, Integer::sum));
        }
        treeMap.forEach((key, value) -> sb.append("(").append(key).append(" ").append(value).append(")"));
        return sb.toString();
    }


    import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
public class SumOfDivided {
 private static List<Long> primeSequence(long n) {
    return   LongStream.iterate(2, i -> i+1).limit(n).filter(SumOfDivided::isPrime).boxed().collect(Collectors.toList());
    }
     private static boolean isPrime(long n) {
 return LongStream.rangeClosed(2, (long)Math.sqrt(n)).allMatch(i -> n % i !=0);
    }
  public static String sumOfDivided(int[] i) {

    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
      Arrays.stream(i).forEach(n -> {
        primeSequence(Math.abs(n)).stream().filter(c -> (long)n %c == 0).forEach(d ->{
          Integer o = map.get(d);
          map.put(d, o == null ? n : n+map.get(d));
        }
        );});
      List<String> ls = new ArrayList<String>();
     for(Long l : map.keySet().stream().sorted().collect(Collectors.toList())) {
     ls.add("("+l+" "+map.get(l)+")");
   }

    return   ls.stream().collect(Collectors.joining(""));

  }
}



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
public class SumOfDivided {
 private static List<Long> primeSequence(long n) {
    return   LongStream.iterate(2, i -> i+1).limit(n).filter(SumOfDivided::isPrime).boxed().collect(Collectors.toList());
    }
     private static boolean isPrime(long n) {
 return LongStream.rangeClosed(2, (long)Math.sqrt(n)).allMatch(i -> n % i !=0);
    }
  public static String sumOfDivided(int[] i) {

    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
      Arrays.stream(i).forEach(n -> {
        primeSequence(Math.abs(n)).stream().filter(c -> (long)n %c == 0).forEach(d ->{
          Integer o = map.get(d);
          map.put(d, o == null ? n : n+map.get(d));
        }
        );});
      List<String> ls = new ArrayList<String>();
     for(Long l : map.keySet().stream().sorted().collect(Collectors.toList())) {
     ls.add("("+l+" "+map.get(l)+")");
   }

    return   ls.stream().collect(Collectors.joining(""));

  }
}



    */

}
