package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final Bun bun;
    private final int numberOfPatties;
    private final Sauce sauce;
    private List<IngredientsType> ingredients = new ArrayList<>();

    public static class BigMacBuilder {

        private Bun bun;
        private int numberOfPatties;
        private Sauce sauce;
        private List<IngredientsType> ingredientsTypeList = new ArrayList<>();

        public BigMacBuilder bun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder numberOfPatties(int numberOfPatties) {
            this.numberOfPatties = numberOfPatties;
            return this;
        }

        public BigMacBuilder sauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder addIngredients(IngredientsType ingredient) {
            ingredientsTypeList.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, numberOfPatties, sauce, ingredientsTypeList);
        }

    }

    public BigMac(Bun bun, int numberOfPatties, Sauce sauce, List<IngredientsType> ingredientsTypeList) {
        this.bun = bun;
        this.numberOfPatties = numberOfPatties;
        this.sauce = sauce;
        this.ingredients = ingredientsTypeList;
    }

    public Bun getBun() {
        return bun;
    }

    public int getNumberOfPatties() {
        return numberOfPatties;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<IngredientsType> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun=" + bun +
                ", numberOfPatties=" + numberOfPatties +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}
