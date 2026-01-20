package br.ada.tech.class1583.exercise.number;

import java.util.*;
import java.util.stream.Collectors;

public class NumberPractice {

    private static final Integer[] NUMBERS = {4, 1, 1, 8, 1, 7, 3, 2, 3, 4};

    public List<Integer> numbersLessThan5() {
        // Filtre todos os números que são menores que 5
        var stream = Arrays.stream(NUMBERS);
        return null;
    }

    public Set<Integer> removeRepeatNumbers() {
        // Remova os números repetidos
        var stream = Arrays.stream(NUMBERS);
        return null;
    }

    public Integer sumAllNumbers() {
        // Calcule a soma total dos números.
        var stream = Arrays.stream(NUMBERS);
        return null;
    }

    public Integer sumNumbersWithoutRepeats() {
        // Some todos os números, porém não utilize os repetidos
        var stream = Arrays.stream(NUMBERS);
        return null;
    }

    public Map<Integer, Long> countRepeatedNumber() {
        // Conte quantas vezes cada número aparece na lista. Exemplo de retorno: 4 -> 2, 1 -> 3
        // Exercício extra: tente fazer isso utilizando Collectors.groupingBy
        var stream = Arrays.stream(NUMBERS);
        return null;
    }

}