package com.kodilla.stream.beatifier;

public class PoemBeautifier {
    public String beautify(String stringToAdd,PoemDecorator poemDecorator){
           return poemDecorator.decorate(stringToAdd);
    }
}
