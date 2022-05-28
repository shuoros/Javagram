package io.github.shuoros.javagram.type;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@Getter
public class Integer implements Type {

    private int value;

}
