package others;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

                LinkedList<Integer> list = new LinkedList<>();
                for (int i = 0; i < 5; i++) {
                    if (i % 2 == 0) {
                        list.addFirst(i); }
                    else{
                        list.addLast(i);
                    }
                }
                System.out.println(list.get(2));
            }
        }

