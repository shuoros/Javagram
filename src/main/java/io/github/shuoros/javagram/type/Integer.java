package io.github.shuoros.javagram.type;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Integer implements Type {

    private int value;

}
