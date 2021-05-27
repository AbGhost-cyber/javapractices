package dremo;

import java.lang.reflect.Array;
import java.util.*;

public class SoloLearn {
    public static void main(String[] args) {
        int amount = 20000;
        int loanPerMonth = 0, i = 0;
        while (i < 3) {
            loanPerMonth = (int) (0.1 * amount);
            amount = amount - loanPerMonth;
            i++;
        }
        System.out.println(amount + "" + loanPerMonth);
        System.out.println(reverseMyString());
    }

    static String reverseMyString() {
        String hello = "hello there";
        StringBuilder s = new StringBuilder();
        int count = 0;
        char[] arr = hello.toCharArray();
        for (int i = arr.length; i > 0; i--) {
            s.append(arr[i - 1]);
            count++;
        }
        System.out.println(count);
        return s.toString();
    }

    static class Bowling {
        HashMap<String, Integer> players;

        Bowling() {
            players = new HashMap<>();
        }

        void addPlayer(String name, int p) {
            players.put(name, p);
        }

        void getWinner() {
            Collection<Integer> values = players.values();
            int max = Collections.max(values);
            for (String key : players.keySet()) {
                if (players.get(key).equals(max)) {
                    System.out.println(key);
                }
            }
        }

        public static void main(String[] args) {
            Bowling game = new Bowling();
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");
                String name = values[0];
                int point = Integer.parseInt(values[1]);
                game.addPlayer(name, point);
            }
            game.getWinner();
        }
    }
}

