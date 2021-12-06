package racingcar_second.domain;

import racingcar_second.domain.exception.NameLengthException;

import java.util.Arrays;
import java.util.List;

public class Name {

    private String name;

    public Name() {
    }

    public Name(String name) {
        if (name.length() > 5) {
            throw new NameLengthException();
        }
        this.name = name;
    }

    public List<String> separateByComma(String input) {
        return Arrays.asList(input.trim().split(","));
    }
}