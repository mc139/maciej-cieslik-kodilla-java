package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    @Override
    public String toString() {
        return "OddNumbersExterminator{" +
                "numbers=" + numbers +
                '}';
    }

    public List<Integer> numbers = new ArrayList<>();


    public OddNumbersExterminator(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++)
            if (numbers.get(i) % 2 != 0 || numbers.contains(0)) {
                numbers.remove(i);
            }
        return numbers;
    }


}

