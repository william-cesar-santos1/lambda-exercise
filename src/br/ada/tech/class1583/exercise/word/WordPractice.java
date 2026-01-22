package br.ada.tech.class1583.exercise.word;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordPractice {

    private static final String[] WORDS = {"Arroz", "Feijão", "Ovo", "Frito", "Radar", "Osso"};

    public List<String> wordsLessThan5Characters() {
        //Filtre apenas palavras que possuem menos de 5 caracteres
        var stream = Arrays.stream(WORDS);
        return stream
                .filter(n -> n.length() < 5)
                .collect(Collectors.toList());
    }

    public List<String> words5Characters() {
        // Filtre apenas palavras que possuem 5 caracteres
        var stream = Arrays.stream(WORDS);
        return stream.filter(s -> s.length() == 5)
                .collect(Collectors.toList());
    }

    public List<String> wordsGreaterThan5Characters() {
        // Filtre apenas palavras que possuem mais de 5 caracteres
        var stream = Arrays.stream(WORDS);
        return stream.filter(word -> word.length() > 5)
                .collect(Collectors.toList());
    }

    public List<String> wordsArePalindromes() {
        // Identifique e retorne as palavras que sejam palíndromos(são iguais de trás para frente, exemplo: Radar)
        return Arrays.stream(WORDS)
                .filter(word -> {
                    String reverse = new StringBuilder(word).reverse().toString();
                    return word.equalsIgnoreCase(reverse);
                }).collect(Collectors.toList());
    }

    public Integer countLettersAllWordHave() {
        // Calcule quantos caracteres tem todas as palavras têm juntas.
        return (int) Arrays.stream(WORDS)
                .flatMapToInt(String::chars)
                .count();
//        return Arrays.stream(WORDS)
//                .mapToInt(String::length)
//                .sum();
//        return Arrays.stream(WORDS)
//                .map(String::length)
//                .reduce(Integer::sum)
//                .orElse(0);
    }

    public Map<String, Integer> countLetterEachWord() {
        //Calcule quantos caracteres cada palavra têm, o retorno deve ser a palavra -> quantidade de carateres. Exemplo: Osso -> 4
        // Exercício extra: tente fazer isso utilizando Collectors.toMap
        return Arrays.stream(WORDS)
                .collect(
                        Collectors.toMap(
                                word -> word,
                                String::length
                        )
                );
    }

}